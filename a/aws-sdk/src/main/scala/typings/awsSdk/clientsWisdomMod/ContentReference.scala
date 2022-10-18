package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the content.
    */
  var contentArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The identifier of the content.
    */
  var contentId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the knowledge base.
    */
  var knowledgeBaseArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The identifier of the knowledge base.
    */
  var knowledgeBaseId: js.UndefOr[Uuid] = js.undefined
}
object ContentReference {
  
  inline def apply(): ContentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentReference]
  }
  
  extension [Self <: ContentReference](x: Self) {
    
    inline def setContentArn(value: Arn): Self = StObject.set(x, "contentArn", value.asInstanceOf[js.Any])
    
    inline def setContentArnUndefined: Self = StObject.set(x, "contentArn", js.undefined)
    
    inline def setContentId(value: Uuid): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    inline def setKnowledgeBaseArn(value: Arn): Self = StObject.set(x, "knowledgeBaseArn", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseArnUndefined: Self = StObject.set(x, "knowledgeBaseArn", js.undefined)
    
    inline def setKnowledgeBaseId(value: Uuid): Self = StObject.set(x, "knowledgeBaseId", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseIdUndefined: Self = StObject.set(x, "knowledgeBaseId", js.undefined)
  }
}
