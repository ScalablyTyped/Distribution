package typings.baseui

import typings.baseui.baseuiStrings._blank
import typings.baseui.baseuiStrings._parent
import typings.baseui.baseuiStrings._self
import typings.baseui.baseuiStrings._top
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLAnchorElement
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("baseui/link", "StyledLink")
  @js.native
  val StyledLink: StyletronComponent[LinkProps] = js.native
  
  trait LinkProps
    extends StObject
       with ClassAttributes[HTMLAnchorElement]
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    @JSName("target")
    var target_LinkProps: js.UndefOr[_self | _blank | _parent | _top] = js.undefined
  }
  object LinkProps {
    
    inline def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setTarget(value: _self | _blank | _parent | _top): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
