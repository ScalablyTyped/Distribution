package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceTemplateVersionInput extends StObject {
  
  /**
    * To get service template major version detail data, include major Version.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * To get service template minor version detail data, include minorVersion.
    */
  var minorVersion: TemplateVersionPart
  
  /**
    * The name of the service template a version of which you want to get detailed data for.
    */
  var templateName: ResourceName
}
object GetServiceTemplateVersionInput {
  
  inline def apply(majorVersion: TemplateVersionPart, minorVersion: TemplateVersionPart, templateName: ResourceName): GetServiceTemplateVersionInput = {
    val __obj = js.Dynamic.literal(majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceTemplateVersionInput]
  }
  
  extension [Self <: GetServiceTemplateVersionInput](x: Self) {
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
