package typings.awsSdkClientS3Browser.typesRecordsEventMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordsEvent extends js.Object {
  /**
    * <p>The byte array of partial, one or more result records.</p>
    */
  var Payload: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
}

object RecordsEvent {
  @scala.inline
  def apply(Payload: ArrayBuffer | ArrayBufferView | String = null): RecordsEvent = {
    val __obj = js.Dynamic.literal()
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordsEvent]
  }
}

