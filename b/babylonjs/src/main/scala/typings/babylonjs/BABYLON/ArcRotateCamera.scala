package typings.babylonjs.BABYLON

import typings.babylonjs.AnonDistanceMax
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ArcRotateCamera")
@js.native
class ArcRotateCamera protected () extends TargetCamera {
  /**
    * Instantiates a new ArcRotateCamera in a given scene
    * @param name Defines the name of the camera
    * @param alpha Defines the camera rotation along the logitudinal axis
    * @param beta Defines the camera rotation along the latitudinal axis
    * @param radius Defines the camera distance from its target
    * @param target Defines the camera target
    * @param scene Defines the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
    */
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3, scene: Scene) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: Vector3,
    scene: Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
  var _YToUpMatrix: Matrix = js.native
  var _autoRotationBehavior: js.Any = js.native
  var _bouncingBehavior: js.Any = js.native
  var _collider: Collider = js.native
  var _collisionTriggered: Boolean = js.native
  var _collisionVelocity: Vector3 = js.native
  var _computationVector: js.Any = js.native
  var _framingBehavior: js.Any = js.native
  var _localDirection: Vector3 = js.native
  var _newPosition: Vector3 = js.native
  /** @hidden */
  var _panningMouseButton: Double = js.native
  var _previousAlpha: Double = js.native
  var _previousBeta: Double = js.native
  var _previousPosition: Vector3 = js.native
  var _previousRadius: Double = js.native
  var _storedAlpha: js.Any = js.native
  var _storedBeta: js.Any = js.native
  var _storedRadius: js.Any = js.native
  var _storedTarget: js.Any = js.native
  var _storedTargetScreenOffset: js.Any = js.native
  var _target: Vector3 = js.native
  var _targetBoundingCenter: Nullable[Vector3] = js.native
  var _targetHost: Nullable[AbstractMesh] = js.native
  var _transformedDirection: Vector3 = js.native
  var _upToYMatrix: Matrix = js.native
  var _upVector: Vector3 = js.native
  /** @hidden */
  var _useCtrlForPanning: Boolean = js.native
  /**
    * Allows the camera to be completely reversed.
    * If false the camera can not arrive upside down.
    */
  var allowUpsideDown: Boolean = js.native
  /**
    * Defines the rotation angle of the camera along the longitudinal axis.
    */
  var alpha: Double = js.native
  /**
    * Defines the rotation angle of the camera along the latitudinal axis.
    */
  var beta: Double = js.native
  /**
    * Defines whether the camera should check collision with the objects oh the scene.
    * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity#how-can-i-do-this
    */
  var checkCollisions: Boolean = js.native
  /**
    * Defines the collision radius of the camera.
    * This simulates a sphere around the camera.
    * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity#arcrotatecamera
    */
  var collisionRadius: Vector3 = js.native
  /**
    * Current inertia value on the longitudinal axis.
    * The bigger this number the longer it will take for the camera to stop.
    */
  var inertialAlphaOffset: Double = js.native
  /**
    * Current inertia value on the latitudinal axis.
    * The bigger this number the longer it will take for the camera to stop.
    */
  var inertialBetaOffset: Double = js.native
  /**
    * Defines the current inertia value used during panning of the camera along the X axis.
    */
  var inertialPanningX: Double = js.native
  /**
    * Defines the current inertia value used during panning of the camera along the Y axis.
    */
  var inertialPanningY: Double = js.native
  /**
    * Current inertia value on the radius axis.
    * The bigger this number the longer it will take for the camera to stop.
    */
  var inertialRadiusOffset: Double = js.native
  /**
    * Defines the input associated to the camera.
    */
  @JSName("inputs")
  var inputs_ArcRotateCamera: ArcRotateCameraInputsManager = js.native
  /**
    * Minimum allowed angle on the longitudinal axis.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var lowerAlphaLimit: Nullable[Double] = js.native
  /**
    * Minimum allowed angle on the latitudinal axis.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var lowerBetaLimit: Double = js.native
  /**
    * Minimum allowed distance of the camera to the target (The camera can not get closer).
    * This can help limiting how the Camera is able to move in the scene.
    */
  var lowerRadiusLimit: Nullable[Double] = js.native
  /**
    * Observable triggered when the mesh target has been changed on the camera.
    */
  var onMeshTargetChangedObservable: Observable[Nullable[AbstractMesh]] = js.native
  /**
    * Defines the allowed panning axis.
    */
  var panningAxis: Vector3 = js.native
  /**
    * Defines the maximum distance the camera can pan.
    * This could help keeping the cammera always in your scene.
    */
  var panningDistanceLimit: Nullable[Double] = js.native
  /**
    * Defines the value of the inertia used during panning.
    * 0 would mean stop inertia and one would mean no decelleration at all.
    */
  var panningInertia: Double = js.native
  /**
    * Defines the target of the camera before paning.
    */
  var panningOriginTarget: Vector3 = js.native
  /**
    * Defines the distance used to consider the camera in pan mode vs pinch/zoom.
    * Basically if your fingers moves away from more than this distance you will be considered
    * in pinch mode.
    */
  var pinchToPanMaxDistance: Double = js.native
  /**
    * Defines the radius of the camera from it s target point.
    */
  var radius: Double = js.native
  /**
    * Defines a screen offset for the camera position.
    */
  var targetScreenOffset: Vector2 = js.native
  /**
    * Maximum allowed angle on the longitudinal axis.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var upperAlphaLimit: Nullable[Double] = js.native
  /**
    * Maximum allowed angle on the latitudinal axis.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var upperBetaLimit: Double = js.native
  /**
    * Maximum allowed distance of the camera to the target (The camera can not get further).
    * This can help limiting how the Camera is able to move in the scene.
    */
  var upperRadiusLimit: Nullable[Double] = js.native
  /**
    * Define if double tap/click is used to restore the previously saved state of the camera.
    */
  var useInputToRestoreState: Boolean = js.native
  /**
    * Defines how much the radius should be scaled while zomming on a particular mesh (through the zoomOn function)
    */
  var zoomOnFactor: Double = js.native
  /* protected */ def _checkLimits(): Unit = js.native
  /* protected */ def _getTargetPosition(): Vector3 = js.native
  /* protected */ def _onCollisionPositionChange(collisionId: Double, newPosition: Vector3): Unit = js.native
  /* protected */ def _onCollisionPositionChange(collisionId: Double, newPosition: Vector3, collidedMesh: Nullable[AbstractMesh]): Unit = js.native
  /**
    * Gets or Set the pointer angular sensibility  along the X axis or how fast is the camera rotating.
    */
  def angularSensibilityX(): Double = js.native
  def angularSensibilityX(value: Double): js.Any = js.native
  /**
    * Gets or Set the pointer angular sensibility along the Y axis or how fast is the camera rotating.
    */
  def angularSensibilityY(): Double = js.native
  def angularSensibilityY(value: Double): js.Any = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean, useCtrlForPanning: Boolean): Unit = js.native
  def attachControl(
    element: HTMLElement,
    noPreventDefault: Boolean,
    useCtrlForPanning: Boolean,
    panningMouseButton: Double
  ): Unit = js.native
  /**
    * Gets the auto rotation behavior of the camera if it has been enabled.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#autorotation-behavior
    */
  def autoRotationBehavior(): Nullable[AutoRotationBehavior] = js.native
  /**
    * Gets the bouncing behavior of the camera if it has been enabled.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#bouncing-behavior
    */
  def bouncingBehavior(): Nullable[BouncingBehavior] = js.native
  /**
    * Focus on a mesh or a bounding box. This adapts the target and maxRadius if necessary but does not update the current radius.
    * The target will be changed but the radius
    * @param meshesOrMinMaxVectorAndDistance Defines the mesh or bounding info to focus on
    * @param doNotUpdateMaxZ Defines whether or not maxZ should be updated whilst zooming on the mesh (this can happen if the mesh is big and the maxradius pretty small for instance)
    */
  def focusOn(meshesOrMinMaxVectorAndDistance: js.Array[AbstractMesh]): Unit = js.native
  def focusOn(meshesOrMinMaxVectorAndDistance: js.Array[AbstractMesh], doNotUpdateMaxZ: Boolean): Unit = js.native
  def focusOn(meshesOrMinMaxVectorAndDistance: AnonDistanceMax): Unit = js.native
  def focusOn(meshesOrMinMaxVectorAndDistance: AnonDistanceMax, doNotUpdateMaxZ: Boolean): Unit = js.native
  /**
    * Gets the framing behavior of the camera if it has been enabled.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#framing-behavior
    */
  def framingBehavior(): Nullable[FramingBehavior] = js.native
  /**
    * Gets or Set the list of keyboard keys used to control beta angle in a negative direction.
    */
  def keysDown(): js.Array[Double] = js.native
  def keysDown(value: js.Array[Double]): js.Any = js.native
  /**
    * Gets or Set the list of keyboard keys used to control alpha angle in a negative direction.
    */
  def keysLeft(): js.Array[Double] = js.native
  def keysLeft(value: js.Array[Double]): js.Any = js.native
  /**
    * Gets or Set the list of keyboard keys used to control alpha angle in a positive direction.
    */
  def keysRight(): js.Array[Double] = js.native
  def keysRight(value: js.Array[Double]): js.Any = js.native
  /**
    * Gets or Set the list of keyboard keys used to control beta angle in a positive direction.
    */
  def keysUp(): js.Array[Double] = js.native
  def keysUp(value: js.Array[Double]): js.Any = js.native
  /**
    * Event raised when the camera is colliding with a mesh.
    */
  def onCollide(collidedMesh: AbstractMesh): Unit = js.native
  /**
    * Gets or Set the pointer panning sensibility or how fast is the camera moving.
    */
  def panningSensibility(): Double = js.native
  def panningSensibility(value: Double): js.Any = js.native
  /**
    * Gets or Set the pointer pinch delta percentage or how fast is the camera zooming.
    * It will be used instead of pinchDeltaPrecision if different from 0.
    * It defines the percentage of current camera.radius to use as delta when pinch zoom is used.
    */
  def pinchDeltaPercentage(): Double = js.native
  def pinchDeltaPercentage(value: Double): js.Any = js.native
  /**
    * Gets or Set the pointer pinch precision or how fast is the camera zooming.
    */
  def pinchPrecision(): Double = js.native
  def pinchPrecision(value: Double): js.Any = js.native
  /**
    * Rebuilds angles (alpha, beta) and radius from the give position and target
    */
  def rebuildAnglesAndRadius(): Unit = js.native
  /**
    * Sets the Y-up to camera up-vector rotation matrix, and the up-vector to Y-up rotation matrix.
    */
  def setMatUp(): Unit = js.native
  /**
    * Use a position to define the current camera related information like alpha, beta and radius
    * @param position Defines the position to set the camera at
    */
  def setPosition(position: Vector3): Unit = js.native
  /**
    * Defines the target the camera should look at.
    * This will automatically adapt alpha beta and radius to fit within the new target.
    * @param target Defines the new target as a Vector or a mesh
    * @param toBoundingCenter In case of a mesh target, defines whether to target the mesh position or its bounding information center
    * @param allowSamePosition If false, prevents reapplying the new computed position if it is identical to the current one (optim)
    */
  def setTarget(target: AbstractMesh): Unit = js.native
  def setTarget(target: AbstractMesh, toBoundingCenter: Boolean): Unit = js.native
  def setTarget(target: AbstractMesh, toBoundingCenter: Boolean, allowSamePosition: Boolean): Unit = js.native
  def setTarget(target: Vector3, toBoundingCenter: Boolean): Unit = js.native
  def setTarget(target: Vector3, toBoundingCenter: Boolean, allowSamePosition: Boolean): Unit = js.native
  /**
    * Defines the target point of the camera.
    * The camera looks towards it form the radius distance.
    */
  def target(): Vector3 = js.native
  def target(value: Vector3): js.Any = js.native
  @JSName("upVector")
  def upVector_MArcRotateCamera(): Vector3 = js.native
  /**
    * The vector the camera should consider as up. (default is Vector3(0, 1, 0) as returned by Vector3.Up())
    * Setting this will copy the given vector to the camera's upVector, and set rotation matrices to and from Y up.
    * DO NOT set the up vector using copyFrom or copyFromFloats, as this bypasses setting the above matrices.
    */
  @JSName("upVector")
  def upVector_MArcRotateCamera(vec: Vector3): js.Any = js.native
  /**
    * Defines if the auto rotation behavior of the camera is enabled on the camera.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#autorotation-behavior
    */
  def useAutoRotationBehavior(): Boolean = js.native
  def useAutoRotationBehavior(value: Boolean): js.Any = js.native
  /**
    * Defines if the bouncing behavior of the camera is enabled on the camera.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#bouncing-behavior
    */
  def useBouncingBehavior(): Boolean = js.native
  def useBouncingBehavior(value: Boolean): js.Any = js.native
  /**
    * Defines if the framing behavior of the camera is enabled on the camera.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#framing-behavior
    */
  def useFramingBehavior(): Boolean = js.native
  def useFramingBehavior(value: Boolean): js.Any = js.native
  /**
    * Gets or Set the pointer use natural pinch zoom to override the pinch precision
    * and pinch delta percentage.
    * When useNaturalPinchZoom is true, multi touch zoom will zoom in such
    * that any object in the plane at the camera's target point will scale
    * perfectly with finger motion.
    */
  def useNaturalPinchZoom(): Boolean = js.native
  def useNaturalPinchZoom(value: Boolean): js.Any = js.native
  /**
    * Gets or Set the mouse wheel delta percentage or how fast is the camera zooming.
    * It will be used instead of pinchDeltaPrecision if different from 0.
    * It defines the percentage of current camera.radius to use as delta when pinch zoom is used.
    */
  def wheelDeltaPercentage(): Double = js.native
  def wheelDeltaPercentage(value: Double): js.Any = js.native
  /**
    * Gets or Set the mouse wheel precision or how fast is the camera zooming.
    */
  def wheelPrecision(): Double = js.native
  def wheelPrecision(value: Double): js.Any = js.native
  /**
    * Zooms on a mesh to be at the min distance where we could see it fully in the current viewport.
    * @param meshes Defines the mesh to zoom on
    * @param doNotUpdateMaxZ Defines whether or not maxZ should be updated whilst zooming on the mesh (this can happen if the mesh is big and the maxradius pretty small for instance)
    */
  def zoomOn(): Unit = js.native
  def zoomOn(meshes: js.Array[AbstractMesh]): Unit = js.native
  def zoomOn(meshes: js.Array[AbstractMesh], doNotUpdateMaxZ: Boolean): Unit = js.native
}

