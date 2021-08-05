package typings.contentfulManagement.anon

import typings.contentfulManagement.contentfulManagementStrings.Environment
import typings.contentfulManagement.contentfulManagementStrings.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var linkType: Environment
  
  var `type`: Link
}
object Id {
  
  inline def apply(id: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], linkType = "Environment")
    __obj.updateDynamic("type")("Link")
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLinkType(value: Environment): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    inline def setType(value: Link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
