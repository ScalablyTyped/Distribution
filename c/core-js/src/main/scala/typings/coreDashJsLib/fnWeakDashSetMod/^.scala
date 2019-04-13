package typings
package coreDashJsLib.fnWeakDashSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/weak-set", JSImport.Namespace)
@js.native
class ^[T /* <: js.Object */] ()
  extends stdLib.WeakSet[T] {
  def this(iterable: stdLib.Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
}

@JSImport("core-js/fn/weak-set", JSImport.Namespace)
@js.native
object ^
  extends org.scalablytyped.runtime.TopLevel[stdLib.WeakSetConstructor]

