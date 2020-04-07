package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapture extends js.Object {
  var capture: String
  var captureConstraint: Double
  var key: String
  var targets: js.Array[String]
}

object AnonCapture {
  @scala.inline
  def apply(capture: String, captureConstraint: Double, key: String, targets: js.Array[String]): AnonCapture = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], captureConstraint = captureConstraint.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCapture]
  }
}

