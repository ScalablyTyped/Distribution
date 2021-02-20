package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HemisphericParticleEmitter extends IParticleEmitterType {
  
  /**
    * How much to randomize the particle direction [0-1].
    */
  var directionRandomizer: Double = js.native
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: js.Any): Unit = js.native
  
  /**
    * The radius of the emission hemisphere.
    */
  var radius: Double = js.native
  
  /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  var radiusRange: Double = js.native
}
object HemisphericParticleEmitter {
  
  @scala.inline
  def apply(
    applyToShader: Effect => Unit,
    directionRandomizer: Double,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: js.Any => Unit,
    radius: Double,
    radiusRange: Double,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): HemisphericParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), directionRandomizer = directionRandomizer.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction1(parse), radius = radius.asInstanceOf[js.Any], radiusRange = radiusRange.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction4(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[HemisphericParticleEmitter]
  }
  
  @scala.inline
  implicit class HemisphericParticleEmitterMutableBuilder[Self <: HemisphericParticleEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectionRandomizer(value: Double): Self = StObject.set(x, "directionRandomizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: js.Any => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusRange(value: Double): Self = StObject.set(x, "radiusRange", value.asInstanceOf[js.Any])
  }
}
