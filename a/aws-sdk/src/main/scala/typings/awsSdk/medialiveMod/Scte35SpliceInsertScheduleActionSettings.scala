package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scte35SpliceInsertScheduleActionSettings extends StObject {
  
  /**
    * Optional, the duration for the splice_insert, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds by 90,000. If you enter a duration, there is an expectation that the downstream system can read the duration and cue in at that time. If you do not enter a duration, the splice_insert will continue indefinitely and there is an expectation that you will enter a return_to_network to end the splice_insert at the appropriate time.
    */
  var Duration: js.UndefOr[longMin0Max8589934591] = js.native
  
  /**
    * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
    */
  var SpliceEventId: longMin0Max4294967295 = js.native
}
object Scte35SpliceInsertScheduleActionSettings {
  
  @scala.inline
  def apply(SpliceEventId: longMin0Max4294967295): Scte35SpliceInsertScheduleActionSettings = {
    val __obj = js.Dynamic.literal(SpliceEventId = SpliceEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35SpliceInsertScheduleActionSettings]
  }
  
  @scala.inline
  implicit class Scte35SpliceInsertScheduleActionSettingsMutableBuilder[Self <: Scte35SpliceInsertScheduleActionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: longMin0Max8589934591): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setSpliceEventId(value: longMin0Max4294967295): Self = StObject.set(x, "SpliceEventId", value.asInstanceOf[js.Any])
  }
}
