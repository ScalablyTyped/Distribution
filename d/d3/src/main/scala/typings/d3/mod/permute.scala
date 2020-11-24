package typings.d3.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "permute")
@js.native
object permute extends js.Object {
  
  def apply[T](source: NumberDictionary[T], keys: Iterable[Double]): js.Array[T] = js.native
  def apply[T, K /* <: /* keyof T */ String */](source: T, keys: Iterable[K]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
}
