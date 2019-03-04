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
    closeSegment: js.Function1[scala.Unit, scala.Unit],
    destroy: js.Function0[scala.Unit],
    getOpenSegment: js.Function0[js.Any],
    openSegment: js.Function1[scala.Double, scala.Unit],
    redraw: js.Function0[scala.Unit],
    updateProp: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): ID3PieChart = {
    val __obj = js.Dynamic.literal(closeSegment = closeSegment, destroy = destroy, getOpenSegment = getOpenSegment, openSegment = openSegment, redraw = redraw, updateProp = updateProp)
  
    __obj.asInstanceOf[ID3PieChart]
  }
}

