package typings.d3Array.mod

import typings.std.Iterable
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "rollup")
@js.native
object rollup extends js.Object {
  
  def apply[TObject, TReduce, TKey](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): Map[TKey, TReduce] = js.native
  def apply[TObject, TReduce, TKey1, TKey2](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): Map[TKey1, Map[TKey2, TReduce]] = js.native
  def apply[TObject, TReduce, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): Map[TKey1, Map[TKey2, Map[TKey3, TReduce]]] = js.native
}
