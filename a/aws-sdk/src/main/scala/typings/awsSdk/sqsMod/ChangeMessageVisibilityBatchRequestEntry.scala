package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeMessageVisibilityBatchRequestEntry extends js.Object {
  /**
    * An identifier for this particular receipt handle used to communicate the result.  The Ids of a batch request need to be unique within a request 
    */
  var Id: String = js.native
  /**
    * A receipt handle.
    */
  var ReceiptHandle: String = js.native
  /**
    * The new value (in seconds) for the message's visibility timeout.
    */
  var VisibilityTimeout: js.UndefOr[Integer] = js.native
}

object ChangeMessageVisibilityBatchRequestEntry {
  @scala.inline
  def apply(Id: String, ReceiptHandle: String, VisibilityTimeout: Int | Double = null): ChangeMessageVisibilityBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
    if (VisibilityTimeout != null) __obj.updateDynamic("VisibilityTimeout")(VisibilityTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
  }
}

