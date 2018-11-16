package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PointCollection")
@js.native
class PointCollection protected () extends Overlay {
  def this(points: js.Array[Point]) = this()
  def this(points: js.Array[Point], opts: PointCollectionOption) = this()
  def clear(): scala.Unit = js.native
  def onclick(event: baidumapDashWebDashSdkLib.Anon_Type): scala.Unit = js.native
  def onmouseout(event: baidumapDashWebDashSdkLib.Anon_Type): scala.Unit = js.native
  def onmouseover(event: baidumapDashWebDashSdkLib.Anon_Type): scala.Unit = js.native
  def setPoints(points: js.Array[Point]): scala.Unit = js.native
  def setStyles(styles: PointCollectionOption): scala.Unit = js.native
}

