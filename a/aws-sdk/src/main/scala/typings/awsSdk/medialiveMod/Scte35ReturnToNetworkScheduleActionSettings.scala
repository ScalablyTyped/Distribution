package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scte35ReturnToNetworkScheduleActionSettings extends js.Object {
  
  /**
    * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
    */
  var SpliceEventId: longMin0Max4294967295 = js.native
}
object Scte35ReturnToNetworkScheduleActionSettings {
  
  @scala.inline
  def apply(SpliceEventId: longMin0Max4294967295): Scte35ReturnToNetworkScheduleActionSettings = {
    val __obj = js.Dynamic.literal(SpliceEventId = SpliceEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35ReturnToNetworkScheduleActionSettings]
  }
  
  @scala.inline
  implicit class Scte35ReturnToNetworkScheduleActionSettingsOps[Self <: Scte35ReturnToNetworkScheduleActionSettings] (val x: Self) extends AnyVal {
    
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
    def setSpliceEventId(value: longMin0Max4294967295): Self = this.set("SpliceEventId", value.asInstanceOf[js.Any])
  }
}
