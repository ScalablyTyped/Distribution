package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutDocumentResponseFailedDocument extends js.Object {
  /**
    * The type of error that caused the document to fail to be indexed.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.kendraMod.ErrorCode] = js.native
  /**
    * A description of the reason why the document could not be indexed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.native
  /**
    * The unique identifier of the document.
    */
  var Id: js.UndefOr[DocumentId] = js.native
}

object BatchPutDocumentResponseFailedDocument {
  @scala.inline
  def apply(): BatchPutDocumentResponseFailedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutDocumentResponseFailedDocument]
  }
  @scala.inline
  implicit class BatchPutDocumentResponseFailedDocumentOps[Self <: BatchPutDocumentResponseFailedDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setId(value: DocumentId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

