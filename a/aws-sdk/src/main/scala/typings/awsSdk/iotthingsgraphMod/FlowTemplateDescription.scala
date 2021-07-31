package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowTemplateDescription extends StObject {
  
  /**
    * A workflow's definition document.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.undefined
  
  /**
    * An object that contains summary information about a workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.undefined
  
  /**
    * The version of the user's namespace against which the workflow was validated. Use this value in your system instance.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
}
object FlowTemplateDescription {
  
  @scala.inline
  def apply(): FlowTemplateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowTemplateDescription]
  }
  
  @scala.inline
  implicit class FlowTemplateDescriptionMutableBuilder[Self <: FlowTemplateDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setSummary(value: FlowTemplateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setValidatedNamespaceVersion(value: Version): Self = StObject.set(x, "validatedNamespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatedNamespaceVersionUndefined: Self = StObject.set(x, "validatedNamespaceVersion", js.undefined)
  }
}
