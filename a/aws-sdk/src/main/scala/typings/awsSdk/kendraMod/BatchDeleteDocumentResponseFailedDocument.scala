package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteDocumentResponseFailedDocument extends js.Object {
  /**
    * The error code for why the document couldn't be removed from the index.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.kendraMod.ErrorCode] = js.native
  /**
    * An explanation for why the document couldn't be removed from the index.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.native
  /**
    * The identifier of the document that couldn't be removed from the index.
    */
  var Id: js.UndefOr[DocumentId] = js.native
}

object BatchDeleteDocumentResponseFailedDocument {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null, Id: DocumentId = null): BatchDeleteDocumentResponseFailedDocument = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDocumentResponseFailedDocument]
  }
}

