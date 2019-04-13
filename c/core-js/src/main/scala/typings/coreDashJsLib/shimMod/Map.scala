package typings
package coreDashJsLib.shimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/shim", "Map")
@js.native
class Map[K, V] ()
  extends stdLib.Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: stdLib.Iterable[js.Tuple2[K, V]]) = this()
}

