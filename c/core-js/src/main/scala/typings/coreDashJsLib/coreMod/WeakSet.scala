package typings
package coreDashJsLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/core", "WeakSet")
@js.native
class WeakSet[T /* <: js.Object */] ()
  extends stdLib.WeakSet[T] {
  def this(iterable: stdLib.Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
}

