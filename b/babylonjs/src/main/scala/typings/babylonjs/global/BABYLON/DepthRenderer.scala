package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DepthRenderer")
@js.native
class DepthRenderer protected ()
  extends typings.babylonjs.BABYLON.DepthRenderer {
  /**
    * Instantiates a depth renderer
    * @param scene The scene the renderer belongs to
    * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
    * @param camera The camera to be used to render the depth map (default: scene's active camera)
    * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, `type`: Double) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    storeNonLinearDepth: Boolean
  ) = this()
  /* CompleteClass */
  override var _cachedDefines: js.Any = js.native
  /* CompleteClass */
  override var _camera: js.Any = js.native
  /* CompleteClass */
  override val _clearColor: js.Any = js.native
  /* CompleteClass */
  override var _depthMap: js.Any = js.native
  /* CompleteClass */
  override var _effect: js.Any = js.native
  /* CompleteClass */
  override var _scene: js.Any = js.native
  /* CompleteClass */
  override val _storeNonLinearDepth: js.Any = js.native
  /** Enable or disable the depth renderer. When disabled, the depth texture is not updated */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /** Get if the depth renderer is using packed depth or not */
  /* CompleteClass */
  override val isPacked: Boolean = js.native
  /**
    * Specifiess that the depth renderer will only be used within
    * the camera it is created for.
    * This can help forcing its rendering during the camera processing.
    */
  /* CompleteClass */
  override var useOnlyInActiveCamera: Boolean = js.native
  /**
    * Disposes of the depth renderer.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Gets the texture which the depth map will be written to.
    * @returns The depth map texture
    */
  /* CompleteClass */
  override def getDepthMap(): typings.babylonjs.BABYLON.RenderTargetTexture = js.native
  /**
    * Creates the depth rendering effect and checks if the effect is ready.
    * @param subMesh The submesh to be used to render the depth map of
    * @param useInstances If multiple world instances should be used
    * @returns if the depth renderer is ready to render the depth map
    */
  /* CompleteClass */
  override def isReady(subMesh: typings.babylonjs.BABYLON.SubMesh, useInstances: Boolean): Boolean = js.native
}

/* static members */
@JSGlobal("BABYLON.DepthRenderer")
@js.native
object DepthRenderer extends js.Object {
  /** @hidden */
  def _SceneComponentInitialization(scene: typings.babylonjs.BABYLON.Scene): Unit = js.native
}

