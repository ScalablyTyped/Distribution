package typings.chunkedDashDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("afterAll")
@js.native
object afterAll extends js.Object {
  def apply(action: js.Function0[Unit]): Unit = js.native
  def apply(action: js.Function0[Unit], timeout: Double): Unit = js.native
  def apply(action: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def apply(action: js.Function1[/* done */ DoneFn, Unit], timeout: Double): Unit = js.native
}

