package typings.babylonjs.global.BABYLON

import typings.babylonjs.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String, _loadingDivBackgroundColor: String) = this()
  /**
    * Gets or sets the color to use for the background
    */
  /* CompleteClass */
  override var loadingUIBackgroundColor: String = js.native
  /**
    * Gets or sets the text to display while loading
    */
  /* CompleteClass */
  override var loadingUIText: String = js.native
  /**
    * Function called to display the loading screen
    */
  /* CompleteClass */
  override def displayLoadingUI(): Unit = js.native
  /**
    * Function called to hide the loading screen
    */
  /* CompleteClass */
  override def hideLoadingUI(): Unit = js.native
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

