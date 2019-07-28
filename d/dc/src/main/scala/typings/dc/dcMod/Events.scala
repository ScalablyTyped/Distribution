package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  def trigger(fn: js.Function0[Unit]): Unit = js.native
  def trigger(fn: js.Function0[Unit], delay: Double): Unit = js.native
}

