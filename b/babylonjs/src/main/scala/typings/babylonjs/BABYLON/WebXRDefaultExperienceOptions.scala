package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRDefaultExperienceOptions")
@js.native
class WebXRDefaultExperienceOptions () extends js.Object {
  /**
    * Enable or disable default UI to enter XR
    */
  var disableDefaultUI: js.UndefOr[Boolean] = js.native
  /**
    * Should teleportation not initialize. defaults to false.
    */
  var disableTeleportation: js.UndefOr[Boolean] = js.native
  /**
    * Floor meshes that will be used for teleport
    */
  var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
  /**
    * If set to true, the first frame will not be used to reset position
    * The first frame is mainly used when copying transformation from the old camera
    * Mainly used in AR
    */
  var ignoreNativeCameraTransformation: js.UndefOr[Boolean] = js.native
  /**
    * Disable the controller mesh-loading. Can be used if you want to load your own meshes
    */
  var inputOptions: js.UndefOr[IWebXRInputOptions] = js.native
  /**
    * optional configuration for the output canvas
    */
  var outputCanvasOptions: js.UndefOr[WebXRManagedOutputCanvasOptions] = js.native
  /**
    * optional UI options. This can be used among other to change session mode and reference space type
    */
  var uiOptions: js.UndefOr[WebXREnterExitUIOptions] = js.native
  /**
    * When loading teleportation and pointer select, use stable versions instead of latest.
    */
  var useStablePlugins: js.UndefOr[Boolean] = js.native
}

