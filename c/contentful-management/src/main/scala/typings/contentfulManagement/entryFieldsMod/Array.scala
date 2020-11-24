package typings.contentfulManagement.entryFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends _EntryFields {
  
  var items: Entry | Asset | js.Symbol = js.native
  
  var `type`: typings.contentfulManagement.contentfulManagementStrings.Array = js.native
}
object Array {
  
  @scala.inline
  def apply(
    items: Entry | Asset | js.Symbol,
    `type`: typings.contentfulManagement.contentfulManagementStrings.Array
  ): Array = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
    
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
    def setItems(value: Entry | Asset | js.Symbol): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.contentfulManagement.contentfulManagementStrings.Array): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
