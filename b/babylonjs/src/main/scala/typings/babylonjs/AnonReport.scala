package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReport extends js.Object {
  var report: String
  var skinned: Boolean
  var valid: Boolean
}

object AnonReport {
  @scala.inline
  def apply(report: String, skinned: Boolean, valid: Boolean): AnonReport = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any], skinned = skinned.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReport]
  }
}

