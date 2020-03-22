package typings.baseui

import typings.react.mod.FormEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValues extends js.Object {
  var event: FormEvent[HTMLInputElement]
  var values: js.Array[String]
}

object AnonValues {
  @scala.inline
  def apply(event: FormEvent[HTMLInputElement], values: js.Array[String]): AnonValues = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValues]
  }
}

