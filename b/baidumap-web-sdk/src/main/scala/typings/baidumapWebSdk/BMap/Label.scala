package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StringDictionary
import typings.baidumapWebSdk.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends Overlay {
  def addEventListener(event: String, handler: Callback): Unit = js.native
  def disableMassClear(): Unit = js.native
  def enableMassClear(): Unit = js.native
  def getMap(): Map = js.native
  def getOffset(): Size = js.native
  def getPosition(): Point = js.native
  def getTitle(): String = js.native
  def onclick(event: Target): Unit = js.native
  def ondblclick(event: Target): Unit = js.native
  def onmousedown(event: Target): Unit = js.native
  def onmouseout(event: Target): Unit = js.native
  def onmouseover(event: Target): Unit = js.native
  def onmouseup(event: Target): Unit = js.native
  def onremove(event: Target): Unit = js.native
  def onrightclick(event: Target): Unit = js.native
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setOffset(offset: Size): Unit = js.native
  def setPosition(position: Point): Unit = js.native
  def setStyle(styles: StringDictionary[String | Double]): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
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
    setZIndex: Double => Unit
  ): Label = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), disableMassClear = js.Any.fromFunction0(disableMassClear), enableMassClear = js.Any.fromFunction0(enableMassClear), getMap = js.Any.fromFunction0(getMap), getOffset = js.Any.fromFunction0(getOffset), getPosition = js.Any.fromFunction0(getPosition), getTitle = js.Any.fromFunction0(getTitle), onclick = js.Any.fromFunction1(onclick), ondblclick = js.Any.fromFunction1(ondblclick), onmousedown = js.Any.fromFunction1(onmousedown), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), onmouseup = js.Any.fromFunction1(onmouseup), onremove = js.Any.fromFunction1(onremove), onrightclick = js.Any.fromFunction1(onrightclick), removeEventListener = js.Any.fromFunction2(removeEventListener), setContent = js.Any.fromFunction1(setContent), setOffset = js.Any.fromFunction1(setOffset), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTitle = js.Any.fromFunction1(setTitle), setZIndex = js.Any.fromFunction1(setZIndex))
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddEventListener(value: (String, Callback) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def setDisableMassClear(value: () => Unit): Self = this.set("disableMassClear", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableMassClear(value: () => Unit): Self = this.set("enableMassClear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMap(value: () => Map): Self = this.set("getMap", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOffset(value: () => Size): Self = this.set("getOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPosition(value: () => Point): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setOnclick(value: Target => Unit): Self = this.set("onclick", js.Any.fromFunction1(value))
    @scala.inline
    def setOndblclick(value: Target => Unit): Self = this.set("ondblclick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnmousedown(value: Target => Unit): Self = this.set("onmousedown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnmouseout(value: Target => Unit): Self = this.set("onmouseout", js.Any.fromFunction1(value))
    @scala.inline
    def setOnmouseover(value: Target => Unit): Self = this.set("onmouseover", js.Any.fromFunction1(value))
    @scala.inline
    def setOnmouseup(value: Target => Unit): Self = this.set("onmouseup", js.Any.fromFunction1(value))
    @scala.inline
    def setOnremove(value: Target => Unit): Self = this.set("onremove", js.Any.fromFunction1(value))
    @scala.inline
    def setOnrightclick(value: Target => Unit): Self = this.set("onrightclick", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveEventListener(value: (String, Callback) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def setSetContent(value: String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOffset(value: Size => Unit): Self = this.set("setOffset", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPosition(value: Point => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStyle(value: StringDictionary[String | Double] => Unit): Self = this.set("setStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetZIndex(value: Double => Unit): Self = this.set("setZIndex", js.Any.fromFunction1(value))
  }
  
}

