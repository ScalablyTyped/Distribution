package typings.baseui.linkMod

import typings.baseui.baseuiStrings._blank
import typings.baseui.baseuiStrings._parent
import typings.baseui.baseuiStrings._self
import typings.baseui.baseuiStrings._top
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProps
  extends AnchorHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement] {
  
  @JSName("target")
  var target_LinkProps: js.UndefOr[_self | _blank | _parent | _top] = js.native
}
object LinkProps {
  
  @scala.inline
  def apply(): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkProps]
  }
  
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: _self | _blank | _parent | _top): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
