package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "UtilityLayerRenderer")
@js.native
class UtilityLayerRenderer protected ()
  extends typings.babylonjs.renderingIndexMod.UtilityLayerRenderer {
  /**
    * Instantiates a UtilityLayerRenderer
    * @param originalScene the original scene that will be rendered on top of
    * @param handleEvents boolean indicating if the utility layer should handle events
    */
  def this(/** the original scene that will be rendered on top of */
  originalScene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    /** the original scene that will be rendered on top of */
  originalScene: typings.babylonjs.sceneMod.Scene,
    handleEvents: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/index", "UtilityLayerRenderer")
@js.native
object UtilityLayerRenderer extends js.Object {
  var _DefaultKeepDepthUtilityLayer: js.Any = js.native
  var _DefaultUtilityLayer: js.Any = js.native
  /**
    * A shared utility layer that can be used to embed objects into a scene (Depth map of the previous scene is not cleared before drawing on top of it)
    */
  def DefaultKeepDepthUtilityLayer(): typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer = js.native
  /**
    * A shared utility layer that can be used to overlay objects into a scene (Depth map of the previous scene is cleared before drawing on top of it)
    */
  def DefaultUtilityLayer(): typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer = js.native
}

