package typings
package d3DashCollectionLib.d3DashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedMap[Datum, RollupType]
  extends Map[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]

object NestedMap {
  @scala.inline
  def apply[Datum, RollupType](
    clear: js.Function0[scala.Unit],
    each: js.Function1[
      js.Function3[
        (NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType, 
        /* key */ java.lang.String, 
        /* map */ Map[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType], 
        scala.Unit
      ], 
      scala.Unit
    ],
    empty: js.Function0[scala.Boolean],
    entries: js.Function0[
      js.Array[
        d3DashCollectionLib.Anon_Key[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]
      ]
    ],
    get: js.Function1[
      java.lang.String, 
      js.UndefOr[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]
    ],
    has: js.Function1[java.lang.String, scala.Boolean],
    keys: js.Function0[js.Array[java.lang.String]],
    remove: js.Function1[java.lang.String, scala.Boolean],
    set: js.Function2[
      java.lang.String, 
      (NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType, 
      NestedMap[Datum, RollupType]
    ],
    size: js.Function0[scala.Double],
    values: js.Function0[js.Array[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]]
  ): NestedMap[Datum, RollupType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("each")(each)
    __obj.updateDynamic("empty")(empty)
    __obj.updateDynamic("entries")(entries)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("keys")(keys)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[NestedMap[Datum, RollupType]]
  }
}

