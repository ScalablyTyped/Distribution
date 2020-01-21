package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeMessageVisibilityBatchResultEntry extends js.Object {
  /**
    * Represents a message whose visibility timeout has been changed successfully.
    */
  var Id: String = js.native
}

object ChangeMessageVisibilityBatchResultEntry {
  @scala.inline
  def apply(Id: String): ChangeMessageVisibilityBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeMessageVisibilityBatchResultEntry]
  }
}

