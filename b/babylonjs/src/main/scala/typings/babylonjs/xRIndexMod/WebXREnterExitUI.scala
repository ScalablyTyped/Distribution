package typings.babylonjs.xRIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXREnterExitUI")
@js.native
/**
  *
  * @param scene babylon scene object to use
  * @param options (read-only) version of the options passed to this UI
  */
class WebXREnterExitUI protected ()
  extends typings.babylonjs.webXREnterExitUIMod.WebXREnterExitUI
/* static members */
@JSImport("babylonjs/XR/index", "WebXREnterExitUI")
@js.native
object WebXREnterExitUI extends js.Object {
  
  /**
    * Creates UI to allow the user to enter/exit XR mode
    * @param scene the scene to add the ui to
    * @param helper the xr experience helper to enter/exit xr with
    * @param options options to configure the UI
    * @returns the created ui
    */
  def CreateAsync(
    scene: Scene,
    helper: typings.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper,
    options: typings.babylonjs.webXREnterExitUIMod.WebXREnterExitUIOptions
  ): js.Promise[typings.babylonjs.webXREnterExitUIMod.WebXREnterExitUI] = js.native
}
