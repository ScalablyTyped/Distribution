package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveKnowledgeBaseTemplateUriRequest extends StObject {
  
  /**
    * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var knowledgeBaseId: UuidOrArn
}
object RemoveKnowledgeBaseTemplateUriRequest {
  
  inline def apply(knowledgeBaseId: UuidOrArn): RemoveKnowledgeBaseTemplateUriRequest = {
    val __obj = js.Dynamic.literal(knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveKnowledgeBaseTemplateUriRequest]
  }
  
  extension [Self <: RemoveKnowledgeBaseTemplateUriRequest](x: Self) {
    
    inline def setKnowledgeBaseId(value: UuidOrArn): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
  }
}
