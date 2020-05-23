package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsMounted extends js.Object {
  var isMounted: Boolean
}

object IsMounted {
  @scala.inline
  def apply(isMounted: Boolean): IsMounted = {
    val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMounted]
  }
}

