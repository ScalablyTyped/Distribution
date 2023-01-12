package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartContentUploadRequest extends StObject {
  
  /**
    * The type of content to upload.
    */
  var contentType: ContentType
  
  /**
    * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var knowledgeBaseId: UuidOrArn
}
object StartContentUploadRequest {
  
  inline def apply(contentType: ContentType, knowledgeBaseId: UuidOrArn): StartContentUploadRequest = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartContentUploadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartContentUploadRequest] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseId(value: UuidOrArn): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
  }
}
