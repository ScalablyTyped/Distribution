package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSecurityGroupRuleDescriptionsEgressResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object UpdateSecurityGroupRuleDescriptionsEgressResult {
  @scala.inline
  def apply(Return: js.UndefOr[Boolean] = js.undefined): UpdateSecurityGroupRuleDescriptionsEgressResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecurityGroupRuleDescriptionsEgressResult]
  }
}

