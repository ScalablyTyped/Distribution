package typings
package coreDashJsLib.es7MapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/es7/map", JSImport.Namespace)
@js.native
class namespaced[K, V] ()
  extends stdLib.Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: stdLib.Iterable[js.Tuple2[K, V]]) = this()
}

