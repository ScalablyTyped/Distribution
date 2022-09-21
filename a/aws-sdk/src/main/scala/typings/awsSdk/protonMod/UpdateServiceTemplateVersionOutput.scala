package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceTemplateVersionOutput extends StObject {
  
  /**
    * The service template version detail data that's returned by Proton.
    */
  var serviceTemplateVersion: ServiceTemplateVersion
}
object UpdateServiceTemplateVersionOutput {
  
  inline def apply(serviceTemplateVersion: ServiceTemplateVersion): UpdateServiceTemplateVersionOutput = {
    val __obj = js.Dynamic.literal(serviceTemplateVersion = serviceTemplateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceTemplateVersionOutput]
  }
  
  extension [Self <: UpdateServiceTemplateVersionOutput](x: Self) {
    
    inline def setServiceTemplateVersion(value: ServiceTemplateVersion): Self = StObject.set(x, "serviceTemplateVersion", value.asInstanceOf[js.Any])
  }
}
