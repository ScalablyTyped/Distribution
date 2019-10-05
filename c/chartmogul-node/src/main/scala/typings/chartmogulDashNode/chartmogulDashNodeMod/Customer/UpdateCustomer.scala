package typings.chartmogulDashNode.chartmogulDashNodeMod.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCustomer extends js.Object {
  var attributes: js.UndefOr[NewAttributes] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var company: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var free_trial_started_at: js.UndefOr[String] = js.undefined
  var lead_created_at: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var zip: js.UndefOr[String] = js.undefined
}

object UpdateCustomer {
  @scala.inline
  def apply(
    attributes: NewAttributes = null,
    city: String = null,
    company: String = null,
    country: String = null,
    email: String = null,
    free_trial_started_at: String = null,
    lead_created_at: String = null,
    name: String = null,
    state: String = null,
    zip: String = null
  ): UpdateCustomer = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (city != null) __obj.updateDynamic("city")(city)
    if (company != null) __obj.updateDynamic("company")(company)
    if (country != null) __obj.updateDynamic("country")(country)
    if (email != null) __obj.updateDynamic("email")(email)
    if (free_trial_started_at != null) __obj.updateDynamic("free_trial_started_at")(free_trial_started_at)
    if (lead_created_at != null) __obj.updateDynamic("lead_created_at")(lead_created_at)
    if (name != null) __obj.updateDynamic("name")(name)
    if (state != null) __obj.updateDynamic("state")(state)
    if (zip != null) __obj.updateDynamic("zip")(zip)
    __obj.asInstanceOf[UpdateCustomer]
  }
}

