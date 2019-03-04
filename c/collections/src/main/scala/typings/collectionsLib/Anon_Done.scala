package typings
package collectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Done[T] extends js.Object {
  var done: collectionsLib.collectionsLibNumbers.`true`
  var value: js.UndefOr[T | scala.Null]
}

object Anon_Done {
  @scala.inline
  def apply[T](done: collectionsLib.collectionsLibNumbers.`true`, value: T = null): Anon_Done[T] = {
    val __obj = js.Dynamic.literal(done = done)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Done[T]]
  }
}

