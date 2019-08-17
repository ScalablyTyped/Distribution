package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRecordsEventMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RecordsEvent extends js.Object {
  /**
    * <p>The byte array of partial, one or more result records.</p>
    */
  var Payload: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
}

object _RecordsEvent {
  @scala.inline
  def apply(Payload: ArrayBuffer | ArrayBufferView | String = null): _RecordsEvent = {
    val __obj = js.Dynamic.literal()
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RecordsEvent]
  }
}

