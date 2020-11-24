package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRManagedOutputCanvasOptions")
@js.native
class WebXRManagedOutputCanvasOptions ()
  extends typings.babylonjs.legacyMod.WebXRManagedOutputCanvasOptions
/* static members */
@JSImport("babylonjs", "WebXRManagedOutputCanvasOptions")
@js.native
object WebXRManagedOutputCanvasOptions extends js.Object {
  
  /**
    * Get the default values of the configuration object
    * @param engine defines the engine to use (can be null)
    * @returns default values of this configuration object
    */
  def GetDefaults(): typings.babylonjs.webXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions = js.native
  def GetDefaults(engine: typings.babylonjs.thinEngineMod.ThinEngine): typings.babylonjs.webXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions = js.native
}
