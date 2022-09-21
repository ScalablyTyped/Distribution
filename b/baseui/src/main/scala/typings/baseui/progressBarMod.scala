package typings.baseui

import typings.baseui.anon.Inline
import typings.baseui.anon.IsLeft
import typings.baseui.anon.PartialProgressBarPropsRe
import typings.baseui.anon.PathLength
import typings.baseui.anon.Steps
import typings.baseui.anon.`257`
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.medium_
import typings.baseui.baseuiStrings.path
import typings.baseui.baseuiStrings.small_
import typings.baseui.baseuiStrings.svg
import typings.baseui.progressBarTypesMod.ProgressBarRoundedProps
import typings.baseui.progressBarTypesMod.StyleProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.global.JSX.Element
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod {
  
  @JSImport("baseui/progress-bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/progress-bar", "ProgressBar")
  @js.native
  val ProgressBar: ForwardRefExoticComponent[PartialProgressBarPropsRe] = js.native
  
  inline def ProgressBarRounded(hasProgressSizeAnimateInlineOverridesRestProps: ProgressBarRoundedProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ProgressBarRounded")(hasProgressSizeAnimateInlineOverridesRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object SIZE {
    
    @JSImport("baseui/progress-bar", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/progress-bar", "SIZE.medium")
    @js.native
    val medium: medium_ = js.native
    
    @JSImport("baseui/progress-bar", "SIZE.small")
    @js.native
    val small: small_ = js.native
  }
  
  @JSImport("baseui/progress-bar", "StyledBar")
  @js.native
  val StyledBar: StyletronComponent[div, Steps] = js.native
  
  @JSImport("baseui/progress-bar", "StyledBarContainer")
  @js.native
  val StyledBarContainer: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-bar", "StyledBarProgress")
  @js.native
  val StyledBarProgress: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-bar", "StyledInfiniteBar")
  @js.native
  val StyledInfiniteBar: StyletronComponent[div, IsLeft] = js.native
  
  @JSImport("baseui/progress-bar", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedRoot")
  @js.native
  val StyledProgressBarRoundedRoot: StyletronComponent[div, Inline] = js.native
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedSvg")
  @js.native
  val StyledProgressBarRoundedSvg: StyletronComponent[svg, `257`] = js.native
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedText")
  @js.native
  val StyledProgressBarRoundedText: StyletronComponent[div, `257`] = js.native
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedTrackBackground")
  @js.native
  val StyledProgressBarRoundedTrackBackground: StyletronComponent[path, `257`] = js.native
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedTrackForeground")
  @js.native
  val StyledProgressBarRoundedTrackForeground: StyletronComponent[path, PathLength] = js.native
  
  @JSImport("baseui/progress-bar", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, StyleProps] = js.native
}
