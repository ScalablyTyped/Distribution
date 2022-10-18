package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.round_
import typings.baseui.baseuiStrings.span
import typings.baseui.buttonButtonMod.ButtonComponentType
import typings.baseui.buttonTypesMod.CustomColors
import typings.baseui.buttonTypesMod.SharedStyleProps
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("baseui/button", "Button")
  @js.native
  val Button: ButtonComponentType = js.native
  
  object KIND {
    
    @JSImport("baseui/button", "KIND.primary")
    @js.native
    val primary: typings.baseui.baseuiStrings.primary = js.native
    
    @JSImport("baseui/button", "KIND.secondary")
    @js.native
    val secondary: typings.baseui.baseuiStrings.secondary = js.native
    
    @JSImport("baseui/button", "KIND.tertiary")
    @js.native
    val tertiary: typings.baseui.baseuiStrings.tertiary = js.native
  }
  
  object SHAPE extends Shortcut {
    
    @JSImport("baseui/button", "SHAPE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/button", "SHAPE.circle")
    @js.native
    val circle: typings.baseui.baseuiStrings.circle = js.native
    
    @JSImport("baseui/button", "SHAPE.pill")
    @js.native
    val pill: typings.baseui.baseuiStrings.pill = js.native
    
    @JSImport("baseui/button", "SHAPE.round")
    @js.native
    val round: round_ = js.native
    
    @JSImport("baseui/button", "SHAPE.square")
    @js.native
    val square: typings.baseui.baseuiStrings.square = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SHAPE.foo` */
    override def _to: default_ = default
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/button", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/button", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/button", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/button", "SIZE.mini")
    @js.native
    val mini: typings.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  @JSImport("baseui/button", "StyledBaseButton")
  @js.native
  val StyledBaseButton: StyletronComponent[button, SharedStyleProps] = js.native
  
  @JSImport("baseui/button", "StyledEndEnhancer")
  @js.native
  val StyledEndEnhancer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/button", "StyledLoadingSpinner")
  @js.native
  val StyledLoadingSpinner: StyletronComponent[span, SharedStyleProps] = js.native
  
  @JSImport("baseui/button", "StyledLoadingSpinnerContainer")
  @js.native
  val StyledLoadingSpinnerContainer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/button", "StyledStartEnhancer")
  @js.native
  val StyledStartEnhancer: StyletronComponent[div, SharedStyleProps] = js.native
  
  type CustomColorsT = CustomColors
}
