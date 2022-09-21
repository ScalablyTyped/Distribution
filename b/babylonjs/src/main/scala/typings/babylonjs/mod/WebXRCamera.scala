package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRCamera")
@js.native
open class WebXRCamera protected ()
  extends typings.babylonjs.legacyMod.WebXRCamera {
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
  
  @JSImport("babylonjs", "WebXRCamera")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "WebXRCamera._ScaleReadOnly")
  @js.native
  def _ScaleReadOnly: Any = js.native
  inline def _ScaleReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ScaleReadOnly")(x.asInstanceOf[js.Any])
}
