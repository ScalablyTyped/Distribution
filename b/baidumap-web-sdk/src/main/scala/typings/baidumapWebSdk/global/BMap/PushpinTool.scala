package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.PushpinToolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PushpinTool")
@js.native
class PushpinTool protected ()
  extends typings.baidumapWebSdk.BMap.PushpinTool {
  def this(map: typings.baidumapWebSdk.BMap.Map) = this()
  def this(map: typings.baidumapWebSdk.BMap.Map, opts: PushpinToolOptions) = this()
  /* CompleteClass */
  override def close(): Boolean = js.native
  /* CompleteClass */
  override def getCursor(): String = js.native
  /* CompleteClass */
  override def getIcon(): typings.baidumapWebSdk.BMap.Icon = js.native
  /* CompleteClass */
  override def onmarkend(event: typings.baidumapWebSdk.anon.Marker): Unit = js.native
  /* CompleteClass */
  override def open(): Boolean = js.native
  /* CompleteClass */
  override def setCursor(cursor: String): String = js.native
  /* CompleteClass */
  override def setIcon(icon: typings.baidumapWebSdk.BMap.Icon): typings.baidumapWebSdk.BMap.Icon = js.native
}

