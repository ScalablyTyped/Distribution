package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableBillingModeSummary extends StObject {
  
  /**
    * The method used to charge for read and write throughput and to manage capacity.
    */
  var BillingMode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * If the billing mode is PAY_PER_REQUEST, indicates when the billing mode was set to that value. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastUpdateToPayPerRequestDateTime: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsDynamoDbTableBillingModeSummary {
  
  inline def apply(): AwsDynamoDbTableBillingModeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableBillingModeSummary]
  }
  
  extension [Self <: AwsDynamoDbTableBillingModeSummary](x: Self) {
    
    inline def setBillingMode(value: NonEmptyString): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
    
    inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
    
    inline def setLastUpdateToPayPerRequestDateTime(value: NonEmptyString): Self = StObject.set(x, "LastUpdateToPayPerRequestDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateToPayPerRequestDateTimeUndefined: Self = StObject.set(x, "LastUpdateToPayPerRequestDateTime", js.undefined)
  }
}
