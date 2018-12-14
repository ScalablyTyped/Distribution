package typings
package confLib.confMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("conf", JSImport.Namespace)
@js.native
class namespaced[T] () extends Conf[T] {
  def this(options: confLib.confMod.ConfNs.Options[T]) = this()
}

