package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "JacobianElement")
@js.native
class JacobianElement ()
  extends typings.cannon.CANNON.JacobianElement {
  /* CompleteClass */
  override var rotational: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var spatial: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def multiplyElement(element: typings.cannon.CANNON.JacobianElement): Double = js.native
  /* CompleteClass */
  override def multiplyVectors(spacial: typings.cannon.CANNON.Vec3, rotational: typings.cannon.CANNON.Vec3): Double = js.native
}

