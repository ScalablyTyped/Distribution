package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Capture extends js.Object {
  var capture: java.lang.String
  var captureConstraint: scala.Double
  var key: java.lang.String
  var targets: js.Array[java.lang.String]
}

object Anon_Capture {
  @scala.inline
  def apply(
    capture: java.lang.String,
    captureConstraint: scala.Double,
    key: java.lang.String,
    targets: js.Array[java.lang.String]
  ): Anon_Capture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capture")(capture)
    __obj.updateDynamic("captureConstraint")(captureConstraint)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[Anon_Capture]
  }
}

