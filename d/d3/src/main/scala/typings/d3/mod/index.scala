package typings.d3.mod

import typings.std.Iterable
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "index")
@js.native
object index extends js.Object {
  
  def apply[TObject, TKey](iterable: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): Map[TKey, TObject] = js.native
  def apply[TObject, TKey1, TKey2](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): Map[TKey1, Map[TKey2, TObject]] = js.native
  def apply[TObject, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): Map[TKey1, Map[TKey2, Map[TKey3, TObject]]] = js.native
}
