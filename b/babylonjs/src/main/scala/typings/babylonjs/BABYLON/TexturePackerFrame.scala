package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.TexturePackerFrame")
@js.native
class TexturePackerFrame protected () extends ITexturePackerFrame {
  /**
    * Initializes a texture package frame.
    * @param id The numerical frame identifier
    * @param scale Scalar Vector2 for UV frame
    * @param offset Vector2 for the frame position in UV units.
    * @returns TexturePackerFrame
    */
  def this(id: Double, scale: Vector2, offset: Vector2) = this()
  /**
    * The frame ID
    */
  /* CompleteClass */
  override var id: Double = js.native
  /**
    * The Frames offset
    */
  /* CompleteClass */
  override var offset: Vector2 = js.native
  /**
    * The frames Scale
    */
  /* CompleteClass */
  override var scale: Vector2 = js.native
}

