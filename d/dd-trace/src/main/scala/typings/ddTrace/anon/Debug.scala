package typings.ddTrace.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debug extends js.Object {
  def debug(message: String): Unit = js.native
  def error(err: String): Unit = js.native
  def error(err: Error): Unit = js.native
}

