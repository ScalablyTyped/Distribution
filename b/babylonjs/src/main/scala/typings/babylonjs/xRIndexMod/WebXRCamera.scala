package typings.babylonjs.xRIndexMod

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRCamera")
@js.native
class WebXRCamera protected ()
  extends typings.babylonjs.webXRCameraMod.WebXRCamera {
  /**
    * Creates a new webXRCamera, this should only be set at the camera after it has been updated by the xrSessionManager
    * @param name the name of the camera
    * @param scene the scene to add the camera to
    * @param _xrSessionManager a constructed xr session manager
    */
  def this(
    name: String,
    scene: Scene,
    _xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
  ) = this()
}
