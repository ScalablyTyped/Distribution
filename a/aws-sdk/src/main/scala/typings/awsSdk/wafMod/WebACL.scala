package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebACL extends js.Object {
  /**
    * The action to perform if none of the Rules contained in the WebACL match. The action is specified by the WafAction object.
    */
  var DefaultAction: WafAction = js.native
  /**
    * A friendly name or description for the metrics for this WebACL. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change MetricName after you create the WebACL.
    */
  var MetricName: js.UndefOr[typings.awsSdk.wafMod.MetricName] = js.native
  /**
    * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * An array that contains the action for each Rule in a WebACL, the priority of the Rule, and the ID of the Rule.
    */
  var Rules: ActivatedRules = js.native
  /**
    * Tha Amazon Resource Name (ARN) of the web ACL.
    */
  var WebACLArn: js.UndefOr[ResourceArn] = js.native
  /**
    * A unique identifier for a WebACL. You use WebACLId to get information about a WebACL (see GetWebACL), update a WebACL (see UpdateWebACL), and delete a WebACL from AWS WAF (see DeleteWebACL).  WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId = js.native
}

object WebACL {
  @scala.inline
  def apply(
    DefaultAction: WafAction,
    Rules: ActivatedRules,
    WebACLId: ResourceId,
    MetricName: MetricName = null,
    Name: ResourceName = null,
    WebACLArn: ResourceArn = null
  ): WebACL = {
    val __obj = js.Dynamic.literal(DefaultAction = DefaultAction.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (WebACLArn != null) __obj.updateDynamic("WebACLArn")(WebACLArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebACL]
  }
}

