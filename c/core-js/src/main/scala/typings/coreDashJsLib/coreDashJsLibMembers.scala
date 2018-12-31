package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object coreDashJsLibMembers extends js.Object {
  /**
    * Non-standard.
    */
  var Dict: DictConstructor = js.native
  /**
    * Non-standard.
    */
  var log: Log = js.native
  @JSName("$for")
  def $for[T](iterable: nodeLib.Iterable[T]): $for[T] = js.native
  // #############################################################################################
  // delay - https://github.com/zloirock/core-js/#delay
  // Modules: core.delay
  // #############################################################################################
  def delay(msec: scala.Double): js.Promise[scala.Unit] = js.native
}

