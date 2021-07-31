package typings.coreJs

import org.scalablytyped.runtime.Shortcut
import typings.std.Iterable
import typings.std.WeakSet
import typings.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weakSetMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/es6/weak-set", JSImport.Namespace)
  @js.native
  class ^[T /* <: js.Object */] ()
    extends StObject
       with WeakSet[T] {
    def this(iterable: Iterable[T]) = this()
    def this(values: js.Array[T]) = this()
  }
  @JSImport("core-js/es6/weak-set", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WeakSetConstructor = js.native
  
  type _To = js.Object & WeakSetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `weakSetMod.foo` */
  override def _to: js.Object & WeakSetConstructor = ^
}
