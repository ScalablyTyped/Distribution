package typings.awsSdkClientSqsNode.typesDeleteMessageBatchResultEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMessageBatchResultEntry extends js.Object {
  /**
    * <p>Represents a successfully deleted message.</p>
    */
  var Id: String
}

object DeleteMessageBatchResultEntry {
  @scala.inline
  def apply(Id: String): DeleteMessageBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMessageBatchResultEntry]
  }
}

