package typings.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsOpen extends js.Object {
  var isOpen: Boolean
  var target: js.Any
  var `type`: String
}

object IsOpen {
  @scala.inline
  def apply(isOpen: Boolean, target: js.Any, `type`: String): IsOpen = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOpen]
  }
}

