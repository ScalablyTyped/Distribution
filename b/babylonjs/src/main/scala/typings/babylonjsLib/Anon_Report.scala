package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Report extends js.Object {
  var report: java.lang.String
  var skinned: scala.Boolean
  var valid: scala.Boolean
}

object Anon_Report {
  @scala.inline
  def apply(report: java.lang.String, skinned: scala.Boolean, valid: scala.Boolean): Anon_Report = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("report")(report)
    __obj.updateDynamic("skinned")(skinned)
    __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[Anon_Report]
  }
}

