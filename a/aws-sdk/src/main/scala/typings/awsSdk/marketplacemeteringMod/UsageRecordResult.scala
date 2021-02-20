package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageRecordResult extends StObject {
  
  /**
    * The MeteringRecordId is a unique identifier for this metering event.
    */
  var MeteringRecordId: js.UndefOr[String] = js.native
  
  /**
    * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.    Success- The UsageRecord was accepted and honored by BatchMeterUsage.    CustomerNotSubscribed- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.    DuplicateRecord- Indicates that the UsageRecord was invalid and not honored. A previously metered UsageRecord had the same customer, dimension, and time, but a different quantity.  
    */
  var Status: js.UndefOr[UsageRecordResultStatus] = js.native
  
  /**
    * The UsageRecord that was part of the BatchMeterUsage request.
    */
  var UsageRecord: js.UndefOr[typings.awsSdk.marketplacemeteringMod.UsageRecord] = js.native
}
object UsageRecordResult {
  
  @scala.inline
  def apply(): UsageRecordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageRecordResult]
  }
  
  @scala.inline
  implicit class UsageRecordResultMutableBuilder[Self <: UsageRecordResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeteringRecordId(value: String): Self = StObject.set(x, "MeteringRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeteringRecordIdUndefined: Self = StObject.set(x, "MeteringRecordId", js.undefined)
    
    @scala.inline
    def setStatus(value: UsageRecordResultStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUsageRecord(value: UsageRecord): Self = StObject.set(x, "UsageRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageRecordUndefined: Self = StObject.set(x, "UsageRecord", js.undefined)
  }
}
