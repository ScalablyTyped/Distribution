package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SavingsPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlan]
  }
  
  @scala.inline
  implicit class SavingsPlanOps[Self <: SavingsPlan] (val x: Self) extends AnyVal {
    
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
    def deleteCommitment: Self = this.set("commitment", js.undefined)
    
    @scala.inline
    def setCurrency(value: CurrencyCode): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEc2InstanceFamily(value: EC2InstanceFamily): Self = this.set("ec2InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2InstanceFamily: Self = this.set("ec2InstanceFamily", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setOfferingId(value: SavingsPlanOfferingId): Self = this.set("offeringId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingId: Self = this.set("offeringId", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: SavingsPlanPaymentOption): Self = this.set("paymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentOption: Self = this.set("paymentOption", js.undefined)
    
    @scala.inline
    def setProductTypesVarargs(value: SavingsPlanProductType*): Self = this.set("productTypes", js.Array(value :_*))
    
    @scala.inline
    def setProductTypes(value: SavingsPlanProductTypeList): Self = this.set("productTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductTypes: Self = this.set("productTypes", js.undefined)
    
    @scala.inline
    def setRecurringPaymentAmount(value: Amount): Self = this.set("recurringPaymentAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurringPaymentAmount: Self = this.set("recurringPaymentAmount", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSavingsPlanArn(value: SavingsPlanArn): Self = this.set("savingsPlanArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlanArn: Self = this.set("savingsPlanArn", js.undefined)
    
    @scala.inline
    def setSavingsPlanId(value: SavingsPlanId): Self = this.set("savingsPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlanId: Self = this.set("savingsPlanId", js.undefined)
    
    @scala.inline
    def setSavingsPlanType(value: SavingsPlanType): Self = this.set("savingsPlanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlanType: Self = this.set("savingsPlanType", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setState(value: SavingsPlanState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTermDurationInSeconds(value: TermDurationInSeconds): Self = this.set("termDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermDurationInSeconds: Self = this.set("termDurationInSeconds", js.undefined)
    
    @scala.inline
    def setUpfrontPaymentAmount(value: Amount): Self = this.set("upfrontPaymentAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpfrontPaymentAmount: Self = this.set("upfrontPaymentAmount", js.undefined)
  }
}
