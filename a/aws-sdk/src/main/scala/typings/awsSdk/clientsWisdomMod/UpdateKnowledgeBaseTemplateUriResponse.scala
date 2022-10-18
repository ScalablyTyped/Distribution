package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateKnowledgeBaseTemplateUriResponse extends StObject {
  
  /**
    * The knowledge base to update.
    */
  var knowledgeBase: js.UndefOr[KnowledgeBaseData] = js.undefined
}
object UpdateKnowledgeBaseTemplateUriResponse {
  
  inline def apply(): UpdateKnowledgeBaseTemplateUriResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateKnowledgeBaseTemplateUriResponse]
  }
  
  extension [Self <: UpdateKnowledgeBaseTemplateUriResponse](x: Self) {
    
    inline def setKnowledgeBase(value: KnowledgeBaseData): Self = StObject.set(x, "knowledgeBase", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseUndefined: Self = StObject.set(x, "knowledgeBase", js.undefined)
  }
}
