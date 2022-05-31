package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRCameraMod.WebXRCamera
import typings.babylonjs.webXRInputMod.WebXRInput
import typings.babylonjs.webXRInputSourceMod.WebXRInputSource
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRControllerPointerSelectionMod {
  
  @JSImport("babylonjs/XR/features/WebXRControllerPointerSelection", "WebXRControllerPointerSelection")
  @js.native
  class WebXRControllerPointerSelection protected () extends WebXRAbstractFeature {
    /**
      * constructs a new background remover module
      * @param _xrSessionManager the session manager for this module
      * @param _options read-only options to be used in this module
      */
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRControllerPointerSelectionOptions) = this()
    
    /* private */ var _attachController: js.Any = js.native
    
    /* private */ var _attachGazeMode: js.Any = js.native
    
    /* private */ var _attachScreenRayMode: js.Any = js.native
    
    /* private */ var _attachTrackedPointerRayMode: js.Any = js.native
    
    /* private */ var _attachedController: js.Any = js.native
    
    /* private */ var _controllers: js.Any = js.native
    
    /* private */ var _convertNormalToDirectionOfRay: js.Any = js.native
    
    /* private */ var _detachController: js.Any = js.native
    
    /* private */ var _generateNewMeshPair: js.Any = js.native
    
    /* private */ var _identityMatrix: js.Any = js.native
    
    /* private */ val _options: js.Any = js.native
    
    /* private */ var _pickingMoved: js.Any = js.native
    
    /* private */ var _scene: js.Any = js.native
    
    /* private */ var _screenCoordinatesRef: js.Any = js.native
    
    /* private */ var _tmpVectorForPickCompare: js.Any = js.native
    
    /* private */ var _updatePointerDistance: js.Any = js.native
    
    /* private */ var _viewportRef: js.Any = js.native
    
    /**
      * Disable lighting on the laser pointer (so it will always be visible)
      */
    var disablePointerLighting: Boolean = js.native
    
    /**
      * Disable lighting on the selection mesh (so it will always be visible)
      */
    var disableSelectionMeshLighting: Boolean = js.native
    
    /**
      * Should the laser pointer be displayed
      */
    var displayLaserPointer: Boolean = js.native
    
    /**
      * Should the selection mesh be displayed (The ring at the end of the laser pointer)
      */
    var displaySelectionMesh: Boolean = js.native
    
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
      * Default color of the laser pointer
      */
    var laserPointerDefaultColor: Color3 = js.native
    
    /**
      * This color will be set to the laser pointer when selection is triggered
      */
    var laserPointerPickedColor: Color3 = js.native
    
    /** @hidden */
    def lasterPointerDefaultColor: Color3 = js.native
    
    /**
      * Optional filter to be used for ray selection.  This predicate shares behavior with
      * scene.pointerMovePredicate which takes priority if it is also assigned.
      */
    def raySelectionPredicate(mesh: AbstractMesh): Boolean = js.native
    
    /**
      * default color of the selection ring
      */
    var selectionMeshDefaultColor: Color3 = js.native
    
    /**
      * This color will be applied to the selection ring when selection is triggered
      */
    var selectionMeshPickedColor: Color3 = js.native
  }
  /* static members */
  object WebXRControllerPointerSelection {
    
    @JSImport("babylonjs/XR/features/WebXRControllerPointerSelection", "WebXRControllerPointerSelection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRControllerPointerSelection", "WebXRControllerPointerSelection.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRControllerPointerSelection", "WebXRControllerPointerSelection.Version")
    @js.native
    val Version: Double = js.native
    
    @JSImport("babylonjs/XR/features/WebXRControllerPointerSelection", "WebXRControllerPointerSelection._idCounter")
    @js.native
    def _idCounter: js.Any = js.native
    inline def _idCounter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_idCounter")(x.asInstanceOf[js.Any])
  }
  
  trait IWebXRControllerPointerSelectionOptions extends StObject {
    
    /**
      * if provided, this scene will be used to render meshes.
      */
    var customUtilityLayerScene: js.UndefOr[Scene] = js.undefined
    
    /**
      * Disable the pointer up event when the xr controller in screen and gaze mode is disposed (meaning - when the user removed the finger from the screen)
      * If not disabled, the last picked point will be used to execute a pointer up event
      * If disabled, pointer up event will be triggered right after the pointer down event.
      * Used in screen and gaze target ray mode only
      */
    var disablePointerUpOnTouchOut: Boolean
    
    /**
      * Should the scene pointerX and pointerY update be disabled
      * This is required for fullscreen AR GUI, but might slow down other experiences.
      * Disable in VR, if not needed.
      * The first rig camera (left eye) will be used to calculate the projection
      */
    var disableScenePointerVectorUpdate: Boolean
    
    /**
      * Disable switching the pointer selection from one controller to the other.
      * If the preferred hand is set it will be fixed on this hand, and if not it will be fixed on the first controller added to the scene
      */
    var disableSwitchOnClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable pointer selection on all controllers instead of switching between them
      */
    var enablePointerSelectionOnAllControllers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * For gaze mode for tracked-pointer / controllers (time to select instead of button press)
      */
    var forceGazeMode: Boolean
    
    /**
      * Optional WebXR camera to be used for gaze selection
      */
    var gazeCamera: js.UndefOr[WebXRCamera] = js.undefined
    
    /**
      * Factor to be applied to the pointer-moved function in the gaze mode. How sensitive should the gaze mode be when checking if the pointer moved
      * to start a new countdown to the pointer down event.
      * Defaults to 1.
      */
    var gazeModePointerMovedFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum distance of the pointer selection feature. Defaults to 100.
      */
    var maxPointerDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * Different button type to use instead of the main component
      */
    var overrideButtonId: js.UndefOr[String] = js.undefined
    
    /**
      * The preferred hand to give the pointer selection to. This will be prioritized when the controller initialize.
      * If switch is enabled, it will still allow the user to switch between the different controllers
      */
    var preferredHandedness: js.UndefOr[XRHandedness] = js.undefined
    
    /**
      *  use this rendering group id for the meshes (optional)
      */
    var renderingGroupId: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time in milliseconds it takes between pick found something to a pointer down event.
      * Used in gaze modes. Tracked pointer uses the trigger, screen uses touch events
      * 3000 means 3 seconds between pointing at something and selecting it
      */
    var timeToSelect: js.UndefOr[Double] = js.undefined
    
    /**
      * Should meshes created here be added to a utility layer or the main scene
      */
    var useUtilityLayer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the xr input to use with this pointer selection
      */
    var xrInput: WebXRInput
  }
  object IWebXRControllerPointerSelectionOptions {
    
    inline def apply(
      disablePointerUpOnTouchOut: Boolean,
      disableScenePointerVectorUpdate: Boolean,
      forceGazeMode: Boolean,
      xrInput: WebXRInput
    ): IWebXRControllerPointerSelectionOptions = {
      val __obj = js.Dynamic.literal(disablePointerUpOnTouchOut = disablePointerUpOnTouchOut.asInstanceOf[js.Any], disableScenePointerVectorUpdate = disableScenePointerVectorUpdate.asInstanceOf[js.Any], forceGazeMode = forceGazeMode.asInstanceOf[js.Any], xrInput = xrInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRControllerPointerSelectionOptions]
    }
    
    extension [Self <: IWebXRControllerPointerSelectionOptions](x: Self) {
      
      inline def setCustomUtilityLayerScene(value: Scene): Self = StObject.set(x, "customUtilityLayerScene", value.asInstanceOf[js.Any])
      
      inline def setCustomUtilityLayerSceneUndefined: Self = StObject.set(x, "customUtilityLayerScene", js.undefined)
      
      inline def setDisablePointerUpOnTouchOut(value: Boolean): Self = StObject.set(x, "disablePointerUpOnTouchOut", value.asInstanceOf[js.Any])
      
      inline def setDisableScenePointerVectorUpdate(value: Boolean): Self = StObject.set(x, "disableScenePointerVectorUpdate", value.asInstanceOf[js.Any])
      
      inline def setDisableSwitchOnClick(value: Boolean): Self = StObject.set(x, "disableSwitchOnClick", value.asInstanceOf[js.Any])
      
      inline def setDisableSwitchOnClickUndefined: Self = StObject.set(x, "disableSwitchOnClick", js.undefined)
      
      inline def setEnablePointerSelectionOnAllControllers(value: Boolean): Self = StObject.set(x, "enablePointerSelectionOnAllControllers", value.asInstanceOf[js.Any])
      
      inline def setEnablePointerSelectionOnAllControllersUndefined: Self = StObject.set(x, "enablePointerSelectionOnAllControllers", js.undefined)
      
      inline def setForceGazeMode(value: Boolean): Self = StObject.set(x, "forceGazeMode", value.asInstanceOf[js.Any])
      
      inline def setGazeCamera(value: WebXRCamera): Self = StObject.set(x, "gazeCamera", value.asInstanceOf[js.Any])
      
      inline def setGazeCameraUndefined: Self = StObject.set(x, "gazeCamera", js.undefined)
      
      inline def setGazeModePointerMovedFactor(value: Double): Self = StObject.set(x, "gazeModePointerMovedFactor", value.asInstanceOf[js.Any])
      
      inline def setGazeModePointerMovedFactorUndefined: Self = StObject.set(x, "gazeModePointerMovedFactor", js.undefined)
      
      inline def setMaxPointerDistance(value: Double): Self = StObject.set(x, "maxPointerDistance", value.asInstanceOf[js.Any])
      
      inline def setMaxPointerDistanceUndefined: Self = StObject.set(x, "maxPointerDistance", js.undefined)
      
      inline def setOverrideButtonId(value: String): Self = StObject.set(x, "overrideButtonId", value.asInstanceOf[js.Any])
      
      inline def setOverrideButtonIdUndefined: Self = StObject.set(x, "overrideButtonId", js.undefined)
      
      inline def setPreferredHandedness(value: XRHandedness): Self = StObject.set(x, "preferredHandedness", value.asInstanceOf[js.Any])
      
      inline def setPreferredHandednessUndefined: Self = StObject.set(x, "preferredHandedness", js.undefined)
      
      inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
      
      inline def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
      
      inline def setTimeToSelect(value: Double): Self = StObject.set(x, "timeToSelect", value.asInstanceOf[js.Any])
      
      inline def setTimeToSelectUndefined: Self = StObject.set(x, "timeToSelect", js.undefined)
      
      inline def setUseUtilityLayer(value: Boolean): Self = StObject.set(x, "useUtilityLayer", value.asInstanceOf[js.Any])
      
      inline def setUseUtilityLayerUndefined: Self = StObject.set(x, "useUtilityLayer", js.undefined)
      
      inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
    }
  }
}
