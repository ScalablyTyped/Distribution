package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "Camera")
@js.native
class Camera protected ()
  extends typings.babylonjs.babylonjsMod.Camera {
  /**
    * Instantiates a new camera object.
    * This should not be used directly but through the inherited cameras: ArcRotate, Free...
    * @see http://doc.babylonjs.com/features/cameras
    * @param name Defines the name of the camera in the scene
    * @param position Defines the position of the camera
    * @param scene Defines the scene the camera belongs too
    * @param setActiveOnSceneIfNoneActive Defines if the camera should be set as active after creation if no other camera have been defined in the scene
    */
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/index", "Camera")
@js.native
object Camera extends js.Object {
  /**
    * This setting aligns the left and right bounds of the viewport to the left and right bounds of the camera frustum.
    */
  val FOVMODE_HORIZONTAL_FIXED: Double = js.native
  /**
    * This is the default FOV mode for perspective cameras.
    * This setting aligns the upper and lower bounds of the viewport to the upper and lower bounds of the camera frustum.
    */
  val FOVMODE_VERTICAL_FIXED: Double = js.native
  /**
    * Defines if by default attaching controls should prevent the default javascript event to continue.
    */
  var ForceAttachControlToAlwaysPreventDefault: Boolean = js.native
  /**
    * This helps creating camera with an orthographic mode.
    * Orthographic is commonly used in engineering as a means to produce object specifications that communicate dimensions unambiguously, each line of 1 unit length (cm, meter..whatever) will appear to have the same length everywhere on the drawing. This allows the drafter to dimension only a subset of lines and let the reader know that other lines of that length on the drawing are also that length in reality. Every parallel line in the drawing is also parallel in the object.
    */
  val ORTHOGRAPHIC_CAMERA: Double = js.native
  /**
    * This is the default projection mode used by the cameras.
    * It helps recreating a feeling of perspective and better appreciate depth.
    * This is the best way to simulate real life cameras.
    */
  val PERSPECTIVE_CAMERA: Double = js.native
  /**
    * Custom rig mode allowing rig cameras to be populated manually with any number of cameras
    */
  val RIG_MODE_CUSTOM: Double = js.native
  /**
    * This specifies ther is no need for a camera rig.
    * Basically only one eye is rendered corresponding to the camera.
    */
  val RIG_MODE_NONE: Double = js.native
  /**
    * Simulates a camera Rig with one blue eye and one red eye.
    * This can be use with 3d blue and red glasses.
    */
  val RIG_MODE_STEREOSCOPIC_ANAGLYPH: Double = js.native
  /**
    * Defines that both eyes of the camera will be rendered on successive lines interlaced for passive 3d monitors.
    */
  val RIG_MODE_STEREOSCOPIC_INTERLACED: Double = js.native
  /**
    * Defines that both eyes of the camera will be rendered over under each other.
    */
  val RIG_MODE_STEREOSCOPIC_OVERUNDER: Double = js.native
  /**
    * Defines that both eyes of the camera will be rendered side by side with a none parallel target.
    */
  val RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED: Double = js.native
  /**
    * Defines that both eyes of the camera will be rendered side by side with a parallel target.
    */
  val RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL: Double = js.native
  /**
    * Defines that both eyes of the camera should be renderered in a VR mode (carbox).
    */
  val RIG_MODE_VR: Double = js.native
  /**
    * Defines that both eyes of the camera should be renderered in a VR mode (webVR).
    */
  val RIG_MODE_WEBVR: Double = js.native
  /**
    * Gets a camera constructor for a given camera type
    * @param type The type of the camera to construct (should be equal to one of the camera class name)
    * @param name The name of the camera the result will be able to instantiate
    * @param scene The scene the result will construct the camera in
    * @param interaxial_distance In case of stereoscopic setup, the distance between both eyes
    * @param isStereoscopicSideBySide In case of stereoscopic setup, should the sereo be side b side
    * @returns a factory method to construc the camera
    */
  def GetConstructorFromName(`type`: String, name: String, scene: typings.babylonjs.sceneMod.Scene): js.Function0[this.type] = js.native
  def GetConstructorFromName(`type`: String, name: String, scene: typings.babylonjs.sceneMod.Scene, interaxial_distance: Double): js.Function0[this.type] = js.native
  def GetConstructorFromName(
    `type`: String,
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    interaxial_distance: Double,
    isStereoscopicSideBySide: Boolean
  ): js.Function0[this.type] = js.native
  /**
    * Parse a JSON and creates the camera from the parsed information
    * @param parsedCamera The JSON to parse
    * @param scene The scene to instantiate the camera in
    * @returns the newly constructed camera
    */
  def Parse(parsedCamera: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.cameraMod.Camera = js.native
  /** @hidden */
  def _createDefaultParsedCamera(name: String, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.cameraMod.Camera = js.native
  /** @hidden */
  def _setStereoscopicAnaglyphRigMode(camera: typings.babylonjs.cameraMod.Camera): Unit = js.native
  /** @hidden */
  def _setStereoscopicRigMode(camera: typings.babylonjs.cameraMod.Camera): Unit = js.native
  /** @hidden */
  def _setVRRigMode(camera: typings.babylonjs.cameraMod.Camera, rigParams: js.Any): Unit = js.native
  /** @hidden */
  def _setWebVRRigMode(camera: typings.babylonjs.cameraMod.Camera, rigParams: js.Any): Unit = js.native
}

