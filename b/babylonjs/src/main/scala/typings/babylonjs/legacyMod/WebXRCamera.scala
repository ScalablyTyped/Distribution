package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRCamera")
@js.native
open class WebXRCamera protected ()
  extends typings.babylonjs.indexMod.WebXRCamera {
  /**
    * Creates a new webXRCamera, this should only be set at the camera after it has been updated by the xrSessionManager
    * @param name the name of the camera
    * @param scene the scene to add the camera to
    * @param _xrSessionManager a constructed xr session manager
    */
  def this(
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    _xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
  ) = this()
}
/* static members */
object WebXRCamera {
  
  @JSImport("babylonjs/Legacy/legacy", "WebXRCamera")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "WebXRCamera._ScaleReadOnly")
  @js.native
  def _ScaleReadOnly: Any = js.native
  inline def _ScaleReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ScaleReadOnly")(x.asInstanceOf[js.Any])
}
