package typings.baseui

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var item: Option
}

object AnonItem {
  @scala.inline
  def apply(item: Option): AnonItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItem]
  }
}

