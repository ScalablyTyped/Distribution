package typings.coreDashJs.libraryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library", "WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends typings.std.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}

