package typings.cypress.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplifiedMap extends SimplifiedSet {
  def get(key: js.Any): js.Any
}

object SimplifiedMap {
  @scala.inline
  def apply(get: js.Any => js.Any, has: js.Any => Boolean): SimplifiedMap = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[SimplifiedMap]
  }
}

