package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutDocumentResponse extends js.Object {
  
  /**
    * A list of documents that were not added to the index because the document failed a validation check. Each document contains an error message that indicates why the document couldn't be added to the index. If there was an error adding a document to an index the error is reported in your AWS CloudWatch log. For more information, see Monitoring Amazon Kendra with Amazon CloudWatch Logs 
    */
  var FailedDocuments: js.UndefOr[BatchPutDocumentResponseFailedDocuments] = js.native
}
object BatchPutDocumentResponse {
  
  @scala.inline
  def apply(): BatchPutDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutDocumentResponse]
  }
  
  @scala.inline
  implicit class BatchPutDocumentResponseOps[Self <: BatchPutDocumentResponse] (val x: Self) extends AnyVal {
    
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
    def setFailedDocumentsVarargs(value: BatchPutDocumentResponseFailedDocument*): Self = this.set("FailedDocuments", js.Array(value :_*))
    
    @scala.inline
    def setFailedDocuments(value: BatchPutDocumentResponseFailedDocuments): Self = this.set("FailedDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedDocuments: Self = this.set("FailedDocuments", js.undefined)
  }
}
