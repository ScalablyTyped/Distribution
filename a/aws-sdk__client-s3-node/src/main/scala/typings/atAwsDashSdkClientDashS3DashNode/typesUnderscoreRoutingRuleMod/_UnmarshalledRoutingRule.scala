package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRoutingRuleMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreConditionMod._UnmarshalledCondition
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRedirectMod._UnmarshalledRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRoutingRule extends _RoutingRule {
  /**
    * <p>A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.</p>
    */
  @JSName("Condition")
  var Condition__UnmarshalledRoutingRule: js.UndefOr[_UnmarshalledCondition] = js.undefined
  /**
    * <p>Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can can specify a different error code to return.</p>
    */
  @JSName("Redirect")
  var Redirect__UnmarshalledRoutingRule: _UnmarshalledRedirect
}

object _UnmarshalledRoutingRule {
  @scala.inline
  def apply(Redirect: _UnmarshalledRedirect, Condition: _UnmarshalledCondition = null): _UnmarshalledRoutingRule = {
    val __obj = js.Dynamic.literal(Redirect = Redirect)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition)
    __obj.asInstanceOf[_UnmarshalledRoutingRule]
  }
}

