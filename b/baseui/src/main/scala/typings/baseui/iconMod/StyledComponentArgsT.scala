package typings.baseui.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyledComponentArgsT extends js.Object {
  
  @JSName("$color")
  var $color: js.UndefOr[String] = js.native
  
  @JSName("$size")
  var $size: js.UndefOr[Double | String] = js.native
}
object StyledComponentArgsT {
  
  @scala.inline
  def apply(): StyledComponentArgsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledComponentArgsT]
  }
  
  @scala.inline
  implicit class StyledComponentArgsTOps[Self <: StyledComponentArgsT] (val x: Self) extends AnyVal {
    
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
    def set$color(value: String): Self = this.set("$color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$color: Self = this.set("$color", js.undefined)
    
    @scala.inline
    def set$size(value: Double | String): Self = this.set("$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$size: Self = this.set("$size", js.undefined)
  }
}
