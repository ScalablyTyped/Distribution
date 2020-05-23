package typings.babylonjs

import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRRigidTransform extends js.Object {
  var inverse: XRRigidTransform
  var matrix: Float32Array
  var orientation: DOMPointReadOnly
  var position: DOMPointReadOnly
}

object XRRigidTransform {
  @scala.inline
  def apply(
    inverse: XRRigidTransform,
    matrix: Float32Array,
    orientation: DOMPointReadOnly,
    position: DOMPointReadOnly
  ): XRRigidTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRigidTransform]
  }
}

