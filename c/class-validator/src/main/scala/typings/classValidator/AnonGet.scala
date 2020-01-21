package typings.classValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(someClass: js.Any): js.Any
}

object AnonGet {
  @scala.inline
  def apply(get: js.Any => js.Any): AnonGet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[AnonGet]
  }
}

