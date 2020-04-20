package typings.cacheManager

import typings.cacheManager.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  def create(args: js.Any*): Store
}

object AnonCreate {
  @scala.inline
  def apply(create: /* repeated */ js.Any => Store): AnonCreate = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[AnonCreate]
  }
}

