package typings.codemirror

import typings.codemirror.codemirrorMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: Mode[_]
  var state: js.Any
}

object Anon_Mode {
  @scala.inline
  def apply(mode: Mode[_], state: js.Any): Anon_Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Mode]
  }
}

