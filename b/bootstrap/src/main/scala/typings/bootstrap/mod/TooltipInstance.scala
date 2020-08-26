package typings.bootstrap.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipInstance[T /* <: TooltipOption */] extends js.Object {
  var config: T = js.native
  var element: Element = js.native
  var tip: HTMLElement = js.native
}

object TooltipInstance {
  @scala.inline
  def apply[/* <: typings.bootstrap.mod.TooltipOption */ T](config: T, element: Element, tip: HTMLElement): TooltipInstance[T] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipInstance[T]]
  }
  @scala.inline
  implicit class TooltipInstanceOps[Self <: TooltipInstance[_], /* <: typings.bootstrap.mod.TooltipOption */ T] (val x: Self with TooltipInstance[T]) extends AnyVal {
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
    def setConfig(value: T): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setTip(value: HTMLElement): Self = this.set("tip", value.asInstanceOf[js.Any])
  }
  
}

