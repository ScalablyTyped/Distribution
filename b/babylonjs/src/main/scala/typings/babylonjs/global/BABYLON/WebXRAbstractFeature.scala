package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRAbstractFeature")
@js.native
abstract class WebXRAbstractFeature protected ()
  extends typings.babylonjs.BABYLON.WebXRAbstractFeature {
  /**
    * Construct a new (abstract) WebXR feature
    * @param _xrSessionManager the xr session manager for this feature
    */
  def this(_xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

