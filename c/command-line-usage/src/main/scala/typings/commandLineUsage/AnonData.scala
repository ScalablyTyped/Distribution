package typings.commandLineUsage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Any
  var options: js.Any
}

object AnonData {
  @scala.inline
  def apply(data: js.Any, options: js.Any): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

