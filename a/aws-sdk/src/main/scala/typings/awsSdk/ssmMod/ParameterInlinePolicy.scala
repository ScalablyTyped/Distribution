package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterInlinePolicy extends js.Object {
  /**
    * The status of the policy. Policies report the following statuses: Pending (the policy has not been enforced or applied yet), Finished (the policy was applied), Failed (the policy was not applied), or InProgress (the policy is being applied now). 
    */
  var PolicyStatus: js.UndefOr[String] = js.native
  /**
    * The JSON text of the policy.
    */
  var PolicyText: js.UndefOr[String] = js.native
  /**
    * The type of policy. Parameter Store supports the following policy types: Expiration, ExpirationNotification, and NoChangeNotification. 
    */
  var PolicyType: js.UndefOr[String] = js.native
}

object ParameterInlinePolicy {
  @scala.inline
  def apply(PolicyStatus: String = null, PolicyText: String = null, PolicyType: String = null): ParameterInlinePolicy = {
    val __obj = js.Dynamic.literal()
    if (PolicyStatus != null) __obj.updateDynamic("PolicyStatus")(PolicyStatus.asInstanceOf[js.Any])
    if (PolicyText != null) __obj.updateDynamic("PolicyText")(PolicyText.asInstanceOf[js.Any])
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterInlinePolicy]
  }
}

