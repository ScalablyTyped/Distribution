package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DepthRenderer")
@js.native
class DepthRenderer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.DepthRenderer {
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
    `type`: Unit,
    camera: Nullable[typings.babylonjs.BABYLON.Camera]
  ) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, `type`: Double, camera: Unit, storeNonLinearDepth: Boolean) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    storeNonLinearDepth: Boolean
  ) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, `type`: Unit, camera: Unit, storeNonLinearDepth: Boolean) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    `type`: Unit,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    storeNonLinearDepth: Boolean
  ) = this()
  
  /* private */ /* CompleteClass */
  var _cachedDefines: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _camera: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override val _clearColor: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _depthMap: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _effect: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _scene: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override val _storeNonLinearDepth: js.Any = js.native
  
  /**
    * Disposes of the depth renderer.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /** Enable or disable the depth renderer. When disabled, the depth texture is not updated */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * Gets the texture which the depth map will be written to.
    * @returns The depth map texture
    */
  /* CompleteClass */
  override def getDepthMap(): typings.babylonjs.BABYLON.RenderTargetTexture = js.native
  
  /** Get if the depth renderer is using packed depth or not */
  /* CompleteClass */
  override val isPacked: Boolean = js.native
  
  /**
    * Creates the depth rendering effect and checks if the effect is ready.
    * @param subMesh The submesh to be used to render the depth map of
    * @param useInstances If multiple world instances should be used
    * @returns if the depth renderer is ready to render the depth map
    */
  /* CompleteClass */
  override def isReady(subMesh: typings.babylonjs.BABYLON.SubMesh, useInstances: Boolean): Boolean = js.native
  
  /**
    * Specifiess that the depth renderer will only be used within
    * the camera it is created for.
    * This can help forcing its rendering during the camera processing.
    */
  /* CompleteClass */
  var useOnlyInActiveCamera: Boolean = js.native
}
/* static members */
object DepthRenderer {
  
  @JSGlobal("BABYLON.DepthRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.BABYLON.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
