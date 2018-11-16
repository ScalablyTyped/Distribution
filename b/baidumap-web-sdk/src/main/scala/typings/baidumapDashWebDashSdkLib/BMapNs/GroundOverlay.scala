package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.GroundOverlay")
@js.native
class GroundOverlay protected () extends Overlay {
  def this(bounds: Bounds) = this()
  def this(bounds: Bounds, opts: GroundOverlayOptions) = this()
  def getBounds(): Bounds = js.native
  def getDispalyOnMaxLevel(): scala.Double = js.native
  def getDisplayOnMinLevel(): scala.Double = js.native
  def getImageURL(): java.lang.String = js.native
  def getOpacity(): scala.Double = js.native
  def onclick(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def ondblclick(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def setBounds(bounds: Bounds): scala.Unit = js.native
  def setDispalyOnMaxLevel(level: scala.Double): scala.Unit = js.native
  def setDisplayOnMinLevel(level: scala.Double): scala.Unit = js.native
  def setImageURL(url: java.lang.String): scala.Unit = js.native
  def setOpacity(opcity: scala.Double): scala.Unit = js.native
}

