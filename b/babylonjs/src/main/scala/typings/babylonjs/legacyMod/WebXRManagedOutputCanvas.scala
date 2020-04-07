package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "WebXRManagedOutputCanvas")
@js.native
class WebXRManagedOutputCanvas protected ()
  extends typings.babylonjs.indexMod.WebXRManagedOutputCanvas {
  /**
    * Initializes the canvas to be added/removed upon entering/exiting xr
    * @param _xrSessionManager The XR Session manager
    * @param _options optional configuration for this canvas output. defaults will be used if not provided
    */
  def this(_xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: typings.babylonjs.webXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions
  ) = this()
}

