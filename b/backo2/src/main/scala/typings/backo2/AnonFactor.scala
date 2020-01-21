package typings.backo2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactor extends js.Object {
  var factor: Double
  var jitter: Double
  var max: Double
  var min: Double
}

object AnonFactor {
  @scala.inline
  def apply(factor: Double, jitter: Double, max: Double, min: Double): AnonFactor = {
    val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFactor]
  }
}

