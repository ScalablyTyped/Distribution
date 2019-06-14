package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Label")
@js.native
class Label protected () extends Overlay {
  def this(content: java.lang.String) = this()
  def this(content: java.lang.String, opts: LabelOptions) = this()
  def addEventListener(event: java.lang.String, handler: Callback): scala.Unit = js.native
  def disableMassClear(): scala.Unit = js.native
  def enableMassClear(): scala.Unit = js.native
  def getMap(): Map = js.native
  def getOffset(): Size = js.native
  def getPosition(): Point = js.native
  def getTitle(): java.lang.String = js.native
  def onclick(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def ondblclick(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmousedown(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmouseout(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmouseover(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onmouseup(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onremove(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def onrightclick(event: baidumapDashWebDashSdkLib.Anon_Target): scala.Unit = js.native
  def removeEventListener(event: java.lang.String, handler: Callback): scala.Unit = js.native
  def setContent(content: java.lang.String): scala.Unit = js.native
  def setOffset(offset: Size): scala.Unit = js.native
  def setPosition(position: Point): scala.Unit = js.native
  def setStyle(styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

