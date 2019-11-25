package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinData extends js.Object {
  var commercial: js.UndefOr[Commercial] = js.undefined
  var countryOfIssuance: js.UndefOr[String] = js.undefined
  var debit: js.UndefOr[Debit] = js.undefined
  var durbinRegulated: js.UndefOr[DurbinRegulated] = js.undefined
  var healthcare: js.UndefOr[HealthCare] = js.undefined
  var issuingBank: js.UndefOr[String] = js.undefined
  var payroll: js.UndefOr[Payroll] = js.undefined
  var prepaid: js.UndefOr[Prepaid] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
}

object BinData {
  @scala.inline
  def apply(
    commercial: Commercial = null,
    countryOfIssuance: String = null,
    debit: Debit = null,
    durbinRegulated: DurbinRegulated = null,
    healthcare: HealthCare = null,
    issuingBank: String = null,
    payroll: Payroll = null,
    prepaid: Prepaid = null,
    productId: String = null
  ): BinData = {
    val __obj = js.Dynamic.literal()
    if (commercial != null) __obj.updateDynamic("commercial")(commercial.asInstanceOf[js.Any])
    if (countryOfIssuance != null) __obj.updateDynamic("countryOfIssuance")(countryOfIssuance.asInstanceOf[js.Any])
    if (debit != null) __obj.updateDynamic("debit")(debit.asInstanceOf[js.Any])
    if (durbinRegulated != null) __obj.updateDynamic("durbinRegulated")(durbinRegulated.asInstanceOf[js.Any])
    if (healthcare != null) __obj.updateDynamic("healthcare")(healthcare.asInstanceOf[js.Any])
    if (issuingBank != null) __obj.updateDynamic("issuingBank")(issuingBank.asInstanceOf[js.Any])
    if (payroll != null) __obj.updateDynamic("payroll")(payroll.asInstanceOf[js.Any])
    if (prepaid != null) __obj.updateDynamic("prepaid")(prepaid.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinData]
  }
}

