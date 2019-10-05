package typings.d3.d3Mod

import typings.std.Iterable
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "group")
@js.native
object group extends js.Object {
  def apply[TObject, TKey](a: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): Map[TKey, js.Array[TObject]] = js.native
}

