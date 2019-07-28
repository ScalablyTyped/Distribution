package typings.coreDashJs.webImmediateMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/web/immediate", "WeakSet")
@js.native
class WeakSet[T /* <: js.Object */] ()
  extends typings.std.WeakSet[T] {
  def this(iterable: Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
}

