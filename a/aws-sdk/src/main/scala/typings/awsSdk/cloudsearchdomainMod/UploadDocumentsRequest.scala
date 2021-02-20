package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadDocumentsRequest extends StObject {
  
  /**
    * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:  application/json application/xml 
    */
  var contentType: ContentType = js.native
  
  /**
    * A batch of documents formatted in JSON or HTML.
    */
  var documents: _Blob = js.native
}
object UploadDocumentsRequest {
  
  @scala.inline
  def apply(contentType: ContentType, documents: _Blob): UploadDocumentsRequest = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadDocumentsRequest]
  }
  
  @scala.inline
  implicit class UploadDocumentsRequestMutableBuilder[Self <: UploadDocumentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocuments(value: _Blob): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
  }
}
