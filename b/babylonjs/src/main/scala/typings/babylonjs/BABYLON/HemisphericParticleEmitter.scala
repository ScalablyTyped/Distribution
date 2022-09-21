package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HemisphericParticleEmitter
  extends StObject
     with IParticleEmitterType {
  
  /**
    * How much to randomize the particle direction [0-1].
    */
  var directionRandomizer: Double
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: Any): Unit
  
  /**
    * The radius of the emission hemisphere.
    */
  var radius: Double
  
  /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  var radiusRange: Double
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit
}
object HemisphericParticleEmitter {
  
  inline def apply(
    applyToShader: UniformBufferEffectCommonAccessor => Unit,
    buildUniformLayout: UniformBuffer => Unit,
    directionRandomizer: Double,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: Any => Unit,
    radius: Double,
    radiusRange: Double,
    serialize: () => Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): HemisphericParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), buildUniformLayout = js.Any.fromFunction1(buildUniformLayout), directionRandomizer = directionRandomizer.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction1(parse), radius = radius.asInstanceOf[js.Any], radiusRange = radiusRange.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction4(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[HemisphericParticleEmitter]
  }
  
  extension [Self <: HemisphericParticleEmitter](x: Self) {
    
    inline def setDirectionRandomizer(value: Double): Self = StObject.set(x, "directionRandomizer", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Any => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusRange(value: Double): Self = StObject.set(x, "radiusRange", value.asInstanceOf[js.Any])
    
    inline def setStartDirectionFunction(value: (Matrix, Vector3, Particle, Boolean) => Unit): Self = StObject.set(x, "startDirectionFunction", js.Any.fromFunction4(value))
  }
}
