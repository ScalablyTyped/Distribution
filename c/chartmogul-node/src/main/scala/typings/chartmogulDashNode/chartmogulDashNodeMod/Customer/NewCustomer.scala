package typings.chartmogulDashNode.chartmogulDashNodeMod.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewCustomer extends js.Object {
  var attributes: js.UndefOr[NewAttributes] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var company: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var data_source_uuid: String
  var email: js.UndefOr[String] = js.undefined
  var external_id: String
  var free_trial_started_at: js.UndefOr[String] = js.undefined
  var lead_created_at: js.UndefOr[String] = js.undefined
  var name: String
  var state: js.UndefOr[String] = js.undefined
  var zip: js.UndefOr[String] = js.undefined
}

object NewCustomer {
  @scala.inline
  def apply(
    data_source_uuid: String,
    external_id: String,
    name: String,
    attributes: NewAttributes = null,
    city: String = null,
    company: String = null,
    country: String = null,
    email: String = null,
    free_trial_started_at: String = null,
    lead_created_at: String = null,
    state: String = null,
    zip: String = null
  ): NewCustomer = {
    val __obj = js.Dynamic.literal(data_source_uuid = data_source_uuid.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (free_trial_started_at != null) __obj.updateDynamic("free_trial_started_at")(free_trial_started_at.asInstanceOf[js.Any])
    if (lead_created_at != null) __obj.updateDynamic("lead_created_at")(lead_created_at.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewCustomer]
  }
}

