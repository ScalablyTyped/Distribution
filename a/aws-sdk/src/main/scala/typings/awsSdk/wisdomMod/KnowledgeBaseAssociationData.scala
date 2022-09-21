package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeBaseAssociationData extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the knowledge base.
    */
  var knowledgeBaseArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The identifier of the knowledge base.
    */
  var knowledgeBaseId: js.UndefOr[Uuid] = js.undefined
}
object KnowledgeBaseAssociationData {
  
  inline def apply(): KnowledgeBaseAssociationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnowledgeBaseAssociationData]
  }
  
  extension [Self <: KnowledgeBaseAssociationData](x: Self) {
    
    inline def setKnowledgeBaseArn(value: Arn): Self = StObject.set(x, "knowledgeBaseArn", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseArnUndefined: Self = StObject.set(x, "knowledgeBaseArn", js.undefined)
    
    inline def setKnowledgeBaseId(value: Uuid): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseIdUndefined: Self = StObject.set(x, "knowledgeBaseId", js.undefined)
  }
}
