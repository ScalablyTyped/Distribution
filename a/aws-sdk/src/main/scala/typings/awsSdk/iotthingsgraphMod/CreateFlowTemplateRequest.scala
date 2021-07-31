package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowTemplateRequest extends StObject {
  
  /**
    * The namespace version in which the workflow is to be created. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The workflow DefinitionDocument.
    */
  var definition: DefinitionDocument
}
object CreateFlowTemplateRequest {
  
  @scala.inline
  def apply(definition: DefinitionDocument): CreateFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateFlowTemplateRequestMutableBuilder[Self <: CreateFlowTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleNamespaceVersion(value: Version): Self = StObject.set(x, "compatibleNamespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleNamespaceVersionUndefined: Self = StObject.set(x, "compatibleNamespaceVersion", js.undefined)
    
    @scala.inline
    def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
  }
}
