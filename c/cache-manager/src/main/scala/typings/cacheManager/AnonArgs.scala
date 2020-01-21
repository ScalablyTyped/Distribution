package typings.cacheManager

import typings.cacheManager.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  def create(args: js.Any*): Store
}

object AnonArgs {
  @scala.inline
  def apply(create: /* repeated */ js.Any => Store): AnonArgs = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[AnonArgs]
  }
}

