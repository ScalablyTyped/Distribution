package typings.contentfulManagement.anon

import typings.contentfulManagement.contentfulManagementStrings.Environment
import typings.contentfulManagement.contentfulManagementStrings.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends StObject {
  
  var id: String = js.native
  
  var linkType: Environment = js.native
  
  var `type`: Link = js.native
}
object Id {
  
  @scala.inline
  def apply(id: String, linkType: Environment, `type`: Link): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
