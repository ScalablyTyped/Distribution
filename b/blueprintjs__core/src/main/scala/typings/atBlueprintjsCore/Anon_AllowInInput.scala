package typings.atBlueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowInInput extends js.Object {
  var allowInInput: Boolean
  var disabled: Boolean
  var global: Boolean
  var preventDefault: Boolean
  var stopPropagation: Boolean
}

object Anon_AllowInInput {
  @scala.inline
  def apply(
    allowInInput: Boolean,
    disabled: Boolean,
    global: Boolean,
    preventDefault: Boolean,
    stopPropagation: Boolean
  ): Anon_AllowInInput = {
    val __obj = js.Dynamic.literal(allowInInput = allowInInput, disabled = disabled, global = global, preventDefault = preventDefault, stopPropagation = stopPropagation)
  
    __obj.asInstanceOf[Anon_AllowInInput]
  }
}

