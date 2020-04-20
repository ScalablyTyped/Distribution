package typings.babylonjs

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRView extends js.Object {
  var eye: XREye
  var projectionMatrix: Float32Array
  var transform: XRRigidTransform
}

object XRView {
  @scala.inline
  def apply(eye: XREye, projectionMatrix: Float32Array, transform: XRRigidTransform): XRView = {
    val __obj = js.Dynamic.literal(eye = eye.asInstanceOf[js.Any], projectionMatrix = projectionMatrix.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRView]
  }
}

