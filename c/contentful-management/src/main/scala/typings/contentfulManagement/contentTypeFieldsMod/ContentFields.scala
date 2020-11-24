package typings.contentfulManagement.contentTypeFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentFields extends Item {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var items: js.UndefOr[Item] = js.native
  
  var localized: Boolean = js.native
  
  var name: String = js.native
  
  var omitted: js.UndefOr[Boolean] = js.native
  
  var required: Boolean = js.native
}
object ContentFields {
  
  @scala.inline
  def apply(id: String, localized: Boolean, name: String, required: Boolean, `type`: String): ContentFields = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localized = localized.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentFields]
  }
  
  @scala.inline
  implicit class ContentFieldsOps[Self <: ContentFields] (val x: Self) extends AnyVal {
    
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
    def setLocalized(value: Boolean): Self = this.set("localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setItems(value: Item): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOmitted(value: Boolean): Self = this.set("omitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitted: Self = this.set("omitted", js.undefined)
  }
}
