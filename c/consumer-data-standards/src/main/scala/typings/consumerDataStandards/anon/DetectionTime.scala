package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.OK
import typings.consumerDataStandards.consumerDataStandardsStrings.PARTIAL_FAILURE
import typings.consumerDataStandards.consumerDataStandardsStrings.SCHEDULED_OUTAGE
import typings.consumerDataStandards.consumerDataStandardsStrings.UNAVAILABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectionTime
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The date and time that the current outage was detected. Should only be present if the status property is PARTIAL_FAILURE or UNAVAILABLE
    */
  var detectionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time that full service is expected to resume (if known). Should not be present if the status property has a value of OK.
    */
  var expectedResolutionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Provides an explanation of the current outage that can be displayed to an end customer. Mandatory if the status property is any value other than OK
    */
  var explanation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enumeration with values. OK (implementation is fully functional). PARTIAL_FAILURE (one or more end points are unexpectedly unavailable). UNAVAILABLE (the full implementation is unexpectedly unavailable). SCHEDULED_OUTAGE (an advertised outage is in effect)
    */
  var status: OK | PARTIAL_FAILURE | SCHEDULED_OUTAGE | UNAVAILABLE
  
  /**
    * The date and time that this status was last updated by the Data Holder.
    */
  var updateTime: String
}
object DetectionTime {
  
  inline def apply(status: OK | PARTIAL_FAILURE | SCHEDULED_OUTAGE | UNAVAILABLE, updateTime: String): DetectionTime = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectionTime]
  }
  
  extension [Self <: DetectionTime](x: Self) {
    
    inline def setDetectionTime(value: String): Self = StObject.set(x, "detectionTime", value.asInstanceOf[js.Any])
    
    inline def setDetectionTimeNull: Self = StObject.set(x, "detectionTime", null)
    
    inline def setDetectionTimeUndefined: Self = StObject.set(x, "detectionTime", js.undefined)
    
    inline def setExpectedResolutionTime(value: String): Self = StObject.set(x, "expectedResolutionTime", value.asInstanceOf[js.Any])
    
    inline def setExpectedResolutionTimeNull: Self = StObject.set(x, "expectedResolutionTime", null)
    
    inline def setExpectedResolutionTimeUndefined: Self = StObject.set(x, "expectedResolutionTime", js.undefined)
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationNull: Self = StObject.set(x, "explanation", null)
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setStatus(value: OK | PARTIAL_FAILURE | SCHEDULED_OUTAGE | UNAVAILABLE): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
