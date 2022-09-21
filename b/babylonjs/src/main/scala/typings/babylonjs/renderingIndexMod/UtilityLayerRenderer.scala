package typings.babylonjs.renderingIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer")
@js.native
open class UtilityLayerRenderer protected ()
  extends typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer {
  /**
    * Instantiates a UtilityLayerRenderer
    * @param originalScene the original scene that will be rendered on top of
    * @param handleEvents boolean indicating if the utility layer should handle events
    */
  def this(/** the original scene that will be rendered on top of */
  originalScene: Scene) = this()
  def this(
    /** the original scene that will be rendered on top of */
  originalScene: Scene,
    handleEvents: Boolean
  ) = this()
}
/* static members */
object UtilityLayerRenderer {
  
  @JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an utility layer, and set it as a default utility layer
    * @param scene associated scene
    * @hidden
    */
  inline def _CreateDefaultUtilityLayerFromScene(scene: Scene): typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("_CreateDefaultUtilityLayerFromScene")(scene.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer]
  
  /** @hidden */
  @JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer._DefaultKeepDepthUtilityLayer")
  @js.native
  def _DefaultKeepDepthUtilityLayer: Nullable[typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer] = js.native
  inline def _DefaultKeepDepthUtilityLayer_=(x: Nullable[typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultKeepDepthUtilityLayer")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer._DefaultUtilityLayer")
  @js.native
  def _DefaultUtilityLayer: Nullable[typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer] = js.native
  inline def _DefaultUtilityLayer_=(x: Nullable[typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultUtilityLayer")(x.asInstanceOf[js.Any])
}
