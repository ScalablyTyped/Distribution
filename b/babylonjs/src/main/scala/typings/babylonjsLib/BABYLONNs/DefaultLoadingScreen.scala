package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used for the default loading screen
     * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
     */
@JSGlobal("BABYLON.DefaultLoadingScreen")
@js.native
class DefaultLoadingScreen protected () extends ILoadingScreen {
  /**
           * Creates a new default loading screen
           * @param _renderingCanvas defines the canvas used to render the scene
           * @param _loadingText defines the default text to display
           * @param _loadingDivBackgroundColor defines the default background color
           */
  def this(_renderingCanvas: babylonjsLib.HTMLCanvasElement) = this()
  /**
           * Creates a new default loading screen
           * @param _renderingCanvas defines the canvas used to render the scene
           * @param _loadingText defines the default text to display
           * @param _loadingDivBackgroundColor defines the default background color
           */
  def this(_renderingCanvas: babylonjsLib.HTMLCanvasElement, _loadingText: java.lang.String) = this()
  /**
           * Creates a new default loading screen
           * @param _renderingCanvas defines the canvas used to render the scene
           * @param _loadingText defines the default text to display
           * @param _loadingDivBackgroundColor defines the default background color
           */
  def this(_renderingCanvas: babylonjsLib.HTMLCanvasElement, _loadingText: java.lang.String, _loadingDivBackgroundColor: java.lang.String) = this()
  var _loadingDiv: js.Any = js.native
  var _loadingDivBackgroundColor: js.Any = js.native
  var _loadingText: js.Any = js.native
  var _loadingTextDiv: js.Any = js.native
  var _renderingCanvas: js.Any = js.native
  var _resizeLoadingUI: js.Any = js.native
  /**
           * Gets or sets the color to use for the background
           */
  /* CompleteClass */
  override var loadingUIBackgroundColor: java.lang.String = js.native
  /**
           * Gets or sets the text to display while loading
           */
  /* CompleteClass */
  override var loadingUIText: java.lang.String = js.native
  /**
           * Function called to display the loading screen
           */
  /* CompleteClass */
  override def displayLoadingUI(): scala.Unit = js.native
  /**
           * Function called to hide the loading screen
           */
  /* CompleteClass */
  override def hideLoadingUI(): scala.Unit = js.native
}

