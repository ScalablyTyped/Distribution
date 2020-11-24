package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomParticleEmitter extends IParticleEmitterType {
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: js.Any): Unit = js.native
  
  /**
    * Gets or sets the destination generator that will create the final destination of each particle.
    *  * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
    */
  def particleDestinationGenerator(index: Double, particle: Nullable[Particle], outDestination: Vector3): Unit = js.native
  
  /**
    * Gets or sets the position generator that will create the inital position of each particle.
    * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
    */
  def particlePositionGenerator(index: Double, particle: Nullable[Particle], outPosition: Vector3): Unit = js.native
}
object CustomParticleEmitter {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CustomParticleEmitterOps[Self <: CustomParticleEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParse(value: js.Any => Unit): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParticleDestinationGenerator(value: (Double, Nullable[Particle], Vector3) => Unit): Self = this.set("particleDestinationGenerator", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParticlePositionGenerator(value: (Double, Nullable[Particle], Vector3) => Unit): Self = this.set("particlePositionGenerator", js.Any.fromFunction3(value))
  }
}
