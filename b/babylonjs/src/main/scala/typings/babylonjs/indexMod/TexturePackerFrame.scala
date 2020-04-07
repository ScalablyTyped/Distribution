package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "TexturePackerFrame")
@js.native
class TexturePackerFrame protected ()
  extends typings.babylonjs.materialsIndexMod.TexturePackerFrame {
  /**
    * Initializes a texture package frame.
    * @param id The numerical frame identifier
    * @param scale Scalar Vector2 for UV frame
    * @param offset Vector2 for the frame position in UV units.
    * @returns TexturePackerFrame
    */
  def this(
    id: Double,
    scale: typings.babylonjs.mathVectorMod.Vector2,
    offset: typings.babylonjs.mathVectorMod.Vector2
  ) = this()
}

