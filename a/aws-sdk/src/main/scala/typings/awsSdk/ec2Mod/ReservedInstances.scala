package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedInstances extends StObject {
  
  /**
    * The Availability Zone in which the Reserved Instance can be used.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The currency of the Reserved Instance. It's specified using ISO 4217 standard currency codes. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  
  /**
    * The duration of the Reserved Instance, in seconds.
    */
  var Duration: js.UndefOr[Long] = js.native
  
  /**
    * The time when the Reserved Instance expires.
    */
  var End: js.UndefOr[DateTime] = js.native
  
  /**
    * The purchase price of the Reserved Instance.
    */
  var FixedPrice: js.UndefOr[Float] = js.native
  
  /**
    * The number of reservations purchased.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * The tenancy of the instance.
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.native
  
  /**
    * The instance type on which the Reserved Instance can be used.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * The offering class of the Reserved Instance.
    */
  var OfferingClass: js.UndefOr[OfferingClassType] = js.native
  
  /**
    * The Reserved Instance offering type.
    */
  var OfferingType: js.UndefOr[OfferingTypeValues] = js.native
  
  /**
    * The Reserved Instance product platform description.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.native
  
  /**
    * The recurring charge tag assigned to the resource.
    */
  var RecurringCharges: js.UndefOr[RecurringChargesList] = js.native
  
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
  
  /**
    * The scope of the Reserved Instance.
    */
  var Scope: js.UndefOr[scope] = js.native
  
  /**
    * The date and time the Reserved Instance started.
    */
  var Start: js.UndefOr[DateTime] = js.native
  
  /**
    * The state of the Reserved Instance purchase.
    */
  var State: js.UndefOr[ReservedInstanceState] = js.native
  
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The usage price of the Reserved Instance, per hour.
    */
  var UsagePrice: js.UndefOr[Float] = js.native
}
object ReservedInstances {
  
  @scala.inline
  def apply(): ReservedInstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstances]
  }
  
  @scala.inline
  implicit class ReservedInstancesMutableBuilder[Self <: ReservedInstances] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: DateTime): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    @scala.inline
    def setFixedPrice(value: Float): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    @scala.inline
    def setInstanceTenancy(value: Tenancy): Self = StObject.set(x, "InstanceTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTenancyUndefined: Self = StObject.set(x, "InstanceTenancy", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setOfferingClass(value: OfferingClassType): Self = StObject.set(x, "OfferingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingClassUndefined: Self = StObject.set(x, "OfferingClass", js.undefined)
    
    @scala.inline
    def setOfferingType(value: OfferingTypeValues): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
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
    def setReservedInstancesId(value: String): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
    
    @scala.inline
    def setScope(value: scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    @scala.inline
    def setStart(value: DateTime): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
    
    @scala.inline
    def setState(value: ReservedInstanceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUsagePrice(value: Float): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
