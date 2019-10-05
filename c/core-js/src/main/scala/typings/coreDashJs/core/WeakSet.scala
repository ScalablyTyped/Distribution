package typings.coreDashJs.core

import org.scalablytyped.runtime.TopLevel
import typings.std.Iterable
import typings.std.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("core.WeakSet")
@js.native
class WeakSet[T /* <: js.Object */] ()
  extends typings.std.WeakSet[T] {
  def this(iterable: Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
}

@JSGlobal("core.WeakSet")
@js.native
object WeakSet extends TopLevel[WeakSetConstructor]

