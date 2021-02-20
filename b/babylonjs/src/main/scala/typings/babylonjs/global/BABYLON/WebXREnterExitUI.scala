package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXREnterExitUI")
@js.native
/**
  *
  * @param scene babylon scene object to use
  * @param options (read-only) version of the options passed to this UI
  */
class WebXREnterExitUI protected ()
  extends typings.babylonjs.BABYLON.WebXREnterExitUI
/* static members */
object WebXREnterExitUI {
  
  /**
    * Creates UI to allow the user to enter/exit XR mode
    * @param scene the scene to add the ui to
    * @param helper the xr experience helper to enter/exit xr with
    * @param options options to configure the UI
    * @returns the created ui
    */
  @JSGlobal("BABYLON.WebXREnterExitUI.CreateAsync")
  @js.native
  def CreateAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    helper: typings.babylonjs.BABYLON.WebXRExperienceHelper,
    options: typings.babylonjs.BABYLON.WebXREnterExitUIOptions
  ): js.Promise[typings.babylonjs.BABYLON.WebXREnterExitUI] = js.native
}
