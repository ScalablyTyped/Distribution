package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationRange extends js.Object {
  /**The starting frame of the animation */
  var from: Double
  /**The name of the animation range**/
  var name: String
  /**The ending frame of the animation*/
  var to: Double
}

object AnimationRange {
  @scala.inline
  def apply(from: Double, name: String, to: Double): AnimationRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationRange]
  }
}

