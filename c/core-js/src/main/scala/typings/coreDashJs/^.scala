package typings.coreDashJs

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Non-standard.
    */
  var Dict: DictConstructor = js.native
  @JSName("$for")
  def $for[T](iterable: Iterable[T]): typings.coreDashJs.$for[T] = js.native
  // #############################################################################################
  // delay - https://github.com/zloirock/core-js/#delay
  // Modules: core.delay
  // #############################################################################################
  def delay(msec: Double): js.Promise[Unit] = js.native
}

