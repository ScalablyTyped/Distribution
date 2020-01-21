package typings.chunkedDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("beforeEach")
@js.native
object beforeEach extends js.Object {
  def apply(action: js.Function0[Unit]): Unit = js.native
  def apply(action: js.Function0[Unit], timeout: Double): Unit = js.native
  def apply(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def apply(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
}

