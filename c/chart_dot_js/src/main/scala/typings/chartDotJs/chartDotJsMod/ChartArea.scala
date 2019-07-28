package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartArea extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object ChartArea {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): ChartArea = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[ChartArea]
  }
}

