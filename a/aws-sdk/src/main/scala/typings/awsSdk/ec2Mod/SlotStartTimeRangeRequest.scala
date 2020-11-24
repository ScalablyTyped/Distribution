package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotStartTimeRangeRequest extends js.Object {
  
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
  implicit class SlotStartTimeRangeRequestOps[Self <: SlotStartTimeRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEarliestTime(value: DateTime): Self = this.set("EarliestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarliestTime: Self = this.set("EarliestTime", js.undefined)
    
    @scala.inline
    def setLatestTime(value: DateTime): Self = this.set("LatestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestTime: Self = this.set("LatestTime", js.undefined)
  }
}
