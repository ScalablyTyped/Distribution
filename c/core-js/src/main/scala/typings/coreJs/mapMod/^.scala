package typings.coreJs.mapMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Iterable
import typings.std.Map
import typings.std.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/es6/map", JSImport.Namespace)
@js.native
class ^[K, V] () extends Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}

@JSImport("core-js/es6/map", JSImport.Namespace)
@js.native
object ^ extends TopLevel[MapConstructor]

