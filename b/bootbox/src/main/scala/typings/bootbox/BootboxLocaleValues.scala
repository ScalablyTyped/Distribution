package typings.bootbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootboxLocaleValues extends js.Object {
  var CANCEL: String
  var CONFIRM: String
  var OK: String
}

object BootboxLocaleValues {
  @scala.inline
  def apply(CANCEL: String, CONFIRM: String, OK: String): BootboxLocaleValues = {
    val __obj = js.Dynamic.literal(CANCEL = CANCEL, CONFIRM = CONFIRM, OK = OK)
  
    __obj.asInstanceOf[BootboxLocaleValues]
  }
}

