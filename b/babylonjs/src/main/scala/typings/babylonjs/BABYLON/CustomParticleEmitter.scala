package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomParticleEmitter
  extends StObject
     with IParticleEmitterType {
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: js.Any): Unit
  
  /**
    * Gets or sets the destination generator that will create the final destination of each particle.
    *  * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
    */
  def particleDestinationGenerator(index: Double, particle: Nullable[Particle], outDestination: Vector3): Unit
  
  /**
    * Gets or sets the position generator that will create the inital position of each particle.
    * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
    */
  def particlePositionGenerator(index: Double, particle: Nullable[Particle], outPosition: Vector3): Unit
}
object CustomParticleEmitter {
  
  inline def apply(
    applyToShader: Effect => Unit,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: js.Any => Unit,
    particleDestinationGenerator: (Double, Nullable[Particle], Vector3) => Unit,
    particlePositionGenerator: (Double, Nullable[Particle], Vector3) => Unit,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): CustomParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction1(parse), particleDestinationGenerator = js.Any.fromFunction3(particleDestinationGenerator), particlePositionGenerator = js.Any.fromFunction3(particlePositionGenerator), serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction4(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[CustomParticleEmitter]
  }
  
  extension [Self <: CustomParticleEmitter](x: Self) {
    
    inline def setParse(value: js.Any => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setParticleDestinationGenerator(value: (Double, Nullable[Particle], Vector3) => Unit): Self = StObject.set(x, "particleDestinationGenerator", js.Any.fromFunction3(value))
    
    inline def setParticlePositionGenerator(value: (Double, Nullable[Particle], Vector3) => Unit): Self = StObject.set(x, "particlePositionGenerator", js.Any.fromFunction3(value))
  }
}
