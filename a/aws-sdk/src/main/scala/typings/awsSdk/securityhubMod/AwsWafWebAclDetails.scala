package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsWafWebAclDetails extends js.Object {
  /**
    * The action to perform if none of the Rules contained in the WebACL match.
    */
  var DefaultAction: js.UndefOr[NonEmptyString] = js.native
  /**
    * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the rule.
    */
  var Rules: js.UndefOr[AwsWafWebAclRuleList] = js.native
  /**
    * A unique identifier for a WebACL.
    */
  var WebAclId: js.UndefOr[NonEmptyString] = js.native
}

object AwsWafWebAclDetails {
  @scala.inline
  def apply(
    DefaultAction: NonEmptyString = null,
    Name: NonEmptyString = null,
    Rules: AwsWafWebAclRuleList = null,
    WebAclId: NonEmptyString = null
  ): AwsWafWebAclDetails = {
    val __obj = js.Dynamic.literal()
    if (DefaultAction != null) __obj.updateDynamic("DefaultAction")(DefaultAction.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    if (WebAclId != null) __obj.updateDynamic("WebAclId")(WebAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsWafWebAclDetails]
  }
}

