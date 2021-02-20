package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthRenderer extends StObject {
  
  var _cachedDefines: js.Any = js.native
  
  var _camera: js.Any = js.native
  
  val _clearColor: js.Any = js.native
  
  var _depthMap: js.Any = js.native
  
  var _effect: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  val _storeNonLinearDepth: js.Any = js.native
  
  /**
    * Disposes of the depth renderer.
    */
  def dispose(): Unit = js.native
  
  /** Enable or disable the depth renderer. When disabled, the depth texture is not updated */
  var enabled: Boolean = js.native
  
  /**
    * Gets the texture which the depth map will be written to.
    * @returns The depth map texture
    */
  def getDepthMap(): RenderTargetTexture = js.native
  
  /** Get if the depth renderer is using packed depth or not */
  val isPacked: Boolean = js.native
  
  /**
    * Creates the depth rendering effect and checks if the effect is ready.
    * @param subMesh The submesh to be used to render the depth map of
    * @param useInstances If multiple world instances should be used
    * @returns if the depth renderer is ready to render the depth map
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  
  /**
    * Specifiess that the depth renderer will only be used within
    * the camera it is created for.
    * This can help forcing its rendering during the camera processing.
    */
  var useOnlyInActiveCamera: Boolean = js.native
}
object DepthRenderer {
  
  @scala.inline
  def apply(
    _cachedDefines: js.Any,
    _camera: js.Any,
    _clearColor: js.Any,
    _depthMap: js.Any,
    _effect: js.Any,
    _scene: js.Any,
    _storeNonLinearDepth: js.Any,
    dispose: () => Unit,
    enabled: Boolean,
    getDepthMap: () => RenderTargetTexture,
    isPacked: Boolean,
    isReady: (SubMesh, Boolean) => Boolean,
    useOnlyInActiveCamera: Boolean
  ): DepthRenderer = {
    val __obj = js.Dynamic.literal(_cachedDefines = _cachedDefines.asInstanceOf[js.Any], _camera = _camera.asInstanceOf[js.Any], _clearColor = _clearColor.asInstanceOf[js.Any], _depthMap = _depthMap.asInstanceOf[js.Any], _effect = _effect.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _storeNonLinearDepth = _storeNonLinearDepth.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enabled = enabled.asInstanceOf[js.Any], getDepthMap = js.Any.fromFunction0(getDepthMap), isPacked = isPacked.asInstanceOf[js.Any], isReady = js.Any.fromFunction2(isReady), useOnlyInActiveCamera = useOnlyInActiveCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthRenderer]
  }
  
  @scala.inline
  implicit class DepthRendererMutableBuilder[Self <: DepthRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDepthMap(value: () => RenderTargetTexture): Self = StObject.set(x, "getDepthMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPacked(value: Boolean): Self = StObject.set(x, "isPacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReady(value: (SubMesh, Boolean) => Boolean): Self = StObject.set(x, "isReady", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUseOnlyInActiveCamera(value: Boolean): Self = StObject.set(x, "useOnlyInActiveCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cachedDefines(value: js.Any): Self = StObject.set(x, "_cachedDefines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_camera(value: js.Any): Self = StObject.set(x, "_camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_clearColor(value: js.Any): Self = StObject.set(x, "_clearColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_depthMap(value: js.Any): Self = StObject.set(x, "_depthMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_effect(value: js.Any): Self = StObject.set(x, "_effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scene(value: js.Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_storeNonLinearDepth(value: js.Any): Self = StObject.set(x, "_storeNonLinearDepth", value.asInstanceOf[js.Any])
  }
}
