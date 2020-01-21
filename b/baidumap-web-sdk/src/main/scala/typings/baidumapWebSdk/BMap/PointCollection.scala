package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.AnonPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PointCollection")
@js.native
class PointCollection protected () extends Overlay {
  def this(points: js.Array[Point]) = this()
  def this(points: js.Array[Point], opts: PointCollectionOption) = this()
  def clear(): Unit = js.native
  def onclick(event: AnonPoint): Unit = js.native
  def onmouseout(event: AnonPoint): Unit = js.native
  def onmouseover(event: AnonPoint): Unit = js.native
  def setPoints(points: js.Array[Point]): Unit = js.native
  def setStyles(styles: PointCollectionOption): Unit = js.native
}

