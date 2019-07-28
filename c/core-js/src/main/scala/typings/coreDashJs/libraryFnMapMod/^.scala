package typings.coreDashJs.libraryFnMapMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Iterable
import typings.std.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/map", JSImport.Namespace)
@js.native
class ^[K, V] ()
  extends typings.std.Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}

@JSImport("core-js/library/fn/map", JSImport.Namespace)
@js.native
object ^ extends TopLevel[MapConstructor]

