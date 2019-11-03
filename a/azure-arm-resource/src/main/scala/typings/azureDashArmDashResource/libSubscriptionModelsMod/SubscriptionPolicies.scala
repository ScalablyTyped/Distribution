package typings.azureDashArmDashResource.libSubscriptionModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPolicies extends js.Object {
  /**
    * The subscription location placement ID. The ID indicates which regions are visible for a
    * subscription. For example, a subscription with a location placement Id of Public_2014-09-01
    * has access to Azure public regions.
    */
  val locationPlacementId: js.UndefOr[String] = js.undefined
  /**
    * The subscription quota ID.
    */
  val quotaId: js.UndefOr[String] = js.undefined
  /**
    * The subscription spending limit. Possible values include: 'On', 'Off', 'CurrentPeriodOff'
    */
  val spendingLimit: js.UndefOr[String] = js.undefined
}

object SubscriptionPolicies {
  @scala.inline
  def apply(locationPlacementId: String = null, quotaId: String = null, spendingLimit: String = null): SubscriptionPolicies = {
    val __obj = js.Dynamic.literal()
    if (locationPlacementId != null) __obj.updateDynamic("locationPlacementId")(locationPlacementId)
    if (quotaId != null) __obj.updateDynamic("quotaId")(quotaId)
    if (spendingLimit != null) __obj.updateDynamic("spendingLimit")(spendingLimit)
    __obj.asInstanceOf[SubscriptionPolicies]
  }
}

