package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSystemTemplateRequest extends StObject {
  
  /**
    * The namespace version in which the system is to be created. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The DefinitionDocument used to create the system.
    */
  var definition: DefinitionDocument
}
object CreateSystemTemplateRequest {
  
  @scala.inline
  def apply(definition: DefinitionDocument): CreateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSystemTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateSystemTemplateRequestMutableBuilder[Self <: CreateSystemTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleNamespaceVersion(value: Version): Self = StObject.set(x, "compatibleNamespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleNamespaceVersionUndefined: Self = StObject.set(x, "compatibleNamespaceVersion", js.undefined)
    
    @scala.inline
    def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
  }
}
