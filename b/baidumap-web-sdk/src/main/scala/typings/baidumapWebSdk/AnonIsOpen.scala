package typings.baidumapWebSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsOpen extends js.Object {
  var isOpen: Boolean
  var target: js.Any
  var `type`: String
}

object AnonIsOpen {
  @scala.inline
  def apply(isOpen: Boolean, target: js.Any, `type`: String): AnonIsOpen = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsOpen]
  }
}

