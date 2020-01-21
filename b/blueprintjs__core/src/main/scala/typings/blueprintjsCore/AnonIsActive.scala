package typings.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsActive extends js.Object {
  var isActive: Boolean
}

object AnonIsActive {
  @scala.inline
  def apply(isActive: Boolean): AnonIsActive = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsActive]
  }
}

