package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteDocumentResponse extends StObject {
  
  /**
    * A list of documents that could not be removed from the index. Each entry contains an error message that indicates why the document couldn't be removed from the index.
    */
  var FailedDocuments: js.UndefOr[BatchDeleteDocumentResponseFailedDocuments] = js.native
}
object BatchDeleteDocumentResponse {
  
  @scala.inline
  def apply(): BatchDeleteDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteDocumentResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteDocumentResponseMutableBuilder[Self <: BatchDeleteDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedDocuments(value: BatchDeleteDocumentResponseFailedDocuments): Self = StObject.set(x, "FailedDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedDocumentsUndefined: Self = StObject.set(x, "FailedDocuments", js.undefined)
    
    @scala.inline
    def setFailedDocumentsVarargs(value: BatchDeleteDocumentResponseFailedDocument*): Self = StObject.set(x, "FailedDocuments", js.Array(value :_*))
  }
}
