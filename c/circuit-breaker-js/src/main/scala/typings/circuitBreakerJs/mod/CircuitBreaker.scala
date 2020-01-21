package typings.circuitBreakerJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircuitBreaker extends js.Object {
  def forceClose(): Unit = js.native
  def forceOpen(): Unit = js.native
  def isOpen(): Boolean = js.native
  def run(command: js.Function2[/* success */ js.Function0[Unit], /* failure */ js.Function0[Unit], Unit]): Unit = js.native
  def run(
    command: js.Function2[/* success */ js.Function0[Unit], /* failure */ js.Function0[Unit], Unit],
    fallback: js.Function0[Unit]
  ): Unit = js.native
  def unforce(): Unit = js.native
}

