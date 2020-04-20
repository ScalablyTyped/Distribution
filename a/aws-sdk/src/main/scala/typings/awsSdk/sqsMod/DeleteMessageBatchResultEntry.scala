package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMessageBatchResultEntry extends js.Object {
  /**
    * Represents a successfully deleted message.
    */
  var Id: String = js.native
}

object DeleteMessageBatchResultEntry {
  @scala.inline
  def apply(Id: String): DeleteMessageBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchResultEntry]
  }
}

