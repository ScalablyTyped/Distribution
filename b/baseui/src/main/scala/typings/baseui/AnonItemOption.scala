package typings.baseui

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemOption extends js.Object {
  var item: Option
}

object AnonItemOption {
  @scala.inline
  def apply(item: Option): AnonItemOption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemOption]
  }
}

