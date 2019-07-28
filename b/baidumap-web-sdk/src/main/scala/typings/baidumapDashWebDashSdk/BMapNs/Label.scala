package typings.baidumapDashWebDashSdk.BMapNs

import org.scalablytyped.runtime.StringDictionary
import typings.baidumapDashWebDashSdk.Anon_Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Label")
@js.native
class Label protected () extends Overlay {
  def this(content: String) = this()
  def this(content: String, opts: LabelOptions) = this()
  def addEventListener(event: String, handler: Callback): Unit = js.native
  def disableMassClear(): Unit = js.native
  def enableMassClear(): Unit = js.native
  def getMap(): Map = js.native
  def getOffset(): Size = js.native
  def getPosition(): Point = js.native
  def getTitle(): String = js.native
  def onclick(event: Anon_Target): Unit = js.native
  def ondblclick(event: Anon_Target): Unit = js.native
  def onmousedown(event: Anon_Target): Unit = js.native
  def onmouseout(event: Anon_Target): Unit = js.native
  def onmouseover(event: Anon_Target): Unit = js.native
  def onmouseup(event: Anon_Target): Unit = js.native
  def onremove(event: Anon_Target): Unit = js.native
  def onrightclick(event: Anon_Target): Unit = js.native
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setOffset(offset: Size): Unit = js.native
  def setPosition(position: Point): Unit = js.native
  def setStyle(styles: StringDictionary[String | Double]): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

