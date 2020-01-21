package typings.awsSdkClientSqsNode.typesBatchResultErrorEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchResultErrorEntry extends js.Object {
  /**
    * <p>An error code representing why the action failed on this entry.</p>
    */
  var Code: String
  /**
    * <p>The <code>Id</code> of an entry in a batch request.</p>
    */
  var Id: String
  /**
    * <p>A message explaining why the action failed on this entry.</p>
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies whether the error happened due to the producer.</p>
    */
  var SenderFault: Boolean
}

object BatchResultErrorEntry {
  @scala.inline
  def apply(Code: String, Id: String, SenderFault: Boolean, Message: String = null): BatchResultErrorEntry = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], SenderFault = SenderFault.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResultErrorEntry]
  }
}

