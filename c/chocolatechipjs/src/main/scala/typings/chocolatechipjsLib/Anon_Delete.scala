package typings
package chocolatechipjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delete extends js.Object {
  var _delete: js.Function
  var hasKey: js.Function
  var keys: js.Array[_]
  var set: js.Function
  var values: js.Array[_]
}

object Anon_Delete {
  @scala.inline
  def apply(
    _delete: js.Function,
    hasKey: js.Function,
    keys: js.Array[_],
    set: js.Function,
    values: js.Array[_]
  ): Anon_Delete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_delete")(_delete)
    __obj.updateDynamic("hasKey")(hasKey)
    __obj.updateDynamic("keys")(keys)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Anon_Delete]
  }
}

