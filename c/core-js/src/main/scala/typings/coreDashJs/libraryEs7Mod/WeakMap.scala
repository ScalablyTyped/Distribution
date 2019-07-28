package typings.coreDashJs.libraryEs7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/es7", "WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends typings.std.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}

