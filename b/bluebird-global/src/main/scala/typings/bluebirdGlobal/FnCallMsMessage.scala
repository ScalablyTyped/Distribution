package typings.bluebirdGlobal

import typings.bluebird.mod.Bluebird
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallMsMessage[T] extends js.Object {
  def apply(ms: Double): Bluebird[T] = js.native
  def apply(ms: Double, message: String): Bluebird[T] = js.native
  def apply(ms: Double, message: Error): Bluebird[T] = js.native
}

