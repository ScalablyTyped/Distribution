package typings.bootstrap.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipInstance[T /* <: TooltipOption */] extends js.Object {
  var config: T
  var element: Element
  var tip: HTMLElement
}

object TooltipInstance {
  @scala.inline
  def apply[/* <: typings.bootstrap.mod.TooltipOption */ T](config: T, element: Element, tip: HTMLElement): TooltipInstance[T] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipInstance[T]]
  }
}

