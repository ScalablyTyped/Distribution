package typings.blueprintjsSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  var disabled: Boolean
  var resetOnQuery: Boolean
}

object Disabled {
  @scala.inline
  def apply(disabled: Boolean, resetOnQuery: Boolean): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], resetOnQuery = resetOnQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
}

