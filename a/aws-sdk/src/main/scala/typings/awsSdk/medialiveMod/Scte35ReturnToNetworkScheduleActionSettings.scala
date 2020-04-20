package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

