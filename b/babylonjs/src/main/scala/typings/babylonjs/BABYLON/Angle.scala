package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Angle extends js.Object {
  var _radians: js.Any
  /**
    * Get value in degrees
    * @returns the Angle value in degrees (float)
    */
  def degrees(): Double
  /**
    * Get value in radians
    * @returns the Angle value in radians (float)
    */
  def radians(): Double
}

object Angle {
  @scala.inline
  def apply(_radians: js.Any, degrees: () => Double, radians: () => Double): Angle = {
    val __obj = js.Dynamic.literal(_radians = _radians.asInstanceOf[js.Any], degrees = js.Any.fromFunction0(degrees), radians = js.Any.fromFunction0(radians))
    __obj.asInstanceOf[Angle]
  }
}

