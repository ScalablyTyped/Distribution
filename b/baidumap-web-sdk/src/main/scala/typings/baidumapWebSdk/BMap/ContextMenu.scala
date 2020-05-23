package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenu extends js.Object {
  def addItem(item: MenuItem): Unit
  def addSeparator(): Unit
  def getItem(index: Double): MenuItem
  def onclose(event: typings.baidumapWebSdk.anon.Pixel): Unit
  def onopen(event: typings.baidumapWebSdk.anon.Pixel): Unit
  def removeItem(item: MenuItem): Unit
  def removeSeparator(index: Double): Unit
}

object ContextMenu {
  @scala.inline
  def apply(
    addItem: MenuItem => Unit,
    addSeparator: () => Unit,
    getItem: Double => MenuItem,
    onclose: typings.baidumapWebSdk.anon.Pixel => Unit,
    onopen: typings.baidumapWebSdk.anon.Pixel => Unit,
    removeItem: MenuItem => Unit,
    removeSeparator: Double => Unit
  ): ContextMenu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), addSeparator = js.Any.fromFunction0(addSeparator), getItem = js.Any.fromFunction1(getItem), onclose = js.Any.fromFunction1(onclose), onopen = js.Any.fromFunction1(onopen), removeItem = js.Any.fromFunction1(removeItem), removeSeparator = js.Any.fromFunction1(removeSeparator))
    __obj.asInstanceOf[ContextMenu]
  }
}

