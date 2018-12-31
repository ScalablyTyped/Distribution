package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Particle emitter emitting particles from the inside of a sphere.
  * It emits the particles randomly between two vectors.
  */
@JSGlobal("BABYLON.SphereDirectedParticleEmitter")
@js.native
/**
  * Creates a new instance SphereDirectedParticleEmitter
  * @param radius the radius of the emission sphere (1 by default)
  * @param direction1 the min limit of the emission direction (up vector by default)
  * @param direction2 the max limit of the emission direction (up vector by default)
  */
class SphereDirectedParticleEmitter () extends SphereParticleEmitter {
  def this(radius: scala.Double) = this()
  def this(radius: scala.Double, /**
    * The min limit of the emission direction.
    */
  direction1: Vector3) = this()
  def this(radius: scala.Double, /**
    * The min limit of the emission direction.
    */
  direction1: Vector3, /**
    * The max limit of the emission direction.
    */
  direction2: Vector3) = this()
  /**
    * The min limit of the emission direction.
    */
  var direction1: Vector3 = js.native
  /**
    * The max limit of the emission direction.
    */
  var direction2: Vector3 = js.native
}

