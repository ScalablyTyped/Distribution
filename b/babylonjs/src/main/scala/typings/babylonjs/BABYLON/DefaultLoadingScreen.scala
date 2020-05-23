package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultLoadingScreen extends ILoadingScreen {
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
  @JSName("loadingUIBackgroundColor")
  def loadingUIBackgroundColor_MDefaultLoadingScreen(color: String): js.Any = js.native
  @JSName("loadingUIText")
  def loadingUIText_MDefaultLoadingScreen: String = js.native
  /**
    * Gets or sets the text to display while loading
    */
  @JSName("loadingUIText")
  def loadingUIText_MDefaultLoadingScreen(text: String): js.Any = js.native
}

