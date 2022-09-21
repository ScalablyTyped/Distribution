package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.`19`
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
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import typings.std.Omit
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalButtonMod extends Shortcut {
  
  @JSImport("baseui/modal/modal-button", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[
    (Pick[
      ButtonProps & SharedStyleProps & (Omit[
        Any, 
        $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible | children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type`
      ]) & `19`, 
      String | Double | js.Symbol
    ]) & RefAttributes[HTMLButtonElement]
  ] = js.native
  
  type _To = ForwardRefExoticComponent[
    (Pick[
      ButtonProps & SharedStyleProps & (Omit[
        Any, 
        $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible | children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type`
      ]) & `19`, 
      String | Double | js.Symbol
    ]) & RefAttributes[HTMLButtonElement]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `modalButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[
    (Pick[
      ButtonProps & SharedStyleProps & (Omit[
        Any, 
        $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible | children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type`
      ]) & `19`, 
      String | Double | js.Symbol
    ]) & RefAttributes[HTMLButtonElement]
  ] = default
}
