package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpriteJSONSpriteFrameData extends js.Object {
  /**
    * number of the height of the Frame
    */
  var h: Double
  /**
    * number of the width of the Frame
    */
  var w: Double
  /**
    * number of the x offset of the Frame
    */
  var x: Double
  /**
    * number of the y offset of the Frame
    */
  var y: Double
}

object ISpriteJSONSpriteFrameData {
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): ISpriteJSONSpriteFrameData = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpriteJSONSpriteFrameData]
  }
}

