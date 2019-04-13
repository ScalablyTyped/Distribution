package typings
package coreDashJsLib.libraryFnWeakDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/weak-map", JSImport.Namespace)
@js.native
class ^[K /* <: js.Object */, V] ()
  extends stdLib.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}

@JSImport("core-js/library/fn/weak-map", JSImport.Namespace)
@js.native
object ^
  extends org.scalablytyped.runtime.TopLevel[stdLib.WeakMapConstructor]

