package typings.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowInInput extends js.Object {
  var allowInInput: Boolean
  var disabled: Boolean
  var global: Boolean
  var preventDefault: Boolean
  var stopPropagation: Boolean
}

object AllowInInput {
  @scala.inline
  def apply(
    allowInInput: Boolean,
    disabled: Boolean,
    global: Boolean,
    preventDefault: Boolean,
    stopPropagation: Boolean
  ): AllowInInput = {
    val __obj = js.Dynamic.literal(allowInInput = allowInInput.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowInInput]
  }
}

