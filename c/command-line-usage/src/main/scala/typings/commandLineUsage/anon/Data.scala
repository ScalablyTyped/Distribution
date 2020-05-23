package typings.commandLineUsage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Any
  var options: js.Any
}

object Data {
  @scala.inline
  def apply(data: js.Any, options: js.Any): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

