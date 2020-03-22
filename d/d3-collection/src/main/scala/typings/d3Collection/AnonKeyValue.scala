package typings.d3Collection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyValue[RollupType] extends js.Object {
  var key: String
  var value: js.UndefOr[RollupType] = js.undefined
  var values: js.Any
}

object AnonKeyValue {
  @scala.inline
  def apply[RollupType](key: String, values: js.Any, value: RollupType = null): AnonKeyValue[RollupType] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyValue[RollupType]]
  }
}

