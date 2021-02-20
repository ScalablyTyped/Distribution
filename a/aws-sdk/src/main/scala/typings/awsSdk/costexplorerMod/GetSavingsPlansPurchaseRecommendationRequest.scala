package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSavingsPlansPurchaseRecommendationRequest extends StObject {
  
  /**
    * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations including the management account and member accounts if the value is set to PAYER. If the value is LINKED, recommendations are calculated for individual member accounts only.
    */
  var AccountScope: js.UndefOr[typings.awsSdk.costexplorerMod.AccountScope] = js.native
  
  /**
    * You can filter your recommendations by Account ID with the LINKED_ACCOUNT dimension. To filter your recommendations by Account ID, specify Key as LINKED_ACCOUNT and Value as the comma-separated Acount ID(s) for which you want to see Savings Plans purchase recommendations. For GetSavingsPlansPurchaseRecommendation, the Filter does not include CostCategories or Tags. It only includes Dimensions. With Dimensions, Key must be LINKED_ACCOUNT and Value can be a single Account ID or multiple comma-separated Account IDs for which you want to see Savings Plans Purchase Recommendations. AND and OR operators are not supported.
    */
  var Filter: js.UndefOr[Expression] = js.native
  
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
    * The savings plan recommendation term used to generate these recommendations.
    */
  var TermInYears: typings.awsSdk.costexplorerMod.TermInYears = js.native
}
object GetSavingsPlansPurchaseRecommendationRequest {
  
  @scala.inline
  def apply(
    LookbackPeriodInDays: LookbackPeriodInDays,
    PaymentOption: PaymentOption,
    SavingsPlansType: SupportedSavingsPlansType,
    TermInYears: TermInYears
  ): GetSavingsPlansPurchaseRecommendationRequest = {
    val __obj = js.Dynamic.literal(LookbackPeriodInDays = LookbackPeriodInDays.asInstanceOf[js.Any], PaymentOption = PaymentOption.asInstanceOf[js.Any], SavingsPlansType = SavingsPlansType.asInstanceOf[js.Any], TermInYears = TermInYears.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationRequest]
  }
  
  @scala.inline
  implicit class GetSavingsPlansPurchaseRecommendationRequestMutableBuilder[Self <: GetSavingsPlansPurchaseRecommendationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountScope(value: AccountScope): Self = StObject.set(x, "AccountScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountScopeUndefined: Self = StObject.set(x, "AccountScope", js.undefined)
    
    @scala.inline
    def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = StObject.set(x, "LookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: NonNegativeInteger): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansType(value: SupportedSavingsPlansType): Self = StObject.set(x, "SavingsPlansType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermInYears(value: TermInYears): Self = StObject.set(x, "TermInYears", value.asInstanceOf[js.Any])
  }
}
