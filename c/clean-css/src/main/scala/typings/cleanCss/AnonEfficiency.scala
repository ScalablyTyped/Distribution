package typings.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEfficiency extends js.Object {
  /**
    * `(originalSize - minifiedSize) / originalSize`, e.g. 0.25 if size is reduced from 100 bytes to 75 bytes
    */
  var efficiency: Double
  /**
    * Optimized content size
    */
  var minifiedSize: Double
  /**
    * Original content size after import inlining
    */
  var originalSize: Double
  /**
    * Time spent on optimizations in milliseconds
    */
  var timeSpent: Double
}

object AnonEfficiency {
  @scala.inline
  def apply(efficiency: Double, minifiedSize: Double, originalSize: Double, timeSpent: Double): AnonEfficiency = {
    val __obj = js.Dynamic.literal(efficiency = efficiency.asInstanceOf[js.Any], minifiedSize = minifiedSize.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any], timeSpent = timeSpent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEfficiency]
  }
}

