package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PointCollection")
@js.native
class PointCollection protected () extends Overlay {
  def this(points: js.Array[Point]) = this()
  def this(points: js.Array[Point], opts: PointCollectionOption) = this()
  def clear(): Unit = js.native
  def onclick(event: AnonType): Unit = js.native
  def onmouseout(event: AnonType): Unit = js.native
  def onmouseover(event: AnonType): Unit = js.native
  def setPoints(points: js.Array[Point]): Unit = js.native
  def setStyles(styles: PointCollectionOption): Unit = js.native
}

