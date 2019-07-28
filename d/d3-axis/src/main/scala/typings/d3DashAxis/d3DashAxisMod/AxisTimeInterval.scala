package typings.d3DashAxis.d3DashAxisMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisTimeInterval extends js.Object {
  def range(start: Date, stop: Date): js.Array[Date] = js.native
  def range(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
}

