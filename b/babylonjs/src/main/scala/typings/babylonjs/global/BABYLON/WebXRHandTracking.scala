package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRHandTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRHandTracking")
@js.native
open class WebXRHandTracking protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRHandTracking {
  /**
    * Creates a new instance of the XR hand tracking feature.
    * @param _xrSessionManager An instance of WebXRSessionManager.
    * @param options Options to use when constructing this feature.
    */
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    /** Options to use when constructing this feature. */
  options: IWebXRHandTrackingOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRHandTracking {
  
  @JSGlobal("BABYLON.WebXRHandTracking")
  @js.native
  val ^ : js.Any = js.native
  
  /** The base URL for the default hand model. */
  @JSGlobal("BABYLON.WebXRHandTracking.DEFAULT_HAND_MODEL_BASE_URL")
  @js.native
  def DEFAULT_HAND_MODEL_BASE_URL: String = js.native
  inline def DEFAULT_HAND_MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HAND_MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /** The filename to use for the default left hand model. */
  @JSGlobal("BABYLON.WebXRHandTracking.DEFAULT_HAND_MODEL_LEFT_FILENAME")
  @js.native
  def DEFAULT_HAND_MODEL_LEFT_FILENAME: String = js.native
  inline def DEFAULT_HAND_MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HAND_MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
  
  /** The filename to use for the default right hand model. */
  @JSGlobal("BABYLON.WebXRHandTracking.DEFAULT_HAND_MODEL_RIGHT_FILENAME")
  @js.native
  def DEFAULT_HAND_MODEL_RIGHT_FILENAME: String = js.native
  inline def DEFAULT_HAND_MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HAND_MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
  
  /** The URL pointing to the default hand model NodeMaterial shader. */
  @JSGlobal("BABYLON.WebXRHandTracking.DEFAULT_HAND_MODEL_SHADER_URL")
  @js.native
  def DEFAULT_HAND_MODEL_SHADER_URL: String = js.native
  inline def DEFAULT_HAND_MODEL_SHADER_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HAND_MODEL_SHADER_URL")(x.asInstanceOf[js.Any])
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRHandTracking.Name")
  @js.native
  val Name: /* "xr-hand-tracking" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRHandTracking.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
  
  /**
    * Generates a mapping from XRHandJoint to bone name for the default hand mesh.
    * @param handedness The handedness being mapped for.
    */
  @JSGlobal("BABYLON.WebXRHandTracking._GenerateDefaultHandMeshRigMapping")
  @js.native
  def _GenerateDefaultHandMeshRigMapping: Any = js.native
  inline def _GenerateDefaultHandMeshRigMapping_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GenerateDefaultHandMeshRigMapping")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebXRHandTracking._GenerateDefaultHandMeshesAsync")
  @js.native
  def _GenerateDefaultHandMeshesAsync: Any = js.native
  inline def _GenerateDefaultHandMeshesAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GenerateDefaultHandMeshesAsync")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebXRHandTracking._GenerateTrackedJointMeshes")
  @js.native
  def _GenerateTrackedJointMeshes: Any = js.native
  inline def _GenerateTrackedJointMeshes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GenerateTrackedJointMeshes")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebXRHandTracking._ICOSPHERE_PARAMS")
  @js.native
  val _ICOSPHERE_PARAMS: Any = js.native
  
  @JSGlobal("BABYLON.WebXRHandTracking._LeftHandGLB")
  @js.native
  def _LeftHandGLB: Any = js.native
  inline def _LeftHandGLB_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LeftHandGLB")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebXRHandTracking._RightHandGLB")
  @js.native
  def _RightHandGLB: Any = js.native
  inline def _RightHandGLB_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RightHandGLB")(x.asInstanceOf[js.Any])
}
