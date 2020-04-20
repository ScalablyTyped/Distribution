package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInd extends js.Object {
  var ind: Double
  var sqDistance: Double
}

object AnonInd {
  @scala.inline
  def apply(ind: Double, sqDistance: Double): AnonInd = {
    val __obj = js.Dynamic.literal(ind = ind.asInstanceOf[js.Any], sqDistance = sqDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInd]
  }
}

