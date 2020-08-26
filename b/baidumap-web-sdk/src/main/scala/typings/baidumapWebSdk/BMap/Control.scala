package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control extends js.Object {
  var defaultAnchor: ControlAnchor = js.native
  var defaultOffset: Size = js.native
  def getAnchor(): ControlAnchor = js.native
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  def getContainer(): js.UndefOr[HTMLElement] = js.native
  def getOffset(): Size = js.native
  def hide(): Unit = js.native
  def initialize(map: Map): HTMLElement = js.native
  def isVisible(): Boolean = js.native
  def setAnchor(anchor: ControlAnchor): Unit = js.native
  def setOffset(offset: Size): Unit = js.native
  def show(): Unit = js.native
}

object Control {
  @scala.inline
  def apply(
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getOffset: () => Size,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    show: () => Unit
  ): Control = {
    val __obj = js.Dynamic.literal(defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getOffset = js.Any.fromFunction0(getOffset), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Control]
  }
  @scala.inline
  implicit class ControlOps[Self <: Control] (val x: Self) extends AnyVal {
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
    def setDefaultAnchor(value: ControlAnchor): Self = this.set("defaultAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultOffset(value: Size): Self = this.set("defaultOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAnchor(value: () => ControlAnchor): Self = this.set("getAnchor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContainer(value: () => js.UndefOr[HTMLElement]): Self = this.set("getContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOffset(value: () => Size): Self = this.set("getOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialize(value: Map => HTMLElement): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAnchor(value: ControlAnchor => Unit): Self = this.set("setAnchor", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOffset(value: Size => Unit): Self = this.set("setOffset", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

