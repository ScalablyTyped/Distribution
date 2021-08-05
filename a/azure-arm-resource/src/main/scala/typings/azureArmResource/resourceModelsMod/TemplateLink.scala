package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateLink extends StObject {
  
  /**
    * If included, must match the ContentVersion in the template.
    */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The URI of the template to deploy.
    */
  var uri: String
}
object TemplateLink {
  
  inline def apply(uri: String): TemplateLink = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLink]
  }
  
  extension [Self <: TemplateLink](x: Self) {
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
