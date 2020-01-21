package typings.chocolatechipjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelete extends js.Object {
  var _delete: js.Function
  var hasKey: js.Function
  var keys: js.Array[_]
  var set: js.Function
  var values: js.Array[_]
}

object AnonDelete {
  @scala.inline
  def apply(
    _delete: js.Function,
    hasKey: js.Function,
    keys: js.Array[_],
    set: js.Function,
    values: js.Array[_]
  ): AnonDelete = {
    val __obj = js.Dynamic.literal(_delete = _delete.asInstanceOf[js.Any], hasKey = hasKey.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDelete]
  }
}

