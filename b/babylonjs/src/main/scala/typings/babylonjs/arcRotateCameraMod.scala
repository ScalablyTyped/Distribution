package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Distance
import typings.babylonjs.arcRotateCameraInputsManagerMod.ArcRotateCameraInputsManager
import typings.babylonjs.autoRotationBehaviorMod.AutoRotationBehavior
import typings.babylonjs.bouncingBehaviorMod.BouncingBehavior
import typings.babylonjs.colliderMod.Collider
import typings.babylonjs.framingBehaviorMod.FramingBehavior
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.targetCameraMod.TargetCamera
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcRotateCameraMod {
  
  @JSImport("babylonjs/Cameras/arcRotateCamera", "ArcRotateCamera")
  @js.native
  open class ArcRotateCamera protected () extends TargetCamera {
    /**
      * Instantiates a new ArcRotateCamera in a given scene
      * @param name Defines the name of the camera
      * @param alpha Defines the camera rotation along the longitudinal axis
      * @param beta Defines the camera rotation along the latitudinal axis
      * @param radius Defines the camera distance from its target
      * @param target Defines the camera target
      * @param scene Defines the scene the camera belongs to
      * @param setActiveOnSceneIfNoneActive Defines whether the camera should be marked as active if not other active cameras have been defined
      */
    def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3) = this()
    def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3, scene: Scene) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Unit,
      setActiveOnSceneIfNoneActive: Boolean
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Scene,
      setActiveOnSceneIfNoneActive: Boolean
    ) = this()
    
    /* private */ var _autoRotationBehavior: Any = js.native
    
    /* private */ var _bouncingBehavior: Any = js.native
    
    /* protected */ def _checkLimits(): Unit = js.native
    
    /* protected */ var _collider: Collider = js.native
    
    /* protected */ var _collisionTriggered: Boolean = js.native
    
    /* protected */ var _collisionVelocity: Vector3 = js.native
    
    /* private */ var _computationVector: Any = js.native
    
    /* private */ var _framingBehavior: Any = js.native
    
    /* protected */ def _getTargetPosition(): Vector3 = js.native
    
    /* protected */ var _newPosition: Vector3 = js.native
    
    /* protected */ def _onCollisionPositionChange(collisionId: Double, newPosition: Vector3): Unit = js.native
    /* protected */ def _onCollisionPositionChange(collisionId: Double, newPosition: Vector3, collidedMesh: Nullable[AbstractMesh]): Unit = js.native
    
    /** @hidden */
    var _panningMouseButton: Double = js.native
    
    /* protected */ var _previousAlpha: Double = js.native
    
    /* protected */ var _previousBeta: Double = js.native
    
    /* protected */ var _previousPosition: Vector3 = js.native
    
    /* protected */ var _previousRadius: Double = js.native
    
    /* private */ var _storedAlpha: Any = js.native
    
    /* private */ var _storedBeta: Any = js.native
    
    /* private */ var _storedRadius: Any = js.native
    
    /* private */ var _storedTarget: Any = js.native
    
    /* private */ var _storedTargetScreenOffset: Any = js.native
    
    /* protected */ var _target: Vector3 = js.native
    
    /* protected */ var _targetBoundingCenter: Nullable[Vector3] = js.native
    
    /* protected */ var _targetHost: Nullable[AbstractMesh] = js.native
    
    /* protected */ var _transformedDirection: Vector3 = js.native
    
    /* protected */ var _upToYMatrix: Matrix = js.native
    
    /** @hidden */
    var _useCtrlForPanning: Boolean = js.native
    
    /* protected */ var _yToUpMatrix: Matrix = js.native
    
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
      * Gets or Set the pointer angular sensibility  along the X axis or how fast is the camera rotating.
      */
    def angularSensibilityX: Double = js.native
    def angularSensibilityX_=(value: Double): Unit = js.native
    
    /**
      * Gets or Set the pointer angular sensibility along the Y axis or how fast is the camera rotating.
      */
    def angularSensibilityY: Double = js.native
    def angularSensibilityY_=(value: Double): Unit = js.native
    
    /**
      * Attached controls to the current camera.
      * @param ignored defines an ignored parameter kept for backward compatibility.
      * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
      * @param useCtrlForPanning  Defines whether ctrl is used for panning within the controls
      */
    def attachControl(ignored: Any, noPreventDefault: Boolean, useCtrlForPanning: Boolean): Unit = js.native
    /**
      * Attached controls to the current camera.
      * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
      * @param useCtrlForPanning  Defines whether ctrl is used for panning within the controls
      */
    def attachControl(noPreventDefault: Boolean, useCtrlForPanning: Boolean): Unit = js.native
    /**
      * Attached controls to the current camera.
      * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
      * @param useCtrlForPanning  Defines whether ctrl is used for panning within the controls
      * @param panningMouseButton Defines whether panning is allowed through mouse click button
      */
    def attachControl(noPreventDefault: Boolean, useCtrlForPanning: Boolean, panningMouseButton: Double): Unit = js.native
    
    /**
      * Gets the auto rotation behavior of the camera if it has been enabled.
      * @see https://doc.babylonjs.com/how_to/camera_behaviors#autorotation-behavior
      */
    def autoRotationBehavior: Nullable[AutoRotationBehavior] = js.native
    
    /**
      * Defines the rotation angle of the camera along the latitudinal axis.
      */
    var beta: Double = js.native
    
    /**
      * Gets the bouncing behavior of the camera if it has been enabled.
      * @see https://doc.babylonjs.com/how_to/camera_behaviors#bouncing-behavior
      */
    def bouncingBehavior: Nullable[BouncingBehavior] = js.native
    
    /**
      * Defines whether the camera should check collision with the objects oh the scene.
      * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity#how-can-i-do-this
      */
    var checkCollisions: Boolean = js.native
    
    /**
      * Defines the collision radius of the camera.
      * This simulates a sphere around the camera.
      * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity#arcrotatecamera
      */
    var collisionRadius: Vector3 = js.native
    
    /**
      * Focus on a mesh or a bounding box. This adapts the target and maxRadius if necessary but does not update the current radius.
      * The target will be changed but the radius
      * @param meshesOrMinMaxVectorAndDistance Defines the mesh or bounding info to focus on
      * @param doNotUpdateMaxZ Defines whether or not maxZ should be updated whilst zooming on the mesh (this can happen if the mesh is big and the maxradius pretty small for instance)
      */
    def focusOn(meshesOrMinMaxVectorAndDistance: js.Array[AbstractMesh]): Unit = js.native
    def focusOn(meshesOrMinMaxVectorAndDistance: js.Array[AbstractMesh], doNotUpdateMaxZ: Boolean): Unit = js.native
    def focusOn(meshesOrMinMaxVectorAndDistance: Distance): Unit = js.native
    def focusOn(meshesOrMinMaxVectorAndDistance: Distance, doNotUpdateMaxZ: Boolean): Unit = js.native
    
    /**
      * Gets the framing behavior of the camera if it has been enabled.
      * @see https://doc.babylonjs.com/how_to/camera_behaviors#framing-behavior
      */
    def framingBehavior: Nullable[FramingBehavior] = js.native
    
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
      * Gets or Set the list of keyboard keys used to control beta angle in a negative direction.
      */
    def keysDown: js.Array[Double] = js.native
    def keysDown_=(value: js.Array[Double]): Unit = js.native
    
    /**
      * Gets or Set the list of keyboard keys used to control alpha angle in a negative direction.
      */
    def keysLeft: js.Array[Double] = js.native
    def keysLeft_=(value: js.Array[Double]): Unit = js.native
    
    /**
      * Gets or Set the list of keyboard keys used to control alpha angle in a positive direction.
      */
    def keysRight: js.Array[Double] = js.native
    def keysRight_=(value: js.Array[Double]): Unit = js.native
    
    /**
      * Gets or Set the list of keyboard keys used to control beta angle in a positive direction.
      */
    def keysUp: js.Array[Double] = js.native
    def keysUp_=(value: js.Array[Double]): Unit = js.native
    
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
      * Defines if camera will eliminate transform on y axis.
      */
    var mapPanning: Boolean = js.native
    
    /**
      * Event raised when the camera is colliding with a mesh.
      */
    def onCollide(collidedMesh: AbstractMesh): Unit = js.native
    
    /**
      * Observable triggered when the mesh target has been changed on the camera.
      */
    var onMeshTargetChangedObservable: Observable[Nullable[AbstractMesh]] = js.native
    
    /**
      * Defines an override value to use as the parameter to setTarget.
      * This allows the parameter to be specified when animating the target (e.g. using FramingBehavior).
      */
    var overrideCloneAlphaBetaRadius: Nullable[Boolean] = js.native
    
    /**
      * Defines the allowed panning axis.
      */
    var panningAxis: Vector3 = js.native
    
    /**
      * Defines the maximum distance the camera can pan.
      * This could help keeping the camera always in your scene.
      */
    var panningDistanceLimit: Nullable[Double] = js.native
    
    /**
      * Defines the value of the inertia used during panning.
      * 0 would mean stop inertia and one would mean no deceleration at all.
      */
    var panningInertia: Double = js.native
    
    /**
      * Defines the target of the camera before panning.
      */
    var panningOriginTarget: Vector3 = js.native
    
    /**
      * Gets or Set the pointer panning sensibility or how fast is the camera moving.
      */
    def panningSensibility: Double = js.native
    def panningSensibility_=(value: Double): Unit = js.native
    
    /**
      * Gets or Set the pointer pinch delta percentage or how fast is the camera zooming.
      * It will be used instead of pinchDeltaPrecision if different from 0.
      * It defines the percentage of current camera.radius to use as delta when pinch zoom is used.
      */
    def pinchDeltaPercentage: Double = js.native
    def pinchDeltaPercentage_=(value: Double): Unit = js.native
    
    /**
      * Gets or Set the pointer pinch precision or how fast is the camera zooming.
      */
    def pinchPrecision: Double = js.native
    def pinchPrecision_=(value: Double): Unit = js.native
    
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
      * Please note that setting a target as a mesh will disable panning.
      * @param target Defines the new target as a Vector or a mesh
      * @param toBoundingCenter In case of a mesh target, defines whether to target the mesh position or its bounding information center
      * @param allowSamePosition If false, prevents reapplying the new computed position if it is identical to the current one (optim)
      * @param cloneAlphaBetaRadius If true, replicate the current setup (alpha, beta, radius) on the new target
      */
    def setTarget(target: AbstractMesh): Unit = js.native
    def setTarget(target: AbstractMesh, toBoundingCenter: Boolean): Unit = js.native
    def setTarget(target: AbstractMesh, toBoundingCenter: Boolean, allowSamePosition: Boolean): Unit = js.native
    def setTarget(
      target: AbstractMesh,
      toBoundingCenter: Boolean,
      allowSamePosition: Boolean,
      cloneAlphaBetaRadius: Boolean
    ): Unit = js.native
    def setTarget(
      target: AbstractMesh,
      toBoundingCenter: Boolean,
      allowSamePosition: Unit,
      cloneAlphaBetaRadius: Boolean
    ): Unit = js.native
    def setTarget(target: AbstractMesh, toBoundingCenter: Unit, allowSamePosition: Boolean): Unit = js.native
    def setTarget(
      target: AbstractMesh,
      toBoundingCenter: Unit,
      allowSamePosition: Boolean,
      cloneAlphaBetaRadius: Boolean
    ): Unit = js.native
    def setTarget(
      target: AbstractMesh,
      toBoundingCenter: Unit,
      allowSamePosition: Unit,
      cloneAlphaBetaRadius: Boolean
    ): Unit = js.native
    def setTarget(target: Vector3, toBoundingCenter: Boolean): Unit = js.native
    def setTarget(target: Vector3, toBoundingCenter: Boolean, allowSamePosition: Boolean): Unit = js.native
    def setTarget(
      target: Vector3,
      toBoundingCenter: Boolean,
      allowSamePosition: Boolean,
      cloneAlphaBetaRadius: Boolean
    ): Unit = js.native
    def setTarget(target: Vector3, toBoundingCenter: Boolean, allowSamePosition: Unit, cloneAlphaBetaRadius: Boolean): Unit = js.native
    def setTarget(target: Vector3, toBoundingCenter: Unit, allowSamePosition: Boolean): Unit = js.native
    def setTarget(target: Vector3, toBoundingCenter: Unit, allowSamePosition: Boolean, cloneAlphaBetaRadius: Boolean): Unit = js.native
    def setTarget(target: Vector3, toBoundingCenter: Unit, allowSamePosition: Unit, cloneAlphaBetaRadius: Boolean): Unit = js.native
    
    /**
      * Defines the target mesh of the camera.
      * The camera looks towards it from the radius distance.
      * Please note that setting a target host will disable panning.
      */
    def targetHost: Nullable[AbstractMesh] = js.native
    def targetHost_=(value: Nullable[AbstractMesh]): Unit = js.native
    
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
      * Defines if the auto rotation behavior of the camera is enabled on the camera.
      * @see https://doc.babylonjs.com/how_to/camera_behaviors#autorotation-behavior
      */
    def useAutoRotationBehavior: Boolean = js.native
    def useAutoRotationBehavior_=(value: Boolean): Unit = js.native
    
    /**
      * Defines if the bouncing behavior of the camera is enabled on the camera.
      * @see https://doc.babylonjs.com/how_to/camera_behaviors#bouncing-behavior
      */
    def useBouncingBehavior: Boolean = js.native
    def useBouncingBehavior_=(value: Boolean): Unit = js.native
    
    /**
      * Defines if the framing behavior of the camera is enabled on the camera.
      * @see https://doc.babylonjs.com/how_to/camera_behaviors#framing-behavior
      */
    def useFramingBehavior: Boolean = js.native
    def useFramingBehavior_=(value: Boolean): Unit = js.native
    
    /**
      * Define if double tap/click is used to restore the previously saved state of the camera.
      */
    var useInputToRestoreState: Boolean = js.native
    
    /**
      * Gets or Set the pointer use natural pinch zoom to override the pinch precision
      * and pinch delta percentage.
      * When useNaturalPinchZoom is true, multi touch zoom will zoom in such
      * that any object in the plane at the camera's target point will scale
      * perfectly with finger motion.
      */
    def useNaturalPinchZoom: Boolean = js.native
    def useNaturalPinchZoom_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or Set the mouse wheel delta percentage or how fast is the camera zooming.
      * It will be used instead of pinchDeltaPrecision if different from 0.
      * It defines the percentage of current camera.radius to use as delta when pinch zoom is used.
      */
    def wheelDeltaPercentage: Double = js.native
    def wheelDeltaPercentage_=(value: Double): Unit = js.native
    
    /**
      * Gets or Set the mouse wheel precision or how fast is the camera zooming.
      */
    def wheelPrecision: Double = js.native
    def wheelPrecision_=(value: Double): Unit = js.native
    
    /**
      * Zooms on a mesh to be at the min distance where we could see it fully in the current viewport.
      * @param meshes Defines the mesh to zoom on
      * @param doNotUpdateMaxZ Defines whether or not maxZ should be updated whilst zooming on the mesh (this can happen if the mesh is big and the maxradius pretty small for instance)
      */
    def zoomOn(): Unit = js.native
    def zoomOn(meshes: js.Array[AbstractMesh]): Unit = js.native
    def zoomOn(meshes: js.Array[AbstractMesh], doNotUpdateMaxZ: Boolean): Unit = js.native
    def zoomOn(meshes: Unit, doNotUpdateMaxZ: Boolean): Unit = js.native
    
    /**
      * Defines how much the radius should be scaled while zooming on a particular mesh (through the zoomOn function)
      */
    var zoomOnFactor: Double = js.native
    
    /**
      * Gets or Set the boolean value that controls whether or not the mouse wheel
      * zooms to the location of the mouse pointer or not.  The default is false.
      */
    def zoomToMouseLocation: Boolean = js.native
    def zoomToMouseLocation_=(value: Boolean): Unit = js.native
  }
}
