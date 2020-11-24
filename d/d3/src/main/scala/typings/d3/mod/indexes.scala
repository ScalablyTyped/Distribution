package typings.d3.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "indexes")
@js.native
object indexes extends js.Object {
  
  def apply[TObject, TKey](iterable: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): js.Array[js.Tuple2[TKey, TObject]] = js.native
  def apply[TObject, TKey1, TKey2](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TObject]]]] = js.native
  def apply[TObject, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TObject]]]]]
  ] = js.native
}
