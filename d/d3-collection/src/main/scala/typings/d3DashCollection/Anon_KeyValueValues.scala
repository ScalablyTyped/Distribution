package typings.d3DashCollection

import typings.d3DashCollection.d3DashCollectionMod.NestedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValueValues[Datum, RollupType] extends js.Object {
  var key: String
  var value: js.UndefOr[RollupType] = js.undefined
  var values: js.UndefOr[(NestedArray[Datum, RollupType]) | js.Array[Datum]] = js.undefined
}

object Anon_KeyValueValues {
  @scala.inline
  def apply[Datum, RollupType](
    key: String,
    value: RollupType = null,
    values: (NestedArray[Datum, RollupType]) | js.Array[Datum] = null
  ): Anon_KeyValueValues[Datum, RollupType] = {
    val __obj = js.Dynamic.literal(key = key)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyValueValues[Datum, RollupType]]
  }
}

