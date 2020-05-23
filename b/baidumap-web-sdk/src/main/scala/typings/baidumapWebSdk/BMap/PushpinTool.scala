package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushpinTool extends js.Object {
  def close(): Boolean
  def getCursor(): String
  def getIcon(): Icon
  def onmarkend(event: typings.baidumapWebSdk.anon.Marker): Unit
  def open(): Boolean
  def setCursor(cursor: String): String
  def setIcon(icon: Icon): Icon
}

object PushpinTool {
  @scala.inline
  def apply(
    close: () => Boolean,
    getCursor: () => String,
    getIcon: () => Icon,
    onmarkend: typings.baidumapWebSdk.anon.Marker => Unit,
    open: () => Boolean,
    setCursor: String => String,
    setIcon: Icon => Icon
  ): PushpinTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getCursor = js.Any.fromFunction0(getCursor), getIcon = js.Any.fromFunction0(getIcon), onmarkend = js.Any.fromFunction1(onmarkend), open = js.Any.fromFunction0(open), setCursor = js.Any.fromFunction1(setCursor), setIcon = js.Any.fromFunction1(setIcon))
    __obj.asInstanceOf[PushpinTool]
  }
}

