package typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchResultEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeMessageVisibilityBatchResultEntry extends js.Object {
  /**
    * <p>Represents a message whose visibility timeout has been changed successfully.</p>
    */
  var Id: String
}

object ChangeMessageVisibilityBatchResultEntry {
  @scala.inline
  def apply(Id: String): ChangeMessageVisibilityBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeMessageVisibilityBatchResultEntry]
  }
}

