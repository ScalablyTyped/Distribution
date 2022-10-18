package typings.baseui

import typings.baseui.anon.Adjoined
import typings.baseui.anon.AlignTop
import typings.baseui.anon.IsFocusVisible
import typings.baseui.anon.IsFocusVisibleSize
import typings.baseui.anon.Positive
import typings.baseui.anon.SVGAttributesSVGElementch
import typings.baseui.anon.SharedPropsthemeTheme
import typings.baseui.anon.SharedStylePropsthemeThem
import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.input
import typings.baseui.inputTypesMod.SharedProps
import typings.react.mod.ForwardRefExoticComponent
import typings.styletronReact.libTypesMod.StyletronComponent
import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputStyledComponentsMod {
  
  @JSImport("baseui/input/styled-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/input/styled-components", "Input")
  @js.native
  val Input: StyletronComponent[input, SharedProps] = js.native
  
  @JSImport("baseui/input/styled-components", "InputContainer")
  @js.native
  val InputContainer: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/input/styled-components", "InputEnhancer")
  @js.native
  val InputEnhancer: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/input/styled-components", "Root")
  @js.native
  val Root: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/input/styled-components", "StyledClearIcon")
  @js.native
  val StyledClearIcon: StyletronComponent[ForwardRefExoticComponent[SVGAttributesSVGElementch], IsFocusVisible] = js.native
  
  @JSImport("baseui/input/styled-components", "StyledClearIconContainer")
  @js.native
  val StyledClearIconContainer: StyletronComponent[div, AlignTop] = js.native
  
  @JSImport("baseui/input/styled-components", "StyledMaskToggleButton")
  @js.native
  val StyledMaskToggleButton: StyletronComponent[button, IsFocusVisibleSize] = js.native
  
  inline def getInputContainerStyles(props: Positive): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputContainerStyles")(props.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  
  inline def getInputStyles(props: SharedPropsthemeTheme): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputStyles")(props.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  inline def getInputStyles(props: SharedStylePropsthemeThem): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputStyles")(props.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  
  inline def getRootStyles(props: Adjoined): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootStyles")(props.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
}
