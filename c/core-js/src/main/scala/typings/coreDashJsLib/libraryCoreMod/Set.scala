package typings
package coreDashJsLib.libraryCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/core", "Set")
@js.native
class Set[T] ()
  extends stdLib.Set[T] {
  def this(values: js.Array[T]) = this()
}

