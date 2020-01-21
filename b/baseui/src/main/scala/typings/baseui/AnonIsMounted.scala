package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsMounted extends js.Object {
  var isMounted: Boolean
}

object AnonIsMounted {
  @scala.inline
  def apply(isMounted: Boolean): AnonIsMounted = {
    val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsMounted]
  }
}

