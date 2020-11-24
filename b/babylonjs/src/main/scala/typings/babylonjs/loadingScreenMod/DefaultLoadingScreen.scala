package typings.babylonjs.loadingScreenMod

import typings.babylonjs.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Loading/loadingScreen", "DefaultLoadingScreen")
@js.native
class DefaultLoadingScreen protected () extends ILoadingScreen {
  /**
    * Creates a new default loading screen
    * @param _renderingCanvas defines the canvas used to render the scene
    * @param _loadingText defines the default text to display
    * @param _loadingDivBackgroundColor defines the default background color
    */
  def this(_renderingCanvas: HTMLCanvasElement) = this()
  def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String) = this()
  def this(
    _renderingCanvas: HTMLCanvasElement,
    _loadingText: js.UndefOr[scala.Nothing],
    _loadingDivBackgroundColor: String
  ) = this()
  def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String, _loadingDivBackgroundColor: String) = this()
  
  var _loadingDiv: js.Any = js.native
  
  var _loadingDivBackgroundColor: js.Any = js.native
  
  var _loadingText: js.Any = js.native
  
  var _loadingTextDiv: js.Any = js.native
  
  var _renderingCanvas: js.Any = js.native
  
  var _resizeLoadingUI: js.Any = js.native
  
  /**
    * Gets or sets the color to use for the background
    */
  @JSName("loadingUIBackgroundColor")
  def loadingUIBackgroundColor_MDefaultLoadingScreen: String = js.native
  
  @JSName("loadingUIText")
  def loadingUIText_MDefaultLoadingScreen: String = js.native
}
/* static members */
@JSImport("babylonjs/Loading/loadingScreen", "DefaultLoadingScreen")
@js.native
object DefaultLoadingScreen extends js.Object {
  
  /** Gets or sets the logo url to use for the default loading screen */
  var DefaultLogoUrl: String = js.native
  
  /** Gets or sets the spinner url to use for the default loading screen */
  var DefaultSpinnerUrl: String = js.native
}
