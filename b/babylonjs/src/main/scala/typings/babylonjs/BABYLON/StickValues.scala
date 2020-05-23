package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickValues extends js.Object {
  /**
    * The x component of the control stick
    */
  var x: Double
  /**
    * The y component of the control stick
    */
  var y: Double
}

object StickValues {
  @scala.inline
  def apply(x: Double, y: Double): StickValues = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickValues]
  }
}

