package typings
package d3DashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValueValuesAny[RollupType] extends js.Object {
  var key: java.lang.String
  var value: js.UndefOr[RollupType]
  var values: js.Any
}

object Anon_KeyValueValuesAny {
  @scala.inline
  def apply[RollupType](key: java.lang.String, values: js.Any, value: RollupType = null): Anon_KeyValueValuesAny[RollupType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("values")(values)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyValueValuesAny[RollupType]]
  }
}

