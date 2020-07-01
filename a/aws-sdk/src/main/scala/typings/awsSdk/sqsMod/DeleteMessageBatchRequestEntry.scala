package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMessageBatchRequestEntry extends js.Object {
  /**
    * An identifier for this particular receipt handle. This is used to communicate the result.  The Ids of a batch request need to be unique within a request. This identifier can have up to 80 characters. The following characters are accepted: alphanumeric characters, hyphens(-), and underscores (_). 
    */
  var Id: String = js.native
  /**
    * A receipt handle.
    */
  var ReceiptHandle: String = js.native
}

object DeleteMessageBatchRequestEntry {
  @scala.inline
  def apply(Id: String, ReceiptHandle: String): DeleteMessageBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchRequestEntry]
  }
}

