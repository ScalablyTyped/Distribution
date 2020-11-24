package typings.baseui.anon

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/tabs.SharedProps & {  $active :boolean | undefined} */
@js.native
trait SharedPropsactivebooleanu extends js.Object {
  
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.native
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  
  @JSName("$orientation")
  var $orientation: js.UndefOr[horizontal | vertical] = js.native
}
object SharedPropsactivebooleanu {
  
  @scala.inline
  def apply(): SharedPropsactivebooleanu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPropsactivebooleanu]
  }
  
  @scala.inline
  implicit class SharedPropsactivebooleanuOps[Self <: SharedPropsactivebooleanu] (val x: Self) extends AnyVal {
    
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
    def set$active(value: Boolean): Self = this.set("$active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$active: Self = this.set("$active", js.undefined)
    
    @scala.inline
    def set$disabled(value: Boolean): Self = this.set("$disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$disabled: Self = this.set("$disabled", js.undefined)
    
    @scala.inline
    def set$orientation(value: horizontal | vertical): Self = this.set("$orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$orientation: Self = this.set("$orientation", js.undefined)
  }
}
