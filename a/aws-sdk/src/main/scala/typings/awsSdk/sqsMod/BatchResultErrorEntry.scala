package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchResultErrorEntry extends js.Object {
  /**
    * An error code representing why the action failed on this entry.
    */
  var Code: String = js.native
  /**
    * The Id of an entry in a batch request.
    */
  var Id: String = js.native
  /**
    * A message explaining why the action failed on this entry.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * Specifies whether the error happened due to the caller of the batch API action.
    */
  var SenderFault: Boolean = js.native
}

object BatchResultErrorEntry {
  @scala.inline
  def apply(Code: String, Id: String, SenderFault: Boolean, Message: String = null): BatchResultErrorEntry = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], SenderFault = SenderFault.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResultErrorEntry]
  }
}

