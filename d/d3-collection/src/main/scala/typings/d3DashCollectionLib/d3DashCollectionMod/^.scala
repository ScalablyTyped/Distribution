package typings
package d3DashCollectionLib.d3DashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-collection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def entries(obj: js.Object): js.Array[d3DashCollectionLib.Anon_KeyValue] = js.native
  def entries[T](obj: org.scalablytyped.runtime.StringDictionary[T]): js.Array[d3DashCollectionLib.Anon_Key[T]] = js.native
  def entries[T](obj: stdLib.ArrayLike[T]): js.Array[d3DashCollectionLib.Anon_Key[T]] = js.native
  def keys(obj: js.Object): js.Array[java.lang.String] = js.native
  def map(obj: js.Object): d3DashCollectionLib.d3DashCollectionMod.Map[_] = js.native
  def map[T](): d3DashCollectionLib.d3DashCollectionMod.Map[T] = js.native
  def map[T](array: js.Array[T]): d3DashCollectionLib.d3DashCollectionMod.Map[T] = js.native
  def map[T](
    array: js.Array[T],
    key: js.Function3[
      /* value */ T, 
      /* i */ js.UndefOr[scala.Double], 
      /* array */ js.UndefOr[js.Array[T]], 
      java.lang.String
    ]
  ): d3DashCollectionLib.d3DashCollectionMod.Map[T] = js.native
  def map[T](d3Map: d3DashCollectionLib.d3DashCollectionMod.Map[T]): d3DashCollectionLib.d3DashCollectionMod.Map[T] = js.native
  def map[T](obj: org.scalablytyped.runtime.NumberDictionary[T]): d3DashCollectionLib.d3DashCollectionMod.Map[T] = js.native
  def map[T](obj: org.scalablytyped.runtime.StringDictionary[T]): d3DashCollectionLib.d3DashCollectionMod.Map[T] = js.native
  def nest[Datum, RollupType](): d3DashCollectionLib.d3DashCollectionMod.Nest[Datum, RollupType] = js.native
  def set(): d3DashCollectionLib.d3DashCollectionMod.Set = js.native
  def set(array: js.Array[java.lang.String | d3DashCollectionLib.d3DashCollectionMod.Stringifiable]): d3DashCollectionLib.d3DashCollectionMod.Set = js.native
  def set(d3Set: d3DashCollectionLib.d3DashCollectionMod.Set): d3DashCollectionLib.d3DashCollectionMod.Set = js.native
  def set[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], java.lang.String]
  ): d3DashCollectionLib.d3DashCollectionMod.Set = js.native
  def values(obj: js.Object): js.Array[_] = js.native
  def values[T](obj: org.scalablytyped.runtime.StringDictionary[T]): js.Array[T] = js.native
  def values[T](obj: stdLib.ArrayLike[T]): js.Array[T] = js.native
}

