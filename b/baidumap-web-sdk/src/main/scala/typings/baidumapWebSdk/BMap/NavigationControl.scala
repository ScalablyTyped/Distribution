package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationControl extends Control {
  def getType(): NavigationControlOptions = js.native
  def setType(`type`: NavigationControlType): Unit = js.native
}

object NavigationControl {
  @scala.inline
  def apply(
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getOffset: () => Size,
    getType: () => NavigationControlOptions,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    setType: NavigationControlType => Unit,
    show: () => Unit
  ): NavigationControl = {
    val __obj = js.Dynamic.literal(defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getOffset = js.Any.fromFunction0(getOffset), getType = js.Any.fromFunction0(getType), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), setType = js.Any.fromFunction1(setType), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[NavigationControl]
  }
  @scala.inline
  implicit class NavigationControlOps[Self <: NavigationControl] (val x: Self) extends AnyVal {
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
    def setGetType(value: () => NavigationControlOptions): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setSetType(value: NavigationControlType => Unit): Self = this.set("setType", js.Any.fromFunction1(value))
  }
  
}

