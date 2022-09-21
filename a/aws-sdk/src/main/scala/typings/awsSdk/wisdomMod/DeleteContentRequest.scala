package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContentRequest extends StObject {
  
  /**
    * The identifier of the content. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var contentId: UuidOrArn
  
  /**
    * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var knowledgeBaseId: UuidOrArn
}
object DeleteContentRequest {
  
  inline def apply(contentId: UuidOrArn, knowledgeBaseId: UuidOrArn): DeleteContentRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContentRequest]
  }
  
  extension [Self <: DeleteContentRequest](x: Self) {
    
    inline def setContentId(value: UuidOrArn): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseId(value: UuidOrArn): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
  }
}
