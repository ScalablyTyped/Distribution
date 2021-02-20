package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlan extends StObject {
  
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
  implicit class SavingsPlanMutableBuilder[Self <: SavingsPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitment(value: Amount): Self = StObject.set(x, "commitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitmentUndefined: Self = StObject.set(x, "commitment", js.undefined)
    
    @scala.inline
    def setCurrency(value: CurrencyCode): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEc2InstanceFamily(value: EC2InstanceFamily): Self = StObject.set(x, "ec2InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceFamilyUndefined: Self = StObject.set(x, "ec2InstanceFamily", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setOfferingId(value: SavingsPlanOfferingId): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "offeringId", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: SavingsPlanPaymentOption): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentOptionUndefined: Self = StObject.set(x, "paymentOption", js.undefined)
    
    @scala.inline
    def setProductTypes(value: SavingsPlanProductTypeList): Self = StObject.set(x, "productTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypesUndefined: Self = StObject.set(x, "productTypes", js.undefined)
    
    @scala.inline
    def setProductTypesVarargs(value: SavingsPlanProductType*): Self = StObject.set(x, "productTypes", js.Array(value :_*))
    
    @scala.inline
    def setRecurringPaymentAmount(value: Amount): Self = StObject.set(x, "recurringPaymentAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringPaymentAmountUndefined: Self = StObject.set(x, "recurringPaymentAmount", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSavingsPlanArn(value: SavingsPlanArn): Self = StObject.set(x, "savingsPlanArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlanArnUndefined: Self = StObject.set(x, "savingsPlanArn", js.undefined)
    
    @scala.inline
    def setSavingsPlanId(value: SavingsPlanId): Self = StObject.set(x, "savingsPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlanIdUndefined: Self = StObject.set(x, "savingsPlanId", js.undefined)
    
    @scala.inline
    def setSavingsPlanType(value: SavingsPlanType): Self = StObject.set(x, "savingsPlanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlanTypeUndefined: Self = StObject.set(x, "savingsPlanType", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setState(value: SavingsPlanState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTermDurationInSeconds(value: TermDurationInSeconds): Self = StObject.set(x, "termDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermDurationInSecondsUndefined: Self = StObject.set(x, "termDurationInSeconds", js.undefined)
    
    @scala.inline
    def setUpfrontPaymentAmount(value: Amount): Self = StObject.set(x, "upfrontPaymentAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpfrontPaymentAmountUndefined: Self = StObject.set(x, "upfrontPaymentAmount", js.undefined)
  }
}
