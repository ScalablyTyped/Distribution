package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.runtimeAnimationMod.RuntimeAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalValue extends js.Object {
  var animations: js.Array[RuntimeAnimation]
  var originalValue: Quaternion
  var totalWeight: Double
}

object OriginalValue {
  @scala.inline
  def apply(animations: js.Array[RuntimeAnimation], originalValue: Quaternion, totalWeight: Double): OriginalValue = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalValue]
  }
}

