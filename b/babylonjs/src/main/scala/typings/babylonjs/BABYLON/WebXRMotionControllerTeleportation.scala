package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRMotionControllerTeleportation extends WebXRAbstractFeature {
  var _attachController: js.Any = js.native
  var _controllers: js.Any = js.native
  var _createDefaultTargetMesh: js.Any = js.native
  var _currentTeleportationControllerId: js.Any = js.native
  var _detachController: js.Any = js.native
  var _findClosestSnapPointWithRadius: js.Any = js.native
  var _floorMeshes: js.Any = js.native
  var _options: js.Any = js.native
  var _quadraticBezierCurve: js.Any = js.native
  var _selectionFeature: js.Any = js.native
  var _setTargetMeshPosition: js.Any = js.native
  var _setTargetMeshVisibility: js.Any = js.native
  var _showParabolicPath: js.Any = js.native
  var _snapToPositions: js.Any = js.native
  var _snappedToPoint: js.Any = js.native
  var _teleportForward: js.Any = js.native
  var _teleportationRingMaterial: js.UndefOr[js.Any] = js.native
  var _tmpRay: js.Any = js.native
  var _tmpVector: js.Any = js.native
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
    * How much rotation should be applied when rotating right and left
    */
  var rotationAngle: Double = js.native
  /**
    * Is rotation enabled when moving forward?
    * Disabling this feature will prevent the user from deciding the direction when teleporting
    */
  var rotationEnabled: Boolean = js.native
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
    * This function sets a selection feature that will be disabled when
    * the forward ray is shown and will be reattached when hidden.
    * This is used to remove the selection rays when moving.
    * @param selectionFeature the feature to disable when forward movement is enabled
    */
  def setSelectionFeature(selectionFeature: IWebXRFeature): Unit = js.native
  /**
    * Get the snapPointsOnly flag
    */
  def snapPointsOnly: Boolean = js.native
  /**
    * Sets the snapPointsOnly flag
    * @param snapToPoints should teleportation be exclusively to snap points
    */
  def snapPointsOnly(snapToPoints: Boolean): js.Any = js.native
}

