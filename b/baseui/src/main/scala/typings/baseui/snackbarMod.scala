package typings.baseui

import typings.baseui.anon.Animating
import typings.baseui.anon.Dequeue
import typings.baseui.anon.HasSuffix
import typings.baseui.anon.heightnumberwidthnumberSp
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.i
import typings.baseui.baseuiStrings.p
import typings.baseui.baseuiStrings.span
import typings.baseui.snackbarTypesMod.Duration
import typings.baseui.snackbarTypesMod.Placement
import typings.baseui.snackbarTypesMod.SnackbarElementOverrides
import typings.baseui.snackbarTypesMod.SnackbarElementProps
import typings.baseui.snackbarTypesMod.SnackbarProviderProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarMod {
  
  @JSImport("baseui/snackbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DURATION {
    
    @JSImport("baseui/snackbar", "DURATION")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/snackbar", "DURATION.infinite")
    @js.native
    def infinite: Double = js.native
    inline def infinite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infinite")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/snackbar", "DURATION.long")
    @js.native
    def long: Double = js.native
    inline def long_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("long")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/snackbar", "DURATION.medium")
    @js.native
    def medium: Double = js.native
    inline def medium_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/snackbar", "DURATION.short")
    @js.native
    def short: Double = js.native
    inline def short_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("short")(x.asInstanceOf[js.Any])
  }
  
  object PLACEMENT {
    
    @JSImport("baseui/snackbar", "PLACEMENT.bottom")
    @js.native
    val bottom: typings.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/snackbar", "PLACEMENT.bottomLeft")
    @js.native
    val bottomLeft: typings.baseui.baseuiStrings.bottomLeft = js.native
    
    @JSImport("baseui/snackbar", "PLACEMENT.bottomRight")
    @js.native
    val bottomRight: typings.baseui.baseuiStrings.bottomRight = js.native
    
    @JSImport("baseui/snackbar", "PLACEMENT.top")
    @js.native
    val top: typings.baseui.baseuiStrings.top = js.native
    
    @JSImport("baseui/snackbar", "PLACEMENT.topLeft")
    @js.native
    val topLeft: typings.baseui.baseuiStrings.topLeft = js.native
    
    @JSImport("baseui/snackbar", "PLACEMENT.topRight")
    @js.native
    val topRight: typings.baseui.baseuiStrings.topRight = js.native
  }
  
  inline def SnackbarElement(param0: SnackbarElementProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SnackbarElement")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SnackbarProvider(param0: SnackbarProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SnackbarProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/snackbar", "StyledActionButtonContainer")
  @js.native
  val StyledActionButtonContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/snackbar", "StyledContent")
  @js.native
  val StyledContent: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/snackbar", "StyledMessage")
  @js.native
  val StyledMessage: StyletronComponent[p, HasSuffix] = js.native
  
  @JSImport("baseui/snackbar", "StyledPlacementContainer")
  @js.native
  val StyledPlacementContainer: StyletronComponent[div, Animating] = js.native
  
  @JSImport("baseui/snackbar", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/snackbar", "StyledSpinner")
  @js.native
  val StyledSpinner: StyletronComponent[i, heightnumberwidthnumberSp] = js.native
  
  @JSImport("baseui/snackbar", "StyledStartEnhancerContainer")
  @js.native
  val StyledStartEnhancerContainer: StyletronComponent[span, js.Object] = js.native
  
  @JSImport("baseui/snackbar", "StyledWrapActionButtonContainer")
  @js.native
  val StyledWrapActionButtonContainer: StyletronComponent[div, js.Object] = js.native
  
  inline def useSnackbar(): Dequeue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSnackbar")().asInstanceOf[Dequeue]
  
  type DurationT = Duration
  
  type PlacementT = Placement
  
  type SnackbarElementOverridesT = SnackbarElementOverrides
  
  type SnackbarElementPropsT = SnackbarElementProps
  
  type SnackbarProviderPropsT = SnackbarProviderProps
}
