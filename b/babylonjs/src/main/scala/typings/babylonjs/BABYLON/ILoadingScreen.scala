package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoadingScreen extends js.Object {
  /**
    * Gets or sets the color to use for the background
    */
  var loadingUIBackgroundColor: String
  /**
    * Gets or sets the text to display while loading
    */
  var loadingUIText: String
  /**
    * Function called to display the loading screen
    */
  def displayLoadingUI(): Unit
  /**
    * Function called to hide the loading screen
    */
  def hideLoadingUI(): Unit
}

object ILoadingScreen {
  @scala.inline
  def apply(
    displayLoadingUI: () => Unit,
    hideLoadingUI: () => Unit,
    loadingUIBackgroundColor: String,
    loadingUIText: String
  ): ILoadingScreen = {
    val __obj = js.Dynamic.literal(displayLoadingUI = js.Any.fromFunction0(displayLoadingUI), hideLoadingUI = js.Any.fromFunction0(hideLoadingUI), loadingUIBackgroundColor = loadingUIBackgroundColor.asInstanceOf[js.Any], loadingUIText = loadingUIText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadingScreen]
  }
}

