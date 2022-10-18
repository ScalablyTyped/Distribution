package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRManagedOutputCanvas")
@js.native
open class WebXRManagedOutputCanvas protected ()
  extends typings.babylonjs.xRIndexMod.WebXRManagedOutputCanvas {
  /**
    * Initializes the canvas to be added/removed upon entering/exiting xr
    * @param _xrSessionManager The XR Session manager
    * @param _options optional configuration for this canvas output. defaults will be used if not provided
    */
  def this(_xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    _options: typings.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions
  ) = this()
}
