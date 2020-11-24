package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    `type`: js.UndefOr[scala.Nothing],
    camera: Nullable[typings.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    `type`: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Camera]],
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Camera]],
    storeNonLinearDepth: Boolean
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.DepthRenderer")
@js.native
object DepthRenderer extends js.Object {
  
  /** @hidden */
  def _SceneComponentInitialization(scene: typings.babylonjs.BABYLON.Scene): Unit = js.native
}
