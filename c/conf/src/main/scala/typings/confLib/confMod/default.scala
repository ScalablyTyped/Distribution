package typings
package confLib.confMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("conf", JSImport.Default)
@js.native
class default[T] () extends Conf[T] {
  def this(options: Options[T]) = this()
}

