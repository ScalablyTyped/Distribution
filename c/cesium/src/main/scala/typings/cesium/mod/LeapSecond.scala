package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "LeapSecond")
@js.native
class LeapSecond () extends js.Object {
  def this(date: JulianDate) = this()
  def this(date: js.UndefOr[scala.Nothing], offset: Double) = this()
  def this(date: JulianDate, offset: Double) = this()
  var julianDate: JulianDate = js.native
  var offset: Double = js.native
}

