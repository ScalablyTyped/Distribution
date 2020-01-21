package typings.baidumapWebSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: js.Any
  var target: js.Any
  var `type`: String
}

object AnonContent {
  @scala.inline
  def apply(content: js.Any, target: js.Any, `type`: String): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

