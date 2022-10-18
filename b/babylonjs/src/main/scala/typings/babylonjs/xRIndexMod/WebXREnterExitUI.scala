package typings.babylonjs.xRIndexMod

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXREnterExitUI")
@js.native
open class WebXREnterExitUI protected ()
  extends typings.babylonjs.xRWebXREnterExitUIMod.WebXREnterExitUI {
  /**
    * Construct a new EnterExit UI class
    *
    * @param _scene babylon scene object to use
    * @param options (read-only) version of the options passed to this UI
    */
  def this(
    _scene: Scene,
    /** version of the options passed to this UI */
  options: typings.babylonjs.xRWebXREnterExitUIMod.WebXREnterExitUIOptions
  ) = this()
}
/* static members */
object WebXREnterExitUI {
  
  @JSImport("babylonjs/XR/index", "WebXREnterExitUI")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates UI to allow the user to enter/exit XR mode
    * @param scene the scene to add the ui to
    * @param helper the xr experience helper to enter/exit xr with
    * @param options options to configure the UI
    * @returns the created ui
    */
  inline def CreateAsync(
    scene: Scene,
    helper: typings.babylonjs.xRWebXRExperienceHelperMod.WebXRExperienceHelper,
    options: typings.babylonjs.xRWebXREnterExitUIMod.WebXREnterExitUIOptions
  ): js.Promise[typings.babylonjs.xRWebXREnterExitUIMod.WebXREnterExitUI] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], helper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.xRWebXREnterExitUIMod.WebXREnterExitUI]]
}
