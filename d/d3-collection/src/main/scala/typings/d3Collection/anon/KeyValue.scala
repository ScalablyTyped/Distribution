package typings.d3Collection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValue[RollupType] extends js.Object {
  var key: String
  var value: js.UndefOr[RollupType] = js.undefined
  var values: js.Any
}

object KeyValue {
  @scala.inline
  def apply[RollupType](key: String, values: js.Any, value: RollupType = null): KeyValue[RollupType] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValue[RollupType]]
  }
}

