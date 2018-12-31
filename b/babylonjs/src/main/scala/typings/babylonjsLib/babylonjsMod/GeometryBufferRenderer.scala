package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This renderer is helpfull to fill one of the render target with a geometry buffer.
  */
@JSImport("babylonjs", "GeometryBufferRenderer")
@js.native
class GeometryBufferRenderer protected ()
  extends babylonjsLib.BABYLONNs.GeometryBufferRenderer {
  /**
    * Creates a new G Buffer for the scene
    * @param scene The scene the buffer belongs to
    * @param ratio How big is the buffer related to the main canvas.
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(scene: babylonjsLib.BABYLONNs.Scene, ratio: scala.Double) = this()
}

