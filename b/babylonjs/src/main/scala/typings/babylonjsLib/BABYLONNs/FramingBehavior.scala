package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The framing behavior (BABYLON.FramingBehavior) is designed to automatically position an ArcRotateCamera when its target is set to a mesh. It is also useful if you want to prevent the camera to go under a virtual horizontal plane.
  * @see http://doc.babylonjs.com/how_to/camera_behaviors#framing-behavior
  */
@JSGlobal("BABYLON.FramingBehavior")
@js.native
class FramingBehavior () extends Behavior[ArcRotateCamera] {
  var _animatables: js.Any = js.native
  /**
    *  Applies any current user interaction to the camera. Takes into account maximum alpha rotation.
    */
  var _applyUserInteraction: js.Any = js.native
  var _attachedCamera: js.Any = js.native
  var _betaIsAnimating: js.Any = js.native
  var _betaTransition: js.Any = js.native
  /**
    * Removes all animation locks. Allows new animations to be added to any of the arcCamera properties.
    */
  var _clearAnimationLocks: js.Any = js.native
  var _defaultElevation: js.Any = js.native
  var _elevationReturnTime: js.Any = js.native
  var _elevationReturnWaitTime: js.Any = js.native
  var _framingTime: js.Any = js.native
  /**
    * Returns the frustum slope based on the canvas ratio and camera FOV
    * @returns The frustum slope represented as a Vector2 with X and Y slopes
    */
  var _getFrustumSlope: js.Any = js.native
  var _isPointerDown: js.Any = js.native
  var _lastInteractionTime: js.Any = js.native
  /**
    * Keeps the camera above the ground plane. If the user pulls the camera below the ground plane, the camera
    * is automatically returned to its default position (expected to be above ground plane).
    */
  var _maintainCameraAboveGround: js.Any = js.native
  var _mode: js.Any = js.native
  var _onAfterCheckInputsObserver: js.Any = js.native
  var _onMeshTargetChangedObserver: js.Any = js.native
  var _onPrePointerObservableObserver: js.Any = js.native
  var _positionScale: js.Any = js.native
  var _radiusScale: js.Any = js.native
  var _radiusTransition: js.Any = js.native
  var _vectorTransition: js.Any = js.native
  var _zoomStopsAnimation: js.Any = js.native
  /**
    * Define if the behavior should automatically change the configured
    * camera limits and sensibilities.
    */
  var autoCorrectCameraLimitsAndSensibility: scala.Boolean = js.native
  /**
    * Sets the angle above/below the horizontal plane to return to when the return to default elevation idle
    * behaviour is triggered, in radians.
    */
  /**
    * Gets the angle above/below the horizontal plane to return to when the return to default elevation idle
    * behaviour is triggered, in radians.
    */
  var defaultElevation: scala.Double = js.native
  /**
    * Sets the time (in milliseconds) taken to return to the default beta position.
    * Negative value indicates camera should not return to default.
    */
  /**
    * Gets the time (in milliseconds) taken to return to the default beta position.
    * Negative value indicates camera should not return to default.
    */
  var elevationReturnTime: scala.Double = js.native
  /**
    * Sets the delay (in milliseconds) taken before the camera returns to the default beta position.
    */
  /**
    * Gets the delay (in milliseconds) taken before the camera returns to the default beta position.
    */
  var elevationReturnWaitTime: scala.Double = js.native
  /**
    * Sets the transition time when framing the mesh, in milliseconds
    */
  /**
    * Gets the transition time when framing the mesh, in milliseconds
    */
  var framingTime: scala.Double = js.native
  /**
    * Gets a value indicating if the user is moving the camera
    */
  val isUserIsMoving: scala.Boolean = js.native
  /**
    * Sets the current mode used by the behavior
    */
  /**
    * Gets current mode used by the behavior.
    */
  var mode: scala.Double = js.native
  /** gets or sets behavior's name */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * Sets the scale to apply on Y axis to position camera focus. 0.5 by default which means the center of the bounding box.
    */
  /**
    * Gets the scale to apply on Y axis to position camera focus. 0.5 by default which means the center of the bounding box.
    */
  var positionScale: scala.Double = js.native
  /**
    * Sets the scale applied to the radius (1 by default)
    */
  /**
    * Gets the scale applied to the radius
    */
  var radiusScale: scala.Double = js.native
  /**
    * Sets the flag that indicates if user zooming should stop animation.
    */
  /**
    * Gets the flag that indicates if user zooming should stop animation.
    */
  var zoomStopsAnimation: scala.Boolean = js.native
  /**
    * Calculates the lowest radius for the camera based on the bounding box of the mesh.
    * @param mesh The mesh on which to base the calculation. mesh boundingInfo used to estimate necessary
    *			  frustum width.
    * @return The minimum distance from the primary mesh's center point at which the camera must be kept in order
    *		 to fully enclose the mesh in the viewing frustum.
    */
  /* protected */ def _calculateLowerRadiusFromModelBoundingSphere(minimumWorld: Vector3, maximumWorld: Vector3): scala.Double = js.native
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: ArcRotateCamera): scala.Unit = js.native
  /**
    * Called when the behavior is detached from its target
    */
  /* CompleteClass */
  override def detach(): scala.Unit = js.native
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  /* CompleteClass */
  override def init(): scala.Unit = js.native
  /**
    * Stops and removes all animations that have been applied to the camera
    */
  def stopAllAnimations(): scala.Unit = js.native
  /**
    * Targets the bounding box info defined by its extends and updates zoom level accordingly.
    * @param minimumWorld Determines the smaller position of the bounding box extend
    * @param maximumWorld Determines the bigger position of the bounding box extend
    * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
    * @param onAnimationEnd Callback triggered at the end of the framing animation
    */
  def zoomOnBoundingInfo(minimumWorld: Vector3, maximumWorld: Vector3): scala.Unit = js.native
  def zoomOnBoundingInfo(minimumWorld: Vector3, maximumWorld: Vector3, focusOnOriginXZ: scala.Boolean): scala.Unit = js.native
  def zoomOnBoundingInfo(
    minimumWorld: Vector3,
    maximumWorld: Vector3,
    focusOnOriginXZ: scala.Boolean,
    onAnimationEnd: Nullable[js.Function0[scala.Unit]]
  ): scala.Unit = js.native
  /**
    * Targets the given mesh and updates zoom level accordingly.
    * @param mesh  The mesh to target.
    * @param radius Optional. If a cached radius position already exists, overrides default.
    * @param framingPositionY Position on mesh to center camera focus where 0 corresponds bottom of its bounding box and 1, the top
    * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
    * @param onAnimationEnd Callback triggered at the end of the framing animation
    */
  def zoomOnMesh(mesh: AbstractMesh): scala.Unit = js.native
  def zoomOnMesh(mesh: AbstractMesh, focusOnOriginXZ: scala.Boolean): scala.Unit = js.native
  def zoomOnMesh(
    mesh: AbstractMesh,
    focusOnOriginXZ: scala.Boolean,
    onAnimationEnd: Nullable[js.Function0[scala.Unit]]
  ): scala.Unit = js.native
  /**
    * Targets the given mesh with its children and updates zoom level accordingly.
    * @param mesh  The mesh to target.
    * @param radius Optional. If a cached radius position already exists, overrides default.
    * @param framingPositionY Position on mesh to center camera focus where 0 corresponds bottom of its bounding box and 1, the top
    * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
    * @param onAnimationEnd Callback triggered at the end of the framing animation
    */
  def zoomOnMeshHierarchy(mesh: AbstractMesh): scala.Unit = js.native
  def zoomOnMeshHierarchy(mesh: AbstractMesh, focusOnOriginXZ: scala.Boolean): scala.Unit = js.native
  def zoomOnMeshHierarchy(
    mesh: AbstractMesh,
    focusOnOriginXZ: scala.Boolean,
    onAnimationEnd: Nullable[js.Function0[scala.Unit]]
  ): scala.Unit = js.native
  /**
    * Targets the given meshes with their children and updates zoom level accordingly.
    * @param meshes  The mesh to target.
    * @param radius Optional. If a cached radius position already exists, overrides default.
    * @param framingPositionY Position on mesh to center camera focus where 0 corresponds bottom of its bounding box and 1, the top
    * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
    * @param onAnimationEnd Callback triggered at the end of the framing animation
    */
  def zoomOnMeshesHierarchy(meshes: js.Array[AbstractMesh]): scala.Unit = js.native
  def zoomOnMeshesHierarchy(meshes: js.Array[AbstractMesh], focusOnOriginXZ: scala.Boolean): scala.Unit = js.native
  def zoomOnMeshesHierarchy(
    meshes: js.Array[AbstractMesh],
    focusOnOriginXZ: scala.Boolean,
    onAnimationEnd: Nullable[js.Function0[scala.Unit]]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.FramingBehavior")
@js.native
object FramingBehavior extends js.Object {
  /**
    * The easing function used by animations
    */
  var EasingFunction: babylonjsLib.BABYLONNs.ExponentialEase = js.native
  /**
    * The easing mode used by animations
    */
  var EasingMode: scala.Double = js.native
  /**
    * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
    */
  var FitFrustumSidesMode: scala.Double = js.native
  /**
    * The camera can move all the way towards the mesh.
    */
  var IgnoreBoundsSizeMode: scala.Double = js.native
}

