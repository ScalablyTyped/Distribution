package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandEnabled extends js.Object {
  
  var expand: Enabled = js.native
}
object ExpandEnabled {
  
  @scala.inline
  def apply(expand: Enabled): ExpandEnabled = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandEnabled]
  }
  
  @scala.inline
  implicit class ExpandEnabledOps[Self <: ExpandEnabled] (val x: Self) extends AnyVal {
    
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
    def setExpand(value: Enabled): Self = this.set("expand", value.asInstanceOf[js.Any])
  }
}
