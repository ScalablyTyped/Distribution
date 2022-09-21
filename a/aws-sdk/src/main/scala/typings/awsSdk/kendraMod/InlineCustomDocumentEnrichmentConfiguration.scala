package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineCustomDocumentEnrichmentConfiguration extends StObject {
  
  /**
    * Configuration of the condition used for the target document attribute or metadata field when ingesting documents into Amazon Kendra.
    */
  var Condition: js.UndefOr[DocumentAttributeCondition] = js.undefined
  
  /**
    *  TRUE to delete content if the condition used for the target attribute is met.
    */
  var DocumentContentDeletion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configuration of the target document attribute or metadata field when ingesting documents into Amazon Kendra. You can also include a value.
    */
  var Target: js.UndefOr[DocumentAttributeTarget] = js.undefined
}
object InlineCustomDocumentEnrichmentConfiguration {
  
  inline def apply(): InlineCustomDocumentEnrichmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineCustomDocumentEnrichmentConfiguration]
  }
  
  extension [Self <: InlineCustomDocumentEnrichmentConfiguration](x: Self) {
    
    inline def setCondition(value: DocumentAttributeCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setDocumentContentDeletion(value: Boolean): Self = StObject.set(x, "DocumentContentDeletion", value.asInstanceOf[js.Any])
    
    inline def setDocumentContentDeletionUndefined: Self = StObject.set(x, "DocumentContentDeletion", js.undefined)
    
    inline def setTarget(value: DocumentAttributeTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
