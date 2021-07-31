package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyStateRequest extends StObject {
  
  /**
    * The status of the journey. Currently, the only supported value is CANCELLED. If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress, until those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics data for those activities, until they are complete, and any activities that were complete when you cancelled the journey. After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition, Amazon Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
    */
  var State: js.UndefOr[typings.awsSdk.pinpointMod.State] = js.undefined
}
object JourneyStateRequest {
  
  @scala.inline
  def apply(): JourneyStateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyStateRequest]
  }
  
  @scala.inline
  implicit class JourneyStateRequestMutableBuilder[Self <: JourneyStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
