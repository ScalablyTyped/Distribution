package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssistantAssociationInputData extends StObject {
  
  /**
    * The identifier of the knowledge base.
    */
  var knowledgeBaseId: js.UndefOr[Uuid] = js.undefined
}
object AssistantAssociationInputData {
  
  inline def apply(): AssistantAssociationInputData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssistantAssociationInputData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssistantAssociationInputData] (val x: Self) extends AnyVal {
    
    inline def setKnowledgeBaseId(value: Uuid): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseIdUndefined: Self = StObject.set(x, "knowledgeBaseId", js.undefined)
  }
}
