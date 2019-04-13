package typings
package coreDashJsLib.libraryWebTimersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/web/timers", "WeakSet")
@js.native
class WeakSet[T /* <: js.Object */] ()
  extends stdLib.WeakSet[T] {
  def this(iterable: stdLib.Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
}

