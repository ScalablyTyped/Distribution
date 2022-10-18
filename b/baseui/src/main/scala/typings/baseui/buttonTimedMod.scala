package typings.baseui

import typings.baseui.anon.initialTimenumbertimeElap
import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.span
import typings.baseui.buttonTimedTypesMod.ButtonTimedProps
import typings.baseui.buttonTypesMod.SharedStyleProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonTimedMod {
  
  @JSImport("baseui/button-timed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ButtonTimed(props: ButtonTimedProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ButtonTimed")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/button-timed", "StyledBaseButtonTimed")
  @js.native
  val StyledBaseButtonTimed: StyletronComponent[button, initialTimenumbertimeElap] = js.native
  
  @JSImport("baseui/button-timed", "StyledEndEnhancer")
  @js.native
  val StyledEndEnhancer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/button-timed", "StyledLoadingSpinner")
  @js.native
  val StyledLoadingSpinner: StyletronComponent[span, SharedStyleProps] = js.native
  
  @JSImport("baseui/button-timed", "StyledLoadingSpinnerContainer")
  @js.native
  val StyledLoadingSpinnerContainer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/button-timed", "StyledStartEnhancer")
  @js.native
  val StyledStartEnhancer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/button-timed", "StyledTimercontainer")
  @js.native
  val StyledTimercontainer: StyletronComponent[span, js.Object] = js.native
}
