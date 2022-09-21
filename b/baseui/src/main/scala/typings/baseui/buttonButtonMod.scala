package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.As
import typings.baseui.baseuiStrings.$colors
import typings.baseui.baseuiStrings.$disabled
import typings.baseui.baseuiStrings.$isFocusVisible
import typings.baseui.baseuiStrings.$isLoading
import typings.baseui.baseuiStrings.$isSelected
import typings.baseui.baseuiStrings.$kind
import typings.baseui.baseuiStrings.$shape
import typings.baseui.baseuiStrings.$size
import typings.baseui.baseuiStrings.`type`
import typings.baseui.baseuiStrings.children
import typings.baseui.baseuiStrings.colors
import typings.baseui.baseuiStrings.disabled
import typings.baseui.baseuiStrings.endEnhancer
import typings.baseui.baseuiStrings.isLoading
import typings.baseui.baseuiStrings.isSelected
import typings.baseui.baseuiStrings.kind
import typings.baseui.baseuiStrings.onClick
import typings.baseui.baseuiStrings.overrides
import typings.baseui.baseuiStrings.shape
import typings.baseui.baseuiStrings.size
import typings.baseui.baseuiStrings.startEnhancer
import typings.baseui.buttonTypesMod.ButtonProps
import typings.baseui.buttonTypesMod.SharedStyleProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonButtonMod extends Shortcut {
  
  @JSImport("baseui/button/button", JSImport.Default)
  @js.native
  val default: ButtonComponentType = js.native
  
  @js.native
  trait ButtonComponentType extends StObject {
    
    def apply[C /* <: ElementType[Any] */](
      props: ButtonProps & SharedStyleProps & (Omit[
          ComponentProps[C], 
          children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type` | $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible
        ]) & As[C]
    ): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type _To = ButtonComponentType
  
  /* This means you don't have to write `default`, but can instead just say `buttonButtonMod.foo` */
  override def _to: ButtonComponentType = default
}
