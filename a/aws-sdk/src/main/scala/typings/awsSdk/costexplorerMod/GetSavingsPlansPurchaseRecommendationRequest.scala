package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansPurchaseRecommendationRequest extends js.Object {
  /**
    * The lookback period used to generate the recommendation.
    */
  var LookbackPeriodInDays: typings.awsSdk.costexplorerMod.LookbackPeriodInDays = js.native
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The payment option used to generate these recommendations.
    */
  var PaymentOption: typings.awsSdk.costexplorerMod.PaymentOption = js.native
  /**
    * The Savings Plans recommendation type requested.
    */
  var SavingsPlansType: SupportedSavingsPlansType = js.native
  /**
    * The savings plan recommendation term used to generated these recommendations.
    */
  var TermInYears: typings.awsSdk.costexplorerMod.TermInYears = js.native
}

object GetSavingsPlansPurchaseRecommendationRequest {
  @scala.inline
  def apply(
    LookbackPeriodInDays: LookbackPeriodInDays,
    PaymentOption: PaymentOption,
    SavingsPlansType: SupportedSavingsPlansType,
    TermInYears: TermInYears,
    NextPageToken: NextPageToken = null,
    PageSize: Int | Double = null
  ): GetSavingsPlansPurchaseRecommendationRequest = {
    val __obj = js.Dynamic.literal(LookbackPeriodInDays = LookbackPeriodInDays.asInstanceOf[js.Any], PaymentOption = PaymentOption.asInstanceOf[js.Any], SavingsPlansType = SavingsPlansType.asInstanceOf[js.Any], TermInYears = TermInYears.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationRequest]
  }
}

