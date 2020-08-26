package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleControl extends Control {
  def getUnit(): LengthUnit = js.native
  def setUnit(unit: LengthUnit): Unit = js.native
}

object ScaleControl {
  @scala.inline
  def apply(
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getOffset: () => Size,
    getUnit: () => LengthUnit,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    setUnit: LengthUnit => Unit,
    show: () => Unit
  ): ScaleControl = {
    val __obj = js.Dynamic.literal(defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getOffset = js.Any.fromFunction0(getOffset), getUnit = js.Any.fromFunction0(getUnit), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), setUnit = js.Any.fromFunction1(setUnit), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ScaleControl]
  }
  @scala.inline
  implicit class ScaleControlOps[Self <: ScaleControl] (val x: Self) extends AnyVal {
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
    def setGetUnit(value: () => LengthUnit): Self = this.set("getUnit", js.Any.fromFunction0(value))
    @scala.inline
    def setSetUnit(value: LengthUnit => Unit): Self = this.set("setUnit", js.Any.fromFunction1(value))
  }
  
}

