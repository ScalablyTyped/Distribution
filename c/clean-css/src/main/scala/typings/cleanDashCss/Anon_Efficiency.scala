package typings.cleanDashCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Efficiency extends js.Object {
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

object Anon_Efficiency {
  @scala.inline
  def apply(efficiency: Double, minifiedSize: Double, originalSize: Double, timeSpent: Double): Anon_Efficiency = {
    val __obj = js.Dynamic.literal(efficiency = efficiency, minifiedSize = minifiedSize, originalSize = originalSize, timeSpent = timeSpent)
  
    __obj.asInstanceOf[Anon_Efficiency]
  }
}

