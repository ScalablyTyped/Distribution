package typings
package d3DashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValueValues[Datum, RollupType] extends js.Object {
  var key: java.lang.String
  var value: js.UndefOr[RollupType]
  var values: js.UndefOr[
    (d3DashCollectionLib.d3DashCollectionMod.NestedArray[Datum, RollupType]) | js.Array[Datum]
  ]
}

object Anon_KeyValueValues {
  @scala.inline
  def apply[Datum, RollupType](
    key: java.lang.String,
    value: RollupType = null,
    values: (d3DashCollectionLib.d3DashCollectionMod.NestedArray[Datum, RollupType]) | js.Array[Datum] = null
  ): Anon_KeyValueValues[Datum, RollupType] = {
    val __obj = js.Dynamic.literal(key = key)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyValueValues[Datum, RollupType]]
  }
}

