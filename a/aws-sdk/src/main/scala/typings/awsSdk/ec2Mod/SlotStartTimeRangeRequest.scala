package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotStartTimeRangeRequest extends StObject {
  
  /**
    * The earliest date and time, in UTC, for the Scheduled Instance to start.
    */
  var EarliestTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The latest date and time, in UTC, for the Scheduled Instance to start.
    */
  var LatestTime: js.UndefOr[DateTime] = js.native
}
object SlotStartTimeRangeRequest {
  
  @scala.inline
  def apply(): SlotStartTimeRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotStartTimeRangeRequest]
  }
  
  @scala.inline
  implicit class SlotStartTimeRangeRequestMutableBuilder[Self <: SlotStartTimeRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEarliestTime(value: DateTime): Self = StObject.set(x, "EarliestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarliestTimeUndefined: Self = StObject.set(x, "EarliestTime", js.undefined)
    
    @scala.inline
    def setLatestTime(value: DateTime): Self = StObject.set(x, "LatestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestTimeUndefined: Self = StObject.set(x, "LatestTime", js.undefined)
  }
}
