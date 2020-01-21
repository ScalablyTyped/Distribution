package typings.coreJs.weakMapMod

import org.scalablytyped.runtime.TopLevel
import typings.std.WeakMap
import typings.std.WeakMapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/es6/weak-map", JSImport.Namespace)
@js.native
class ^[K /* <: js.Object */, V] () extends WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}

@JSImport("core-js/es6/weak-map", JSImport.Namespace)
@js.native
object ^ extends TopLevel[WeakMapConstructor]

