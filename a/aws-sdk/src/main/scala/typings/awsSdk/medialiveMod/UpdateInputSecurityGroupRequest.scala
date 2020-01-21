package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInputSecurityGroupRequest extends js.Object {
  /**
    * The id of the Input Security Group to update.
    */
  var InputSecurityGroupId: string = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
  /**
    * List of IPv4 CIDR addresses to whitelist
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRuleCidr] = js.native
}

object UpdateInputSecurityGroupRequest {
  @scala.inline
  def apply(
    InputSecurityGroupId: string,
    Tags: Tags = null,
    WhitelistRules: listOfInputWhitelistRuleCidr = null
  ): UpdateInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (WhitelistRules != null) __obj.updateDynamic("WhitelistRules")(WhitelistRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputSecurityGroupRequest]
  }
}

