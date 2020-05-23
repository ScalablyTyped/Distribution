package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepthRenderer extends js.Object {
  var _cachedDefines: js.Any
  var _camera: js.Any
  val _clearColor: js.Any
  var _depthMap: js.Any
  var _effect: js.Any
  var _scene: js.Any
  val _storeNonLinearDepth: js.Any
  /** Enable or disable the depth renderer. When disabled, the depth texture is not updated */
  var enabled: Boolean
  /** Get if the depth renderer is using packed depth or not */
  val isPacked: Boolean
  /**
    * Specifiess that the depth renderer will only be used within
    * the camera it is created for.
    * This can help forcing its rendering during the camera processing.
    */
  var useOnlyInActiveCamera: Boolean
  /**
    * Disposes of the depth renderer.
    */
  def dispose(): Unit
  /**
    * Gets the texture which the depth map will be written to.
    * @returns The depth map texture
    */
  def getDepthMap(): RenderTargetTexture
  /**
    * Creates the depth rendering effect and checks if the effect is ready.
    * @param subMesh The submesh to be used to render the depth map of
    * @param useInstances If multiple world instances should be used
    * @returns if the depth renderer is ready to render the depth map
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean
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
}

