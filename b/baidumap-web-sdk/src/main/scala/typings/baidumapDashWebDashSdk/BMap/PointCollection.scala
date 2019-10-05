package typings.baidumapDashWebDashSdk.BMap

import typings.baidumapDashWebDashSdk.Anon_Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PointCollection")
@js.native
class PointCollection protected () extends Overlay {
  def this(points: js.Array[Point]) = this()
  def this(points: js.Array[Point], opts: PointCollectionOption) = this()
  def clear(): Unit = js.native
  def onclick(event: Anon_Point): Unit = js.native
  def onmouseout(event: Anon_Point): Unit = js.native
  def onmouseover(event: Anon_Point): Unit = js.native
  def setPoints(points: js.Array[Point]): Unit = js.native
  def setStyles(styles: PointCollectionOption): Unit = js.native
}

