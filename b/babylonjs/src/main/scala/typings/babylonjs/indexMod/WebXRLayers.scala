package typings.babylonjs.indexMod

import typings.babylonjs.webXRLayersMod.IWebXRLayersOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRLayers")
@js.native
open class WebXRLayers protected ()
  extends typings.babylonjs.xRIndexMod.WebXRLayers {
  def this(_xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRLayersOptions
  ) = this()
}
/* static members */
object WebXRLayers {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/index", "WebXRLayers.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/index", "WebXRLayers.Version")
  @js.native
  val Version: Double = js.native
}
