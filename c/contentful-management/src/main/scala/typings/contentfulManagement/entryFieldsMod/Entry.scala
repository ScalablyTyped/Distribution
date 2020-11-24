package typings.contentfulManagement.entryFieldsMod

import typings.contentfulManagement.contentfulManagementStrings.Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry extends _EntryFields {
  
  var linkType: typings.contentfulManagement.contentfulManagementStrings.Entry = js.native
  
  var `type`: Link = js.native
}
object Entry {
  
  @scala.inline
  def apply(linkType: typings.contentfulManagement.contentfulManagementStrings.Entry, `type`: Link): Entry = {
    val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
    
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
    def setLinkType(value: typings.contentfulManagement.contentfulManagementStrings.Entry): Self = this.set("linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Link): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
