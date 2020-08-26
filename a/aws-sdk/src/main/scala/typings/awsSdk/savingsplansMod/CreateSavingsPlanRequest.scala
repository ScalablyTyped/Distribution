package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSavingsPlanRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * The hourly commitment, in USD. This is a value between 0.001 and 1 million. You cannot specify more than three digits after the decimal point.
    */
  var commitment: Amount = js.native
  /**
    * The ID of the offering.
    */
  var savingsPlanOfferingId: SavingsPlanOfferingId = js.native
  /**
    * One or more tags.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The up-front payment amount. This is a whole number between 50 and 99 percent of the total value of the Savings Plan. This parameter is supported only if the payment option is Partial Upfront.
    */
  var upfrontPaymentAmount: js.UndefOr[Amount] = js.native
}

object CreateSavingsPlanRequest {
  @scala.inline
  def apply(commitment: Amount, savingsPlanOfferingId: SavingsPlanOfferingId): CreateSavingsPlanRequest = {
    val __obj = js.Dynamic.literal(commitment = commitment.asInstanceOf[js.Any], savingsPlanOfferingId = savingsPlanOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSavingsPlanRequest]
  }
  @scala.inline
  implicit class CreateSavingsPlanRequestOps[Self <: CreateSavingsPlanRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommitment(value: Amount): Self = this.set("commitment", value.asInstanceOf[js.Any])
    @scala.inline
    def setSavingsPlanOfferingId(value: SavingsPlanOfferingId): Self = this.set("savingsPlanOfferingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUpfrontPaymentAmount(value: Amount): Self = this.set("upfrontPaymentAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpfrontPaymentAmount: Self = this.set("upfrontPaymentAmount", js.undefined)
  }
  
}

