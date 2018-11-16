package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PanoramaLabel")
@js.native
class PanoramaLabel protected () extends js.Object {
  def this(content: java.lang.String) = this()
  def this(content: java.lang.String, opts: PanoramaLabelOptions) = this()
  def addEventListener(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def getAltitude(): scala.Double = js.native
  def getContent(): java.lang.String = js.native
  def getPosition(): Point = js.native
  def getPov(): PanoramaPov = js.native
  def hide(): scala.Unit = js.native
  def onclick(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def onmouseout(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def onmouseover(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def onremove(event: baidumapDashWebDashSdkLib.Anon_TypeTarget): scala.Unit = js.native
  def removeEventListener(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def setAltitude(altitude: scala.Double): scala.Unit = js.native
  def setContent(content: java.lang.String): scala.Unit = js.native
  def setPosition(position: Point): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

