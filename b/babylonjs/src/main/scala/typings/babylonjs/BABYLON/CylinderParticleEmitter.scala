package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CylinderParticleEmitter
  extends StObject
     with IParticleEmitterType {
  
  /* private */ var _tempVector: Any
  
  /**
    * How much to randomize the particle direction [0-1].
    */
  var directionRandomizer: Double
  
  /**
    * The height of the emission cylinder.
    */
  var height: Double
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: Any): Unit
  
  /**
    * The radius of the emission cylinder.
    */
  var radius: Double
  
  /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  var radiusRange: Double
}
object CylinderParticleEmitter {
  
  inline def apply(
    _tempVector: Any,
    applyToShader: UniformBufferEffectCommonAccessor => Unit,
    buildUniformLayout: UniformBuffer => Unit,
    directionRandomizer: Double,
    getClassName: () => String,
    getEffectDefines: () => String,
    height: Double,
    parse: Any => Unit,
    radius: Double,
    radiusRange: Double,
    serialize: () => Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean, Matrix) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): CylinderParticleEmitter = {
    val __obj = js.Dynamic.literal(_tempVector = _tempVector.asInstanceOf[js.Any], applyToShader = js.Any.fromFunction1(applyToShader), buildUniformLayout = js.Any.fromFunction1(buildUniformLayout), directionRandomizer = directionRandomizer.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), height = height.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), radius = radius.asInstanceOf[js.Any], radiusRange = radiusRange.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction5(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[CylinderParticleEmitter]
  }
  
  extension [Self <: CylinderParticleEmitter](x: Self) {
    
    inline def setDirectionRandomizer(value: Double): Self = StObject.set(x, "directionRandomizer", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Any => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusRange(value: Double): Self = StObject.set(x, "radiusRange", value.asInstanceOf[js.Any])
    
    inline def set_tempVector(value: Any): Self = StObject.set(x, "_tempVector", value.asInstanceOf[js.Any])
  }
}
