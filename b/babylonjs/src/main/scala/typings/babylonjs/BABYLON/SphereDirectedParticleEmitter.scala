package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SphereDirectedParticleEmitter")
@js.native
/**
  * Creates a new instance SphereDirectedParticleEmitter
  * @param radius the radius of the emission sphere (1 by default)
  * @param direction1 the min limit of the emission direction (up vector by default)
  * @param direction2 the max limit of the emission direction (up vector by default)
  */
class SphereDirectedParticleEmitter () extends SphereParticleEmitter {
  def this(radius: Double) = this()
  def this(radius: Double, /**
    * The min limit of the emission direction.
    */
  direction1: Vector3) = this()
  def this(
    radius: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: Vector3,
    /**
    * The max limit of the emission direction.
    */
  direction2: Vector3
  ) = this()
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

