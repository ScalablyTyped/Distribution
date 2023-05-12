package typings.babylonjs

import typings.babylonjs.anon.DisableAnimation
import typings.babylonjs.collisionsPickingInfoMod.PickingInfo
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.xRFeaturesWebXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.xRWebXRFeaturesManagerMod.IWebXRFeature
import typings.babylonjs.xRWebXRInputMod.WebXRInput
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRControllerTeleportationMod {
  
  @JSImport("babylonjs/XR/features/WebXRControllerTeleportation", "WebXRMotionControllerTeleportation")
  @js.native
  open class WebXRMotionControllerTeleportation protected () extends WebXRAbstractFeature {
    /**
      * constructs a new teleportation system
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param _options configuration object for this feature
      */
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRTeleportationOptions) = this()
    
    /* private */ var _attachController: Any = js.native
    
    /* private */ var _blockedRayColor: Any = js.native
    
    /* private */ var _cachedColor4White: Any = js.native
    
    /* private */ var _controllers: Any = js.native
    
    /* private */ var _createDefaultTargetMesh: Any = js.native
    
    /* private */ var _currentTeleportationControllerId: Any = js.native
    
    /* private */ var _detachController: Any = js.native
    
    /* private */ var _disposeBezierCurve: Any = js.native
    
    /* private */ var _findClosestSnapPointWithRadius: Any = js.native
    
    /* private */ var _floorMeshes: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _quadraticBezierCurve: Any = js.native
    
    /* private */ var _rotationEnabled: Any = js.native
    
    /* private */ var _selectionFeature: Any = js.native
    
    /* private */ var _setTargetMeshPosition: Any = js.native
    
    /* private */ var _setTargetMeshVisibility: Any = js.native
    
    /* private */ var _showParabolicPath: Any = js.native
    
    /* private */ var _snapToPositions: Any = js.native
    
    /* private */ var _snappedToPoint: Any = js.native
    
    /* private */ var _teleportForward: Any = js.native
    
    /* private */ var _teleportationRingMaterial: Any = js.native
    
    /* private */ var _tmpQuaternion: Any = js.native
    
    /* private */ var _tmpRay: Any = js.native
    
    /* private */ var _tmpVector: Any = js.native
    
    /**
      * Add a mesh to the list of meshes blocking the teleportation ray
      * @param mesh The mesh to add to the teleportation-blocking meshes
      */
    def addBlockerMesh(mesh: AbstractMesh): Unit = js.native
    
    /**
      * Add a new mesh to the floor meshes array
      * @param mesh the mesh to use as floor mesh
      */
    def addFloorMesh(mesh: AbstractMesh): Unit = js.native
    
    /**
      * Add a new snap-to point to fix teleportation to this position
      * @param newSnapPoint The new Snap-To point
      */
    def addSnapPoint(newSnapPoint: Vector3): Unit = js.native
    
    /**
      * Is movement backwards enabled
      */
    var backwardsMovementEnabled: Boolean = js.native
    
    /**
      * Distance to travel when moving backwards
      */
    var backwardsTeleportationDistance: Double = js.native
    
    /**
      * This observable will notify when the target mesh position was updated.
      * The picking info it provides contains the point to which the target mesh will move ()
      */
    var onTargetMeshPositionUpdatedObservable: Observable[PickingInfo] = js.native
    
    /**
      * The distance from the user to the inspection point in the direction of the controller
      * A higher number will allow the user to move further
      * defaults to 5 (meters, in xr units)
      */
    var parabolicCheckRadius: Double = js.native
    
    /**
      * Should the module support parabolic ray on top of direct ray
      * If enabled, the user will be able to point "at the sky" and move according to predefined radius distance
      * Very helpful when moving between floors / different heights
      */
    var parabolicRayEnabled: Boolean = js.native
    
    /**
      * Remove a mesh from the blocker meshes array
      * @param mesh the mesh to remove
      */
    def removeBlockerMesh(mesh: AbstractMesh): Unit = js.native
    
    /**
      * Remove a mesh from the floor meshes array
      * @param mesh the mesh to remove
      */
    def removeFloorMesh(mesh: AbstractMesh): Unit = js.native
    
    /**
      * Remove a mesh from the floor meshes array using its name
      * @param name the mesh name to remove
      */
    def removeFloorMeshByName(name: String): Unit = js.native
    
    /**
      * This function will iterate through the array, searching for this point or equal to it. It will then remove it from the snap-to array
      * @param snapPointToRemove the point (or a clone of it) to be removed from the array
      * @returns was the point found and removed or not
      */
    def removeSnapPoint(snapPointToRemove: Vector3): Boolean = js.native
    
    /**
      * How much rotation should be applied when rotating right and left
      */
    var rotationAngle: Double = js.native
    
    /**
      * Is rotation enabled when moving forward?
      * Disabling this feature will prevent the user from deciding the direction when teleporting
      */
    def rotationEnabled: Boolean = js.native
    /**
      * Sets whether rotation is enabled or not
      * @param enabled is rotation enabled when teleportation is shown
      */
    def rotationEnabled_=(enabled: Boolean): Unit = js.native
    
    /**
      * This function sets a selection feature that will be disabled when
      * the forward ray is shown and will be reattached when hidden.
      * This is used to remove the selection rays when moving.
      * @param selectionFeature the feature to disable when forward movement is enabled
      */
    def setSelectionFeature(selectionFeature: Nullable[IWebXRFeature]): Unit = js.native
    
    /**
      * Skip the next teleportation. This can be controlled by the user to prevent the user from teleportation
      * to sections that are not yet "unlocked", but should still show the teleportation mesh.
      */
    var skipNextTeleportation: Boolean = js.native
    
    /**
      * Get the snapPointsOnly flag
      */
    def snapPointsOnly: Boolean = js.native
    /**
      * Sets the snapPointsOnly flag
      * @param snapToPoints should teleportation be exclusively to snap points
      */
    def snapPointsOnly_=(snapToPoints: Boolean): Unit = js.native
    
    /**
      * The second type of ray - straight line.
      * Should it be enabled or should the parabolic line be the only one.
      */
    var straightRayEnabled: Boolean = js.native
    
    /**
      * Is teleportation enabled. Can be used to allow rotation only.
      */
    var teleportationEnabled: Boolean = js.native
    
    /**
      * Exposes the currently set teleportation target mesh.
      */
    def teleportationTargetMesh: Nullable[AbstractMesh] = js.native
  }
  /* static members */
  object WebXRMotionControllerTeleportation {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRControllerTeleportation", "WebXRMotionControllerTeleportation.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the webxr specs version
      */
    @JSImport("babylonjs/XR/features/WebXRControllerTeleportation", "WebXRMotionControllerTeleportation.Version")
    @js.native
    val Version: Double = js.native
  }
  
  trait IWebXRTeleportationOptions extends StObject {
    
    /**
      * Color of the teleportation ray when it is blocked by a mesh in the pickBlockerMeshes array
      * Defaults to red.
      */
    var blockedRayColor: js.UndefOr[Color4] = js.undefined
    
    /**
      * if provided, this scene will be used to render meshes.
      */
    var customUtilityLayerScene: js.UndefOr[Scene] = js.undefined
    
    /**
      * Values to configure the default target mesh
      */
    var defaultTargetMeshOptions: js.UndefOr[DisableAnimation] = js.undefined
    
    /**
      * A list of meshes to use as floor meshes.
      * Meshes can be added and removed after initializing the feature using the
      * addFloorMesh and removeFloorMesh functions
      * If empty, rotation will still work
      */
    var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.undefined
    
    /**
      * Should teleport work only on a specific hand?
      */
    var forceHandedness: js.UndefOr[XRHandedness] = js.undefined
    
    /**
      * If provided, this function will be used to generate the ray mesh instead of the lines mesh being used per default
      */
    var generateRayPathMesh: js.UndefOr[
        js.Function2[/* points */ js.Array[Vector3], /* pickingInfo */ PickingInfo, AbstractMesh]
      ] = js.undefined
    
    /**
      * Meshes that the teleportation ray cannot go through
      */
    var pickBlockerMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.undefined
    
    /**
      *  use this rendering group id for the meshes (optional)
      */
    var renderingGroupId: js.UndefOr[Double] = js.undefined
    
    /**
      * Should teleportation move only to snap points
      */
    var snapPointsOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array of points to which the teleportation will snap to.
      * If the teleportation ray is in the proximity of one of those points, it will be corrected to this point.
      */
    var snapPositions: js.UndefOr[js.Array[Vector3]] = js.undefined
    
    /**
      * How close should the teleportation ray be in order to snap to position.
      * Default to 0.8 units (meters)
      */
    var snapToPositionRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * Provide your own teleportation mesh instead of babylon's wonderful doughnut.
      * If you want to support rotation, make sure your mesh has a direction indicator.
      *
      * When left untouched, the default mesh will be initialized.
      */
    var teleportationTargetMesh: js.UndefOr[AbstractMesh] = js.undefined
    
    /**
      * If main component is used (no thumbstick), how long should the "long press" take before teleport
      */
    var timeToTeleport: js.UndefOr[Double] = js.undefined
    
    /**
      * Disable using the thumbstick and use the main component (usually trigger) on long press.
      * This will be automatically true if the controller doesn't have a thumbstick or touchpad.
      */
    var useMainComponentOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should meshes created here be added to a utility layer or the main scene
      */
    var useUtilityLayer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Babylon XR Input class for controller
      */
    var xrInput: WebXRInput
  }
  object IWebXRTeleportationOptions {
    
    inline def apply(xrInput: WebXRInput): IWebXRTeleportationOptions = {
      val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRTeleportationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWebXRTeleportationOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockedRayColor(value: Color4): Self = StObject.set(x, "blockedRayColor", value.asInstanceOf[js.Any])
      
      inline def setBlockedRayColorUndefined: Self = StObject.set(x, "blockedRayColor", js.undefined)
      
      inline def setCustomUtilityLayerScene(value: Scene): Self = StObject.set(x, "customUtilityLayerScene", value.asInstanceOf[js.Any])
      
      inline def setCustomUtilityLayerSceneUndefined: Self = StObject.set(x, "customUtilityLayerScene", js.undefined)
      
      inline def setDefaultTargetMeshOptions(value: DisableAnimation): Self = StObject.set(x, "defaultTargetMeshOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultTargetMeshOptionsUndefined: Self = StObject.set(x, "defaultTargetMeshOptions", js.undefined)
      
      inline def setFloorMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "floorMeshes", value.asInstanceOf[js.Any])
      
      inline def setFloorMeshesUndefined: Self = StObject.set(x, "floorMeshes", js.undefined)
      
      inline def setFloorMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "floorMeshes", js.Array(value*))
      
      inline def setForceHandedness(value: XRHandedness): Self = StObject.set(x, "forceHandedness", value.asInstanceOf[js.Any])
      
      inline def setForceHandednessUndefined: Self = StObject.set(x, "forceHandedness", js.undefined)
      
      inline def setGenerateRayPathMesh(value: (/* points */ js.Array[Vector3], /* pickingInfo */ PickingInfo) => AbstractMesh): Self = StObject.set(x, "generateRayPathMesh", js.Any.fromFunction2(value))
      
      inline def setGenerateRayPathMeshUndefined: Self = StObject.set(x, "generateRayPathMesh", js.undefined)
      
      inline def setPickBlockerMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "pickBlockerMeshes", value.asInstanceOf[js.Any])
      
      inline def setPickBlockerMeshesUndefined: Self = StObject.set(x, "pickBlockerMeshes", js.undefined)
      
      inline def setPickBlockerMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "pickBlockerMeshes", js.Array(value*))
      
      inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
      
      inline def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
      
      inline def setSnapPointsOnly(value: Boolean): Self = StObject.set(x, "snapPointsOnly", value.asInstanceOf[js.Any])
      
      inline def setSnapPointsOnlyUndefined: Self = StObject.set(x, "snapPointsOnly", js.undefined)
      
      inline def setSnapPositions(value: js.Array[Vector3]): Self = StObject.set(x, "snapPositions", value.asInstanceOf[js.Any])
      
      inline def setSnapPositionsUndefined: Self = StObject.set(x, "snapPositions", js.undefined)
      
      inline def setSnapPositionsVarargs(value: Vector3*): Self = StObject.set(x, "snapPositions", js.Array(value*))
      
      inline def setSnapToPositionRadius(value: Double): Self = StObject.set(x, "snapToPositionRadius", value.asInstanceOf[js.Any])
      
      inline def setSnapToPositionRadiusUndefined: Self = StObject.set(x, "snapToPositionRadius", js.undefined)
      
      inline def setTeleportationTargetMesh(value: AbstractMesh): Self = StObject.set(x, "teleportationTargetMesh", value.asInstanceOf[js.Any])
      
      inline def setTeleportationTargetMeshUndefined: Self = StObject.set(x, "teleportationTargetMesh", js.undefined)
      
      inline def setTimeToTeleport(value: Double): Self = StObject.set(x, "timeToTeleport", value.asInstanceOf[js.Any])
      
      inline def setTimeToTeleportUndefined: Self = StObject.set(x, "timeToTeleport", js.undefined)
      
      inline def setUseMainComponentOnly(value: Boolean): Self = StObject.set(x, "useMainComponentOnly", value.asInstanceOf[js.Any])
      
      inline def setUseMainComponentOnlyUndefined: Self = StObject.set(x, "useMainComponentOnly", js.undefined)
      
      inline def setUseUtilityLayer(value: Boolean): Self = StObject.set(x, "useUtilityLayer", value.asInstanceOf[js.Any])
      
      inline def setUseUtilityLayerUndefined: Self = StObject.set(x, "useUtilityLayer", js.undefined)
      
      inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
    }
  }
}
