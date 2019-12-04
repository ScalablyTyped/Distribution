package typings.chunkedDashDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("it")
@js.native
object it extends js.Object {
  def apply(expectation: String): Unit = js.native
  def apply(expectation: String, assertion: js.Function0[Unit]): Unit = js.native
  def apply(expectation: String, assertion: js.Function0[Unit], timeout: Double): Unit = js.native
  def apply(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def apply(expectation: String, assertion: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
}

