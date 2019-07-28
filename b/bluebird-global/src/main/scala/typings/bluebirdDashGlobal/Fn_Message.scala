package typings.bluebirdDashGlobal

import typings.bluebird.bluebirdMod.Bluebird
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Message[T] extends js.Object {
  def apply(ms: Double): Bluebird[T] = js.native
  def apply(ms: Double, message: String): Bluebird[T] = js.native
  def apply(ms: Double, message: Error): Bluebird[T] = js.native
}

