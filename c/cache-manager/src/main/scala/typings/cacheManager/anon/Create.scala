package typings.cacheManager.anon

import typings.cacheManager.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  def create(args: js.Any*): Store
}

object Create {
  @scala.inline
  def apply(create: /* repeated */ js.Any => Store): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Create]
  }
}

