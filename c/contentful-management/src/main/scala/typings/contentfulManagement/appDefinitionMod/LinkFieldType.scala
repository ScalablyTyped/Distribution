package typings.contentfulManagement.appDefinitionMod

import typings.contentfulManagement.contentfulManagementStrings.Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkFieldType extends FieldType {
  
  var linkType: LinkType = js.native
  
  var `type`: Link = js.native
}
object LinkFieldType {
  
  @scala.inline
  def apply(linkType: LinkType, `type`: Link): LinkFieldType = {
    val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFieldType]
  }
  
  @scala.inline
  implicit class LinkFieldTypeOps[Self <: LinkFieldType] (val x: Self) extends AnyVal {
    
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
    def setLinkType(value: LinkType): Self = this.set("linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Link): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
