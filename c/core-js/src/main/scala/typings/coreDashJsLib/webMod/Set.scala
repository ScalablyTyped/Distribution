package typings
package coreDashJsLib.webMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/web", "Set")
@js.native
class Set[T] ()
  extends stdLib.Set[T] {
  def this(values: js.Array[T]) = this()
}

