package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JacobianElement extends js.Object {
  var rotational: Vec3
  var spatial: Vec3
  def multiplyElement(element: JacobianElement): Double
  def multiplyVectors(spacial: Vec3, rotational: Vec3): Double
}

object JacobianElement {
  @scala.inline
  def apply(
    multiplyElement: JacobianElement => Double,
    multiplyVectors: (Vec3, Vec3) => Double,
    rotational: Vec3,
    spatial: Vec3
  ): JacobianElement = {
    val __obj = js.Dynamic.literal(multiplyElement = js.Any.fromFunction1(multiplyElement), multiplyVectors = js.Any.fromFunction2(multiplyVectors), rotational = rotational.asInstanceOf[js.Any], spatial = spatial.asInstanceOf[js.Any])
    __obj.asInstanceOf[JacobianElement]
  }
}

