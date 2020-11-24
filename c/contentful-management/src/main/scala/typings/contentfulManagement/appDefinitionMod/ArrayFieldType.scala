package typings.contentfulManagement.appDefinitionMod

import typings.contentfulManagement.contentfulManagementStrings.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayFieldType extends FieldType {
  
  var items: SingleFieldType | LinkFieldType = js.native
  
  var `type`: Array = js.native
}
object ArrayFieldType {
  
  @scala.inline
  def apply(items: SingleFieldType | LinkFieldType, `type`: Array): ArrayFieldType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldType]
  }
  
  @scala.inline
  implicit class ArrayFieldTypeOps[Self <: ArrayFieldType] (val x: Self) extends AnyVal {
    
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
    def setItems(value: SingleFieldType | LinkFieldType): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Array): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
