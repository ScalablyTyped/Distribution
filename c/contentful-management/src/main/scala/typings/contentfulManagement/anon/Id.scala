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
  
  @scala.inline
  def apply(id: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], linkType = "Environment")
    __obj.updateDynamic("type")("Link")
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: Environment): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
