package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigRuleRequest extends js.Object {
  /**
    * The name of the AWS Config rule that you want to delete.
    */
  var ConfigRuleName: StringWithCharLimit64 = js.native
}

object DeleteConfigRuleRequest {
  @scala.inline
  def apply(ConfigRuleName: StringWithCharLimit64): DeleteConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConfigRuleRequest]
  }
}

