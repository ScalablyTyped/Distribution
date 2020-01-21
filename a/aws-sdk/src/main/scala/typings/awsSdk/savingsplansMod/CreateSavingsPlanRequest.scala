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
  def apply(
    commitment: Amount,
    savingsPlanOfferingId: SavingsPlanOfferingId,
    clientToken: ClientToken = null,
    tags: TagMap = null,
    upfrontPaymentAmount: Amount = null
  ): CreateSavingsPlanRequest = {
    val __obj = js.Dynamic.literal(commitment = commitment.asInstanceOf[js.Any], savingsPlanOfferingId = savingsPlanOfferingId.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (upfrontPaymentAmount != null) __obj.updateDynamic("upfrontPaymentAmount")(upfrontPaymentAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSavingsPlanRequest]
  }
}

