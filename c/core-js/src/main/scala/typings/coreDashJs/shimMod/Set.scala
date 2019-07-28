package typings.coreDashJs.shimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/shim", "Set")
@js.native
class Set[T] ()
  extends typings.std.Set[T] {
  def this(values: js.Array[T]) = this()
}

