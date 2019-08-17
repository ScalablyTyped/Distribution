package typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreBatchResultErrorEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BatchResultErrorEntry extends js.Object {
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

object _BatchResultErrorEntry {
  @scala.inline
  def apply(Code: String, Id: String, SenderFault: Boolean, Message: String = null): _BatchResultErrorEntry = {
    val __obj = js.Dynamic.literal(Code = Code, Id = Id, SenderFault = SenderFault)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[_BatchResultErrorEntry]
  }
}

