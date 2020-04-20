package typings.blueprintjsCore

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButton extends js.Object {
  def button(ref: HTMLElement): Unit
}

object AnonButton {
  @scala.inline
  def apply(button: HTMLElement => Unit): AnonButton = {
    val __obj = js.Dynamic.literal(button = js.Any.fromFunction1(button))
    __obj.asInstanceOf[AnonButton]
  }
}

