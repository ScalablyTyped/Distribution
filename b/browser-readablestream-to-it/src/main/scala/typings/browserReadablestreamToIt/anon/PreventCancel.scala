package typings.browserReadablestreamToIt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreventCancel extends js.Object {
  
  var preventCancel: js.UndefOr[Boolean] = js.native
}
object PreventCancel {
  
  @scala.inline
  def apply(): PreventCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreventCancel]
  }
  
  @scala.inline
  implicit class PreventCancelOps[Self <: PreventCancel] (val x: Self) extends AnyVal {
    
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
    def setPreventCancel(value: Boolean): Self = this.set("preventCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventCancel: Self = this.set("preventCancel", js.undefined)
  }
}
