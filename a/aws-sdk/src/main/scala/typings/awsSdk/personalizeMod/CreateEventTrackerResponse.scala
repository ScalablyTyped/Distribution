package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventTrackerResponse extends StObject {
  
  /**
    * The ARN of the event tracker.
    */
  var eventTrackerArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the event tracker. Include this ID in requests to the PutEvents API.
    */
  var trackingId: js.UndefOr[TrackingId] = js.undefined
}
object CreateEventTrackerResponse {
  
  inline def apply(): CreateEventTrackerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventTrackerResponse]
  }
  
  extension [Self <: CreateEventTrackerResponse](x: Self) {
    
    inline def setEventTrackerArn(value: Arn): Self = StObject.set(x, "eventTrackerArn", value.asInstanceOf[js.Any])
    
    inline def setEventTrackerArnUndefined: Self = StObject.set(x, "eventTrackerArn", js.undefined)
    
    inline def setTrackingId(value: TrackingId): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
