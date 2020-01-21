package typings.baidumapWebSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromitem extends js.Object {
  var fromitem: js.Any
  var target: js.Any
  var toitem: js.Any
  var `type`: String
}

object AnonFromitem {
  @scala.inline
  def apply(fromitem: js.Any, target: js.Any, toitem: js.Any, `type`: String): AnonFromitem = {
    val __obj = js.Dynamic.literal(fromitem = fromitem.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], toitem = toitem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromitem]
  }
}

