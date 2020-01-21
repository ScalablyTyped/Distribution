package typings.bootbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroup extends js.Object {
  var group: js.UndefOr[String] = js.undefined
  var text: String
  var value: String
}

object AnonGroup {
  @scala.inline
  def apply(text: String, value: String, group: String = null): AnonGroup = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroup]
  }
}

