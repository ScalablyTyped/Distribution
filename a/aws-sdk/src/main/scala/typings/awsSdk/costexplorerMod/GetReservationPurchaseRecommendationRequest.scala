package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservationPurchaseRecommendationRequest extends js.Object {
  /**
    * The account ID that is associated with the recommendation. 
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  /**
    * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations including the payer account and linked accounts if the value is set to PAYER. If the value is LINKED, recommendations are calculated for individual linked accounts only.
    */
  var AccountScope: js.UndefOr[typings.awsSdk.costexplorerMod.AccountScope] = js.native
  /**
    * The number of previous days that you want AWS to consider when it calculates your recommendations.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.native
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The reservation purchase option that you want recommendations for.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.costexplorerMod.PaymentOption] = js.native
  /**
    * The specific service that you want recommendations for.
    */
  var Service: GenericString = js.native
  /**
    * The hardware specifications for the service instances that you want recommendations for, such as standard or convertible Amazon EC2 instances.
    */
  var ServiceSpecification: js.UndefOr[typings.awsSdk.costexplorerMod.ServiceSpecification] = js.native
  /**
    * The reservation term that you want recommendations for.
    */
  var TermInYears: js.UndefOr[typings.awsSdk.costexplorerMod.TermInYears] = js.native
}

object GetReservationPurchaseRecommendationRequest {
  @scala.inline
  def apply(Service: GenericString): GetReservationPurchaseRecommendationRequest = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationPurchaseRecommendationRequest]
  }
  @scala.inline
  implicit class GetReservationPurchaseRecommendationRequestOps[Self <: GetReservationPurchaseRecommendationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setService(value: GenericString): Self = this.set("Service", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountId(value: GenericString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setAccountScope(value: AccountScope): Self = this.set("AccountScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountScope: Self = this.set("AccountScope", js.undefined)
    @scala.inline
    def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = this.set("LookbackPeriodInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookbackPeriodInDays: Self = this.set("LookbackPeriodInDays", js.undefined)
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    @scala.inline
    def setPageSize(value: NonNegativeInteger): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    @scala.inline
    def setPaymentOption(value: PaymentOption): Self = this.set("PaymentOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentOption: Self = this.set("PaymentOption", js.undefined)
    @scala.inline
    def setServiceSpecification(value: ServiceSpecification): Self = this.set("ServiceSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceSpecification: Self = this.set("ServiceSpecification", js.undefined)
    @scala.inline
    def setTermInYears(value: TermInYears): Self = this.set("TermInYears", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermInYears: Self = this.set("TermInYears", js.undefined)
  }
  
}

