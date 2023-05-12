package typings.babylonjs.renderingIndexMod

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/index", "DepthRenderer")
@js.native
open class DepthRenderer protected ()
  extends typings.babylonjs.renderingDepthRendererMod.DepthRenderer {
  /**
    * Instantiates a depth renderer
    * @param scene The scene the renderer belongs to
    * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
    * @param camera The camera to be used to render the depth map (default: scene's active camera)
    * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
    * @param samplingMode The sampling mode to be used with the render target (Linear, Nearest...) (default: TRILINEAR_SAMPLINGMODE)
    * @param storeCameraSpaceZ Defines whether the depth stored is the Z coordinate in camera space. If true, storeNonLinearDepth has no effect. (Default: false)
    * @param name Name of the render target (default: DepthRenderer)
    */
  def this(
    scene: Scene,
    `type`: js.UndefOr[Double],
    camera: js.UndefOr[Nullable[Camera]],
    storeNonLinearDepth: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    storeCameraSpaceZ: js.UndefOr[Boolean],
    name: js.UndefOr[String]
  ) = this()
}
/* static members */
object DepthRenderer {
  
  @JSImport("babylonjs/Rendering/index", "DepthRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
