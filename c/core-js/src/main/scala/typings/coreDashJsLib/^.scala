package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Non-standard.
    */
  var Dict: coreDashJsLib.DictConstructor = js.native
  /**
    * Non-standard.
    */
  var log: coreDashJsLib.Log = js.native
  @JSName("$for")
  def $for[T](iterable: nodeLib.Iterable[T]): coreDashJsLib.$for[T] = js.native
  // #############################################################################################
  // delay - https://github.com/zloirock/core-js/#delay
  // Modules: core.delay
  // #############################################################################################
  def delay(msec: scala.Double): js.Promise[scala.Unit] = js.native
}

