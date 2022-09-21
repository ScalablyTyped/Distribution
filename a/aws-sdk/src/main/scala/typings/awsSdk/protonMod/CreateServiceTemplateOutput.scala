package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceTemplateOutput extends StObject {
  
  /**
    * The service template detail data that's returned by Proton.
    */
  var serviceTemplate: ServiceTemplate
}
object CreateServiceTemplateOutput {
  
  inline def apply(serviceTemplate: ServiceTemplate): CreateServiceTemplateOutput = {
    val __obj = js.Dynamic.literal(serviceTemplate = serviceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceTemplateOutput]
  }
  
  extension [Self <: CreateServiceTemplateOutput](x: Self) {
    
    inline def setServiceTemplate(value: ServiceTemplate): Self = StObject.set(x, "serviceTemplate", value.asInstanceOf[js.Any])
  }
}
