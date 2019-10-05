package typings.chartmogulDashNode.chartmogulDashNodeMod.Invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineItem extends js.Object {
  var account_code: js.UndefOr[String] = js.undefined
  var amount_in_cents: js.UndefOr[Double] = js.undefined
  var cancelled_at: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var discount_amount_in_cents: js.UndefOr[Double] = js.undefined
  var discount_code: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
  var plan_uuid: js.UndefOr[String] = js.undefined
  var prorated: js.UndefOr[Boolean] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var service_period_end: js.UndefOr[String] = js.undefined
  var service_period_start: js.UndefOr[String] = js.undefined
  var subscription_external_id: js.UndefOr[String] = js.undefined
  var subscription_uuid: js.UndefOr[String] = js.undefined
  var tax_amount_in_cents: js.UndefOr[Double] = js.undefined
  var transaction_fees_in_cents: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object LineItem {
  @scala.inline
  def apply(
    account_code: String = null,
    amount_in_cents: Int | Double = null,
    cancelled_at: String = null,
    description: String = null,
    discount_amount_in_cents: Int | Double = null,
    discount_code: String = null,
    external_id: String = null,
    plan_uuid: String = null,
    prorated: js.UndefOr[Boolean] = js.undefined,
    quantity: Int | Double = null,
    service_period_end: String = null,
    service_period_start: String = null,
    subscription_external_id: String = null,
    subscription_uuid: String = null,
    tax_amount_in_cents: Int | Double = null,
    transaction_fees_in_cents: Int | Double = null,
    `type`: String = null,
    uuid: String = null
  ): LineItem = {
    val __obj = js.Dynamic.literal()
    if (account_code != null) __obj.updateDynamic("account_code")(account_code)
    if (amount_in_cents != null) __obj.updateDynamic("amount_in_cents")(amount_in_cents.asInstanceOf[js.Any])
    if (cancelled_at != null) __obj.updateDynamic("cancelled_at")(cancelled_at)
    if (description != null) __obj.updateDynamic("description")(description)
    if (discount_amount_in_cents != null) __obj.updateDynamic("discount_amount_in_cents")(discount_amount_in_cents.asInstanceOf[js.Any])
    if (discount_code != null) __obj.updateDynamic("discount_code")(discount_code)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (plan_uuid != null) __obj.updateDynamic("plan_uuid")(plan_uuid)
    if (!js.isUndefined(prorated)) __obj.updateDynamic("prorated")(prorated)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (service_period_end != null) __obj.updateDynamic("service_period_end")(service_period_end)
    if (service_period_start != null) __obj.updateDynamic("service_period_start")(service_period_start)
    if (subscription_external_id != null) __obj.updateDynamic("subscription_external_id")(subscription_external_id)
    if (subscription_uuid != null) __obj.updateDynamic("subscription_uuid")(subscription_uuid)
    if (tax_amount_in_cents != null) __obj.updateDynamic("tax_amount_in_cents")(tax_amount_in_cents.asInstanceOf[js.Any])
    if (transaction_fees_in_cents != null) __obj.updateDynamic("transaction_fees_in_cents")(transaction_fees_in_cents.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[LineItem]
  }
}

