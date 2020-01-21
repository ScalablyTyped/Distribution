package typings.d3Collection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey[T] extends js.Object {
  var key: String
  var value: T
}

object AnonKey {
  @scala.inline
  def apply[T](key: String, value: T): AnonKey[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey[T]]
  }
}

