package typings
package coreDashJsLib.webDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/web/dom", "Set")
@js.native
class Set[T] ()
  extends stdLib.Set[T] {
  def this(values: js.Array[T]) = this()
}

