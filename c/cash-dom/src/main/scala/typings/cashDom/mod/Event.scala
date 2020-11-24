package typings.cashDom.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  var ___cd: js.UndefOr[Boolean] = js.native
  
  var ___iblur: js.UndefOr[Boolean] = js.native
  
  var ___ifocus: js.UndefOr[Boolean] = js.native
  
  var ___ot: js.UndefOr[String] = js.native
  
  var ___td: js.UndefOr[Boolean] = js.native
  
  var data: js.Any = js.native
  
  var namespace: String = js.native
  
  var relatedTarget: js.UndefOr[Node | Null] = js.native
}
object Event {
  
  @scala.inline
  def apply(data: js.Any, namespace: String): Event = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set___cd(value: Boolean): Self = this.set("___cd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete___cd: Self = this.set("___cd", js.undefined)
    
    @scala.inline
    def set___iblur(value: Boolean): Self = this.set("___iblur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete___iblur: Self = this.set("___iblur", js.undefined)
    
    @scala.inline
    def set___ifocus(value: Boolean): Self = this.set("___ifocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete___ifocus: Self = this.set("___ifocus", js.undefined)
    
    @scala.inline
    def set___ot(value: String): Self = this.set("___ot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete___ot: Self = this.set("___ot", js.undefined)
    
    @scala.inline
    def set___td(value: Boolean): Self = this.set("___td", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete___td: Self = this.set("___td", js.undefined)
    
    @scala.inline
    def setRelatedTarget(value: Node): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedTarget: Self = this.set("relatedTarget", js.undefined)
    
    @scala.inline
    def setRelatedTargetNull: Self = this.set("relatedTarget", null)
  }
}
