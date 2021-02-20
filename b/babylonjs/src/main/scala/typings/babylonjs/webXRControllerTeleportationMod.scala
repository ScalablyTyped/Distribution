package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.DisableAnimation
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRFeaturesManagerMod.IWebXRFeature
import typings.babylonjs.webXRInputMod.WebXRInput
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRControllerTeleportationMod {
  
  @JSImport("babylonjs/XR/features/WebXRControllerTeleportation", "WebXRMotionControllerTeleportation")
  @js.native
  class WebXRMotionControllerTeleportation protected () extends WebXRAbstractFeature {
    /**
      * constructs a new anchor system
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param _options configuration object for this feature
      */
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRTeleportationOptions) = this()
    
    var _attachController: js.Any = js.native
    
    var _controllers: js.Any = js.native
    
    var _createDefaultTargetMesh: js.Any = js.native
    
    var _currentTeleportationControllerId: js.Any = js.native
    
    var _detachController: js.Any = js.native
    
    var _findClosestSnapPointWithRadius: js.Any = js.native
    
    var _floorMeshes: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _quadraticBezierCurve: js.Any = js.native
    
    var _rotationEnabled: js.Any = js.native
    
    var _selectionFeature: js.Any = js.native
    
    var _setTargetMeshPosition: js.Any = js.native
    
    var _setTargetMeshVisibility: js.Any = js.native
    
    var _showParabolicPath: js.Any = js.native
    
    var _snapToPositions: js.Any = js.native
    
    var _snappedToPoint: js.Any = js.native
    
    var _teleportForward: js.Any = js.native
    
    var _teleportationRingMaterial: js.Any = js.native
    
    var _tmpQuaternion: js.Any = js.native
    
    var _tmpRay: js.Any = js.native
    
    var _tmpVector: js.Any = js.native
    
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
      * Sets wether rotation is enabled or not
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
  
  @js.native
  trait IWebXRTeleportationOptions extends StObject {
    
    /**
      * if provided, this scene will be used to render meshes.
      */
    var customUtilityLayerScene: js.UndefOr[Scene] = js.native
    
    /**
      * Values to configure the default target mesh
      */
    var defaultTargetMeshOptions: js.UndefOr[DisableAnimation] = js.native
    
    /**
      * A list of meshes to use as floor meshes.
      * Meshes can be added and removed after initializing the feature using the
      * addFloorMesh and removeFloorMesh functions
      * If empty, rotation will still work
      */
    var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
    
    /**
      * Should teleport work only on a specific hand?
      */
    var forceHandedness: js.UndefOr[XRHandedness] = js.native
    
    /**
      * If provided, this function will be used to generate the ray mesh instead of the lines mesh being used per default
      */
    var generateRayPathMesh: js.UndefOr[js.Function1[/* points */ js.Array[Vector3], AbstractMesh]] = js.native
    
    /**
      * Meshes that the teleportation ray cannot go through
      */
    var pickBlockerMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
    
    /**
      *  use this rendering group id for the meshes (optional)
      */
    var renderingGroupId: js.UndefOr[Double] = js.native
    
    /**
      * Should teleportation move only to snap points
      */
    var snapPointsOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * An array of points to which the teleportation will snap to.
      * If the teleportation ray is in the proximity of one of those points, it will be corrected to this point.
      */
    var snapPositions: js.UndefOr[js.Array[Vector3]] = js.native
    
    /**
      * How close should the teleportation ray be in order to snap to position.
      * Default to 0.8 units (meters)
      */
    var snapToPositionRadius: js.UndefOr[Double] = js.native
    
    /**
      * Provide your own teleportation mesh instead of babylon's wonderful doughnut.
      * If you want to support rotation, make sure your mesh has a direction indicator.
      *
      * When left untouched, the default mesh will be initialized.
      */
    var teleportationTargetMesh: js.UndefOr[AbstractMesh] = js.native
    
    /**
      * If main component is used (no thumbstick), how long should the "long press" take before teleport
      */
    var timeToTeleport: js.UndefOr[Double] = js.native
    
    /**
      * Disable using the thumbstick and use the main component (usually trigger) on long press.
      * This will be automatically true if the controller doesn't have a thumbstick or touchpad.
      */
    var useMainComponentOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Should meshes created here be added to a utility layer or the main scene
      */
    var useUtilityLayer: js.UndefOr[Boolean] = js.native
    
    /**
      * Babylon XR Input class for controller
      */
    var xrInput: WebXRInput = js.native
  }
  object IWebXRTeleportationOptions {
    
    @scala.inline
    def apply(xrInput: WebXRInput): IWebXRTeleportationOptions = {
      val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRTeleportationOptions]
    }
    
    @scala.inline
    implicit class IWebXRTeleportationOptionsMutableBuilder[Self <: IWebXRTeleportationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomUtilityLayerScene(value: Scene): Self = StObject.set(x, "customUtilityLayerScene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUtilityLayerSceneUndefined: Self = StObject.set(x, "customUtilityLayerScene", js.undefined)
      
      @scala.inline
      def setDefaultTargetMeshOptions(value: DisableAnimation): Self = StObject.set(x, "defaultTargetMeshOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTargetMeshOptionsUndefined: Self = StObject.set(x, "defaultTargetMeshOptions", js.undefined)
      
      @scala.inline
      def setFloorMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "floorMeshes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloorMeshesUndefined: Self = StObject.set(x, "floorMeshes", js.undefined)
      
      @scala.inline
      def setFloorMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "floorMeshes", js.Array(value :_*))
      
      @scala.inline
      def setForceHandedness(value: XRHandedness): Self = StObject.set(x, "forceHandedness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceHandednessUndefined: Self = StObject.set(x, "forceHandedness", js.undefined)
      
      @scala.inline
      def setGenerateRayPathMesh(value: /* points */ js.Array[Vector3] => AbstractMesh): Self = StObject.set(x, "generateRayPathMesh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenerateRayPathMeshUndefined: Self = StObject.set(x, "generateRayPathMesh", js.undefined)
      
      @scala.inline
      def setPickBlockerMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "pickBlockerMeshes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickBlockerMeshesUndefined: Self = StObject.set(x, "pickBlockerMeshes", js.undefined)
      
      @scala.inline
      def setPickBlockerMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "pickBlockerMeshes", js.Array(value :_*))
      
      @scala.inline
      def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
      
      @scala.inline
      def setSnapPointsOnly(value: Boolean): Self = StObject.set(x, "snapPointsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapPointsOnlyUndefined: Self = StObject.set(x, "snapPointsOnly", js.undefined)
      
      @scala.inline
      def setSnapPositions(value: js.Array[Vector3]): Self = StObject.set(x, "snapPositions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapPositionsUndefined: Self = StObject.set(x, "snapPositions", js.undefined)
      
      @scala.inline
      def setSnapPositionsVarargs(value: Vector3*): Self = StObject.set(x, "snapPositions", js.Array(value :_*))
      
      @scala.inline
      def setSnapToPositionRadius(value: Double): Self = StObject.set(x, "snapToPositionRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToPositionRadiusUndefined: Self = StObject.set(x, "snapToPositionRadius", js.undefined)
      
      @scala.inline
      def setTeleportationTargetMesh(value: AbstractMesh): Self = StObject.set(x, "teleportationTargetMesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeleportationTargetMeshUndefined: Self = StObject.set(x, "teleportationTargetMesh", js.undefined)
      
      @scala.inline
      def setTimeToTeleport(value: Double): Self = StObject.set(x, "timeToTeleport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToTeleportUndefined: Self = StObject.set(x, "timeToTeleport", js.undefined)
      
      @scala.inline
      def setUseMainComponentOnly(value: Boolean): Self = StObject.set(x, "useMainComponentOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMainComponentOnlyUndefined: Self = StObject.set(x, "useMainComponentOnly", js.undefined)
      
      @scala.inline
      def setUseUtilityLayer(value: Boolean): Self = StObject.set(x, "useUtilityLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUtilityLayerUndefined: Self = StObject.set(x, "useUtilityLayer", js.undefined)
      
      @scala.inline
      def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
    }
  }
}
