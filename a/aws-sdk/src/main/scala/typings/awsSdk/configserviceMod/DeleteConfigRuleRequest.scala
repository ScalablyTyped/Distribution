package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigRuleRequest extends js.Object {
  /**
    * The name of the AWS Config rule that you want to delete.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName = js.native
}

object DeleteConfigRuleRequest {
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName): DeleteConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConfigRuleRequest]
  }
}

