package typings.chartmogulNode.mod.Customer

import typings.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewAttributes extends js.Object {
  
  var custom: js.UndefOr[js.Array[NewCustomAttributes]] = js.native
  
  var tags: js.UndefOr[Strings] = js.native
}
object NewAttributes {
  
  @scala.inline
  def apply(): NewAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewAttributes]
  }
  
  @scala.inline
  implicit class NewAttributesOps[Self <: NewAttributes] (val x: Self) extends AnyVal {
    
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
    def setCustomVarargs(value: NewCustomAttributes*): Self = this.set("custom", js.Array(value :_*))
    
    @scala.inline
    def setCustom(value: js.Array[NewCustomAttributes]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Strings): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
