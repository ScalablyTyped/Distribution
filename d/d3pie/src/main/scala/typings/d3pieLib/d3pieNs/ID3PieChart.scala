package typings
package d3pieLib.d3pieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieChart extends js.Object {
  def closeSegment(index: scala.Unit): scala.Unit
  def destroy(): scala.Unit
  def getOpenSegment(): js.Any
  def openSegment(index: scala.Double): scala.Unit
  def redraw(): scala.Unit
  def updateProp(propKey: java.lang.String, value: js.Any): scala.Unit
}

object ID3PieChart {
  @scala.inline
  def apply(
    closeSegment: scala.Unit => scala.Unit,
    destroy: () => scala.Unit,
    getOpenSegment: () => js.Any,
    openSegment: scala.Double => scala.Unit,
    redraw: () => scala.Unit,
    updateProp: (java.lang.String, js.Any) => scala.Unit
  ): ID3PieChart = {
    val __obj = js.Dynamic.literal(closeSegment = js.Any.fromFunction1(closeSegment), destroy = js.Any.fromFunction0(destroy), getOpenSegment = js.Any.fromFunction0(getOpenSegment), openSegment = js.Any.fromFunction1(openSegment), redraw = js.Any.fromFunction0(redraw), updateProp = js.Any.fromFunction2(updateProp))
  
    __obj.asInstanceOf[ID3PieChart]
  }
}

