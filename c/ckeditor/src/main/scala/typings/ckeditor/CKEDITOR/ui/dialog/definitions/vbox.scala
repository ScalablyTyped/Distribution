package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait vbox extends js.Object {
  
  var align: js.UndefOr[String] = js.native
  
  var expand: js.UndefOr[Boolean] = js.native
  
  var heights: js.UndefOr[js.Array[String]] = js.native
  
  var padding: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object vbox {
  
  @scala.inline
  def apply(): vbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[vbox]
  }
  
  @scala.inline
  implicit class vboxOps[Self <: vbox] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setHeightsVarargs(value: String*): Self = this.set("heights", js.Array(value :_*))
    
    @scala.inline
    def setHeights(value: js.Array[String]): Self = this.set("heights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeights: Self = this.set("heights", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
