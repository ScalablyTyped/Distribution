package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateKnowledgeBaseTemplateUriRequest extends StObject {
  
  /**
    * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var knowledgeBaseId: UuidOrArn
  
  /**
    * The template URI to update.
    */
  var templateUri: Uri
}
object UpdateKnowledgeBaseTemplateUriRequest {
  
  inline def apply(knowledgeBaseId: UuidOrArn, templateUri: Uri): UpdateKnowledgeBaseTemplateUriRequest = {
    val __obj = js.Dynamic.literal(knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any], templateUri = templateUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateKnowledgeBaseTemplateUriRequest]
  }
  
  extension [Self <: UpdateKnowledgeBaseTemplateUriRequest](x: Self) {
    
    inline def setKnowledgeBaseId(value: UuidOrArn): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
    
    inline def setTemplateUri(value: Uri): Self = StObject.set(x, "templateUri", value.asInstanceOf[js.Any])
  }
}
