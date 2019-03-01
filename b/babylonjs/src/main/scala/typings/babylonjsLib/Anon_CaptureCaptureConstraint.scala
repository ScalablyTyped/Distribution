package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaptureCaptureConstraint extends js.Object {
  var capture: scala.Null
  var captureConstraint: scala.Null
  var key: java.lang.String
  var targets: js.Array[java.lang.String]
}

object Anon_CaptureCaptureConstraint {
  @scala.inline
  def apply(
    capture: scala.Null,
    captureConstraint: scala.Null,
    key: java.lang.String,
    targets: js.Array[java.lang.String]
  ): Anon_CaptureCaptureConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capture")(capture)
    __obj.updateDynamic("captureConstraint")(captureConstraint)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[Anon_CaptureCaptureConstraint]
  }
}

