package typings.blueprintjsSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var disabled: Boolean
  var resetOnQuery: Boolean
}

object AnonDisabled {
  @scala.inline
  def apply(disabled: Boolean, resetOnQuery: Boolean): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], resetOnQuery = resetOnQuery.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabled]
  }
}

