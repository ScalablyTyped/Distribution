package typings.dbDotJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyableQuery[T] extends js.Object {
  def keys(): KeysQuery[T]
}

object KeyableQuery {
  @scala.inline
  def apply[T](keys: () => KeysQuery[T]): KeyableQuery[T] = {
    val __obj = js.Dynamic.literal(keys = js.Any.fromFunction0(keys))
  
    __obj.asInstanceOf[KeyableQuery[T]]
  }
}

