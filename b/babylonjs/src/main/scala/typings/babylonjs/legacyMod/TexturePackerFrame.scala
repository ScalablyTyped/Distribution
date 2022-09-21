package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "TexturePackerFrame")
@js.native
open class TexturePackerFrame protected ()
  extends typings.babylonjs.indexMod.TexturePackerFrame {
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
