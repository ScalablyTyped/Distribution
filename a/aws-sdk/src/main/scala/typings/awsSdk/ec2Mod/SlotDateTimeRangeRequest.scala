package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotDateTimeRangeRequest extends StObject {
  
  /**
    * The earliest date and time, in UTC, for the Scheduled Instance to start.
    */
  var EarliestTime: DateTime
  
  /**
    * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to the earliest date and at most three months in the future.
    */
  var LatestTime: DateTime
}
object SlotDateTimeRangeRequest {
  
  @scala.inline
  def apply(EarliestTime: DateTime, LatestTime: DateTime): SlotDateTimeRangeRequest = {
    val __obj = js.Dynamic.literal(EarliestTime = EarliestTime.asInstanceOf[js.Any], LatestTime = LatestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDateTimeRangeRequest]
  }
  
  @scala.inline
  implicit class SlotDateTimeRangeRequestMutableBuilder[Self <: SlotDateTimeRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEarliestTime(value: DateTime): Self = StObject.set(x, "EarliestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestTime(value: DateTime): Self = StObject.set(x, "LatestTime", value.asInstanceOf[js.Any])
  }
}
