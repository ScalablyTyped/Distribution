package typings.baseui.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleProps extends js.Object {
  
  @JSName("$didImageFailToLoad")
  var $didImageFailToLoad: Boolean = js.native
  
  @JSName("$size")
  var $size: js.UndefOr[String] = js.native
}
object StyleProps {
  
  @scala.inline
  def apply($didImageFailToLoad: Boolean): StyleProps = {
    val __obj = js.Dynamic.literal($didImageFailToLoad = $didImageFailToLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleProps]
  }
  
  @scala.inline
  implicit class StylePropsOps[Self <: StyleProps] (val x: Self) extends AnyVal {
    
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
    def set$didImageFailToLoad(value: Boolean): Self = this.set("$didImageFailToLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$size(value: String): Self = this.set("$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$size: Self = this.set("$size", js.undefined)
  }
}
