package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.AnonMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PushpinTool")
@js.native
class PushpinTool protected () extends js.Object {
  def this(map: Map) = this()
  def this(map: Map, opts: PushpinToolOptions) = this()
  def close(): Boolean = js.native
  def getCursor(): String = js.native
  def getIcon(): Icon = js.native
  def onmarkend(event: AnonMarker): Unit = js.native
  def open(): Boolean = js.native
  def setCursor(cursor: String): String = js.native
  def setIcon(icon: Icon): Icon = js.native
}

