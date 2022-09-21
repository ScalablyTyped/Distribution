package typings.babylonjs.global.BABYLON

import typings.babylonjs.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DefaultLoadingScreen")
@js.native
open class DefaultLoadingScreen protected ()
  extends StObject
     with typings.babylonjs.BABYLON.DefaultLoadingScreen {
  /**
    * Creates a new default loading screen
    * @param _renderingCanvas defines the canvas used to render the scene
    * @param _loadingText defines the default text to display
    * @param _loadingDivBackgroundColor defines the default background color
    */
  def this(_renderingCanvas: HTMLCanvasElement) = this()
  def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String) = this()
  def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String, _loadingDivBackgroundColor: String) = this()
  def this(_renderingCanvas: HTMLCanvasElement, _loadingText: Unit, _loadingDivBackgroundColor: String) = this()
  
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
  
  /**
    * Gets or sets the color to use for the background
    */
  /* CompleteClass */
  var loadingUIBackgroundColor: String = js.native
  
  /**
    * Gets or sets the text to display while loading
    */
  /* CompleteClass */
  var loadingUIText: String = js.native
}
/* static members */
object DefaultLoadingScreen {
  
  @JSGlobal("BABYLON.DefaultLoadingScreen")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets or sets the logo url to use for the default loading screen */
  @JSGlobal("BABYLON.DefaultLoadingScreen.DefaultLogoUrl")
  @js.native
  def DefaultLogoUrl: String = js.native
  inline def DefaultLogoUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultLogoUrl")(x.asInstanceOf[js.Any])
  
  /** Gets or sets the spinner url to use for the default loading screen */
  @JSGlobal("BABYLON.DefaultLoadingScreen.DefaultSpinnerUrl")
  @js.native
  def DefaultSpinnerUrl: String = js.native
  inline def DefaultSpinnerUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultSpinnerUrl")(x.asInstanceOf[js.Any])
}
