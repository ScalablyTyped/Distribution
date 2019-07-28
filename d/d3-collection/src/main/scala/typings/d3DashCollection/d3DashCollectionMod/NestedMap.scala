package typings.d3DashCollection.d3DashCollectionMod

import typings.d3DashCollection.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedMap[Datum, RollupType]
  extends Map[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]

object NestedMap {
  @scala.inline
  def apply[Datum, RollupType](
    clear: () => Unit,
    each: js.Function3[
      (NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType, 
      /* key */ String, 
      /* map */ Map[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType], 
      Unit
    ] => Unit,
    empty: () => Boolean,
    entries: () => js.Array[Anon_Key[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]],
    get: String => js.UndefOr[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType],
    has: String => Boolean,
    keys: () => js.Array[String],
    remove: String => Boolean,
    set: (String, (NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType) => NestedMap[Datum, RollupType],
    size: () => Double,
    values: () => js.Array[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]
  ): NestedMap[Datum, RollupType] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), empty = js.Any.fromFunction0(empty), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[NestedMap[Datum, RollupType]]
  }
}

