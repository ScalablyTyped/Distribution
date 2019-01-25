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

