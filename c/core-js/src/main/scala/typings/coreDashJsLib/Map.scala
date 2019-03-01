package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map[K, V] extends js.Object {
  def toJSON(): js.Any
}

object Map {
  @scala.inline
  def apply[K, V](toJSON: js.Function0[js.Any]): Map[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[Map[K, V]]
  }
}

