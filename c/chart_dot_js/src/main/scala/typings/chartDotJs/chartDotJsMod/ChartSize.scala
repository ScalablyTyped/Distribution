package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSize extends js.Object {
  var height: Double
  var width: Double
}

object ChartSize {
  @scala.inline
  def apply(height: Double, width: Double): ChartSize = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[ChartSize]
  }
}

