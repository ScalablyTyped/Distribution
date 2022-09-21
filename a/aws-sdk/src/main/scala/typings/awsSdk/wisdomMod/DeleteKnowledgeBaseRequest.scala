package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteKnowledgeBaseRequest extends StObject {
  
  /**
    * The knowledge base to delete content from. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var knowledgeBaseId: UuidOrArn
}
object DeleteKnowledgeBaseRequest {
  
  inline def apply(knowledgeBaseId: UuidOrArn): DeleteKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal(knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKnowledgeBaseRequest]
  }
  
  extension [Self <: DeleteKnowledgeBaseRequest](x: Self) {
    
    inline def setKnowledgeBaseId(value: UuidOrArn): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
  }
}
