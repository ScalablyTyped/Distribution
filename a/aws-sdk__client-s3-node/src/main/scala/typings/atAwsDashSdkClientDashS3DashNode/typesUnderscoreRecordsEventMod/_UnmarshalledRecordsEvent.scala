package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRecordsEventMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRecordsEvent extends _RecordsEvent {
  /**
    * <p>The byte array of partial, one or more result records.</p>
    */
  @JSName("Payload")
  var Payload__UnmarshalledRecordsEvent: js.UndefOr[Uint8Array] = js.undefined
}

object _UnmarshalledRecordsEvent {
  @scala.inline
  def apply(Payload: Uint8Array = null): _UnmarshalledRecordsEvent = {
    val __obj = js.Dynamic.literal()
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledRecordsEvent]
  }
}

