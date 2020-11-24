package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimecodeConfig extends js.Object {
  
  /**
    * Identifies the source for the timecode that will be associated with the events outputs.
  -Embedded (embedded): Initialize the output timecode with timecode from the the source.  If no embedded timecode is detected in the source, the system falls back to using "Start at 0" (zerobased).
  -System Clock (systemclock): Use the UTC time.
  -Start at 0 (zerobased): The time of the first frame of the event will be 00:00:00:00.
    */
  var Source: TimecodeConfigSource = js.native
  
  /**
    * Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies below this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No timecode sync when this is not specified.
    */
  var SyncThreshold: js.UndefOr[integerMin1Max1000000] = js.native
}
object TimecodeConfig {
  
  @scala.inline
  def apply(Source: TimecodeConfigSource): TimecodeConfig = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimecodeConfig]
  }
  
  @scala.inline
  implicit class TimecodeConfigOps[Self <: TimecodeConfig] (val x: Self) extends AnyVal {
    
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
    def setSource(value: TimecodeConfigSource): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncThreshold(value: integerMin1Max1000000): Self = this.set("SyncThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncThreshold: Self = this.set("SyncThreshold", js.undefined)
  }
}
