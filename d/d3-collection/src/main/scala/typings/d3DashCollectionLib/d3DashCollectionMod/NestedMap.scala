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
    clear: () => scala.Unit,
    each: js.Function3[
      (NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType, 
      /* key */ java.lang.String, 
      /* map */ Map[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType], 
      scala.Unit
    ] => scala.Unit,
    empty: () => scala.Boolean,
    entries: () => js.Array[
      d3DashCollectionLib.Anon_Key[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]
    ],
    get: java.lang.String => js.UndefOr[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType],
    has: java.lang.String => scala.Boolean,
    keys: () => js.Array[java.lang.String],
    remove: java.lang.String => scala.Boolean,
    set: (java.lang.String, (NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType) => NestedMap[Datum, RollupType],
    size: () => scala.Double,
    values: () => js.Array[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]
  ): NestedMap[Datum, RollupType] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), empty = js.Any.fromFunction0(empty), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[NestedMap[Datum, RollupType]]
  }
}

