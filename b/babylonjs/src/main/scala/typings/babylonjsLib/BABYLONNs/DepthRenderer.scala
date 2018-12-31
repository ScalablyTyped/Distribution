package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a depth renderer in Babylon.
  * A depth renderer will render to it's depth map every frame which can be displayed or used in post processing
  */
@JSGlobal("BABYLON.DepthRenderer")
@js.native
class DepthRenderer protected () extends js.Object {
  /**
    * Instantiates a depth renderer
    * @param scene The scene the renderer belongs to
    * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
    * @param camera The camera to be used to render the depth map (default: scene's active camera)
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, `type`: scala.Double) = this()
  def this(scene: Scene, `type`: scala.Double, camera: Nullable[Camera]) = this()
  var _cachedDefines: js.Any = js.native
  var _camera: js.Any = js.native
  var _depthMap: js.Any = js.native
  var _effect: js.Any = js.native
  var _scene: js.Any = js.native
  /**
    * Specifiess that the depth renderer will only be used within
    * the camera it is created for.
    * This can help forcing its rendering during the camera processing.
    */
  var useOnlyInActiveCamera: scala.Boolean = js.native
  /**
    * Disposes of the depth renderer.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Gets the texture which the depth map will be written to.
    * @returns The depth map texture
    */
  def getDepthMap(): RenderTargetTexture = js.native
  /**
    * Creates the depth rendering effect and checks if the effect is ready.
    * @param subMesh The submesh to be used to render the depth map of
    * @param useInstances If multiple world instances should be used
    * @returns if the depth renderer is ready to render the depth map
    */
  def isReady(subMesh: SubMesh, useInstances: scala.Boolean): scala.Boolean = js.native
}

