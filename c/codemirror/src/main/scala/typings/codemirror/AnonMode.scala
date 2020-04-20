package typings.codemirror

import typings.codemirror.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var mode: Mode[_]
  var state: js.Any
}

object AnonMode {
  @scala.inline
  def apply(mode: Mode[_], state: js.Any): AnonMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMode]
  }
}

