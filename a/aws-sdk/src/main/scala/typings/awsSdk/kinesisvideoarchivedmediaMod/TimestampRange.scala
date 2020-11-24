package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestampRange extends js.Object {
  
  /**
    * The ending timestamp in the range of timestamps for which to return fragments.
    */
  var EndTimestamp: Timestamp = js.native
  
  /**
    * The starting timestamp in the range of timestamps for which to return fragments.
    */
  var StartTimestamp: Timestamp = js.native
}
object TimestampRange {
  
  @scala.inline
  def apply(EndTimestamp: Timestamp, StartTimestamp: Timestamp): TimestampRange = {
    val __obj = js.Dynamic.literal(EndTimestamp = EndTimestamp.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampRange]
  }
  
  @scala.inline
  implicit class TimestampRangeOps[Self <: TimestampRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTimestamp(value: Timestamp): Self = this.set("EndTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestamp(value: Timestamp): Self = this.set("StartTimestamp", value.asInstanceOf[js.Any])
  }
}
