package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlan extends js.Object {
  /**
    * The hourly commitment, in USD.
    */
  var commitment: js.UndefOr[Amount] = js.native
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  /**
    * The description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The EC2 instance family.
    */
  var ec2InstanceFamily: js.UndefOr[EC2InstanceFamily] = js.native
  /**
    * The end time.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[SavingsPlanOfferingId] = js.native
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.native
  /**
    * The product types.
    */
  var productTypes: js.UndefOr[SavingsPlanProductTypeList] = js.native
  /**
    * The recurring payment amount.
    */
  var recurringPaymentAmount: js.UndefOr[Amount] = js.native
  /**
    * The AWS Region.
    */
  var region: js.UndefOr[Region] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Savings Plan.
    */
  var savingsPlanArn: js.UndefOr[SavingsPlanArn] = js.native
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: js.UndefOr[SavingsPlanId] = js.native
  /**
    * The plan type.
    */
  var savingsPlanType: js.UndefOr[SavingsPlanType] = js.native
  /**
    * The start time.
    */
  var start: js.UndefOr[String] = js.native
  /**
    * The state.
    */
  var state: js.UndefOr[SavingsPlanState] = js.native
  /**
    * One or more tags.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The duration of the term, in seconds.
    */
  var termDurationInSeconds: js.UndefOr[TermDurationInSeconds] = js.native
  /**
    * The up-front payment amount.
    */
  var upfrontPaymentAmount: js.UndefOr[Amount] = js.native
}

object SavingsPlan {
  @scala.inline
  def apply(
    commitment: Amount = null,
    currency: CurrencyCode = null,
    description: String = null,
    ec2InstanceFamily: EC2InstanceFamily = null,
    end: String = null,
    offeringId: SavingsPlanOfferingId = null,
    paymentOption: SavingsPlanPaymentOption = null,
    productTypes: SavingsPlanProductTypeList = null,
    recurringPaymentAmount: Amount = null,
    region: Region = null,
    savingsPlanArn: SavingsPlanArn = null,
    savingsPlanId: SavingsPlanId = null,
    savingsPlanType: SavingsPlanType = null,
    start: String = null,
    state: SavingsPlanState = null,
    tags: TagMap = null,
    termDurationInSeconds: js.UndefOr[TermDurationInSeconds] = js.undefined,
    upfrontPaymentAmount: Amount = null
  ): SavingsPlan = {
    val __obj = js.Dynamic.literal()
    if (commitment != null) __obj.updateDynamic("commitment")(commitment.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ec2InstanceFamily != null) __obj.updateDynamic("ec2InstanceFamily")(ec2InstanceFamily.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (offeringId != null) __obj.updateDynamic("offeringId")(offeringId.asInstanceOf[js.Any])
    if (paymentOption != null) __obj.updateDynamic("paymentOption")(paymentOption.asInstanceOf[js.Any])
    if (productTypes != null) __obj.updateDynamic("productTypes")(productTypes.asInstanceOf[js.Any])
    if (recurringPaymentAmount != null) __obj.updateDynamic("recurringPaymentAmount")(recurringPaymentAmount.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (savingsPlanArn != null) __obj.updateDynamic("savingsPlanArn")(savingsPlanArn.asInstanceOf[js.Any])
    if (savingsPlanId != null) __obj.updateDynamic("savingsPlanId")(savingsPlanId.asInstanceOf[js.Any])
    if (savingsPlanType != null) __obj.updateDynamic("savingsPlanType")(savingsPlanType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(termDurationInSeconds)) __obj.updateDynamic("termDurationInSeconds")(termDurationInSeconds.get.asInstanceOf[js.Any])
    if (upfrontPaymentAmount != null) __obj.updateDynamic("upfrontPaymentAmount")(upfrontPaymentAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlan]
  }
}

