package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadDocumentsRequest extends StObject {
  
  /**
    * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:  application/json application/xml 
    */
  var contentType: ContentType
  
  /**
    * A batch of documents formatted in JSON or HTML.
    */
  var documents: _Blob
}
object UploadDocumentsRequest {
  
  inline def apply(contentType: ContentType, documents: _Blob): UploadDocumentsRequest = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadDocumentsRequest]
  }
  
  extension [Self <: UploadDocumentsRequest](x: Self) {
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setDocuments(value: _Blob): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
  }
}
