package typings.bootbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var group: js.UndefOr[String] = js.undefined
  var text: String
  var value: String
}

object Group {
  @scala.inline
  def apply(text: String, value: String, group: String = null): Group = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

