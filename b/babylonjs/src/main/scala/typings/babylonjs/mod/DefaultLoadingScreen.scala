package typings.babylonjs.mod

import typings.babylonjs.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DefaultLoadingScreen")
@js.native
class DefaultLoadingScreen protected ()
  extends typings.babylonjs.legacyMod.DefaultLoadingScreen {
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
object DefaultLoadingScreen {
  
  @JSImport("babylonjs", "DefaultLoadingScreen")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets or sets the logo url to use for the default loading screen */
  @JSImport("babylonjs", "DefaultLoadingScreen.DefaultLogoUrl")
  @js.native
  def DefaultLogoUrl: String = js.native
  @scala.inline
  def DefaultLogoUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultLogoUrl")(x.asInstanceOf[js.Any])
  
  /** Gets or sets the spinner url to use for the default loading screen */
  @JSImport("babylonjs", "DefaultLoadingScreen.DefaultSpinnerUrl")
  @js.native
  def DefaultSpinnerUrl: String = js.native
  @scala.inline
  def DefaultSpinnerUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultSpinnerUrl")(x.asInstanceOf[js.Any])
}
