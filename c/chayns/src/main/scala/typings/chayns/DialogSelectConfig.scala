package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.dialog.select()
@js.native
trait DialogSelectConfig extends js.Object {
  
  var buttons: js.UndefOr[js.Array[_]] = js.native
  
          // TODO interface for buttons
  var list: js.Array[DialogSelectConfigItem] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var multiselect: js.UndefOr[Boolean] = js.native
  
  var quickfind: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
}
object DialogSelectConfig {
  
  @scala.inline
  def apply(list: js.Array[DialogSelectConfigItem], title: String): DialogSelectConfig = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectConfig]
  }
  
  @scala.inline
  implicit class DialogSelectConfigOps[Self <: DialogSelectConfig] (val x: Self) extends AnyVal {
    
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
    def setListVarargs(value: DialogSelectConfigItem*): Self = this.set("list", js.Array(value :_*))
    
    @scala.inline
    def setList(value: js.Array[DialogSelectConfigItem]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: js.Any*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[_]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMultiselect(value: Boolean): Self = this.set("multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiselect: Self = this.set("multiselect", js.undefined)
    
    @scala.inline
    def setQuickfind(value: Boolean): Self = this.set("quickfind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickfind: Self = this.set("quickfind", js.undefined)
  }
}
