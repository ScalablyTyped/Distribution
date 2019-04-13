package typings
package circuitDashBreakerDashJsLib.circuitDashBreakerDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var errorCount: scala.Double
  var errorPercentage: scala.Double
  var totalCount: scala.Double
}

object Metrics {
  @scala.inline
  def apply(errorCount: scala.Double, errorPercentage: scala.Double, totalCount: scala.Double): Metrics = {
    val __obj = js.Dynamic.literal(errorCount = errorCount, errorPercentage = errorPercentage, totalCount = totalCount)
  
    __obj.asInstanceOf[Metrics]
  }
}

