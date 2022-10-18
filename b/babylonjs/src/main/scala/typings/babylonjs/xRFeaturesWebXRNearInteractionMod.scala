package typings.babylonjs

import typings.babylonjs.collisionsPickingInfoMod.PickingInfo
import typings.babylonjs.cullingBoundingSphereMod.BoundingSphere
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.xRFeaturesWebXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.xRFeaturesWebXRControllerPointerSelectionMod.WebXRControllerPointerSelection
import typings.babylonjs.xRWebXRInputMod.WebXRInput
import typings.babylonjs.xRWebXRInputSourceMod.WebXRInputSource
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRNearInteractionMod {
  
  @js.native
  sealed trait WebXRNearControllerMode extends StObject
  @JSImport("babylonjs/XR/features/WebXRNearInteraction", "WebXRNearControllerMode")
  @js.native
  object WebXRNearControllerMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WebXRNearControllerMode & Double] = js.native
    
    /**
      * The interaction point for motion controllers will be in front of the controller
      */
    @js.native
    sealed trait CENTERED_IN_FRONT
      extends StObject
         with WebXRNearControllerMode
    /* 2 */ val CENTERED_IN_FRONT: typings.babylonjs.xRFeaturesWebXRNearInteractionMod.WebXRNearControllerMode.CENTERED_IN_FRONT & Double = js.native
    
    /**
      * The interaction point for motion controllers will be inside of them
      */
    @js.native
    sealed trait CENTERED_ON_CONTROLLER
      extends StObject
         with WebXRNearControllerMode
    /* 1 */ val CENTERED_ON_CONTROLLER: typings.babylonjs.xRFeaturesWebXRNearInteractionMod.WebXRNearControllerMode.CENTERED_ON_CONTROLLER & Double = js.native
    
    /**
      * Motion controllers will not support near interaction
      */
    @js.native
    sealed trait DISABLED
      extends StObject
         with WebXRNearControllerMode
    /* 0 */ val DISABLED: typings.babylonjs.xRFeaturesWebXRNearInteractionMod.WebXRNearControllerMode.DISABLED & Double = js.native
  }
  
  @JSImport("babylonjs/XR/features/WebXRNearInteraction", "WebXRNearInteraction")
  @js.native
  open class WebXRNearInteraction protected () extends WebXRAbstractFeature {
    /**
      * constructs a new background remover module
      * @param _xrSessionManager the session manager for this module
      * @param _options read-only options to be used in this module
      */
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRNearInteractionOptions) = this()
    
    /* private */ var _attachController: Any = js.native
    
    /* private */ var _attachNearInteractionMode: Any = js.native
    
    /* private */ var _attachedController: Any = js.native
    
    /* private */ var _controllerAvailablePredicate: Any = js.native
    
    /* private */ val _controllerPickRadius: Any = js.native
    
    /* private */ var _controllers: Any = js.native
    
    /* private */ var _detachController: Any = js.native
    
    /* private */ var _farInteractionFeature: Any = js.native
    
    /* private */ var _generateNewTouchPointMesh: Any = js.native
    
    /* private */ var _generateVisualCue: Any = js.native
    
    /* private */ var _handleTransitionAnimation: Any = js.native
    
    /* private */ val _hoverRadius: Any = js.native
    
    /* private */ var _isControllerReadyForNearInteraction: Any = js.native
    
    /* private */ val _nearGrabLengthScale: Any = js.native
    
    /**
      * Filter used for near interaction grab
      * @param mesh
      */
    /* private */ var _nearGrabPredicate: Any = js.native
    
    /**
      * Filter used for any near interaction
      * @param mesh
      */
    /* private */ var _nearInteractionPredicate: Any = js.native
    
    /**
      * Filter used for near interaction pick and hover
      * @param mesh
      */
    /* private */ var _nearPickPredicate: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /* private */ val _pickRadius: Any = js.native
    
    /* private */ var _pickWithSphere: Any = js.native
    
    /* private */ var _processTouchPoint: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _tmpRay: Any = js.native
    
    /* private */ def _utilityLayerScene: Any = js.native
    
    /**
      * Will get the mesh under a specific pointer.
      * `scene.meshUnderPointer` will only return one mesh - either left or right.
      * @param controllerId the controllerId to check
      * @returns The mesh under pointer or null if no mesh is under the pointer
      */
    def getMeshUnderPointer(controllerId: String): Nullable[AbstractMesh] = js.native
    
    /**
      * Get the xr controller that correlates to the pointer id in the pointer event
      *
      * @param id the pointer id to search for
      * @returns the controller that correlates to this id or null if not found
      */
    def getXRControllerByPointerId(id: Double): Nullable[WebXRInputSource] = js.native
    
    /**
      * default color of the selection ring
      */
    var selectionMeshDefaultColor: Color3 = js.native
    
    /**
      * This color will be applied to the selection ring when selection is triggered
      */
    var selectionMeshPickedColor: Color3 = js.native
    
    /**
      * This function sets webXRControllerPointerSelection feature that will be disabled when
      * the hover range is reached for a mesh and will be reattached when not in hover range.
      * This is used to remove the selection rays when moving.
      * @param farInteractionFeature the feature to disable when finger is in hover range for a mesh
      */
    def setFarInteractionFeature(farInteractionFeature: Nullable[WebXRControllerPointerSelection]): Unit = js.native
  }
  /* static members */
  object WebXRNearInteraction {
    
    @JSImport("babylonjs/XR/features/WebXRNearInteraction", "WebXRNearInteraction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRNearInteraction", "WebXRNearInteraction.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * Picks a mesh with a sphere
      * @param mesh the mesh to pick
      * @param sphere picking sphere in world coordinates
      * @param skipBoundingInfo a boolean indicating if we should skip the bounding info check
      * @returns the picking info
      */
    inline def PickMeshWithSphere(mesh: AbstractMesh, sphere: BoundingSphere): PickingInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("PickMeshWithSphere")(mesh.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any])).asInstanceOf[PickingInfo]
    inline def PickMeshWithSphere(mesh: AbstractMesh, sphere: BoundingSphere, skipBoundingInfo: Boolean): PickingInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("PickMeshWithSphere")(mesh.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any], skipBoundingInfo.asInstanceOf[js.Any])).asInstanceOf[PickingInfo]
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRNearInteraction", "WebXRNearInteraction.Version")
    @js.native
    val Version: Double = js.native
    
    @JSImport("babylonjs/XR/features/WebXRNearInteraction", "WebXRNearInteraction._IdCounter")
    @js.native
    def _IdCounter: Any = js.native
    inline def _IdCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IdCounter")(x.asInstanceOf[js.Any])
  }
  
  trait IWebXRNearInteractionOptions extends StObject {
    
    /**
      * If provided, this scene will be used to render meshes.
      */
    var customUtilityLayerScene: js.UndefOr[Scene] = js.undefined
    
    /**
      * Disable switching the near interaction from one controller to the other.
      * If the preferred hand is set it will be fixed on this hand, and if not it will be fixed on the first controller added to the scene
      */
    var disableSwitchOnClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable near interaction on all controllers instead of switching between them
      */
    var enableNearInteractionOnAllControllers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Far interaction feature to toggle when near interaction takes precedence
      */
    var farInteractionFeature: js.UndefOr[WebXRControllerPointerSelection] = js.undefined
    
    /**
      * Optional material for the motion controller orb, if enabled
      */
    var motionControllerOrbMaterial: js.UndefOr[Material] = js.undefined
    
    /**
      * Near interaction mode for motion controllers
      */
    var nearInteractionControllerMode: js.UndefOr[WebXRNearControllerMode] = js.undefined
    
    /**
      * The preferred hand to give the near interaction to. This will be prioritized when the controller initialize.
      * If switch is enabled, it will still allow the user to switch between the different controllers
      */
    var preferredHandedness: js.UndefOr[XRHandedness] = js.undefined
    
    /**
      * Should meshes created here be added to a utility layer or the main scene
      */
    var useUtilityLayer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The xr input to use with this near interaction
      */
    var xrInput: WebXRInput
  }
  object IWebXRNearInteractionOptions {
    
    inline def apply(xrInput: WebXRInput): IWebXRNearInteractionOptions = {
      val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRNearInteractionOptions]
    }
    
    extension [Self <: IWebXRNearInteractionOptions](x: Self) {
      
      inline def setCustomUtilityLayerScene(value: Scene): Self = StObject.set(x, "customUtilityLayerScene", value.asInstanceOf[js.Any])
      
      inline def setCustomUtilityLayerSceneUndefined: Self = StObject.set(x, "customUtilityLayerScene", js.undefined)
      
      inline def setDisableSwitchOnClick(value: Boolean): Self = StObject.set(x, "disableSwitchOnClick", value.asInstanceOf[js.Any])
      
      inline def setDisableSwitchOnClickUndefined: Self = StObject.set(x, "disableSwitchOnClick", js.undefined)
      
      inline def setEnableNearInteractionOnAllControllers(value: Boolean): Self = StObject.set(x, "enableNearInteractionOnAllControllers", value.asInstanceOf[js.Any])
      
      inline def setEnableNearInteractionOnAllControllersUndefined: Self = StObject.set(x, "enableNearInteractionOnAllControllers", js.undefined)
      
      inline def setFarInteractionFeature(value: WebXRControllerPointerSelection): Self = StObject.set(x, "farInteractionFeature", value.asInstanceOf[js.Any])
      
      inline def setFarInteractionFeatureUndefined: Self = StObject.set(x, "farInteractionFeature", js.undefined)
      
      inline def setMotionControllerOrbMaterial(value: Material): Self = StObject.set(x, "motionControllerOrbMaterial", value.asInstanceOf[js.Any])
      
      inline def setMotionControllerOrbMaterialUndefined: Self = StObject.set(x, "motionControllerOrbMaterial", js.undefined)
      
      inline def setNearInteractionControllerMode(value: WebXRNearControllerMode): Self = StObject.set(x, "nearInteractionControllerMode", value.asInstanceOf[js.Any])
      
      inline def setNearInteractionControllerModeUndefined: Self = StObject.set(x, "nearInteractionControllerMode", js.undefined)
      
      inline def setPreferredHandedness(value: XRHandedness): Self = StObject.set(x, "preferredHandedness", value.asInstanceOf[js.Any])
      
      inline def setPreferredHandednessUndefined: Self = StObject.set(x, "preferredHandedness", js.undefined)
      
      inline def setUseUtilityLayer(value: Boolean): Self = StObject.set(x, "useUtilityLayer", value.asInstanceOf[js.Any])
      
      inline def setUseUtilityLayerUndefined: Self = StObject.set(x, "useUtilityLayer", js.undefined)
      
      inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
    }
  }
}
