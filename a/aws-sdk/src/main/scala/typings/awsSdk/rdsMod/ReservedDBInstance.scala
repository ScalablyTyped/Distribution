package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedDBInstance extends StObject {
  
  /**
    * The currency code for the reserved DB instance.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  
  /**
    * The DB instance class for the reserved DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  
  /**
    * The number of reserved DB instances.
    */
  var DBInstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * The duration of the reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  
  /**
    * The fixed price charged for this reserved DB instance.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  
  /**
    * The unique identifier for the lease associated with the reserved DB instance.  AWS Support might request the lease ID for an issue related to a reserved DB instance. 
    */
  var LeaseId: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the reservation applies to Multi-AZ deployments.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  
  /**
    * The offering type of this reserved DB instance.
    */
  var OfferingType: js.UndefOr[String] = js.native
  
  /**
    * The description of the reserved DB instance.
    */
  var ProductDescription: js.UndefOr[String] = js.native
  
  /**
    * The recurring price charged to run this reserved DB instance.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the reserved DB instance.
    */
  var ReservedDBInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier for the reservation.
    */
  var ReservedDBInstanceId: js.UndefOr[String] = js.native
  
  /**
    * The offering identifier.
    */
  var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.native
  
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The state of the reserved DB instance.
    */
  var State: js.UndefOr[String] = js.native
  
  /**
    * The hourly price charged for this reserved DB instance.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}
object ReservedDBInstance {
  
  @scala.inline
  def apply(): ReservedDBInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedDBInstance]
  }
  
  @scala.inline
  implicit class ReservedDBInstanceMutableBuilder[Self <: ReservedDBInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    @scala.inline
    def setDBInstanceCount(value: Integer): Self = StObject.set(x, "DBInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceCountUndefined: Self = StObject.set(x, "DBInstanceCount", js.undefined)
    
    @scala.inline
    def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setFixedPrice(value: Double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    @scala.inline
    def setLeaseId(value: String): Self = StObject.set(x, "LeaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseIdUndefined: Self = StObject.set(x, "LeaseId", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    @scala.inline
    def setOfferingType(value: String): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    @scala.inline
    def setProductDescription(value: String): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    @scala.inline
    def setRecurringCharges(value: RecurringChargeList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value :_*))
    
    @scala.inline
    def setReservedDBInstanceArn(value: String): Self = StObject.set(x, "ReservedDBInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedDBInstanceArnUndefined: Self = StObject.set(x, "ReservedDBInstanceArn", js.undefined)
    
    @scala.inline
    def setReservedDBInstanceId(value: String): Self = StObject.set(x, "ReservedDBInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedDBInstanceIdUndefined: Self = StObject.set(x, "ReservedDBInstanceId", js.undefined)
    
    @scala.inline
    def setReservedDBInstancesOfferingId(value: String): Self = StObject.set(x, "ReservedDBInstancesOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedDBInstancesOfferingIdUndefined: Self = StObject.set(x, "ReservedDBInstancesOfferingId", js.undefined)
    
    @scala.inline
    def setStartTime(value: TStamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setUsagePrice(value: Double): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
