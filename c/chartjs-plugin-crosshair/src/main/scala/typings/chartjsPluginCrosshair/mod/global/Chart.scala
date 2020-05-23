package typings.chartjsPluginCrosshair.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  def panZoom(increment: Double): Unit
}

object Chart {
  @scala.inline
  def apply(panZoom: Double => Unit): Chart = {
    val __obj = js.Dynamic.literal(panZoom = js.Any.fromFunction1(panZoom))
    __obj.asInstanceOf[Chart]
  }
}

