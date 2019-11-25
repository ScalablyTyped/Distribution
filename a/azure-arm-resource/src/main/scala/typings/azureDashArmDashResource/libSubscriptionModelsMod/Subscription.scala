package typings.azureDashArmDashResource.libSubscriptionModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  /**
    * The authorization source of the request. Valid values are one or more combinations of Legacy,
    * RoleBased, Bypassed, Direct and Management. For example, 'Legacy, RoleBased'.
    */
  var authorizationSource: js.UndefOr[String] = js.undefined
  /**
    * The subscription display name.
    */
  val displayName: js.UndefOr[String] = js.undefined
  /**
    * The fully qualified ID for the subscription. For example,
    * /subscriptions/00000000-0000-0000-0000-000000000000.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The subscription state. Possible values are Enabled, Warned, PastDue, Disabled, and Deleted.
    * Possible values include: 'Enabled', 'Warned', 'PastDue', 'Disabled', 'Deleted'
    */
  val state: js.UndefOr[String] = js.undefined
  /**
    * The subscription ID.
    */
  val subscriptionId: js.UndefOr[String] = js.undefined
  /**
    * The subscription policies.
    */
  var subscriptionPolicies: js.UndefOr[SubscriptionPolicies] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    authorizationSource: String = null,
    displayName: String = null,
    id: String = null,
    state: String = null,
    subscriptionId: String = null,
    subscriptionPolicies: SubscriptionPolicies = null
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (authorizationSource != null) __obj.updateDynamic("authorizationSource")(authorizationSource.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (subscriptionId != null) __obj.updateDynamic("subscriptionId")(subscriptionId.asInstanceOf[js.Any])
    if (subscriptionPolicies != null) __obj.updateDynamic("subscriptionPolicies")(subscriptionPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
}

