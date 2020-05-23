package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.runtimeAnimationMod.RuntimeAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animations extends js.Object {
  var animations: js.Array[RuntimeAnimation]
  var originalValue: Matrix
  var totalWeight: Double
}

object Animations {
  @scala.inline
  def apply(animations: js.Array[RuntimeAnimation], originalValue: Matrix, totalWeight: Double): Animations = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animations]
  }
}

