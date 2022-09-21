package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceTemplateVersionOutput extends StObject {
  
  /**
    * The service template version summary of detail data that's returned by Proton.
    */
  var serviceTemplateVersion: ServiceTemplateVersion
}
object CreateServiceTemplateVersionOutput {
  
  inline def apply(serviceTemplateVersion: ServiceTemplateVersion): CreateServiceTemplateVersionOutput = {
    val __obj = js.Dynamic.literal(serviceTemplateVersion = serviceTemplateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceTemplateVersionOutput]
  }
  
  extension [Self <: CreateServiceTemplateVersionOutput](x: Self) {
    
    inline def setServiceTemplateVersion(value: ServiceTemplateVersion): Self = StObject.set(x, "serviceTemplateVersion", value.asInstanceOf[js.Any])
  }
}
