package typings
package cleanDashCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Efficiency extends js.Object {
  /**
    * `(originalSize - minifiedSize) / originalSize`, e.g. 0.25 if size is reduced from 100 bytes to 75 bytes
    */
  var efficiency: scala.Double
  /**
    * Optimized content size
    */
  var minifiedSize: scala.Double
  /**
    * Original content size after import inlining
    */
  var originalSize: scala.Double
  /**
    * Time spent on optimizations in milliseconds
    */
  var timeSpent: scala.Double
}

object Anon_Efficiency {
  @scala.inline
  def apply(
    efficiency: scala.Double,
    minifiedSize: scala.Double,
    originalSize: scala.Double,
    timeSpent: scala.Double
  ): Anon_Efficiency = {
    val __obj = js.Dynamic.literal(efficiency = efficiency, minifiedSize = minifiedSize, originalSize = originalSize, timeSpent = timeSpent)
  
    __obj.asInstanceOf[Anon_Efficiency]
  }
}

