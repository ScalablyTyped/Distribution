package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentSavingsPlanOffering extends js.Object {
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  /**
    * The duration, in seconds.
    */
  var durationSeconds: js.UndefOr[SavingsPlansDuration] = js.native
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[UUID] = js.native
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.native
  /**
    * The description.
    */
  var planDescription: js.UndefOr[SavingsPlanDescription] = js.native
  /**
    * The plan type.
    */
  var planType: js.UndefOr[SavingsPlanType] = js.native
}

object ParentSavingsPlanOffering {
  @scala.inline
  def apply(
    currency: CurrencyCode = null,
    durationSeconds: js.UndefOr[SavingsPlansDuration] = js.undefined,
    offeringId: UUID = null,
    paymentOption: SavingsPlanPaymentOption = null,
    planDescription: SavingsPlanDescription = null,
    planType: SavingsPlanType = null
  ): ParentSavingsPlanOffering = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (!js.isUndefined(durationSeconds)) __obj.updateDynamic("durationSeconds")(durationSeconds.get.asInstanceOf[js.Any])
    if (offeringId != null) __obj.updateDynamic("offeringId")(offeringId.asInstanceOf[js.Any])
    if (paymentOption != null) __obj.updateDynamic("paymentOption")(paymentOption.asInstanceOf[js.Any])
    if (planDescription != null) __obj.updateDynamic("planDescription")(planDescription.asInstanceOf[js.Any])
    if (planType != null) __obj.updateDynamic("planType")(planType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentSavingsPlanOffering]
  }
}

