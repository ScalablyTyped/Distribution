package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanOffering extends js.Object {
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  /**
    * The description.
    */
  var description: js.UndefOr[SavingsPlanDescription] = js.native
  /**
    * The duration, in seconds.
    */
  var durationSeconds: js.UndefOr[SavingsPlansDuration] = js.native
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[UUID] = js.native
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operation: js.UndefOr[SavingsPlanOperation] = js.native
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.native
  /**
    * The plan type.
    */
  var planType: js.UndefOr[SavingsPlanType] = js.native
  /**
    * The product type.
    */
  var productTypes: js.UndefOr[SavingsPlanProductTypeList] = js.native
  /**
    * The properties.
    */
  var properties: js.UndefOr[SavingsPlanOfferingPropertyList] = js.native
  /**
    * The service.
    */
  var serviceCode: js.UndefOr[SavingsPlanServiceCode] = js.native
  /**
    * The usage details of the line item in the billing report.
    */
  var usageType: js.UndefOr[SavingsPlanUsageType] = js.native
}

object SavingsPlanOffering {
  @scala.inline
  def apply(): SavingsPlanOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOffering]
  }
  @scala.inline
  implicit class SavingsPlanOfferingOps[Self <: SavingsPlanOffering] (val x: Self) extends AnyVal {
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
    def setCurrency(value: CurrencyCode): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setDescription(value: SavingsPlanDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDurationSeconds(value: SavingsPlansDuration): Self = this.set("durationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationSeconds: Self = this.set("durationSeconds", js.undefined)
    @scala.inline
    def setOfferingId(value: UUID): Self = this.set("offeringId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferingId: Self = this.set("offeringId", js.undefined)
    @scala.inline
    def setOperation(value: SavingsPlanOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setPaymentOption(value: SavingsPlanPaymentOption): Self = this.set("paymentOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentOption: Self = this.set("paymentOption", js.undefined)
    @scala.inline
    def setPlanType(value: SavingsPlanType): Self = this.set("planType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanType: Self = this.set("planType", js.undefined)
    @scala.inline
    def setProductTypesVarargs(value: SavingsPlanProductType*): Self = this.set("productTypes", js.Array(value :_*))
    @scala.inline
    def setProductTypes(value: SavingsPlanProductTypeList): Self = this.set("productTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductTypes: Self = this.set("productTypes", js.undefined)
    @scala.inline
    def setPropertiesVarargs(value: SavingsPlanOfferingProperty*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: SavingsPlanOfferingPropertyList): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setServiceCode(value: SavingsPlanServiceCode): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCode: Self = this.set("serviceCode", js.undefined)
    @scala.inline
    def setUsageType(value: SavingsPlanUsageType): Self = this.set("usageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageType: Self = this.set("usageType", js.undefined)
  }
  
}

