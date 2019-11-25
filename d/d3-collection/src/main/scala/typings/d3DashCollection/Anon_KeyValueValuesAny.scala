package typings.d3DashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValueValuesAny[RollupType] extends js.Object {
  var key: String
  var value: js.UndefOr[RollupType] = js.undefined
  var values: js.Any
}

object Anon_KeyValueValuesAny {
  @scala.inline
  def apply[RollupType](key: String, values: js.Any, value: RollupType = null): Anon_KeyValueValuesAny[RollupType] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyValueValuesAny[RollupType]]
  }
}

