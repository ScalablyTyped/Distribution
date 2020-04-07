package typings.babylonjs

import typings.babylonjs.BABYLON.Quaternion
import typings.babylonjs.BABYLON.RuntimeAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationsOriginalValue extends js.Object {
  var animations: js.Array[RuntimeAnimation]
  var originalValue: Quaternion
  var totalWeight: Double
}

object AnonAnimationsOriginalValue {
  @scala.inline
  def apply(animations: js.Array[RuntimeAnimation], originalValue: Quaternion, totalWeight: Double): AnonAnimationsOriginalValue = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnimationsOriginalValue]
  }
}

