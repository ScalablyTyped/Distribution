package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("d3pie")
@js.native
class d3pie protected ()
  extends d3pieLib.d3pieNs.ID3PieChart {
  def this(id: java.lang.String, options: d3pieLib.d3pieNs.ID3PieOptions) = this()
  def this(id: stdLib.HTMLElement, options: d3pieLib.d3pieNs.ID3PieOptions) = this()
  /* CompleteClass */
  override def closeSegment(index: scala.Unit): scala.Unit = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def getOpenSegment(): js.Any = js.native
  /* CompleteClass */
  override def openSegment(index: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def redraw(): scala.Unit = js.native
  /* CompleteClass */
  override def updateProp(propKey: java.lang.String, value: js.Any): scala.Unit = js.native
}

