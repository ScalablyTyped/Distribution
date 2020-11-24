package typings.babylonjs.materialsIndexMod

import typings.babylonjs.mathVectorMod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "TexturePackerFrame")
@js.native
class TexturePackerFrame protected ()
  extends typings.babylonjs.texturesIndexMod.TexturePackerFrame {
  /**
    * Initializes a texture package frame.
    * @param id The numerical frame identifier
    * @param scale Scalar Vector2 for UV frame
    * @param offset Vector2 for the frame position in UV units.
    * @returns TexturePackerFrame
    */
  def this(id: Double, scale: Vector2, offset: Vector2) = this()
}
