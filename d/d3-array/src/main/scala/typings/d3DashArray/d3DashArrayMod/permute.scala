package typings.d3DashArray.d3DashArrayMod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-array", "permute")
@js.native
object permute extends js.Object {
  def apply[T](array: NumberDictionary[T], keys: ArrayLike[Double]): js.Array[T] = js.native
  def apply[T, K /* <: String */](`object`: T, keys: ArrayLike[K]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
}

