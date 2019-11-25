package typings.circuitDashBreakerDashJs.circuitDashBreakerDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var errorCount: Double
  var errorPercentage: Double
  var totalCount: Double
}

object Metrics {
  @scala.inline
  def apply(errorCount: Double, errorPercentage: Double, totalCount: Double): Metrics = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], errorPercentage = errorPercentage.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Metrics]
  }
}

