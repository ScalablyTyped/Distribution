package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedDBInstance extends js.Object {
  
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
  implicit class ReservedDBInstanceOps[Self <: ReservedDBInstance] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: String): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    
    @scala.inline
    def setDBInstanceClass(value: String): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    
    @scala.inline
    def setDBInstanceCount(value: Integer): Self = this.set("DBInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBInstanceCount: Self = this.set("DBInstanceCount", js.undefined)
    
    @scala.inline
    def setDuration(value: Integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setFixedPrice(value: Double): Self = this.set("FixedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPrice: Self = this.set("FixedPrice", js.undefined)
    
    @scala.inline
    def setLeaseId(value: String): Self = this.set("LeaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaseId: Self = this.set("LeaseId", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: Boolean): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    
    @scala.inline
    def setOfferingType(value: String): Self = this.set("OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingType: Self = this.set("OfferingType", js.undefined)
    
    @scala.inline
    def setProductDescription(value: String): Self = this.set("ProductDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductDescription: Self = this.set("ProductDescription", js.undefined)
    
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = this.set("RecurringCharges", js.Array(value :_*))
    
    @scala.inline
    def setRecurringCharges(value: RecurringChargeList): Self = this.set("RecurringCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurringCharges: Self = this.set("RecurringCharges", js.undefined)
    
    @scala.inline
    def setReservedDBInstanceArn(value: String): Self = this.set("ReservedDBInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedDBInstanceArn: Self = this.set("ReservedDBInstanceArn", js.undefined)
    
    @scala.inline
    def setReservedDBInstanceId(value: String): Self = this.set("ReservedDBInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedDBInstanceId: Self = this.set("ReservedDBInstanceId", js.undefined)
    
    @scala.inline
    def setReservedDBInstancesOfferingId(value: String): Self = this.set("ReservedDBInstancesOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedDBInstancesOfferingId: Self = this.set("ReservedDBInstancesOfferingId", js.undefined)
    
    @scala.inline
    def setStartTime(value: TStamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setUsagePrice(value: Double): Self = this.set("UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsagePrice: Self = this.set("UsagePrice", js.undefined)
  }
}
