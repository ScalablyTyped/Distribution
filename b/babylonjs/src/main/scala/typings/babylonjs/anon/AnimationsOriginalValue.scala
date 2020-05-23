package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Quaternion
import typings.babylonjs.BABYLON.RuntimeAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationsOriginalValue extends js.Object {
  var animations: js.Array[RuntimeAnimation]
  var originalValue: Quaternion
  var totalWeight: Double
}

object AnimationsOriginalValue {
  @scala.inline
  def apply(animations: js.Array[RuntimeAnimation], originalValue: Quaternion, totalWeight: Double): AnimationsOriginalValue = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationsOriginalValue]
  }
}

