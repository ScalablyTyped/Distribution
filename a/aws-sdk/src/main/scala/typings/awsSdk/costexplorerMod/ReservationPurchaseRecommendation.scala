package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPurchaseRecommendation extends js.Object {
  /**
    * The account scope that AWS recommends that you purchase this instance for. For example, you can purchase this reservation for an entire organization in AWS Organizations.
    */
  var AccountScope: js.UndefOr[typings.awsSdk.costexplorerMod.AccountScope] = js.native
  /**
    * How many days of previous usage that AWS considers when making this recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.native
  /**
    * The payment option for the reservation. For example, AllUpfront or NoUpfront.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.costexplorerMod.PaymentOption] = js.native
  /**
    * Details about the recommended purchases.
    */
  var RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails] = js.native
  /**
    * A summary about the recommended purchase.
    */
  var RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary] = js.native
  /**
    * Hardware specifications for the service that you want recommendations for.
    */
  var ServiceSpecification: js.UndefOr[typings.awsSdk.costexplorerMod.ServiceSpecification] = js.native
  /**
    * The term of the reservation that you want recommendations for, in years.
    */
  var TermInYears: js.UndefOr[typings.awsSdk.costexplorerMod.TermInYears] = js.native
}

object ReservationPurchaseRecommendation {
  @scala.inline
  def apply(): ReservationPurchaseRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendation]
  }
  @scala.inline
  implicit class ReservationPurchaseRecommendationOps[Self <: ReservationPurchaseRecommendation] (val x: Self) extends AnyVal {
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
    def setAccountScope(value: AccountScope): Self = this.set("AccountScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountScope: Self = this.set("AccountScope", js.undefined)
    @scala.inline
    def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = this.set("LookbackPeriodInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookbackPeriodInDays: Self = this.set("LookbackPeriodInDays", js.undefined)
    @scala.inline
    def setPaymentOption(value: PaymentOption): Self = this.set("PaymentOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentOption: Self = this.set("PaymentOption", js.undefined)
    @scala.inline
    def setRecommendationDetailsVarargs(value: ReservationPurchaseRecommendationDetail*): Self = this.set("RecommendationDetails", js.Array(value :_*))
    @scala.inline
    def setRecommendationDetails(value: ReservationPurchaseRecommendationDetails): Self = this.set("RecommendationDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendationDetails: Self = this.set("RecommendationDetails", js.undefined)
    @scala.inline
    def setRecommendationSummary(value: ReservationPurchaseRecommendationSummary): Self = this.set("RecommendationSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendationSummary: Self = this.set("RecommendationSummary", js.undefined)
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

