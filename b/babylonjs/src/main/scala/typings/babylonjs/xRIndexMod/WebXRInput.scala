package typings.babylonjs.xRIndexMod

import typings.babylonjs.webXRInputMod.IWebXRInputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRInput")
@js.native
class WebXRInput protected ()
  extends typings.babylonjs.webXRInputMod.WebXRInput {
  /**
    * Initializes the WebXRInput
    * @param xrSessionManager the xr session manager for this session
    * @param xrCamera the WebXR camera for this session. Mainly used for teleportation
    * @param options = initialization options for this xr input
    */
  def this(
    /**
    * the xr session manager for this session
    */
  xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: typings.babylonjs.webXRCameraMod.WebXRCamera
  ) = this()
  def this(
    /**
    * the xr session manager for this session
    */
  xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: typings.babylonjs.webXRCameraMod.WebXRCamera,
    options: IWebXRInputOptions
  ) = this()
}
