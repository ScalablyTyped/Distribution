package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Renders a layer on top of an existing scene
     */
@JSImport("babylonjs", "UtilityLayerRenderer")
@js.native
class UtilityLayerRenderer protected ()
  extends babylonjsLib.BABYLONNs.UtilityLayerRenderer {
  /**
           * Instantiates a UtilityLayerRenderer
           * @param originalScene the original scene that will be rendered on top of
           */
  def this(/** the original scene that will be rendered on top of */
  originalScene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
     * Renders a layer on top of an existing scene
     */
@JSImport("babylonjs", "UtilityLayerRenderer")
@js.native
object UtilityLayerRenderer extends js.Object {
  /**
           * A shared utility layer that can be used to embed objects into a scene (Depth map of the previous scene is not cleared before drawing on top of it)
           */
  val DefaultKeepDepthUtilityLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer = js.native
  /**
           * A shared utility layer that can be used to overlay objects into a scene (Depth map of the previous scene is cleared before drawing on top of it)
           */
  val DefaultUtilityLayer: babylonjsLib.BABYLONNs.UtilityLayerRenderer = js.native
  var _DefaultKeepDepthUtilityLayer: js.Any = js.native
  var _DefaultUtilityLayer: js.Any = js.native
}

