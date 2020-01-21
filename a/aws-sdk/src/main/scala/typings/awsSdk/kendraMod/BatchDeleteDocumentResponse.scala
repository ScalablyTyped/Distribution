package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteDocumentResponse extends js.Object {
  /**
    * A list of documents that could not be removed from the index. Each entry contains an error message that indicates why the document couldn't be removed from the index.
    */
  var FailedDocuments: js.UndefOr[BatchDeleteDocumentResponseFailedDocuments] = js.native
}

object BatchDeleteDocumentResponse {
  @scala.inline
  def apply(FailedDocuments: BatchDeleteDocumentResponseFailedDocuments = null): BatchDeleteDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedDocuments != null) __obj.updateDynamic("FailedDocuments")(FailedDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDocumentResponse]
  }
}

