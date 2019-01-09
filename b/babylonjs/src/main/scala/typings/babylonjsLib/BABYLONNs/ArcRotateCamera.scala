package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents an orbital type of camera.
  *
  * This camera always points towards a given target position and can be rotated around that target with the target as the centre of rotation. It can be controlled with cursors and mouse, or with touch events.
  * Think of this camera as one orbiting its target position, or more imaginatively as a spy satellite orbiting the earth. Its position relative to the target (earth) can be set by three parameters, alpha (radians) the longitudinal rotation, beta (radians) the latitudinal rotation and radius the distance from the target position.
  * @see http://doc.babylonjs.com/babylon101/cameras#arc-rotate-camera
  */
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
  def this(name: java.lang.String, alpha: scala.Double, beta: scala.Double, radius: scala.Double, target: Vector3, scene: Scene) = this()
  def this(name: java.lang.String, alpha: scala.Double, beta: scala.Double, radius: scala.Double, target: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: scala.Boolean) = this()
  var _autoRotationBehavior: js.Any = js.native
  var _bouncingBehavior: js.Any = js.native
  var _collider: Collider = js.native
  var _collisionTriggered: scala.Boolean = js.native
  var _collisionVelocity: Vector3 = js.native
  var _computationVector: js.Any = js.native
  var _framingBehavior: js.Any = js.native
  var _localDirection: Vector3 = js.native
  var _newPosition: Vector3 = js.native
  /** @hidden */
  var _panningMouseButton: scala.Double = js.native
  var _previousAlpha: scala.Double = js.native
  var _previousBeta: scala.Double = js.native
  var _previousPosition: Vector3 = js.native
  var _previousRadius: scala.Double = js.native
  var _storedAlpha: js.Any = js.native
  var _storedBeta: js.Any = js.native
  var _storedRadius: js.Any = js.native
  var _storedTarget: js.Any = js.native
  var _target: Vector3 = js.native
  var _targetBoundingCenter: Nullable[Vector3] = js.native
  var _targetHost: Nullable[AbstractMesh] = js.native
  var _transformedDirection: Vector3 = js.native
  /** @hidden */
  var _useCtrlForPanning: scala.Boolean = js.native
  /**
    * Allows the camera to be completely reversed.
    * If false the camera can not arrive upside down.
    */
  var allowUpsideDown: scala.Boolean = js.native
  /**
    * Defines the rotation angle of the camera along the longitudinal axis.
    */
  var alpha: scala.Double = js.native
  /**
    * Gets or Set the pointer angular sensibility  along the X axis or how fast is the camera rotating.
    */
  var angularSensibilityX: scala.Double = js.native
  /**
    * Gets or Set the pointer angular sensibility along the Y axis or how fast is the camera rotating.
    */
  var angularSensibilityY: scala.Double = js.native
  /**
    * Gets the auto rotation behavior of the camera if it has been enabled.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#autorotation-behavior
    */
  val autoRotationBehavior: Nullable[AutoRotationBehavior] = js.native
  /**
    * Defines the rotation angle of the camera along the latitudinal axis.
    */
  var beta: scala.Double = js.native
  /**
    * Gets the bouncing behavior of the camera if it has been enabled.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#bouncing-behavior
    */
  val bouncingBehavior: Nullable[BouncingBehavior] = js.native
  /**
    * Defines whether the camera should check collision with the objects oh the scene.
    * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity#how-can-i-do-this
    */
  var checkCollisions: scala.Boolean = js.native
  /**
    * Defines the collision radius of the camera.
    * This simulates a sphere around the camera.
    * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity#arcrotatecamera
    */
  var collisionRadius: Vector3 = js.native
  /**
    * Gets the framing behavior of the camera if it has been enabled.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#framing-behavior
    */
  val framingBehavior: Nullable[FramingBehavior] = js.native
  /**
    * Current inertia value on the longitudinal axis.
    * The bigger this number the longer it will take for the camera to stop.
    */
  var inertialAlphaOffset: scala.Double = js.native
  /**
    * Current inertia value on the latitudinal axis.
    * The bigger this number the longer it will take for the camera to stop.
    */
  var inertialBetaOffset: scala.Double = js.native
  /**
    * Defines the current inertia value used during panning of the camera along the X axis.
    */
  var inertialPanningX: scala.Double = js.native
  /**
    * Defines the current inertia value used during panning of the camera along the Y axis.
    */
  var inertialPanningY: scala.Double = js.native
  /**
    * Current inertia value on the radius axis.
    * The bigger this number the longer it will take for the camera to stop.
    */
  var inertialRadiusOffset: scala.Double = js.native
  /**
    * Defines the inpute associated to the camera.
    */
  @JSName("inputs")
  var inputs_ArcRotateCamera: ArcRotateCameraInputsManager = js.native
  /**
    * Gets or Set the list of keyboard keys used to control beta angle in a negative direction.
    */
  var keysDown: js.Array[scala.Double] = js.native
  /**
    * Gets or Set the list of keyboard keys used to control alpha angle in a negative direction.
    */
  var keysLeft: js.Array[scala.Double] = js.native
  /**
    * Gets or Set the list of keyboard keys used to control alpha angle in a positive direction.
    */
  var keysRight: js.Array[scala.Double] = js.native
  /**
    * Gets or Set the list of keyboard keys used to control beta angle in a positive direction.
    */
  var keysUp: js.Array[scala.Double] = js.native
  /**
    * Minimum allowed angle on the longitudinal axis.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var lowerAlphaLimit: Nullable[scala.Double] = js.native
  /**
    * Minimum allowed angle on the latitudinal axis.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var lowerBetaLimit: scala.Double = js.native
  /**
    * Minimum allowed distance of the camera to the target (The camera can not get closer).
    * This can help limiting how the Camera is able to move in the scene.
    */
  var lowerRadiusLimit: Nullable[scala.Double] = js.native
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
  var panningDistanceLimit: Nullable[scala.Double] = js.native
  /**
    * Defines the value of the inertia used during panning.
    * 0 would mean stop inertia and one would mean no decelleration at all.
    */
  var panningInertia: scala.Double = js.native
  /**
    * Defines the target of the camera before paning.
    */
  var panningOriginTarget: Vector3 = js.native
  /**
    * Gets or Set the pointer panning sensibility or how fast is the camera moving.
    */
  var panningSensibility: scala.Double = js.native
  /**
    * Gets or Set the pointer pinch delta percentage or how fast is the camera zooming.
    * It will be used instead of pinchDeltaPrecision if different from 0.
    * It defines the percentage of current camera.radius to use as delta when pinch zoom is used.
    */
  var pinchDeltaPercentage: scala.Double = js.native
  /**
    * Gets or Set the pointer pinch precision or how fast is the camera zooming.
    */
  var pinchPrecision: scala.Double = js.native
  /**
    * Defines the distance used to consider the camera in pan mode vs pinch/zoom.
    * Basically if your fingers moves away from more than this distance you will be considered
    * in pinch mode.
    */
  var pinchToPanMaxDistance: scala.Double = js.native
  /**
    * Defines the radius of the camera from it s target point.
    */
  var radius: scala.Double = js.native
  /**
    * Defines the target point of the camera.
    * The camera looks towards it form the radius distance.
    */
  var target: Vector3 = js.native
  /**
    * Defines a screen offset for the camera position.
    */
  var targetScreenOffset: Vector2 = js.native
  /**
    * Maximum allowed angle on the longitudinal axis.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var upperAlphaLimit: Nullable[scala.Double] = js.native
  /**
    * Maximum allowed angle on the latitudinal axis.
    * This can help limiting how the Camera is able to move in the scene.
    */
  var upperBetaLimit: scala.Double = js.native
  /**
    * Maximum allowed distance of the camera to the target (The camera can not get further).
    * This can help limiting how the Camera is able to move in the scene.
    */
  var upperRadiusLimit: Nullable[scala.Double] = js.native
  /**
    * Defines if the auto rotation behavior of the camera is enabled on the camera.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#autorotation-behavior
    */
  var useAutoRotationBehavior: scala.Boolean = js.native
  /**
    * Defines if the bouncing behavior of the camera is enabled on the camera.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#bouncing-behavior
    */
  var useBouncingBehavior: scala.Boolean = js.native
  /**
    * Defines if the framing behavior of the camera is enabled on the camera.
    * @see http://doc.babylonjs.com/how_to/camera_behaviors#framing-behavior
    */
  var useFramingBehavior: scala.Boolean = js.native
  /**
    * Define if double tap/click is used to restore the previously saved state of the camera.
    */
  var useInputToRestoreState: scala.Boolean = js.native
  /**
    * Gets or Set the mouse wheel delta percentage or how fast is the camera zooming.
    * It will be used instead of pinchDeltaPrecision if different from 0.
    * It defines the percentage of current camera.radius to use as delta when pinch zoom is used.
    */
  var wheelDeltaPercentage: scala.Double = js.native
  /**
    * Gets or Set the mouse wheel precision or how fast is the camera zooming.
    */
  var wheelPrecision: scala.Double = js.native
  /**
    * Defines how much the radius should be scaled while zomming on a particular mesh (through the zoomOn function)
    */
  var zoomOnFactor: scala.Double = js.native
  /* protected */ def _checkLimits(): scala.Unit = js.native
  /* protected */ def _getTargetPosition(): Vector3 = js.native
  /* protected */ def _onCollisionPositionChange(collisionId: scala.Double, newPosition: Vector3): scala.Unit = js.native
  /* protected */ def _onCollisionPositionChange(collisionId: scala.Double, newPosition: Vector3, collidedMesh: Nullable[AbstractMesh]): scala.Unit = js.native
  def attachControl(element: stdLib.HTMLElement, noPreventDefault: scala.Boolean, useCtrlForPanning: scala.Boolean): scala.Unit = js.native
  def attachControl(
    element: stdLib.HTMLElement,
    noPreventDefault: scala.Boolean,
    useCtrlForPanning: scala.Boolean,
    panningMouseButton: scala.Double
  ): scala.Unit = js.native
  def focusOn(meshesOrMinMaxVectorAndDistance: babylonjsLib.Anon_DistanceMax): scala.Unit = js.native
  def focusOn(meshesOrMinMaxVectorAndDistance: babylonjsLib.Anon_DistanceMax, doNotUpdateMaxZ: scala.Boolean): scala.Unit = js.native
  /**
    * Focus on a mesh or a bounding box. This adapts the target and maxRadius if necessary but does not update the current radius.
    * The target will be changed but the radius
    * @param meshesOrMinMaxVectorAndDistance Defines the mesh or bounding info to focus on
    * @param doNotUpdateMaxZ Defines whether or not maxZ should be updated whilst zooming on the mesh (this can happen if the mesh is big and the maxradius pretty small for instance)
    */
  def focusOn(meshesOrMinMaxVectorAndDistance: js.Array[AbstractMesh]): scala.Unit = js.native
  def focusOn(meshesOrMinMaxVectorAndDistance: js.Array[AbstractMesh], doNotUpdateMaxZ: scala.Boolean): scala.Unit = js.native
  /**
    * Event raised when the camera is colliding with a mesh.
    */
  def onCollide(collidedMesh: AbstractMesh): scala.Unit = js.native
  /**
    * Rebuilds angles (alpha, beta) and radius from the give position and target.
    */
  def rebuildAnglesAndRadius(): scala.Unit = js.native
  /**
    * Use a position to define the current camera related information like aplha, beta and radius
    * @param position Defines the position to set the camera at
    */
  def setPosition(position: Vector3): scala.Unit = js.native
  /**
    * Defines the target the camera should look at.
    * This will automatically adapt alpha beta and radius to fit within the new target.
    * @param target Defines the new target as a Vector or a mesh
    * @param toBoundingCenter In case of a mesh target, defines wether to target the mesh position or its bounding information center
    * @param allowSamePosition If false, prevents reapplying the new computed position if it is identical to the current one (optim)
    */
  def setTarget(target: AbstractMesh): scala.Unit = js.native
  def setTarget(target: AbstractMesh, toBoundingCenter: scala.Boolean): scala.Unit = js.native
  def setTarget(target: AbstractMesh, toBoundingCenter: scala.Boolean, allowSamePosition: scala.Boolean): scala.Unit = js.native
  def setTarget(target: Vector3, toBoundingCenter: scala.Boolean): scala.Unit = js.native
  def setTarget(target: Vector3, toBoundingCenter: scala.Boolean, allowSamePosition: scala.Boolean): scala.Unit = js.native
  /**
    * Zooms on a mesh to be at the min distance where we could see it fully in the current viewport.
    * @param meshes Defines the mesh to zoom on
    * @param doNotUpdateMaxZ Defines whether or not maxZ should be updated whilst zooming on the mesh (this can happen if the mesh is big and the maxradius pretty small for instance)
    */
  def zoomOn(): scala.Unit = js.native
  def zoomOn(meshes: js.Array[AbstractMesh]): scala.Unit = js.native
  def zoomOn(meshes: js.Array[AbstractMesh], doNotUpdateMaxZ: scala.Boolean): scala.Unit = js.native
}

