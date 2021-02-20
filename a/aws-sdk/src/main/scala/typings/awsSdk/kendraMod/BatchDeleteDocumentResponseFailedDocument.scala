package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteDocumentResponseFailedDocument extends StObject {
  
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
  def apply(): BatchDeleteDocumentResponseFailedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteDocumentResponseFailedDocument]
  }
  
  @scala.inline
  implicit class BatchDeleteDocumentResponseFailedDocumentMutableBuilder[Self <: BatchDeleteDocumentResponseFailedDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setId(value: DocumentId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
