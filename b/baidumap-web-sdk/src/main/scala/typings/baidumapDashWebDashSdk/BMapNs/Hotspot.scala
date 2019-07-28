package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Hotspot")
@js.native
class Hotspot protected () extends Overlay {
  def this(position: Point) = this()
  def this(position: Point, opts: HotspotOptions) = this()
  def getPosition(): Point = js.native
  def getText(): String = js.native
  def getUserData(): js.Any = js.native
  def setPosition(position: Point): Unit = js.native
  def setText(text: String): Unit = js.native
  def setUserData(data: js.Any): Unit = js.native
}

