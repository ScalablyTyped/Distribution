package typings.coreJs

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/core/$for", JSImport.Namespace)
@js.native
object forMod extends js.Object {
  def apply[T](iterable: Iterable[T]): `for`[T] = js.native
}

