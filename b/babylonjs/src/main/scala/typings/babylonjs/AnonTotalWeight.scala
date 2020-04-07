package typings.babylonjs

import typings.babylonjs.BABYLON.Matrix
import typings.babylonjs.BABYLON.RuntimeAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTotalWeight extends js.Object {
  var animations: js.Array[RuntimeAnimation]
  var originalValue: Matrix
  var totalWeight: Double
}

object AnonTotalWeight {
  @scala.inline
  def apply(animations: js.Array[RuntimeAnimation], originalValue: Matrix, totalWeight: Double): AnonTotalWeight = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTotalWeight]
  }
}

