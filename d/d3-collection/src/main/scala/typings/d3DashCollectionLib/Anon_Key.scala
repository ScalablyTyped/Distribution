package typings
package d3DashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[T] extends js.Object {
  var key: java.lang.String
  var value: T
}

object Anon_Key {
  @scala.inline
  def apply[T](key: java.lang.String, value: T): Anon_Key[T] = {
    val __obj = js.Dynamic.literal(key = key, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key[T]]
  }
}

