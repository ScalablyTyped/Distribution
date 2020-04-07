package typings.babylonjs.frameMod

import typings.babylonjs.mathVectorMod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITexturePackerFrame extends js.Object {
  /**
    * The frame ID
    */
  var id: Double
  /**
    * The Frames offset
    */
  var offset: Vector2
  /**
    * The frames Scale
    */
  var scale: Vector2
}

object ITexturePackerFrame {
  @scala.inline
  def apply(id: Double, offset: Vector2, scale: Vector2): ITexturePackerFrame = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITexturePackerFrame]
  }
}

