package typings.baidumapDashWebDashSdk.BMapNs

import typings.baidumapDashWebDashSdk.Anon_Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.GroundOverlay")
@js.native
class GroundOverlay protected () extends Overlay {
  def this(bounds: Bounds) = this()
  def this(bounds: Bounds, opts: GroundOverlayOptions) = this()
  def getBounds(): Bounds = js.native
  def getDispalyOnMaxLevel(): Double = js.native
  def getDisplayOnMinLevel(): Double = js.native
  def getImageURL(): String = js.native
  def getOpacity(): Double = js.native
  def onclick(event: Anon_Target): Unit = js.native
  def ondblclick(event: Anon_Target): Unit = js.native
  def setBounds(bounds: Bounds): Unit = js.native
  def setDispalyOnMaxLevel(level: Double): Unit = js.native
  def setDisplayOnMinLevel(level: Double): Unit = js.native
  def setImageURL(url: String): Unit = js.native
  def setOpacity(opcity: Double): Unit = js.native
}

