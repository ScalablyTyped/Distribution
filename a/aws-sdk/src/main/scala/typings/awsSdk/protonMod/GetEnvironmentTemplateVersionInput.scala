package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentTemplateVersionInput extends StObject {
  
  /**
    * To get environment template major version detail data, include major Version.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * To get environment template minor version detail data, include minorVersion.
    */
  var minorVersion: TemplateVersionPart
  
  /**
    * The name of the environment template a version of which you want to get detailed data for..
    */
  var templateName: ResourceName
}
object GetEnvironmentTemplateVersionInput {
  
  inline def apply(majorVersion: TemplateVersionPart, minorVersion: TemplateVersionPart, templateName: ResourceName): GetEnvironmentTemplateVersionInput = {
    val __obj = js.Dynamic.literal(majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentTemplateVersionInput]
  }
  
  extension [Self <: GetEnvironmentTemplateVersionInput](x: Self) {
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
