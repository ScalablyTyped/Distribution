package typings
package coreDashJsLib.libraryWebImmediateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/web/immediate", "Map")
@js.native
class Map[K, V] ()
  extends stdLib.Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: stdLib.Iterable[js.Tuple2[K, V]]) = this()
}

