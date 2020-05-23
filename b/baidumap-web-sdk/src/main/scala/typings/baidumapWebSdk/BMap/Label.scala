package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StringDictionary
import typings.baidumapWebSdk.anon.Target
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends Overlay {
  def addEventListener(event: String, handler: Callback): Unit
  def disableMassClear(): Unit
  def enableMassClear(): Unit
  def getMap(): Map
  def getOffset(): Size
  def getPosition(): Point
  def getTitle(): String
  def onclick(event: Target): Unit
  def ondblclick(event: Target): Unit
  def onmousedown(event: Target): Unit
  def onmouseout(event: Target): Unit
  def onmouseover(event: Target): Unit
  def onmouseup(event: Target): Unit
  def onremove(event: Target): Unit
  def onrightclick(event: Target): Unit
  def removeEventListener(event: String, handler: Callback): Unit
  def setContent(content: String): Unit
  def setOffset(offset: Size): Unit
  def setPosition(position: Point): Unit
  def setStyle(styles: StringDictionary[String | Double]): Unit
  def setTitle(title: String): Unit
  def setZIndex(zIndex: Double): Unit
}

object Label {
  @scala.inline
  def apply(
    addEventListener: (String, Callback) => Unit,
    disableMassClear: () => Unit,
    enableMassClear: () => Unit,
    getMap: () => Map,
    getOffset: () => Size,
    getPosition: () => Point,
    getTitle: () => String,
    onclick: Target => Unit,
    ondblclick: Target => Unit,
    onmousedown: Target => Unit,
    onmouseout: Target => Unit,
    onmouseover: Target => Unit,
    onmouseup: Target => Unit,
    onremove: Target => Unit,
    onrightclick: Target => Unit,
    removeEventListener: (String, Callback) => Unit,
    setContent: String => Unit,
    setOffset: Size => Unit,
    setPosition: Point => Unit,
    setStyle: StringDictionary[String | Double] => Unit,
    setTitle: String => Unit,
    setZIndex: Double => Unit,
    draw: () => Unit = null,
    hide: () => Unit = null,
    initialize: /* map */ Map => HTMLElement = null,
    isVisible: () => Boolean = null,
    show: () => Unit = null
  ): Label = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), disableMassClear = js.Any.fromFunction0(disableMassClear), enableMassClear = js.Any.fromFunction0(enableMassClear), getMap = js.Any.fromFunction0(getMap), getOffset = js.Any.fromFunction0(getOffset), getPosition = js.Any.fromFunction0(getPosition), getTitle = js.Any.fromFunction0(getTitle), onclick = js.Any.fromFunction1(onclick), ondblclick = js.Any.fromFunction1(ondblclick), onmousedown = js.Any.fromFunction1(onmousedown), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), onmouseup = js.Any.fromFunction1(onmouseup), onremove = js.Any.fromFunction1(onremove), onrightclick = js.Any.fromFunction1(onrightclick), removeEventListener = js.Any.fromFunction2(removeEventListener), setContent = js.Any.fromFunction1(setContent), setOffset = js.Any.fromFunction1(setOffset), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTitle = js.Any.fromFunction1(setTitle), setZIndex = js.Any.fromFunction1(setZIndex))
    if (draw != null) __obj.updateDynamic("draw")(js.Any.fromFunction0(draw))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1(initialize))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction0(isVisible))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    __obj.asInstanceOf[Label]
  }
}

