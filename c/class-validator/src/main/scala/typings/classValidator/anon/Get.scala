package typings.classValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get extends js.Object {
  def get(someClass: js.Any): js.Any
}

object Get {
  @scala.inline
  def apply(get: js.Any => js.Any): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Get]
  }
}

