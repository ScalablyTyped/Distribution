package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKnowledgeBaseResponse extends StObject {
  
  /**
    * The knowledge base.
    */
  var knowledgeBase: js.UndefOr[KnowledgeBaseData] = js.undefined
}
object CreateKnowledgeBaseResponse {
  
  inline def apply(): CreateKnowledgeBaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKnowledgeBaseResponse]
  }
  
  extension [Self <: CreateKnowledgeBaseResponse](x: Self) {
    
    inline def setKnowledgeBase(value: KnowledgeBaseData): Self = StObject.set(x, "knowledgeBase", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseUndefined: Self = StObject.set(x, "knowledgeBase", js.undefined)
  }
}
