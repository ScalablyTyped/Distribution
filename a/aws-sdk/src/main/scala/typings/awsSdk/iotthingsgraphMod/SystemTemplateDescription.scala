package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemTemplateDescription extends StObject {
  
  /**
    * The definition document of a system.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.undefined
  
  /**
    * An object that contains summary information about a system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.undefined
  
  /**
    * The namespace version against which the system was validated. Use this value in your system instance.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
}
object SystemTemplateDescription {
  
  inline def apply(): SystemTemplateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemTemplateDescription]
  }
  
  extension [Self <: SystemTemplateDescription](x: Self) {
    
    inline def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setSummary(value: SystemTemplateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setValidatedNamespaceVersion(value: Version): Self = StObject.set(x, "validatedNamespaceVersion", value.asInstanceOf[js.Any])
    
    inline def setValidatedNamespaceVersionUndefined: Self = StObject.set(x, "validatedNamespaceVersion", js.undefined)
  }
}
