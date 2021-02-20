package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedInstancesOffering extends StObject {
  
  /**
    * The Availability Zone in which the Reserved Instance can be used.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard currency codes. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  
  /**
    * The duration of the Reserved Instance, in seconds.
    */
  var Duration: js.UndefOr[Long] = js.native
  
  /**
    * The purchase price of the Reserved Instance.
    */
  var FixedPrice: js.UndefOr[Float] = js.native
  
  /**
    * The tenancy of the instance.
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.native
  
  /**
    * The instance type on which the Reserved Instance can be used.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If it's a Reserved Instance Marketplace offering, this is true.
    */
  var Marketplace: js.UndefOr[Boolean] = js.native
  
  /**
    * If convertible it can be exchanged for Reserved Instances of the same or higher monetary value, with different configurations. If standard, it is not possible to perform an exchange.
    */
  var OfferingClass: js.UndefOr[OfferingClassType] = js.native
  
  /**
    * The Reserved Instance offering type.
    */
  var OfferingType: js.UndefOr[OfferingTypeValues] = js.native
  
  /**
    * The pricing details of the Reserved Instance offering.
    */
  var PricingDetails: js.UndefOr[PricingDetailsList] = js.native
  
  /**
    * The Reserved Instance product platform description.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.native
  
  /**
    * The recurring charge tag assigned to the resource.
    */
  var RecurringCharges: js.UndefOr[RecurringChargesList] = js.native
  
  /**
    * The ID of the Reserved Instance offering. This is the offering ID used in GetReservedInstancesExchangeQuote to confirm that an exchange can be made.
    */
  var ReservedInstancesOfferingId: js.UndefOr[String] = js.native
  
  /**
    * Whether the Reserved Instance is applied to instances in a Region or an Availability Zone.
    */
  var Scope: js.UndefOr[scope] = js.native
  
  /**
    * The usage price of the Reserved Instance, per hour.
    */
  var UsagePrice: js.UndefOr[Float] = js.native
}
object ReservedInstancesOffering {
  
  @scala.inline
  def apply(): ReservedInstancesOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesOffering]
  }
  
  @scala.inline
  implicit class ReservedInstancesOfferingMutableBuilder[Self <: ReservedInstancesOffering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setDuration(value: Long): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setFixedPrice(value: Float): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    @scala.inline
    def setInstanceTenancy(value: Tenancy): Self = StObject.set(x, "InstanceTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTenancyUndefined: Self = StObject.set(x, "InstanceTenancy", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setMarketplace(value: Boolean): Self = StObject.set(x, "Marketplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketplaceUndefined: Self = StObject.set(x, "Marketplace", js.undefined)
    
    @scala.inline
    def setOfferingClass(value: OfferingClassType): Self = StObject.set(x, "OfferingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingClassUndefined: Self = StObject.set(x, "OfferingClass", js.undefined)
    
    @scala.inline
    def setOfferingType(value: OfferingTypeValues): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    @scala.inline
    def setPricingDetails(value: PricingDetailsList): Self = StObject.set(x, "PricingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingDetailsUndefined: Self = StObject.set(x, "PricingDetails", js.undefined)
    
    @scala.inline
    def setPricingDetailsVarargs(value: PricingDetail*): Self = StObject.set(x, "PricingDetails", js.Array(value :_*))
    
    @scala.inline
    def setProductDescription(value: RIProductDescription): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    @scala.inline
    def setRecurringCharges(value: RecurringChargesList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstancesOfferingId(value: String): Self = StObject.set(x, "ReservedInstancesOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesOfferingIdUndefined: Self = StObject.set(x, "ReservedInstancesOfferingId", js.undefined)
    
    @scala.inline
    def setScope(value: scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    @scala.inline
    def setUsagePrice(value: Float): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
