package typings.backo2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factor extends js.Object {
  var factor: Double
  var jitter: Double
  var max: Double
  var min: Double
}

object Anon_Factor {
  @scala.inline
  def apply(factor: Double, jitter: Double, max: Double, min: Double): Anon_Factor = {
    val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Factor]
  }
}

