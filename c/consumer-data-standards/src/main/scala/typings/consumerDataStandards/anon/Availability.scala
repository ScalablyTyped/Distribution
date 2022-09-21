package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Availability
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Percentage availability of the CDR platform over time
    */
  var availability: CurrentMonth
  
  /**
    * Average response time in seconds, at millisecond resolution, within each performance tier
    */
  var averageResponse: HighPriority
  
  /**
    * Transactions per second over time
    */
  var averageTps: Dictk
  
  /**
    * Number of customers with active authorisations at the time of the call
    */
  var customerCount: Double
  
  /**
    * Number of calls resulting in error due to server execution over time
    */
  var errors: Dictk
  
  /**
    * Number of API calls in each performance tier over time
    */
  var invocations: LargePayload
  
  /**
    * Maximum record transactions per second over time
    */
  var peakTps: Dictk
  
  /**
    * Percentage of calls within the performance thresholds
    */
  var performance: Dictk
  
  /**
    * Number of Data Recipient Software Products with active authorisations at the time of the call
    */
  var recipientCount: Double
  
  /**
    * Number of calls rejected due to traffic thresholds over time
    */
  var rejections: Authenticated
  
  /**
    * The date and time that the metrics in this payload were requested.
    */
  var requestTime: String
  
  /**
    * Errors and rejections received by the primary data holder from the secondary data holder.  Mandatory for data holders designated for a Shared Responsibility Data Request data cluster
    */
  var secondaryHolder: js.UndefOr[Errors] = js.undefined
  
  /**
    * Session counts over time. Note that a session is defined as the provisioning of an Access Token.
    */
  var sessionCount: Dictk
}
object Availability {
  
  inline def apply(
    availability: CurrentMonth,
    averageResponse: HighPriority,
    averageTps: Dictk,
    customerCount: Double,
    errors: Dictk,
    invocations: LargePayload,
    peakTps: Dictk,
    performance: Dictk,
    recipientCount: Double,
    rejections: Authenticated,
    requestTime: String,
    sessionCount: Dictk
  ): Availability = {
    val __obj = js.Dynamic.literal(availability = availability.asInstanceOf[js.Any], averageResponse = averageResponse.asInstanceOf[js.Any], averageTps = averageTps.asInstanceOf[js.Any], customerCount = customerCount.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], invocations = invocations.asInstanceOf[js.Any], peakTps = peakTps.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], recipientCount = recipientCount.asInstanceOf[js.Any], rejections = rejections.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], sessionCount = sessionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Availability]
  }
  
  extension [Self <: Availability](x: Self) {
    
    inline def setAvailability(value: CurrentMonth): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAverageResponse(value: HighPriority): Self = StObject.set(x, "averageResponse", value.asInstanceOf[js.Any])
    
    inline def setAverageTps(value: Dictk): Self = StObject.set(x, "averageTps", value.asInstanceOf[js.Any])
    
    inline def setCustomerCount(value: Double): Self = StObject.set(x, "customerCount", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: Dictk): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setInvocations(value: LargePayload): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
    
    inline def setPeakTps(value: Dictk): Self = StObject.set(x, "peakTps", value.asInstanceOf[js.Any])
    
    inline def setPerformance(value: Dictk): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setRecipientCount(value: Double): Self = StObject.set(x, "recipientCount", value.asInstanceOf[js.Any])
    
    inline def setRejections(value: Authenticated): Self = StObject.set(x, "rejections", value.asInstanceOf[js.Any])
    
    inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setSecondaryHolder(value: Errors): Self = StObject.set(x, "secondaryHolder", value.asInstanceOf[js.Any])
    
    inline def setSecondaryHolderUndefined: Self = StObject.set(x, "secondaryHolder", js.undefined)
    
    inline def setSessionCount(value: Dictk): Self = StObject.set(x, "sessionCount", value.asInstanceOf[js.Any])
  }
}
