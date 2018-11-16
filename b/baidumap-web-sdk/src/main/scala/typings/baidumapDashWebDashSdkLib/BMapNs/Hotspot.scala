package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Hotspot")
@js.native
class Hotspot protected () extends Overlay {
  def this(position: Point) = this()
  def this(position: Point, opts: HotspotOptions) = this()
  def getPosition(): Point = js.native
  def getText(): java.lang.String = js.native
  def getUserData(): js.Any = js.native
  def setPosition(position: Point): scala.Unit = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
  def setUserData(data: js.Any): scala.Unit = js.native
}

