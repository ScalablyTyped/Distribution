package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRuleVersionRequest extends js.Object {
  /**
    * The ID of the detector that includes the rule version to delete.
    */
  var detectorId: identifier = js.native
  /**
    * The rule ID of the rule version to delete.
    */
  var ruleId: identifier = js.native
  /**
    * The rule version to delete.
    */
  var ruleVersion: nonEmptyString = js.native
}

object DeleteRuleVersionRequest {
  @scala.inline
  def apply(detectorId: identifier, ruleId: identifier, ruleVersion: nonEmptyString): DeleteRuleVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], ruleVersion = ruleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleVersionRequest]
  }
}

