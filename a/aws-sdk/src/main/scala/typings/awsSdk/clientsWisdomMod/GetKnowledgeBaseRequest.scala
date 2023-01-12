package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKnowledgeBaseRequest extends StObject {
  
  /**
    * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var knowledgeBaseId: UuidOrArn
}
object GetKnowledgeBaseRequest {
  
  inline def apply(knowledgeBaseId: UuidOrArn): GetKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal(knowledgeBaseId = knowledgeBaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKnowledgeBaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKnowledgeBaseRequest] (val x: Self) extends AnyVal {
    
    inline def setKnowledgeBaseId(value: UuidOrArn): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
  }
}
