package typings.classDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Get extends js.Object {
  def get(someClass: js.Any): js.Any
}

object Anon_Get {
  @scala.inline
  def apply(get: js.Any => js.Any): Anon_Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[Anon_Get]
  }
}

