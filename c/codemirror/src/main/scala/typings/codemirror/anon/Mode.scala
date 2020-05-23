package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var mode: typings.codemirror.mod.Mode[_]
  var state: js.Any
}

object Mode {
  @scala.inline
  def apply(mode: typings.codemirror.mod.Mode[_], state: js.Any): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

