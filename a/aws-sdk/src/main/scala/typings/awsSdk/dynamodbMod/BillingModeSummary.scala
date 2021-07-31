package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingModeSummary extends StObject {
  
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
    */
  var BillingMode: js.UndefOr[typings.awsSdk.dynamodbMod.BillingMode] = js.undefined
  
  /**
    * Represents the time when PAY_PER_REQUEST was last set as the read/write capacity mode.
    */
  var LastUpdateToPayPerRequestDateTime: js.UndefOr[Date] = js.undefined
}
object BillingModeSummary {
  
  @scala.inline
  def apply(): BillingModeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingModeSummary]
  }
  
  @scala.inline
  implicit class BillingModeSummaryMutableBuilder[Self <: BillingModeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
    
    @scala.inline
    def setLastUpdateToPayPerRequestDateTime(value: Date): Self = StObject.set(x, "LastUpdateToPayPerRequestDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateToPayPerRequestDateTimeUndefined: Self = StObject.set(x, "LastUpdateToPayPerRequestDateTime", js.undefined)
  }
}
