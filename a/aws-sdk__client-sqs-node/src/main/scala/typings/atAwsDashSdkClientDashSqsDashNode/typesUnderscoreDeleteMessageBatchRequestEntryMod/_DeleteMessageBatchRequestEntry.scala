package typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreDeleteMessageBatchRequestEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DeleteMessageBatchRequestEntry extends js.Object {
  /**
    * <p>An identifier for this particular receipt handle. This is used to communicate the result.</p> <note> <p>The <code>Id</code>s of a batch request need to be unique within a request</p> </note>
    */
  var Id: String
  /**
    * <p>A receipt handle.</p>
    */
  var ReceiptHandle: String
}

object _DeleteMessageBatchRequestEntry {
  @scala.inline
  def apply(Id: String, ReceiptHandle: String): _DeleteMessageBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_DeleteMessageBatchRequestEntry]
  }
}

