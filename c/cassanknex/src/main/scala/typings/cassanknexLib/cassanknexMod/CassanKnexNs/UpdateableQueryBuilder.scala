package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateableQueryBuilder[T] extends js.Object {
  def add(`object`: stdLib.Partial[T]): this.type = js.native
  def add[K /* <: java.lang.String */](
    key: K,
    value: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): TypeMatchedValue[T, K, js.Array[_] | stdLib.Set[_], this.type] = js.native
  def add[K /* <: java.lang.String */](
    key: K,
    value: org.scalablytyped.runtime.StringDictionary[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): TypeMatchedValue[
    T, 
    K, 
    stdLib.Map[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
    ], 
    this.type
  ] = js.native
  def decrement(column: java.lang.String, amount: scala.Double): this.type = js.native
  def decrement(`object`: stdLib.Partial[T]): this.type = js.native
  def increment(column: java.lang.String, amount: scala.Double): this.type = js.native
  def increment(`object`: stdLib.Partial[T]): this.type = js.native
  def remove(`object`: stdLib.Partial[T]): this.type = js.native
  def remove[K /* <: java.lang.String */](
    key: K,
    value: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): this.type = js.native
  def set(`object`: stdLib.Partial[T]): this.type = js.native
  def set[K /* <: java.lang.String */](key: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): this.type = js.native
}

