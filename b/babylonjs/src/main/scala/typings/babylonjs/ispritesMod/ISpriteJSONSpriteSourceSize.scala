package typings.babylonjs.ispritesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpriteJSONSpriteSourceSize extends js.Object {
  /**
    * number of the original height of the Frame
    */
  var h: Double
  /**
    * number of the original width of the Frame
    */
  var w: Double
}

object ISpriteJSONSpriteSourceSize {
  @scala.inline
  def apply(h: Double, w: Double): ISpriteJSONSpriteSourceSize = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpriteJSONSpriteSourceSize]
  }
}

