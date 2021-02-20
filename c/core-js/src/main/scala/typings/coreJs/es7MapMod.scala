package typings.coreJs

import org.scalablytyped.runtime.Shortcut
import typings.std.Iterable
import typings.std.MapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es7MapMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/es7/map", JSImport.Namespace)
  @js.native
  class ^[K, V] ()
    extends typings.std.Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/es7/map", JSImport.Namespace)
  @js.native
  val ^ : MapConstructor = js.native
  
  type _To = MapConstructor
  
  /* This means you don't have to write `^`, but can instead just say `es7MapMod.foo` */
  override def _to: MapConstructor = ^
}
