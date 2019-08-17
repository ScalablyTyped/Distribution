package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRoutingRuleMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreConditionMod._Condition
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRedirectMod._Redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RoutingRule extends js.Object {
  /**
    * <p>A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.</p>
    */
  var Condition: js.UndefOr[_Condition] = js.undefined
  /**
    * <p>Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can can specify a different error code to return.</p>
    */
  var Redirect: _Redirect
}

object _RoutingRule {
  @scala.inline
  def apply(Redirect: _Redirect, Condition: _Condition = null): _RoutingRule = {
    val __obj = js.Dynamic.literal(Redirect = Redirect)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition)
    __obj.asInstanceOf[_RoutingRule]
  }
}

