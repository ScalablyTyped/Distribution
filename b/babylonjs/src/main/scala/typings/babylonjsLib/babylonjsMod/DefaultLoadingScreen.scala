package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used for the default loading screen
  * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
  */
@JSImport("babylonjs", "DefaultLoadingScreen")
@js.native
class DefaultLoadingScreen protected ()
  extends babylonjsLib.BABYLONNs.DefaultLoadingScreen {
  /**
    * Creates a new default loading screen
    * @param _renderingCanvas defines the canvas used to render the scene
    * @param _loadingText defines the default text to display
    * @param _loadingDivBackgroundColor defines the default background color
    */
  def this(_renderingCanvas: babylonjsLib.HTMLCanvasElement) = this()
  def this(_renderingCanvas: babylonjsLib.HTMLCanvasElement, _loadingText: java.lang.String) = this()
  def this(_renderingCanvas: babylonjsLib.HTMLCanvasElement, _loadingText: java.lang.String, _loadingDivBackgroundColor: java.lang.String) = this()
}

