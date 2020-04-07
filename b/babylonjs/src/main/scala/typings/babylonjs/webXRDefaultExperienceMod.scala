package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRControllerPointerSelectionMod.WebXRControllerPointerSelection
import typings.babylonjs.webXRControllerTeleportationMod.WebXRMotionControllerTeleportation
import typings.babylonjs.webXREnterExitUIMod.WebXREnterExitUI
import typings.babylonjs.webXREnterExitUIMod.WebXREnterExitUIOptions
import typings.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper
import typings.babylonjs.webXRInputMod.IWebXRInputOptions
import typings.babylonjs.webXRInputMod.WebXRInput
import typings.babylonjs.webXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions
import typings.babylonjs.webXRTypesMod.WebXRRenderTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/webXRDefaultExperience", JSImport.Namespace)
@js.native
object webXRDefaultExperienceMod extends js.Object {
  @js.native
  class WebXRDefaultExperience protected () extends js.Object {
    /**
      * Base experience
      */
    var baseExperience: WebXRExperienceHelper = js.native
    /**
      * Enables ui for entering/exiting xr
      */
    var enterExitUI: WebXREnterExitUI = js.native
    /**
      * Input experience extension
      */
    var input: WebXRInput = js.native
    /**
      * Enables laser pointer and selection
      */
    var pointerSelection: WebXRControllerPointerSelection = js.native
    /**
      * Default target xr should render to
      */
    var renderTarget: WebXRRenderTarget = js.native
    /**
      * Enables teleportation
      */
    var teleportation: WebXRMotionControllerTeleportation = js.native
    /**
      * DIsposes of the experience helper
      */
    def dispose(): Unit = js.native
  }
  
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
  
  /* static members */
  @js.native
  object WebXRDefaultExperience extends js.Object {
    /**
      * Creates the default xr experience
      * @param scene scene
      * @param options options for basic configuration
      * @returns resulting WebXRDefaultExperience
      */
    def CreateAsync(scene: Scene): js.Promise[WebXRDefaultExperience] = js.native
    def CreateAsync(scene: Scene, options: WebXRDefaultExperienceOptions): js.Promise[WebXRDefaultExperience] = js.native
  }
  
}

