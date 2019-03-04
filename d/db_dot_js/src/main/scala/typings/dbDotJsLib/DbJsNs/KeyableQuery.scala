package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyableQuery[T] extends js.Object {
  def keys(): KeysQuery[T]
}

object KeyableQuery {
  @scala.inline
  def apply[T](keys: js.Function0[KeysQuery[T]]): KeyableQuery[T] = {
    val __obj = js.Dynamic.literal(keys = keys)
  
    __obj.asInstanceOf[KeyableQuery[T]]
  }
}

