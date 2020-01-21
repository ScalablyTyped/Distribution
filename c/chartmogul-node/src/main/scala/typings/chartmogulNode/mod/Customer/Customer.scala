package typings.chartmogulNode.mod.Customer

import typings.chartmogulNode.AnonAddresszip
import typings.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Customer extends js.Object {
  var address: js.UndefOr[AnonAddresszip] = js.undefined
  var arr: js.UndefOr[Double] = js.undefined
  var attributes: js.UndefOr[Attributes_] = js.undefined
  var `billing-system-type`: js.UndefOr[String] = js.undefined
  var `billing-system-url`: js.UndefOr[String] = js.undefined
  var `chartmogul-url`: js.UndefOr[String] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var company: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var `currency-sign`: js.UndefOr[String] = js.undefined
  var `customer-since`: js.UndefOr[String] = js.undefined
  var data_source_uuid: js.UndefOr[String] = js.undefined
  var data_source_uuids: js.UndefOr[Strings] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
  var external_ids: js.UndefOr[Strings] = js.undefined
  var free_trial_started_at: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var lead_created_at: js.UndefOr[String] = js.undefined
  var mrr: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
  var zip: js.UndefOr[String] = js.undefined
}

object Customer {
  @scala.inline
  def apply(
    address: AnonAddresszip = null,
    arr: Int | Double = null,
    attributes: Attributes_ = null,
    `billing-system-type`: String = null,
    `billing-system-url`: String = null,
    `chartmogul-url`: String = null,
    city: String = null,
    company: String = null,
    country: String = null,
    currency: String = null,
    `currency-sign`: String = null,
    `customer-since`: String = null,
    data_source_uuid: String = null,
    data_source_uuids: Strings = null,
    email: String = null,
    external_id: String = null,
    external_ids: Strings = null,
    free_trial_started_at: String = null,
    id: Int | Double = null,
    lead_created_at: String = null,
    mrr: Int | Double = null,
    name: String = null,
    state: String = null,
    status: String = null,
    uuid: String = null,
    zip: String = null
  ): Customer = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (arr != null) __obj.updateDynamic("arr")(arr.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (`billing-system-type` != null) __obj.updateDynamic("billing-system-type")(`billing-system-type`.asInstanceOf[js.Any])
    if (`billing-system-url` != null) __obj.updateDynamic("billing-system-url")(`billing-system-url`.asInstanceOf[js.Any])
    if (`chartmogul-url` != null) __obj.updateDynamic("chartmogul-url")(`chartmogul-url`.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (`currency-sign` != null) __obj.updateDynamic("currency-sign")(`currency-sign`.asInstanceOf[js.Any])
    if (`customer-since` != null) __obj.updateDynamic("customer-since")(`customer-since`.asInstanceOf[js.Any])
    if (data_source_uuid != null) __obj.updateDynamic("data_source_uuid")(data_source_uuid.asInstanceOf[js.Any])
    if (data_source_uuids != null) __obj.updateDynamic("data_source_uuids")(data_source_uuids.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (external_ids != null) __obj.updateDynamic("external_ids")(external_ids.asInstanceOf[js.Any])
    if (free_trial_started_at != null) __obj.updateDynamic("free_trial_started_at")(free_trial_started_at.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lead_created_at != null) __obj.updateDynamic("lead_created_at")(lead_created_at.asInstanceOf[js.Any])
    if (mrr != null) __obj.updateDynamic("mrr")(mrr.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customer]
  }
}

