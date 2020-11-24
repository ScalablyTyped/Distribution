package typings.contentfulManagement.anon

import typings.contentfulManagement.contentfulManagementStrings.Environment
import typings.contentfulManagement.contentfulManagementStrings.Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends js.Object {
  
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
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: Environment): Self = this.set("linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Link): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
