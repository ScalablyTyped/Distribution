package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureConstraint extends js.Object {
  var capture: Null
  var captureConstraint: Null
  var key: String
  var targets: js.Array[String]
}

object CaptureConstraint {
  @scala.inline
  def apply(capture: Null, captureConstraint: Null, key: String, targets: js.Array[String]): CaptureConstraint = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], captureConstraint = captureConstraint.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureConstraint]
  }
}

