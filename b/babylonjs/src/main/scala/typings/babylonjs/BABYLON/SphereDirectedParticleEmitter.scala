package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SphereDirectedParticleEmitter extends SphereParticleEmitter {
  
  /**
    * The min limit of the emission direction.
    */
  var direction1: Vector3 = js.native
  
  /**
    * The max limit of the emission direction.
    */
  var direction2: Vector3 = js.native
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle): Unit = js.native
}
object SphereDirectedParticleEmitter {
  
  @scala.inline
  def apply(
    applyToShader: Effect => Unit,
    direction1: Vector3,
    direction2: Vector3,
    directionRandomizer: Double,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: js.Any => Unit,
    radius: Double,
    radiusRange: Double,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): SphereDirectedParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), direction1 = direction1.asInstanceOf[js.Any], direction2 = direction2.asInstanceOf[js.Any], directionRandomizer = directionRandomizer.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction1(parse), radius = radius.asInstanceOf[js.Any], radiusRange = radiusRange.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction3(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[SphereDirectedParticleEmitter]
  }
  
  @scala.inline
  implicit class SphereDirectedParticleEmitterMutableBuilder[Self <: SphereDirectedParticleEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection1(value: Vector3): Self = StObject.set(x, "direction1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection2(value: Vector3): Self = StObject.set(x, "direction2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDirectionFunction(value: (Matrix, Vector3, Particle) => Unit): Self = StObject.set(x, "startDirectionFunction", js.Any.fromFunction3(value))
  }
}
