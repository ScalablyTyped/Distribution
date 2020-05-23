package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutDocumentResponse extends js.Object {
  /**
    * A list of documents that were not added to the index because the document failed a validation check. Each document contains an error message that indicates why the document couldn't be added to the index. If there was an error adding a document to an index the error is reported in your AWS CloudWatch log. For more information, see Monitoring Amazon Kendra with Amazon CloudWatch Logs 
    */
  var FailedDocuments: js.UndefOr[BatchPutDocumentResponseFailedDocuments] = js.native
}

object BatchPutDocumentResponse {
  @scala.inline
  def apply(FailedDocuments: BatchPutDocumentResponseFailedDocuments = null): BatchPutDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedDocuments != null) __obj.updateDynamic("FailedDocuments")(FailedDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutDocumentResponse]
  }
}

