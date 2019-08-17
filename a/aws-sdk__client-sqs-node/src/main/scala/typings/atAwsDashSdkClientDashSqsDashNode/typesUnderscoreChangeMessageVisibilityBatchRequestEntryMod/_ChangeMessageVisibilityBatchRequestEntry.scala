package typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreChangeMessageVisibilityBatchRequestEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ChangeMessageVisibilityBatchRequestEntry extends js.Object {
  /**
    * <p>An identifier for this particular receipt handle used to communicate the result.</p> <note> <p>The <code>Id</code>s of a batch request need to be unique within a request</p> </note>
    */
  var Id: String
  /**
    * <p>A receipt handle.</p>
    */
  var ReceiptHandle: String
  /**
    * <p>The new value (in seconds) for the message's visibility timeout.</p>
    */
  var VisibilityTimeout: js.UndefOr[Double] = js.undefined
}

object _ChangeMessageVisibilityBatchRequestEntry {
  @scala.inline
  def apply(Id: String, ReceiptHandle: String, VisibilityTimeout: Int | Double = null): _ChangeMessageVisibilityBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id, ReceiptHandle = ReceiptHandle)
    if (VisibilityTimeout != null) __obj.updateDynamic("VisibilityTimeout")(VisibilityTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ChangeMessageVisibilityBatchRequestEntry]
  }
}

