package typings.concurrently.concurrentlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandObj extends js.Object {
  var command: String
  var name: js.UndefOr[String] = js.undefined
  var prefixColor: js.UndefOr[String] = js.undefined
}

object CommandObj {
  @scala.inline
  def apply(command: String, name: String = null, prefixColor: String = null): CommandObj = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefixColor != null) __obj.updateDynamic("prefixColor")(prefixColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandObj]
  }
}

