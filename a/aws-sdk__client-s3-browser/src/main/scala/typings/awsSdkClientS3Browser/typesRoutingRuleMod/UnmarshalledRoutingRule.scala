package typings.awsSdkClientS3Browser.typesRoutingRuleMod

import typings.awsSdkClientS3Browser.typesConditionMod.UnmarshalledCondition
import typings.awsSdkClientS3Browser.typesRedirectMod.UnmarshalledRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledRoutingRule extends RoutingRule {
  /**
    * <p>A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.</p>
    */
  @JSName("Condition")
  var Condition_UnmarshalledRoutingRule: js.UndefOr[UnmarshalledCondition] = js.undefined
  /**
    * <p>Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can can specify a different error code to return.</p>
    */
  @JSName("Redirect")
  var Redirect_UnmarshalledRoutingRule: UnmarshalledRedirect
}

object UnmarshalledRoutingRule {
  @scala.inline
  def apply(Redirect: UnmarshalledRedirect, Condition: UnmarshalledCondition = null): UnmarshalledRoutingRule = {
    val __obj = js.Dynamic.literal(Redirect = Redirect.asInstanceOf[js.Any])
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRoutingRule]
  }
}

