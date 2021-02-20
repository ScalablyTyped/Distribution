package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JourneyLimits extends StObject {
  
  /**
    * The maximum number of messages that the journey can send to a single participant during a 24-hour period. The maximum value is 100.
    */
  var DailyCap: js.UndefOr[integer] = js.native
  
  /**
    * The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow participants to enter the journey an unlimited number of times, set this value to 0.
    */
  var EndpointReentryCap: js.UndefOr[integer] = js.native
  
  /**
    * The maximum number of messages that the journey can send each second.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.native
}
object JourneyLimits {
  
  @scala.inline
  def apply(): JourneyLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyLimits]
  }
  
  @scala.inline
  implicit class JourneyLimitsMutableBuilder[Self <: JourneyLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyCap(value: integer): Self = StObject.set(x, "DailyCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyCapUndefined: Self = StObject.set(x, "DailyCap", js.undefined)
    
    @scala.inline
    def setEndpointReentryCap(value: integer): Self = StObject.set(x, "EndpointReentryCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointReentryCapUndefined: Self = StObject.set(x, "EndpointReentryCap", js.undefined)
    
    @scala.inline
    def setMessagesPerSecond(value: integer): Self = StObject.set(x, "MessagesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesPerSecondUndefined: Self = StObject.set(x, "MessagesPerSecond", js.undefined)
  }
}
