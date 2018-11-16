package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This represents a depth renderer in Babylon.
     * A depth renderer will render to it's depth map every frame which can be displayed or used in post processing
     */
@JSImport("babylonjs", "DepthRenderer")
@js.native
class DepthRenderer protected ()
  extends babylonjsLib.BABYLONNs.DepthRenderer {
  /**
           * Instantiates a depth renderer
           * @param scene The scene the renderer belongs to
           * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
           * @param camera The camera to be used to render the depth map (default: scene's active camera)
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Instantiates a depth renderer
           * @param scene The scene the renderer belongs to
           * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
           * @param camera The camera to be used to render the depth map (default: scene's active camera)
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene, `type`: scala.Double) = this()
  /**
           * Instantiates a depth renderer
           * @param scene The scene the renderer belongs to
           * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
           * @param camera The camera to be used to render the depth map (default: scene's active camera)
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene, `type`: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
}

