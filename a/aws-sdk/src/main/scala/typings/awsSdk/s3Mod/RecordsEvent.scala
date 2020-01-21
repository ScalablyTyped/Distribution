package typings.awsSdk.s3Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordsEvent extends js.Object {
  /**
    * The byte array of partial, one or more result records.
    */
  var Payload: js.UndefOr[Buffer] = js.native
}

object RecordsEvent {
  @scala.inline
  def apply(Payload: Buffer = null): RecordsEvent = {
    val __obj = js.Dynamic.literal()
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordsEvent]
  }
}

