package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.JacobianElement")
@js.native
class JacobianElement () extends js.Object {
  var rotational: Vec3 = js.native
  var spatial: Vec3 = js.native
  def multiplyElement(element: JacobianElement): Double = js.native
  def multiplyVectors(spacial: Vec3, rotational: Vec3): Double = js.native
}

