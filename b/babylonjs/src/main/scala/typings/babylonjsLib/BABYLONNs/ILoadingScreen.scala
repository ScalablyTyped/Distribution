package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface used to present a loading screen while loading a scene
  * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
  */
trait ILoadingScreen extends js.Object {
  /**
    * Gets or sets the color to use for the background
    */
  var loadingUIBackgroundColor: java.lang.String
  /**
    * Gets or sets the text to display while loading
    */
  var loadingUIText: java.lang.String
  /**
    * Function called to display the loading screen
    */
  def displayLoadingUI(): scala.Unit
  /**
    * Function called to hide the loading screen
    */
  def hideLoadingUI(): scala.Unit
}

object ILoadingScreen {
  @scala.inline
  def apply(
    displayLoadingUI: js.Function0[scala.Unit],
    hideLoadingUI: js.Function0[scala.Unit],
    loadingUIBackgroundColor: java.lang.String,
    loadingUIText: java.lang.String
  ): ILoadingScreen = {
    val __obj = js.Dynamic.literal(displayLoadingUI = displayLoadingUI, hideLoadingUI = hideLoadingUI, loadingUIBackgroundColor = loadingUIBackgroundColor, loadingUIText = loadingUIText)
  
    __obj.asInstanceOf[ILoadingScreen]
  }
}

