package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SphereDirectedParticleEmitter
  extends StObject
     with SphereParticleEmitter {
  
  /**
    * The min limit of the emission direction.
    */
  var direction1: Vector3
  
  /**
    * The max limit of the emission direction.
    */
  var direction2: Vector3
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3): Unit
}
object SphereDirectedParticleEmitter {
  
  inline def apply(
    applyToShader: UniformBufferEffectCommonAccessor => Unit,
    buildUniformLayout: UniformBuffer => Unit,
    direction1: Vector3,
    direction2: Vector3,
    directionRandomizer: Double,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: Any => Unit,
    radius: Double,
    radiusRange: Double,
    serialize: () => Any,
    startDirectionFunction: (Matrix, Vector3) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): SphereDirectedParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), buildUniformLayout = js.Any.fromFunction1(buildUniformLayout), direction1 = direction1.asInstanceOf[js.Any], direction2 = direction2.asInstanceOf[js.Any], directionRandomizer = directionRandomizer.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction1(parse), radius = radius.asInstanceOf[js.Any], radiusRange = radiusRange.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction2(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[SphereDirectedParticleEmitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SphereDirectedParticleEmitter] (val x: Self) extends AnyVal {
    
    inline def setDirection1(value: Vector3): Self = StObject.set(x, "direction1", value.asInstanceOf[js.Any])
    
    inline def setDirection2(value: Vector3): Self = StObject.set(x, "direction2", value.asInstanceOf[js.Any])
    
    inline def setStartDirectionFunction(value: (Matrix, Vector3) => Unit): Self = StObject.set(x, "startDirectionFunction", js.Any.fromFunction2(value))
  }
}
