package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSize extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object ChartSize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): ChartSize = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[ChartSize]
  }
}

