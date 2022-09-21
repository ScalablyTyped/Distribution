package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPredictionSummary extends StObject {
  
  /**
    *  The detector ID. 
    */
  var detectorId: js.UndefOr[identifier] = js.undefined
  
  /**
    *  The detector version ID. 
    */
  var detectorVersionId: js.UndefOr[wholeNumberVersionString] = js.undefined
  
  /**
    *  The event ID. 
    */
  var eventId: js.UndefOr[identifier] = js.undefined
  
  /**
    *  The timestamp of the event. 
    */
  var eventTimestamp: js.UndefOr[time] = js.undefined
  
  /**
    *  The event type. 
    */
  var eventTypeName: js.UndefOr[identifier] = js.undefined
  
  /**
    *  The timestamp when the prediction was generated. 
    */
  var predictionTimestamp: js.UndefOr[time] = js.undefined
}
object EventPredictionSummary {
  
  inline def apply(): EventPredictionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPredictionSummary]
  }
  
  extension [Self <: EventPredictionSummary](x: Self) {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    inline def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionIdUndefined: Self = StObject.set(x, "detectorVersionId", js.undefined)
    
    inline def setEventId(value: identifier): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setEventTimestamp(value: time): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEventTimestampUndefined: Self = StObject.set(x, "eventTimestamp", js.undefined)
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    inline def setPredictionTimestamp(value: time): Self = StObject.set(x, "predictionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setPredictionTimestampUndefined: Self = StObject.set(x, "predictionTimestamp", js.undefined)
  }
}
