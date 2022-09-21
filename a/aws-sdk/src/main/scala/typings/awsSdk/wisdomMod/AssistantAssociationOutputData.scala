package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssistantAssociationOutputData extends StObject {
  
  /**
    * The knowledge base where output data is sent.
    */
  var knowledgeBaseAssociation: js.UndefOr[KnowledgeBaseAssociationData] = js.undefined
}
object AssistantAssociationOutputData {
  
  inline def apply(): AssistantAssociationOutputData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssistantAssociationOutputData]
  }
  
  extension [Self <: AssistantAssociationOutputData](x: Self) {
    
    inline def setKnowledgeBaseAssociation(value: KnowledgeBaseAssociationData): Self = StObject.set(x, "knowledgeBaseAssociation", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseAssociationUndefined: Self = StObject.set(x, "knowledgeBaseAssociation", js.undefined)
  }
}
