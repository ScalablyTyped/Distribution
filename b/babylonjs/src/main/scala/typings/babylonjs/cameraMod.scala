package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.boundingInfoMod.ICullable
import typings.babylonjs.cameraInputsManagerMod.CameraInputsManager
import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathViewportMod.Viewport
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.smartArrayMod.SmartArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraMod {
  
  @JSImport("babylonjs/Cameras/camera", "Camera")
  @js.native
  class Camera protected () extends Node {
    /**
      * Instantiates a new camera object.
      * This should not be used directly but through the inherited cameras: ArcRotate, Free...
      * @see https://doc.babylonjs.com/features/cameras
      * @param name Defines the name of the camera in the scene
      * @param position Defines the position of the camera
      * @param scene Defines the scene the camera belongs too
      * @param setActiveOnSceneIfNoneActive Defines if the camera should be set as active after creation if no other camera have been defined in the scene
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: Boolean) = this()
    
    /** @hidden */
    var _activeMeshes: SmartArray[AbstractMesh] = js.native
    
    /** @hidden */
    var _cameraRigParams: js.Any = js.native
    
    var _cascadePostProcessesToRigCams: js.Any = js.native
    
    /** @hidden */
    def _checkInputs(): Unit = js.native
    
    /** @hidden */
    var _computedViewMatrix: Matrix = js.native
    
    var _doNotComputeProjectionMatrix: js.Any = js.native
    
    var _frustumPlanes: js.Any = js.native
    
    /**
      * Internal, gets the first post proces.
      * @returns the first post process to be run on this camera.
      */
    def _getFirstPostProcess(): Nullable[PostProcess] = js.native
    
    /** @hidden */
    def _getVRProjectionMatrix(): Matrix = js.native
    
    /** @hidden */
    def _getViewMatrix(): Matrix = js.native
    
    /**
      * This function MUST be overwritten by the different WebVR cameras available.
      * The context in which it is running is the RIG camera. So 'this' is the TargetCamera, left or right.
      * @hidden
      */
    def _getWebVRProjectionMatrix(): Matrix = js.native
    
    /**
      * This function MUST be overwritten by the different WebVR cameras available.
      * The context in which it is running is the RIG camera. So 'this' is the TargetCamera, left or right.
      * @hidden
      */
    def _getWebVRViewMatrix(): Matrix = js.native
    
    var _globalPosition: Vector3 = js.native
    
    /** @hidden */
    val _isCamera: Boolean = js.native
    
    /** @hidden */
    var _isLeftCamera: Boolean = js.native
    
    /** @hidden */
    var _isRightCamera: Boolean = js.native
    
    /** @hidden */
    def _isSynchronizedProjectionMatrix(): Boolean = js.native
    
    /** @hidden */
    def _isSynchronizedViewMatrix(): Boolean = js.native
    
    /**
      * @hidden
      * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
      */
    var _multiviewTexture: Nullable[RenderTargetTexture] = js.native
    
    /** @hidden */
    var _position: Vector3 = js.native
    
    /** @hidden */
    var _postProcesses: js.Array[Nullable[PostProcess]] = js.native
    
    /** @hidden */
    var _projectionMatrix: Matrix = js.native
    
    var _refreshFrustumPlanes: js.Any = js.native
    
    /**
      * @hidden
      * ensures the multiview texture of the camera exists and has the specified width/height
      * @param width height to set on the multiview texture
      * @param height width to set on the multiview texture
      */
    def _resizeOrCreateMultiviewTexture(width: Double, height: Double): Unit = js.native
    
    /**
      * Restores the camera state values if it has been stored. You must call storeState() first
      */
    /* protected */ def _restoreStateValues(): Boolean = js.native
    
    /** @hidden */
    var _rigCameras: js.Array[Camera] = js.native
    
    /** @hidden */
    var _rigPostProcess: Nullable[PostProcess] = js.native
    
    /** @hidden */
    def _setupInputs(): Unit = js.native
    
    /** @hidden */
    var _skipRendering: Boolean = js.native
    
    var _stateStored: js.Any = js.native
    
    var _storedFov: js.Any = js.native
    
    var _transformMatrix: js.Any = js.native
    
    var _upVector: Vector3 = js.native
    
    /* protected */ def _updateCameraRotationMatrix(): Unit = js.native
    
    var _updateFrustumPlanes: js.Any = js.native
    
    /**
      * May need to be overridden by children
      * @hidden
      */
    def _updateRigCameras(): Unit = js.native
    
    /* protected */ def _updateWebVRCameraRotationMatrix(): Unit = js.native
    
    /**
      * @hidden
      * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
      */
    var _useMultiviewToSingleView: Boolean = js.native
    
    var _webvrViewMatrix: Matrix = js.native
    
    /**
      * Returns the current camera absolute rotation
      */
    def absoluteRotation: Quaternion = js.native
    
    /**
      * Attach the input controls to a specific dom element to get the input from.
      * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
      */
    def attachControl(): Unit = js.native
    /**
      * Attach the input controls to a specific dom element to get the input from.
      * @param ignored defines an ignored parameter kept for backward compatibility. If you want to define the source input element, you can set engine.inputElement before calling camera.attachControl
      * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
      * BACK COMPAT SIGNATURE ONLY.
      */
    def attachControl(ignored: js.Any): Unit = js.native
    def attachControl(ignored: js.Any, noPreventDefault: Boolean): Unit = js.native
    def attachControl(noPreventDefault: Boolean): Unit = js.native
    
    /**
      * Attach a post process to the camera.
      * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#attach-postprocess
      * @param postProcess The post process to attach to the camera
      * @param insertAt The position of the post process in case several of them are in use in the scene
      * @returns the position the post process has been inserted at
      */
    def attachPostProcess(postProcess: PostProcess): Double = js.native
    def attachPostProcess(postProcess: PostProcess, insertAt: Nullable[Double]): Double = js.native
    
    /**
      * Rig mode of the camera.
      * This is useful to create the camera with two "eyes" instead of one to create VR or stereoscopic scenes.
      * This is normally controlled byt the camera themselves as internal use.
      */
    var cameraRigMode: Double = js.native
    
    /**
      * Clones the current camera.
      * @param name The cloned camera name
      * @returns the cloned camera
      */
    def clone(name: String): Camera = js.native
    
    /**
      * needs to be overridden by children so sub has required properties to be copied
      * @hidden
      */
    def createRigCamera(name: String, cameraIndex: Double): Nullable[Camera] = js.native
    
    /**
      * Defines the list of custom render target which are rendered to and then used as the input to this camera's render. Eg. display another camera view on a TV in the main scene
      * This is pretty helpfull if you wish to make a camera render to a texture you could reuse somewhere
      * else in the scene. (Eg. security camera)
      *
      * To change the final output target of the camera, camera.outputRenderTarget should be used instead (eg. webXR renders to a render target corrisponding to an HMD)
      */
    var customRenderTargets: js.Array[RenderTargetTexture] = js.native
    
    /**
      * Detach the current controls from the specified dom element.
      */
    def detachControl(): Unit = js.native
    /**
      * Detach the current controls from the specified dom element.
      * @param ignored defines an ignored parameter kept for backward compatibility. If you want to define the source input element, you can set engine.inputElement before calling camera.attachControl
      */
    def detachControl(ignored: js.Any): Unit = js.native
    
    /**
      * Detach a post process to the camera.
      * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#attach-postprocess
      * @param postProcess The post process to detach from the camera
      */
    def detachPostProcess(postProcess: PostProcess): Unit = js.native
    
    /**
      * Field Of View is set in Radians. (default is 0.8)
      */
    var fov: Double = js.native
    
    /**
      * fovMode sets the camera frustum bounds to the viewport bounds. (default is FOVMODE_VERTICAL_FIXED)
      */
    var fovMode: Double = js.native
    
    /**
      * Freeze the projection matrix.
      * It will prevent the cache check of the camera projection compute and can speed up perf
      * if no parameter of the camera are meant to change
      * @param projection Defines manually a projection if necessary
      */
    def freezeProjectionMatrix(): Unit = js.native
    def freezeProjectionMatrix(projection: Matrix): Unit = js.native
    
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
    def getDirectionToRef(localAxis: Vector3, result: Vector3): Unit = js.native
    
    /**
      * Gets a ray in the forward direction from the camera.
      * @param length Defines the length of the ray to create
      * @param transform Defines the transform to apply to the ray, by default the world matrx is used to create a workd space ray
      * @param origin Defines the start point of the ray which defaults to the camera position
      * @returns the forward ray
      */
    def getForwardRay(): Ray = js.native
    def getForwardRay(length: js.UndefOr[scala.Nothing], transform: js.UndefOr[scala.Nothing], origin: Vector3): Ray = js.native
    def getForwardRay(length: js.UndefOr[scala.Nothing], transform: Matrix): Ray = js.native
    def getForwardRay(length: js.UndefOr[scala.Nothing], transform: Matrix, origin: Vector3): Ray = js.native
    def getForwardRay(length: Double): Ray = js.native
    def getForwardRay(length: Double, transform: js.UndefOr[scala.Nothing], origin: Vector3): Ray = js.native
    def getForwardRay(length: Double, transform: Matrix): Ray = js.native
    def getForwardRay(length: Double, transform: Matrix, origin: Vector3): Ray = js.native
    
    /**
      * Gets a ray in the forward direction from the camera.
      * @param refRay the ray to (re)use when setting the values
      * @param length Defines the length of the ray to create
      * @param transform Defines the transform to apply to the ray, by default the world matrx is used to create a workd space ray
      * @param origin Defines the start point of the ray which defaults to the camera position
      * @returns the forward ray
      */
    def getForwardRayToRef(refRay: Ray): Ray = js.native
    def getForwardRayToRef(
      refRay: Ray,
      length: js.UndefOr[scala.Nothing],
      transform: js.UndefOr[scala.Nothing],
      origin: Vector3
    ): Ray = js.native
    def getForwardRayToRef(refRay: Ray, length: js.UndefOr[scala.Nothing], transform: Matrix): Ray = js.native
    def getForwardRayToRef(refRay: Ray, length: js.UndefOr[scala.Nothing], transform: Matrix, origin: Vector3): Ray = js.native
    def getForwardRayToRef(refRay: Ray, length: Double): Ray = js.native
    def getForwardRayToRef(refRay: Ray, length: Double, transform: js.UndefOr[scala.Nothing], origin: Vector3): Ray = js.native
    def getForwardRayToRef(refRay: Ray, length: Double, transform: Matrix): Ray = js.native
    def getForwardRayToRef(refRay: Ray, length: Double, transform: Matrix, origin: Vector3): Ray = js.native
    
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
    def getProjectionMatrix(force: Boolean): Matrix = js.native
    
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
    def getViewMatrix(force: Boolean): Matrix = js.native
    
    /**
      * Gets the current world space position of the camera.
      */
    def globalPosition: Vector3 = js.native
    
    /**
      * Define the default inertia of the camera.
      * This helps giving a smooth feeling to the camera movement.
      */
    var inertia: Double = js.native
    
    /**
      * Define the input manager associated with the camera.
      */
    var inputs: CameraInputsManager[Camera] = js.native
    
    /**
      * Defines the distance between both "eyes" in case of a RIG
      */
    var interaxialDistance: Double = js.native
    
    /**
      * Check whether a mesh is part of the current active mesh list of the camera
      * @param mesh Defines the mesh to check
      * @returns true if active, false otherwise
      */
    def isActiveMesh(mesh: Mesh): Boolean = js.native
    
    /**
      * Checks if a cullable object (mesh...) is in the camera frustum
      * Unlike isInFrustum this cheks the full bounding box
      * @param target The object to check
      * @returns true if the object is in frustum otherwise false
      */
    def isCompletelyInFrustum(target: ICullable): Boolean = js.native
    
    /**
      * Checks if a cullable object (mesh...) is in the camera frustum
      * This checks the bounding box center. See isCompletelyInFrustum for a full bounding check
      * @param target The object to check
      * @param checkRigCameras If the rig cameras should be checked (eg. with webVR camera both eyes should be checked) (Default: false)
      * @returns true if the object is in frustum otherwise false
      */
    def isInFrustum(target: ICullable): Boolean = js.native
    def isInFrustum(target: ICullable, checkRigCameras: Boolean): Boolean = js.native
    
    /**
      * Define whether the camera is intermediate.
      * This is useful to not present the output directly to the screen in case of rig without post process for instance
      */
    var isIntermediate: Boolean = js.native
    
    /**
      * Gets the left camera of a rig setup in case of Rigged Camera
      */
    def isLeftCamera: Boolean = js.native
    
    /**
      * Is this camera a part of a rig system?
      */
    var isRigCamera: Boolean = js.native
    
    /**
      * Gets the right camera of a rig setup in case of Rigged Camera
      */
    def isRightCamera: Boolean = js.native
    
    /**
      * Defines if stereoscopic rendering is done side by side or over under.
      */
    var isStereoscopicSideBySide: Boolean = js.native
    
    /**
      * Restricts the camera to viewing objects with the same layerMask.
      * A camera with a layerMask of 1 will render mesh.layerMask & camera.layerMask!== 0
      */
    var layerMask: Double = js.native
    
    /**
      * Gets the left camera of a rig setup in case of Rigged Camera
      */
    def leftCamera: Nullable[FreeCamera] = js.native
    
    /**
      * Define the maximum distance the camera can see to.
      * This is important to note that the depth buffer are not infinite and the further it end
      * the more your scene might encounter depth fighting issue.
      */
    var maxZ: Double = js.native
    
    /**
      * Define the minimum distance the camera can see from.
      * This is important to note that the depth buffer are not infinite and the closer it starts
      * the more your scene might encounter depth fighting issue.
      */
    var minZ: Double = js.native
    
    /**
      * Define the mode of the camera (Camera.PERSPECTIVE_CAMERA or Camera.ORTHOGRAPHIC_CAMERA)
      */
    var mode: Double = js.native
    
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
    var orthoBottom: Nullable[Double] = js.native
    
    /**
      * Define the current limit on the left side for an orthographic camera
      * In scene unit
      */
    var orthoLeft: Nullable[Double] = js.native
    
    /**
      * Define the current limit on the right side for an orthographic camera
      * In scene unit
      */
    var orthoRight: Nullable[Double] = js.native
    
    /**
      * Define the current limit on the top side for an orthographic camera
      * In scene unit
      */
    var orthoTop: Nullable[Double] = js.native
    
    /**
      * When set, the camera will render to this render target instead of the default canvas
      *
      * If the desire is to use the output of a camera as a texture in the scene consider using camera.customRenderTargets instead
      */
    var outputRenderTarget: Nullable[RenderTargetTexture] = js.native
    
    /**
      * Define the current local position of the camera in the scene
      */
    def position: Vector3 = js.native
    def position_=(newPosition: Vector3): Unit = js.native
    
    /**
      * Restored camera state. You must call storeState() first.
      * @returns true if restored and false otherwise
      */
    def restoreState(): Boolean = js.native
    
    /** @hidden */
    def rigCameras: js.Array[Camera] = js.native
    
    /**
      * If isRigCamera set to true this will be set with the parent camera.
      * The parent camera is not (!) necessarily the .parent of this camera (like in the case of XR)
      */
    var rigParent: js.UndefOr[Camera] = js.native
    
    /**
      * Gets the post process used by the rig cameras
      */
    def rigPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * Gets the right camera of a rig setup in case of Rigged Camera
      */
    def rightCamera: Nullable[FreeCamera] = js.native
    
    /**
      * Serialiaze the camera setup to a json represention
      * @returns the JSON representation
      */
    def serialize(): js.Any = js.native
    
    /**
      * @hidden
      */
    def setCameraRigMode(mode: Double, rigParams: js.Any): Unit = js.native
    
    /** @hidden */
    def setCameraRigParameter(name: String, value: js.Any): Unit = js.native
    
    /**
      * Store current camera state (fov, position, etc..)
      * @returns the camera
      */
    def storeState(): Camera = js.native
    
    def toString(fullDetails: Boolean): String = js.native
    
    /**
      * Unfreeze the projection matrix if it has previously been freezed by freezeProjectionMatrix.
      */
    def unfreezeProjectionMatrix(): Unit = js.native
    
    def upVector: Vector3 = js.native
    /**
      * The vector the camera should consider as up.
      * (default is Vector3(0, 1, 0) aka Vector3.Up())
      */
    def upVector_=(vec: Vector3): Unit = js.native
    
    /**
      * Update the camera state according to the different inputs gathered during the frame.
      */
    def update(): Unit = js.native
    
    /**
      * Define the viewport of the camera.
      * This correspond to the portion of the screen the camera will render to in normalized 0 to 1 unit.
      */
    var viewport: Viewport = js.native
  }
  /* static members */
  object Camera {
    
    @JSImport("babylonjs/Cameras/camera", "Camera")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This setting aligns the left and right bounds of the viewport to the left and right bounds of the camera frustum.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.FOVMODE_HORIZONTAL_FIXED")
    @js.native
    val FOVMODE_HORIZONTAL_FIXED: Double = js.native
    
    /**
      * This is the default FOV mode for perspective cameras.
      * This setting aligns the upper and lower bounds of the viewport to the upper and lower bounds of the camera frustum.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.FOVMODE_VERTICAL_FIXED")
    @js.native
    val FOVMODE_VERTICAL_FIXED: Double = js.native
    
    /**
      * Defines if by default attaching controls should prevent the default javascript event to continue.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.ForceAttachControlToAlwaysPreventDefault")
    @js.native
    def ForceAttachControlToAlwaysPreventDefault: Boolean = js.native
    @scala.inline
    def ForceAttachControlToAlwaysPreventDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForceAttachControlToAlwaysPreventDefault")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a camera constructor for a given camera type
      * @param type The type of the camera to construct (should be equal to one of the camera class name)
      * @param name The name of the camera the result will be able to instantiate
      * @param scene The scene the result will construct the camera in
      * @param interaxial_distance In case of stereoscopic setup, the distance between both eyes
      * @param isStereoscopicSideBySide In case of stereoscopic setup, should the sereo be side b side
      * @returns a factory method to construc the camera
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.GetConstructorFromName")
    @js.native
    def GetConstructorFromName(`type`: String, name: String, scene: Scene): js.Function0[this.type] = js.native
    @JSImport("babylonjs/Cameras/camera", "Camera.GetConstructorFromName")
    @js.native
    def GetConstructorFromName(
      `type`: String,
      name: String,
      scene: Scene,
      interaxial_distance: js.UndefOr[scala.Nothing],
      isStereoscopicSideBySide: Boolean
    ): js.Function0[this.type] = js.native
    @JSImport("babylonjs/Cameras/camera", "Camera.GetConstructorFromName")
    @js.native
    def GetConstructorFromName(`type`: String, name: String, scene: Scene, interaxial_distance: Double): js.Function0[this.type] = js.native
    @JSImport("babylonjs/Cameras/camera", "Camera.GetConstructorFromName")
    @js.native
    def GetConstructorFromName(
      `type`: String,
      name: String,
      scene: Scene,
      interaxial_distance: Double,
      isStereoscopicSideBySide: Boolean
    ): js.Function0[this.type] = js.native
    
    /**
      * This helps creating camera with an orthographic mode.
      * Orthographic is commonly used in engineering as a means to produce object specifications that communicate dimensions unambiguously, each line of 1 unit length (cm, meter..whatever) will appear to have the same length everywhere on the drawing. This allows the drafter to dimension only a subset of lines and let the reader know that other lines of that length on the drawing are also that length in reality. Every parallel line in the drawing is also parallel in the object.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.ORTHOGRAPHIC_CAMERA")
    @js.native
    val ORTHOGRAPHIC_CAMERA: Double = js.native
    
    /**
      * This is the default projection mode used by the cameras.
      * It helps recreating a feeling of perspective and better appreciate depth.
      * This is the best way to simulate real life cameras.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.PERSPECTIVE_CAMERA")
    @js.native
    val PERSPECTIVE_CAMERA: Double = js.native
    
    /**
      * Parse a JSON and creates the camera from the parsed information
      * @param parsedCamera The JSON to parse
      * @param scene The scene to instantiate the camera in
      * @returns the newly constructed camera
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.Parse")
    @js.native
    def Parse(parsedCamera: js.Any, scene: Scene): Camera = js.native
    
    /**
      * Custom rig mode allowing rig cameras to be populated manually with any number of cameras
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.RIG_MODE_CUSTOM")
    @js.native
    val RIG_MODE_CUSTOM: Double = js.native
    
    /**
      * This specifies ther is no need for a camera rig.
      * Basically only one eye is rendered corresponding to the camera.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.RIG_MODE_NONE")
    @js.native
    val RIG_MODE_NONE: Double = js.native
    
    /**
      * Simulates a camera Rig with one blue eye and one red eye.
      * This can be use with 3d blue and red glasses.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.RIG_MODE_STEREOSCOPIC_ANAGLYPH")
    @js.native
    val RIG_MODE_STEREOSCOPIC_ANAGLYPH: Double = js.native
    
    /**
      * Defines that both eyes of the camera will be rendered on successive lines interlaced for passive 3d monitors.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.RIG_MODE_STEREOSCOPIC_INTERLACED")
    @js.native
    val RIG_MODE_STEREOSCOPIC_INTERLACED: Double = js.native
    
    /**
      * Defines that both eyes of the camera will be rendered over under each other.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.RIG_MODE_STEREOSCOPIC_OVERUNDER")
    @js.native
    val RIG_MODE_STEREOSCOPIC_OVERUNDER: Double = js.native
    
    /**
      * Defines that both eyes of the camera will be rendered side by side with a none parallel target.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED")
    @js.native
    val RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED: Double = js.native
    
    /**
      * Defines that both eyes of the camera will be rendered side by side with a parallel target.
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL")
    @js.native
    val RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL: Double = js.native
    
    /**
      * Defines that both eyes of the camera should be renderered in a VR mode (carbox).
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.RIG_MODE_VR")
    @js.native
    val RIG_MODE_VR: Double = js.native
    
    /**
      * Defines that both eyes of the camera should be renderered in a VR mode (webVR).
      */
    @JSImport("babylonjs/Cameras/camera", "Camera.RIG_MODE_WEBVR")
    @js.native
    val RIG_MODE_WEBVR: Double = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Cameras/camera", "Camera._createDefaultParsedCamera")
    @js.native
    def _createDefaultParsedCamera(name: String, scene: Scene): Camera = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Cameras/camera", "Camera._setStereoscopicAnaglyphRigMode")
    @js.native
    def _setStereoscopicAnaglyphRigMode(camera: Camera): Unit = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Cameras/camera", "Camera._setStereoscopicRigMode")
    @js.native
    def _setStereoscopicRigMode(camera: Camera): Unit = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Cameras/camera", "Camera._setVRRigMode")
    @js.native
    def _setVRRigMode(camera: Camera, rigParams: js.Any): Unit = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Cameras/camera", "Camera._setWebVRRigMode")
    @js.native
    def _setWebVRRigMode(camera: Camera, rigParams: js.Any): Unit = js.native
  }
}
