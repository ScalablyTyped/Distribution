package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Control extends js.Object {
  var defaultAnchor: ControlAnchor
  var defaultOffset: Size
  def getAnchor(): ControlAnchor
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  def getContainer(): js.UndefOr[HTMLElement]
  def getOffset(): Size
  def hide(): Unit
  def initialize(map: Map): HTMLElement
  def isVisible(): Boolean
  def setAnchor(anchor: ControlAnchor): Unit
  def setOffset(offset: Size): Unit
  def show(): Unit
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
}

