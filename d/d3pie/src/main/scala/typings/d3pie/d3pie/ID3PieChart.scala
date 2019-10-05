package typings.d3pie.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieChart extends js.Object {
  def closeSegment(index: Unit): Unit
  def destroy(): Unit
  def getOpenSegment(): js.Any
  def openSegment(index: Double): Unit
  def redraw(): Unit
  def updateProp(propKey: String, value: js.Any): Unit
}

object ID3PieChart {
  @scala.inline
  def apply(
    closeSegment: Unit => Unit,
    destroy: () => Unit,
    getOpenSegment: () => js.Any,
    openSegment: Double => Unit,
    redraw: () => Unit,
    updateProp: (String, js.Any) => Unit
  ): ID3PieChart = {
    val __obj = js.Dynamic.literal(closeSegment = js.Any.fromFunction1(closeSegment), destroy = js.Any.fromFunction0(destroy), getOpenSegment = js.Any.fromFunction0(getOpenSegment), openSegment = js.Any.fromFunction1(openSegment), redraw = js.Any.fromFunction0(redraw), updateProp = js.Any.fromFunction2(updateProp))
  
    __obj.asInstanceOf[ID3PieChart]
  }
}

