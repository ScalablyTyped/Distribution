package typings.babylonjs.global.BABYLON

import typings.babylonjs.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DefaultLoadingScreen")
@js.native
class DefaultLoadingScreen protected ()
  extends typings.babylonjs.BABYLON.DefaultLoadingScreen {
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
}
/* static members */
@JSGlobal("BABYLON.DefaultLoadingScreen")
@js.native
object DefaultLoadingScreen extends js.Object {
  
  /** Gets or sets the logo url to use for the default loading screen */
  var DefaultLogoUrl: String = js.native
  
  /** Gets or sets the spinner url to use for the default loading screen */
  var DefaultSpinnerUrl: String = js.native
}
