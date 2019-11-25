package typings.d3DashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[T] extends js.Object {
  var key: String
  var value: T
}

object Anon_Key {
  @scala.inline
  def apply[T](key: String, value: T): Anon_Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key[T]]
  }
}

