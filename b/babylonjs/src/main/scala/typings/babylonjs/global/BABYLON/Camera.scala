package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Camera")
@js.native
open class Camera protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Camera {
  /**
    * Instantiates a new camera object.
    * This should not be used directly but through the inherited cameras: ArcRotate, Free...
    * @see https://doc.babylonjs.com/features/cameras
    * @param name Defines the name of the camera in the scene
    * @param position Defines the position of the camera
    * @param scene Defines the scene the camera belongs too
    * @param setActiveOnSceneIfNoneActive Defines if the camera should be set as active after creation if no other camera have been defined in the scene
    */
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3) = this()
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: Unit,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}
/* static members */
object Camera {
  
  @JSGlobal("BABYLON.Camera")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This setting aligns the left and right bounds of the viewport to the left and right bounds of the camera frustum.
    */
  @JSGlobal("BABYLON.Camera.FOVMODE_HORIZONTAL_FIXED")
  @js.native
  val FOVMODE_HORIZONTAL_FIXED: /* 1 */ Double = js.native
  
  /**
    * This is the default FOV mode for perspective cameras.
    * This setting aligns the upper and lower bounds of the viewport to the upper and lower bounds of the camera frustum.
    */
  @JSGlobal("BABYLON.Camera.FOVMODE_VERTICAL_FIXED")
  @js.native
  val FOVMODE_VERTICAL_FIXED: /* 0 */ Double = js.native
  
  /**
    * Defines if by default attaching controls should prevent the default javascript event to continue.
    */
  @JSGlobal("BABYLON.Camera.ForceAttachControlToAlwaysPreventDefault")
  @js.native
  def ForceAttachControlToAlwaysPreventDefault: Boolean = js.native
  inline def ForceAttachControlToAlwaysPreventDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForceAttachControlToAlwaysPreventDefault")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a camera constructor for a given camera type
    * @param type The type of the camera to construct (should be equal to one of the camera class name)
    * @param name The name of the camera the result will be able to instantiate
    * @param scene The scene the result will construct the camera in
    * @param interaxial_distance In case of stereoscopic setup, the distance between both eyes
    * @param isStereoscopicSideBySide In case of stereoscopic setup, should the sereo be side b side
    * @returns a factory method to construct the camera
    */
  inline def GetConstructorFromName(`type`: String, name: String, scene: typings.babylonjs.BABYLON.Scene): js.Function0[this.type] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetConstructorFromName")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Function0[this.type]]
  inline def GetConstructorFromName(`type`: String, name: String, scene: typings.babylonjs.BABYLON.Scene, interaxial_distance: Double): js.Function0[this.type] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetConstructorFromName")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], interaxial_distance.asInstanceOf[js.Any])).asInstanceOf[js.Function0[this.type]]
  inline def GetConstructorFromName(
    `type`: String,
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    interaxial_distance: Double,
    isStereoscopicSideBySide: Boolean
  ): js.Function0[this.type] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetConstructorFromName")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], interaxial_distance.asInstanceOf[js.Any], isStereoscopicSideBySide.asInstanceOf[js.Any])).asInstanceOf[js.Function0[this.type]]
  inline def GetConstructorFromName(
    `type`: String,
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    interaxial_distance: Unit,
    isStereoscopicSideBySide: Boolean
  ): js.Function0[this.type] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetConstructorFromName")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], interaxial_distance.asInstanceOf[js.Any], isStereoscopicSideBySide.asInstanceOf[js.Any])).asInstanceOf[js.Function0[this.type]]
  
  /**
    * This helps creating camera with an orthographic mode.
    * Orthographic is commonly used in engineering as a means to produce object specifications that communicate dimensions unambiguously, each line of 1 unit length (cm, meter..whatever) will appear to have the same length everywhere on the drawing. This allows the drafter to dimension only a subset of lines and let the reader know that other lines of that length on the drawing are also that length in reality. Every parallel line in the drawing is also parallel in the object.
    */
  @JSGlobal("BABYLON.Camera.ORTHOGRAPHIC_CAMERA")
  @js.native
  val ORTHOGRAPHIC_CAMERA: /* 1 */ Double = js.native
  
  /**
    * This is the default projection mode used by the cameras.
    * It helps recreating a feeling of perspective and better appreciate depth.
    * This is the best way to simulate real life cameras.
    */
  @JSGlobal("BABYLON.Camera.PERSPECTIVE_CAMERA")
  @js.native
  val PERSPECTIVE_CAMERA: /* 0 */ Double = js.native
  
  /**
    * Parse a JSON and creates the camera from the parsed information
    * @param parsedCamera The JSON to parse
    * @param scene The scene to instantiate the camera in
    * @returns the newly constructed camera
    */
  inline def Parse(parsedCamera: Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Camera = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Camera]
  
  /**
    * Custom rig mode allowing rig cameras to be populated manually with any number of cameras
    */
  @JSGlobal("BABYLON.Camera.RIG_MODE_CUSTOM")
  @js.native
  val RIG_MODE_CUSTOM: /* 22 */ Double = js.native
  
  /**
    * This specifies there is no need for a camera rig.
    * Basically only one eye is rendered corresponding to the camera.
    */
  @JSGlobal("BABYLON.Camera.RIG_MODE_NONE")
  @js.native
  val RIG_MODE_NONE: /* 0 */ Double = js.native
  
  /**
    * Simulates a camera Rig with one blue eye and one red eye.
    * This can be use with 3d blue and red glasses.
    */
  @JSGlobal("BABYLON.Camera.RIG_MODE_STEREOSCOPIC_ANAGLYPH")
  @js.native
  val RIG_MODE_STEREOSCOPIC_ANAGLYPH: /* 10 */ Double = js.native
  
  /**
    * Defines that both eyes of the camera will be rendered on successive lines interlaced for passive 3d monitors.
    */
  @JSGlobal("BABYLON.Camera.RIG_MODE_STEREOSCOPIC_INTERLACED")
  @js.native
  val RIG_MODE_STEREOSCOPIC_INTERLACED: /* 14 */ Double = js.native
  
  /**
    * Defines that both eyes of the camera will be rendered over under each other.
    */
  @JSGlobal("BABYLON.Camera.RIG_MODE_STEREOSCOPIC_OVERUNDER")
  @js.native
  val RIG_MODE_STEREOSCOPIC_OVERUNDER: /* 13 */ Double = js.native
  
  /**
    * Defines that both eyes of the camera will be rendered side by side with a none parallel target.
    */
  @JSGlobal("BABYLON.Camera.RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED")
  @js.native
  val RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED: /* 12 */ Double = js.native
  
  /**
    * Defines that both eyes of the camera will be rendered side by side with a parallel target.
    */
  @JSGlobal("BABYLON.Camera.RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL")
  @js.native
  val RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL: /* 11 */ Double = js.native
  
  /**
    * Defines that both eyes of the camera should be renderered in a VR mode (carbox).
    */
  @JSGlobal("BABYLON.Camera.RIG_MODE_VR")
  @js.native
  val RIG_MODE_VR: /* 20 */ Double = js.native
  
  /**
    * Defines that both eyes of the camera should be renderered in a VR mode (webVR).
    */
  @JSGlobal("BABYLON.Camera.RIG_MODE_WEBVR")
  @js.native
  val RIG_MODE_WEBVR: /* 21 */ Double = js.native
  
  /**
    * @param name
    * @param scene
    * @hidden
    */
  inline def _CreateDefaultParsedCamera(name: String, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Camera = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateDefaultParsedCamera")(name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Camera]
}
