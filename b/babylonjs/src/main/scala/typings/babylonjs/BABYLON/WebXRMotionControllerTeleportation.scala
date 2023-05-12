package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRMotionControllerTeleportation
  extends StObject
     with WebXRAbstractFeature {
  
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
