package typings.babylonjs.BABYLON

import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXREnterExitUIOptions")
@js.native
class WebXREnterExitUIOptions () extends js.Object {
  /**
    * User provided buttons to enable/disable WebXR. The system will provide default if not set
    */
  var customButtons: js.UndefOr[js.Array[WebXREnterExitUIButton]] = js.native
  /**
    * A reference space type to use when creating the default button.
    * Default is local-floor
    */
  var referenceSpaceType: js.UndefOr[XRReferenceSpaceType] = js.native
  /**
    * Context to enter xr with
    */
  var renderTarget: js.UndefOr[Nullable[WebXRRenderTarget]] = js.native
  /**
    * A session mode to use when creating the default button.
    * Default is immersive-vr
    */
  var sessionMode: js.UndefOr[XRSessionMode] = js.native
}

