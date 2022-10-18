package typings.babylonjs

import typings.babylonjs.anon.PartialIWebXRControllerPo
import typings.babylonjs.anon.PartialIWebXRInputOptions
import typings.babylonjs.anon.PartialIWebXRNearInteract
import typings.babylonjs.anon.PartialIWebXRTeleportatio
import typings.babylonjs.anon.PartialWebXREnterExitUIOp
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.xRFeaturesWebXRControllerPointerSelectionMod.WebXRControllerPointerSelection
import typings.babylonjs.xRFeaturesWebXRControllerTeleportationMod.WebXRMotionControllerTeleportation
import typings.babylonjs.xRFeaturesWebXRNearInteractionMod.WebXRNearInteraction
import typings.babylonjs.xRWebXREnterExitUIMod.WebXREnterExitUI
import typings.babylonjs.xRWebXRExperienceHelperMod.WebXRExperienceHelper
import typings.babylonjs.xRWebXRInputMod.WebXRInput
import typings.babylonjs.xRWebXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions
import typings.babylonjs.xRWebXRTypesMod.WebXRRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRWebXRDefaultExperienceMod {
  
  @JSImport("babylonjs/XR/webXRDefaultExperience", "WebXRDefaultExperience")
  @js.native
  /* private */ open class WebXRDefaultExperience () extends StObject {
    
    /**
      * Base experience
      */
    var baseExperience: WebXRExperienceHelper = js.native
    
    /**
      * Disposes of the experience helper
      */
    def dispose(): Unit = js.native
    
    /**
      * Enables ui for entering/exiting xr
      */
    var enterExitUI: WebXREnterExitUI = js.native
    
    /**
      * Input experience extension
      */
    var input: WebXRInput = js.native
    
    /**
      * Enables near interaction for hands/controllers
      */
    var nearInteraction: WebXRNearInteraction = js.native
    
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
  }
  /* static members */
  object WebXRDefaultExperience {
    
    @JSImport("babylonjs/XR/webXRDefaultExperience", "WebXRDefaultExperience")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates the default xr experience
      * @param scene scene
      * @param options options for basic configuration
      * @returns resulting WebXRDefaultExperience
      */
    inline def CreateAsync(scene: Scene): js.Promise[WebXRDefaultExperience] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebXRDefaultExperience]]
    inline def CreateAsync(scene: Scene, options: WebXRDefaultExperienceOptions): js.Promise[WebXRDefaultExperience] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebXRDefaultExperience]]
  }
  
  @JSImport("babylonjs/XR/webXRDefaultExperience", "WebXRDefaultExperienceOptions")
  @js.native
  open class WebXRDefaultExperienceOptions () extends StObject {
    
    /**
      * Enable or disable default UI to enter XR
      */
    var disableDefaultUI: js.UndefOr[Boolean] = js.native
    
    /**
      * Should nearInteraction not initialize. Defaults to false.
      */
    var disableNearInteraction: js.UndefOr[Boolean] = js.native
    
    /**
      * Should pointer selection not initialize.
      * Note that disabling pointer selection also disables teleportation.
      * Defaults to false.
      */
    var disablePointerSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Should teleportation not initialize. Defaults to false.
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
      * Optional configuration for the XR input object
      */
    var inputOptions: js.UndefOr[PartialIWebXRInputOptions] = js.native
    
    /**
      * optional configuration for near interaction
      */
    var nearInteractionOptions: js.UndefOr[PartialIWebXRNearInteract] = js.native
    
    /**
      * A list of optional features to init the session with
      * If set to true, all features we support will be added
      */
    var optionalFeatures: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    /**
      * optional configuration for the output canvas
      */
    var outputCanvasOptions: js.UndefOr[WebXRManagedOutputCanvasOptions] = js.native
    
    /**
      * optional configuration for pointer selection
      */
    var pointerSelectionOptions: js.UndefOr[PartialIWebXRControllerPo] = js.native
    
    /**
      * An optional rendering group id that will be set globally for teleportation, pointer selection and default controller meshes
      */
    var renderingGroupId: js.UndefOr[Double] = js.native
    
    /**
      * optional configuration for teleportation
      */
    var teleportationOptions: js.UndefOr[PartialIWebXRTeleportatio] = js.native
    
    /**
      * optional UI options. This can be used among other to change session mode and reference space type
      */
    var uiOptions: js.UndefOr[PartialWebXREnterExitUIOp] = js.native
    
    /**
      * When loading teleportation and pointer select, use stable versions instead of latest.
      */
    var useStablePlugins: js.UndefOr[Boolean] = js.native
  }
}
