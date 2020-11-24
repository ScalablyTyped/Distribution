package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FramingBehavior extends Behavior[ArcRotateCamera] {
  
  var _animatables: js.Any = js.native
  
  /**
    *  Applies any current user interaction to the camera. Takes into account maximum alpha rotation.
    */
  var _applyUserInteraction: js.Any = js.native
  
  var _attachedCamera: js.Any = js.native
  
  var _betaIsAnimating: js.Any = js.native
  
  var _betaTransition: js.Any = js.native
  
  /**
    * Calculates the lowest radius for the camera based on the bounding box of the mesh.
    * @param mesh The mesh on which to base the calculation. mesh boundingInfo used to estimate necessary
    *			  frustum width.
    * @return The minimum distance from the primary mesh's center point at which the camera must be kept in order
    *		 to fully enclose the mesh in the viewing frustum.
    */
  /* protected */ def _calculateLowerRadiusFromModelBoundingSphere(minimumWorld: Vector3, maximumWorld: Vector3): Double = js.native
  
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
  var autoCorrectCameraLimitsAndSensibility: Boolean = js.native
  
  /**
    * Gets the angle above/below the horizontal plane to return to when the return to default elevation idle
    * behaviour is triggered, in radians.
    */
  def defaultElevation: Double = js.native
  /**
    * Sets the angle above/below the horizontal plane to return to when the return to default elevation idle
    * behaviour is triggered, in radians.
    */
  def defaultElevation_=(elevation: Double): Unit = js.native
  
  /**
    * Gets the time (in milliseconds) taken to return to the default beta position.
    * Negative value indicates camera should not return to default.
    */
  def elevationReturnTime: Double = js.native
  /**
    * Sets the time (in milliseconds) taken to return to the default beta position.
    * Negative value indicates camera should not return to default.
    */
  def elevationReturnTime_=(speed: Double): Unit = js.native
  
  /**
    * Gets the delay (in milliseconds) taken before the camera returns to the default beta position.
    */
  def elevationReturnWaitTime: Double = js.native
  /**
    * Sets the delay (in milliseconds) taken before the camera returns to the default beta position.
    */
  def elevationReturnWaitTime_=(time: Double): Unit = js.native
  
  /**
    * Gets the transition time when framing the mesh, in milliseconds
    */
  def framingTime: Double = js.native
  /**
    * Sets the transition time when framing the mesh, in milliseconds
    */
  def framingTime_=(time: Double): Unit = js.native
  
  /**
    * Gets a value indicating if the user is moving the camera
    */
  def isUserIsMoving: Boolean = js.native
  
  /**
    * Gets current mode used by the behavior.
    */
  def mode: Double = js.native
  /**
    * Sets the current mode used by the behavior
    */
  def mode_=(mode: Double): Unit = js.native
  
  /**
    * Gets the name of the behavior.
    */
  @JSName("name")
  def name_MFramingBehavior: String = js.native
  
  /**
    * Gets the scale to apply on Y axis to position camera focus. 0.5 by default which means the center of the bounding box.
    */
  def positionScale: Double = js.native
  /**
    * Sets the scale to apply on Y axis to position camera focus. 0.5 by default which means the center of the bounding box.
    */
  def positionScale_=(scale: Double): Unit = js.native
  
  /**
    * Gets the scale applied to the radius
    */
  def radiusScale: Double = js.native
  /**
    * Sets the scale applied to the radius (1 by default)
    */
  def radiusScale_=(radius: Double): Unit = js.native
  
  /**
    * Stops and removes all animations that have been applied to the camera
    */
  def stopAllAnimations(): Unit = js.native
  
  /**
    * Targets the bounding box info defined by its extends and updates zoom level accordingly.
    * @param minimumWorld Determines the smaller position of the bounding box extend
    * @param maximumWorld Determines the bigger position of the bounding box extend
    * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
    * @param onAnimationEnd Callback triggered at the end of the framing animation
    */
  def zoomOnBoundingInfo(minimumWorld: Vector3, maximumWorld: Vector3): Unit = js.native
  def zoomOnBoundingInfo(
    minimumWorld: Vector3,
    maximumWorld: Vector3,
    focusOnOriginXZ: js.UndefOr[scala.Nothing],
    onAnimationEnd: Nullable[js.Function0[Unit]]
  ): Unit = js.native
  def zoomOnBoundingInfo(minimumWorld: Vector3, maximumWorld: Vector3, focusOnOriginXZ: Boolean): Unit = js.native
  def zoomOnBoundingInfo(
    minimumWorld: Vector3,
    maximumWorld: Vector3,
    focusOnOriginXZ: Boolean,
    onAnimationEnd: Nullable[js.Function0[Unit]]
  ): Unit = js.native
  
  /**
    * Targets the given mesh and updates zoom level accordingly.
    * @param mesh  The mesh to target.
    * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
    * @param onAnimationEnd Callback triggered at the end of the framing animation
    */
  def zoomOnMesh(mesh: AbstractMesh): Unit = js.native
  def zoomOnMesh(
    mesh: AbstractMesh,
    focusOnOriginXZ: js.UndefOr[scala.Nothing],
    onAnimationEnd: Nullable[js.Function0[Unit]]
  ): Unit = js.native
  def zoomOnMesh(mesh: AbstractMesh, focusOnOriginXZ: Boolean): Unit = js.native
  def zoomOnMesh(mesh: AbstractMesh, focusOnOriginXZ: Boolean, onAnimationEnd: Nullable[js.Function0[Unit]]): Unit = js.native
  
  /**
    * Targets the given mesh with its children and updates zoom level accordingly.
    * @param mesh  The mesh to target.
    * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
    * @param onAnimationEnd Callback triggered at the end of the framing animation
    */
  def zoomOnMeshHierarchy(mesh: AbstractMesh): Unit = js.native
  def zoomOnMeshHierarchy(
    mesh: AbstractMesh,
    focusOnOriginXZ: js.UndefOr[scala.Nothing],
    onAnimationEnd: Nullable[js.Function0[Unit]]
  ): Unit = js.native
  def zoomOnMeshHierarchy(mesh: AbstractMesh, focusOnOriginXZ: Boolean): Unit = js.native
  def zoomOnMeshHierarchy(mesh: AbstractMesh, focusOnOriginXZ: Boolean, onAnimationEnd: Nullable[js.Function0[Unit]]): Unit = js.native
  
  /**
    * Targets the given meshes with their children and updates zoom level accordingly.
    * @param meshes  The mesh to target.
    * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
    * @param onAnimationEnd Callback triggered at the end of the framing animation
    */
  def zoomOnMeshesHierarchy(meshes: js.Array[AbstractMesh]): Unit = js.native
  def zoomOnMeshesHierarchy(
    meshes: js.Array[AbstractMesh],
    focusOnOriginXZ: js.UndefOr[scala.Nothing],
    onAnimationEnd: Nullable[js.Function0[Unit]]
  ): Unit = js.native
  def zoomOnMeshesHierarchy(meshes: js.Array[AbstractMesh], focusOnOriginXZ: Boolean): Unit = js.native
  def zoomOnMeshesHierarchy(
    meshes: js.Array[AbstractMesh],
    focusOnOriginXZ: Boolean,
    onAnimationEnd: Nullable[js.Function0[Unit]]
  ): Unit = js.native
  
  /**
    * Gets the flag that indicates if user zooming should stop animation.
    */
  def zoomStopsAnimation: Boolean = js.native
  /**
    * Sets the flag that indicates if user zooming should stop animation.
    */
  def zoomStopsAnimation_=(flag: Boolean): Unit = js.native
}
