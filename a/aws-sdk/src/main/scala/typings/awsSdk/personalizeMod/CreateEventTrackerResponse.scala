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
  
  @scala.inline
  def apply(): CreateEventTrackerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventTrackerResponse]
  }
  
  @scala.inline
  implicit class CreateEventTrackerResponseMutableBuilder[Self <: CreateEventTrackerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTrackerArn(value: Arn): Self = StObject.set(x, "eventTrackerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTrackerArnUndefined: Self = StObject.set(x, "eventTrackerArn", js.undefined)
    
    @scala.inline
    def setTrackingId(value: TrackingId): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
