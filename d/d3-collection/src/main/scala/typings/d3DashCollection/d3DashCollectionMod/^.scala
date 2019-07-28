package typings.d3DashCollection.d3DashCollectionMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.d3DashCollection.Anon_Key
import typings.d3DashCollection.Anon_KeyValue
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-collection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def entries(obj: js.Object): js.Array[Anon_KeyValue] = js.native
  def entries[T](obj: StringDictionary[T]): js.Array[Anon_Key[T]] = js.native
  def entries[T](obj: ArrayLike[T]): js.Array[Anon_Key[T]] = js.native
  def keys(obj: js.Object): js.Array[String] = js.native
  def map(obj: js.Object): Map[_] = js.native
  def map[T](): Map[T] = js.native
  def map[T](array: js.Array[T]): Map[T] = js.native
  def map[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* i */ js.UndefOr[Double], /* array */ js.UndefOr[js.Array[T]], String]
  ): Map[T] = js.native
  def map[T](d3Map: Map[T]): Map[T] = js.native
  def map[T](obj: NumberDictionary[T]): Map[T] = js.native
  def map[T](obj: StringDictionary[T]): Map[T] = js.native
  def nest[Datum, RollupType](): Nest[Datum, RollupType] = js.native
  def set(): Set = js.native
  def set(array: js.Array[String | Stringifiable]): Set = js.native
  def set(d3Set: Set): Set = js.native
  def set[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], String]
  ): Set = js.native
  def values(obj: js.Object): js.Array[_] = js.native
  def values[T](obj: StringDictionary[T]): js.Array[T] = js.native
  def values[T](obj: ArrayLike[T]): js.Array[T] = js.native
}

