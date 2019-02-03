package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the base class of all the camera used in the application.
  * @see http://doc.babylonjs.com/features/cameras
  */
@JSGlobal("BABYLON.Camera")
@js.native
class Camera protected () extends Node {
  /**
    * Instantiates a new camera object.
    * This should not be used directly but through the inherited cameras: ArcRotate, Free...
    * @see http://doc.babylonjs.com/features/cameras
    * @param name Defines the name of the camera in the scene
    * @param position Defines the position of the camera
    * @param scene Defines the scene the camera belongs too
    * @param setActiveOnSceneIfNoneActive Defines if the camera should be set as active after creation if no other camera have been defined in the scene
    */
  def this(name: java.lang.String, position: Vector3, scene: Scene) = this()
  def this(name: java.lang.String, position: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: scala.Boolean) = this()
  /** @hidden */
  var _activeMeshes: SmartArray[AbstractMesh] = js.native
  /** @hidden */
  var _alternateCamera: Camera = js.native
  /** @hidden */
  var _cameraRigParams: js.Any = js.native
  var _cascadePostProcessesToRigCams: js.Any = js.native
  var _computedViewMatrix: js.Any = js.native
  var _doNotComputeProjectionMatrix: js.Any = js.native
  var _frustumPlanes: js.Any = js.native
  var _getVRProjectionMatrix: js.Any = js.native
  var _globalPosition: Vector3 = js.native
  /** @hidden */
  var _postProcesses: js.Array[Nullable[PostProcess]] = js.native
  /** @hidden */
  var _projectionMatrix: Matrix = js.native
  var _refreshFrustumPlanes: js.Any = js.native
  /** @hidden */
  var _rigCameras: js.Array[Camera] = js.native
  /** @hidden */
  var _rigPostProcess: Nullable[PostProcess] = js.native
  /** @hidden */
  var _skipRendering: scala.Boolean = js.native
  var _stateStored: js.Any = js.native
  var _storedFov: js.Any = js.native
  var _transformMatrix: js.Any = js.native
  var _updateFrustumPlanes: js.Any = js.native
  var _webvrViewMatrix: Matrix = js.native
  /**
    * Rig mode of the camera.
    * This is usefull to create the camera with two "eyes" instead of one to create VR or stereoscopic scenes.
    * This is normally controlled byt the camera themselves as internal use.
    */
  var cameraRigMode: scala.Double = js.native
  /**
    * Defines the list of custom render target the camera should render to.
    * This is pretty helpfull if you wish to make a camera render to a texture you could reuse somewhere
    * else in the scene.
    */
  var customRenderTargets: js.Array[RenderTargetTexture] = js.native
  /**
    * Field Of View is set in Radians. (default is 0.8)
    */
  var fov: scala.Double = js.native
  /**
    * fovMode sets the camera frustum bounds to the viewport bounds. (default is FOVMODE_VERTICAL_FIXED)
    */
  var fovMode: scala.Double = js.native
  /**
    * Gets the current world space position of the camera.
    */
  val globalPosition: Vector3 = js.native
  /**
    * Define the default inertia of the camera.
    * This helps giving a smooth feeling to the camera movement.
    */
  var inertia: scala.Double = js.native
  /**
    * Define the input manager associated with the camera.
    */
  var inputs: CameraInputsManager[Camera] = js.native
  /**
    * Defines the distance between both "eyes" in case of a RIG
    */
  var interaxialDistance: scala.Double = js.native
  /**
    * Define wether the camera is intermediate.
    * This is usefull to not present the output directly to the screen in case of rig without post process for instance
    */
  var isIntermediate: scala.Boolean = js.native
  /**
    * Defines if stereoscopic rendering is done side by side or over under.
    */
  var isStereoscopicSideBySide: scala.Boolean = js.native
  /**
    * Restricts the camera to viewing objects with the same layerMask.
    * A camera with a layerMask of 1 will render mesh.layerMask & camera.layerMask!== 0
    */
  var layerMask: scala.Double = js.native
  /**
    * Gets the left camera of a rig setup in case of Rigged Camera
    */
  val leftCamera: Nullable[FreeCamera] = js.native
  /**
    * Define the maximum distance the camera can see to.
    * This is important to note that the depth buffer are not infinite and the further it end
    * the more your scene might encounter depth fighting issue.
    */
  var maxZ: scala.Double = js.native
  /**
    * Define the minimum distance the camera can see from.
    * This is important to note that the depth buffer are not infinite and the closer it starts
    * the more your scene might encounter depth fighting issue.
    */
  var minZ: scala.Double = js.native
  /**
    * Define the mode of the camera (Camera.PERSPECTIVE_CAMERA or Camera.PERSPECTIVE_ORTHOGRAPHIC)
    */
  var mode: scala.Double = js.native
  /**
    * Observable triggered when the inputs have been processed.
    */
  var onAfterCheckInputsObservable: Observable[Camera] = js.native
  /**
    * Observable triggered when the camera Projection matrix has changed.
    */
  var onProjectionMatrixChangedObservable: Observable[Camera] = js.native
  /**
    * Observable triggered when reset has been called and applied to the camera.
    */
  var onRestoreStateObservable: Observable[Camera] = js.native
  /**
    * Observable triggered when the camera view matrix has changed.
    */
  var onViewMatrixChangedObservable: Observable[Camera] = js.native
  /**
    * Define the current limit on the bottom side for an orthographic camera
    * In scene unit
    */
  var orthoBottom: Nullable[scala.Double] = js.native
  /**
    * Define the current limit on the left side for an orthographic camera
    * In scene unit
    */
  var orthoLeft: Nullable[scala.Double] = js.native
  /**
    * Define the current limit on the right side for an orthographic camera
    * In scene unit
    */
  var orthoRight: Nullable[scala.Double] = js.native
  /**
    * Define the current limit on the top side for an orthographic camera
    * In scene unit
    */
  var orthoTop: Nullable[scala.Double] = js.native
  /**
    * Define the current local position of the camera in the scene
    */
  var position: Vector3 = js.native
  /** @hidden */
  val rigCameras: js.Array[Camera] = js.native
  /**
    * Gets the post process used by the rig cameras
    */
  val rigPostProcess: Nullable[PostProcess] = js.native
  /**
    * Gets the right camera of a rig setup in case of Rigged Camera
    */
  val rightCamera: Nullable[FreeCamera] = js.native
  /**
    * The vector the camera should consider as up.
    * (default is Vector3(0, 1, 0) aka Vector3.Up())
    */
  var upVector: Vector3 = js.native
  /**
    * Define the viewport of the camera.
    * This correspond to the portion of the screen the camera will render to in normalized 0 to 1 unit.
    */
  var viewport: Viewport = js.native
  /** @hidden */
  def _checkInputs(): scala.Unit = js.native
  /**
    * Internal, gets the first post proces.
    * @returns the first post process to be run on this camera.
    */
  def _getFirstPostProcess(): Nullable[PostProcess] = js.native
  /** @hidden */
  /* protected */ def _getViewMatrix(): Matrix = js.native
  /**
    * This function MUST be overwritten by the different WebVR cameras available.
    * The context in which it is running is the RIG camera. So 'this' is the TargetCamera, left or right.
    */
  /* protected */ def _getWebVRProjectionMatrix(): Matrix = js.native
  /**
    * This function MUST be overwritten by the different WebVR cameras available.
    * The context in which it is running is the RIG camera. So 'this' is the TargetCamera, left or right.
    */
  /* protected */ def _getWebVRViewMatrix(): Matrix = js.native
  /** @hidden */
  def _isSynchronizedProjectionMatrix(): scala.Boolean = js.native
  /** @hidden */
  def _isSynchronizedViewMatrix(): scala.Boolean = js.native
  /**
    * Restores the camera state values if it has been stored. You must call storeState() first
    */
  /* protected */ def _restoreStateValues(): scala.Boolean = js.native
  /** @hidden */
  def _setupInputs(): scala.Unit = js.native
  /* protected */ def _updateCameraRotationMatrix(): scala.Unit = js.native
  /**
    * May need to be overridden by children
    * @hidden
    */
  def _updateRigCameras(): scala.Unit = js.native
  /* protected */ def _updateWebVRCameraRotationMatrix(): scala.Unit = js.native
  /**
    * Attach the input controls to a specific dom element to get the input from.
    * @param element Defines the element the controls should be listened from
    * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
    */
  def attachControl(element: stdLib.HTMLElement): scala.Unit = js.native
  def attachControl(element: stdLib.HTMLElement, noPreventDefault: scala.Boolean): scala.Unit = js.native
  /**
    * Attach a post process to the camera.
    * @see http://doc.babylonjs.com/how_to/how_to_use_postprocesses#attach-postprocess
    * @param postProcess The post process to attach to the camera
    * @param insertAt The position of the post process in case several of them are in use in the scene
    * @returns the position the post process has been inserted at
    */
  def attachPostProcess(postProcess: PostProcess): scala.Double = js.native
  def attachPostProcess(postProcess: PostProcess, insertAt: Nullable[scala.Double]): scala.Double = js.native
  /**
    * Clones the current camera.
    * @param name The cloned camera name
    * @returns the cloned camera
    */
  def clone(name: java.lang.String): Camera = js.native
  /**
    * needs to be overridden by children so sub has required properties to be copied
    * @hidden
    */
  def createRigCamera(name: java.lang.String, cameraIndex: scala.Double): Nullable[Camera] = js.native
  /**
    * Detach the current controls from the specified dom element.
    * @param element Defines the element to stop listening the inputs from
    */
  def detachControl(element: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Detach a post process to the camera.
    * @see http://doc.babylonjs.com/how_to/how_to_use_postprocesses#attach-postprocess
    * @param postProcess The post process to detach from the camera
    */
  def detachPostProcess(postProcess: PostProcess): scala.Unit = js.native
  /**
    * Freeze the projection matrix.
    * It will prevent the cache check of the camera projection compute and can speed up perf
    * if no parameter of the camera are meant to change
    * @param projection Defines manually a projection if necessary
    */
  def freezeProjectionMatrix(): scala.Unit = js.native
  def freezeProjectionMatrix(projection: Matrix): scala.Unit = js.native
  /**
    * Gets the list of active meshes this frame (meshes no culled or excluded by lod s in the frame)
    * @returns the active meshe list
    */
  def getActiveMeshes(): SmartArray[AbstractMesh] = js.native
  /**
    * Gets the direction of the camera relative to a given local axis.
    * @param localAxis Defines the reference axis to provide a relative direction.
    * @return the direction
    */
  def getDirection(localAxis: Vector3): Vector3 = js.native
  /**
    * Gets the direction of the camera relative to a given local axis into a passed vector.
    * @param localAxis Defines the reference axis to provide a relative direction.
    * @param result Defines the vector to store the result in
    */
  def getDirectionToRef(localAxis: Vector3, result: Vector3): scala.Unit = js.native
  /**
    * Gets a ray in the forward direction from the camera.
    * @param length Defines the length of the ray to create
    * @param transform Defines the transform to apply to the ray, by default the world matrx is used to create a workd space ray
    * @param origin Defines the start point of the ray which defaults to the camera position
    * @returns the forward ray
    */
  def getForwardRay(): Ray = js.native
  def getForwardRay(length: scala.Double): Ray = js.native
  def getForwardRay(length: scala.Double, transform: Matrix): Ray = js.native
  def getForwardRay(length: scala.Double, transform: Matrix, origin: Vector3): Ray = js.native
  /**
    * Gets the left camera target of a rig setup in case of Rigged Camera
    * @returns the target position
    */
  def getLeftTarget(): Nullable[Vector3] = js.native
  /**
    * Gets the current projection matrix of the camera.
    * @param force forces the camera to recompute the matrix without looking at the cached state
    * @returns the projection matrix
    */
  def getProjectionMatrix(): Matrix = js.native
  def getProjectionMatrix(force: scala.Boolean): Matrix = js.native
  /**
    * Gets the right camera target of a rig setup in case of Rigged Camera
    * @returns the target position
    */
  def getRightTarget(): Nullable[Vector3] = js.native
  /**
    * Gets the transformation matrix (ie. the multiplication of view by projection matrices)
    * @returns a Matrix
    */
  def getTransformationMatrix(): Matrix = js.native
  /**
    * Gets the current view matrix of the camera.
    * @param force forces the camera to recompute the matrix without looking at the cached state
    * @returns the view matrix
    */
  def getViewMatrix(): Matrix = js.native
  def getViewMatrix(force: scala.Boolean): Matrix = js.native
  /**
    * Check wether a mesh is part of the current active mesh list of the camera
    * @param mesh Defines the mesh to check
    * @returns true if active, false otherwise
    */
  def isActiveMesh(mesh: Mesh): scala.Boolean = js.native
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this cheks the full bounding box
    * @param target The object to check
    * @returns true if the object is in frustum otherwise false
    */
  def isCompletelyInFrustum(target: ICullable): scala.Boolean = js.native
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * This checks the bounding box center. See isCompletelyInFrustum for a full bounding check
    * @param target The object to check
    * @returns true if the object is in frustum otherwise false
    */
  def isInFrustum(target: ICullable): scala.Boolean = js.native
  /**
    * Restored camera state. You must call storeState() first.
    * @returns true if restored and false otherwise
    */
  def restoreState(): scala.Boolean = js.native
  /**
    * Serialiaze the camera setup to a json represention
    * @returns the JSON representation
    */
  def serialize(): js.Any = js.native
  /**
    * @hidden
    */
  def setCameraRigMode(mode: scala.Double, rigParams: js.Any): scala.Unit = js.native
  /** @hidden */
  def setCameraRigParameter(name: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
    * Store current camera state (fov, position, etc..)
    * @returns the camera
    */
  def storeState(): Camera = js.native
  def toString(fullDetails: scala.Boolean): java.lang.String = js.native
  /**
    * Unfreeze the projection matrix if it has previously been freezed by freezeProjectionMatrix.
    */
  def unfreezeProjectionMatrix(): scala.Unit = js.native
  /**
    * Update the camera state according to the different inputs gathered during the frame.
    */
  def update(): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.Camera")
@js.native
object Camera extends js.Object {
  /**
    * This setting aligns the left and right bounds of the viewport to the left and right bounds of the camera frustum.
    */
  val FOVMODE_HORIZONTAL_FIXED: scala.Double = js.native
  /**
    * This is the default FOV mode for perspective cameras.
    * This setting aligns the upper and lower bounds of the viewport to the upper and lower bounds of the camera frustum.
    */
  val FOVMODE_VERTICAL_FIXED: scala.Double = js.native
  /**
    * Defines if by default attaching controls should prevent the default javascript event to continue.
    */
  var ForceAttachControlToAlwaysPreventDefault: scala.Boolean = js.native
  /**
    * This helps creating camera with an orthographic mode.
    * Orthographic is commonly used in engineering as a means to produce object specifications that communicate dimensions unambiguously, each line of 1 unit length (cm, meter..whatever) will appear to have the same length everywhere on the drawing. This allows the drafter to dimension only a subset of lines and let the reader know that other lines of that length on the drawing are also that length in reality. Every parallel line in the drawing is also parallel in the object.
    */
  val ORTHOGRAPHIC_CAMERA: scala.Double = js.native
  /**
    * This is the default projection mode used by the cameras.
    * It helps recreating a feeling of perspective and better appreciate depth.
    * This is the best way to simulate real life cameras.
    */
  val PERSPECTIVE_CAMERA: scala.Double = js.native
  /**
    * This specifies ther is no need for a camera rig.
    * Basically only one eye is rendered corresponding to the camera.
    */
  val RIG_MODE_NONE: scala.Double = js.native
  /**
    * Simulates a camera Rig with one blue eye and one red eye.
    * This can be use with 3d blue and red glasses.
    */
  val RIG_MODE_STEREOSCOPIC_ANAGLYPH: scala.Double = js.native
  /**
    * Defines that both eyes of the camera will be rendered over under each other.
    */
  val RIG_MODE_STEREOSCOPIC_OVERUNDER: scala.Double = js.native
  /**
    * Defines that both eyes of the camera will be rendered side by side with a none parallel target.
    */
  val RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED: scala.Double = js.native
  /**
    * Defines that both eyes of the camera will be rendered side by side with a parallel target.
    */
  val RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL: scala.Double = js.native
  /**
    * Defines that both eyes of the camera should be renderered in a VR mode (carbox).
    */
  val RIG_MODE_VR: scala.Double = js.native
  /**
    * Defines that both eyes of the camera should be renderered in a VR mode (webVR).
    */
  val RIG_MODE_WEBVR: scala.Double = js.native
  /**
    * @hidden
    * Might be removed once multiview will be a thing
    */
  var UseAlternateWebVRRendering: scala.Boolean = js.native
  /**
    * Gets a camera constructor for a given camera type
    * @param type The type of the camera to construct (should be equal to one of the camera class name)
    * @param name The name of the camera the result will be able to instantiate
    * @param scene The scene the result will construct the camera in
    * @param interaxial_distance In case of stereoscopic setup, the distance between both eyes
    * @param isStereoscopicSideBySide In case of stereoscopic setup, should the sereo be side b side
    * @returns a factory method to construc the camera
    */
  def GetConstructorFromName(`type`: java.lang.String, name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene): js.Function0[this.type] = js.native
  def GetConstructorFromName(
    `type`: java.lang.String,
    name: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Scene,
    interaxial_distance: scala.Double
  ): js.Function0[this.type] = js.native
  def GetConstructorFromName(
    `type`: java.lang.String,
    name: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Scene,
    interaxial_distance: scala.Double,
    isStereoscopicSideBySide: scala.Boolean
  ): js.Function0[this.type] = js.native
  /**
    * Parse a JSON and creates the camera from the parsed information
    * @param parsedCamera The JSON to parse
    * @param scene The scene to instantiate the camera in
    * @returns the newly constructed camera
    */
  def Parse(parsedCamera: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Camera = js.native
}

