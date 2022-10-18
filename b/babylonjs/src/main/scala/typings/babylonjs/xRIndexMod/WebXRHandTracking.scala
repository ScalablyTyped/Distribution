package typings.babylonjs.xRIndexMod

import typings.babylonjs.xRFeaturesWebXRHandTrackingMod.IWebXRHandTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRHandTracking")
@js.native
open class WebXRHandTracking protected ()
  extends typings.babylonjs.xRFeaturesIndexMod.WebXRHandTracking {
  /**
    * Creates a new instance of the XR hand tracking feature.
    * @param _xrSessionManager An instance of WebXRSessionManager.
    * @param options Options to use when constructing this feature.
    */
  def this(
    _xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    /** Options to use when constructing this feature. */
  options: IWebXRHandTrackingOptions
  ) = this()
}
/* static members */
object WebXRHandTracking {
  
  @JSImport("babylonjs/XR/index", "WebXRHandTracking")
  @js.native
  val ^ : js.Any = js.native
  
  /** The base URL for the default hand model. */
  @JSImport("babylonjs/XR/index", "WebXRHandTracking.DEFAULT_HAND_MODEL_BASE_URL")
  @js.native
  def DEFAULT_HAND_MODEL_BASE_URL: String = js.native
  inline def DEFAULT_HAND_MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HAND_MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /** The filename to use for the default left hand model. */
  @JSImport("babylonjs/XR/index", "WebXRHandTracking.DEFAULT_HAND_MODEL_LEFT_FILENAME")
  @js.native
  def DEFAULT_HAND_MODEL_LEFT_FILENAME: String = js.native
  inline def DEFAULT_HAND_MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HAND_MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
  
  /** The filename to use for the default right hand model. */
  @JSImport("babylonjs/XR/index", "WebXRHandTracking.DEFAULT_HAND_MODEL_RIGHT_FILENAME")
  @js.native
  def DEFAULT_HAND_MODEL_RIGHT_FILENAME: String = js.native
  inline def DEFAULT_HAND_MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HAND_MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
  
  /** The URL pointing to the default hand model NodeMaterial shader. */
  @JSImport("babylonjs/XR/index", "WebXRHandTracking.DEFAULT_HAND_MODEL_SHADER_URL")
  @js.native
  def DEFAULT_HAND_MODEL_SHADER_URL: String = js.native
  inline def DEFAULT_HAND_MODEL_SHADER_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HAND_MODEL_SHADER_URL")(x.asInstanceOf[js.Any])
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/index", "WebXRHandTracking.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/index", "WebXRHandTracking.Version")
  @js.native
  val Version: Double = js.native
  
  /**
    * Generates a mapping from XRHandJoint to bone name for the default hand mesh.
    * @param handedness The handedness being mapped for.
    */
  @JSImport("babylonjs/XR/index", "WebXRHandTracking._GenerateDefaultHandMeshRigMapping")
  @js.native
  def _GenerateDefaultHandMeshRigMapping: Any = js.native
  inline def _GenerateDefaultHandMeshRigMapping_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GenerateDefaultHandMeshRigMapping")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/XR/index", "WebXRHandTracking._GenerateDefaultHandMeshesAsync")
  @js.native
  def _GenerateDefaultHandMeshesAsync: Any = js.native
  inline def _GenerateDefaultHandMeshesAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GenerateDefaultHandMeshesAsync")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/XR/index", "WebXRHandTracking._GenerateTrackedJointMeshes")
  @js.native
  def _GenerateTrackedJointMeshes: Any = js.native
  inline def _GenerateTrackedJointMeshes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GenerateTrackedJointMeshes")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/XR/index", "WebXRHandTracking._ICOSPHERE_PARAMS")
  @js.native
  val _ICOSPHERE_PARAMS: Any = js.native
  
  @JSImport("babylonjs/XR/index", "WebXRHandTracking._LeftHandGLB")
  @js.native
  def _LeftHandGLB: Any = js.native
  inline def _LeftHandGLB_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LeftHandGLB")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/XR/index", "WebXRHandTracking._RightHandGLB")
  @js.native
  def _RightHandGLB: Any = js.native
  inline def _RightHandGLB_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RightHandGLB")(x.asInstanceOf[js.Any])
}
