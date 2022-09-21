package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXREnterExitUI")
@js.native
open class WebXREnterExitUI protected ()
  extends typings.babylonjs.xRIndexMod.WebXREnterExitUI {
  /**
    * Construct a new EnterExit UI class
    *
    * @param _scene babylon scene object to use
    * @param options (read-only) version of the options passed to this UI
    */
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    /** version of the options passed to this UI */
  options: typings.babylonjs.webXREnterExitUIMod.WebXREnterExitUIOptions
  ) = this()
}
/* static members */
object WebXREnterExitUI {
  
  @JSImport("babylonjs/index", "WebXREnterExitUI")
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
    scene: typings.babylonjs.sceneMod.Scene,
    helper: typings.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper,
    options: typings.babylonjs.webXREnterExitUIMod.WebXREnterExitUIOptions
  ): js.Promise[typings.babylonjs.webXREnterExitUIMod.WebXREnterExitUI] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], helper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.webXREnterExitUIMod.WebXREnterExitUI]]
}
