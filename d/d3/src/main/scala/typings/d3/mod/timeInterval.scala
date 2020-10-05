package typings.d3.mod

import typings.d3Time.mod.CountableTimeInterval
import typings.d3Time.mod.TimeInterval_
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "timeInterval")
@js.native
object timeInterval extends js.Object {
  def apply(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit]
  ): TimeInterval_ = js.native
  def apply(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ Date, /* end */ Date, Double]
  ): CountableTimeInterval = js.native
  def apply(
    floor: js.Function1[/* date */ Date, Unit],
    offset: js.Function2[/* date */ Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ Date, /* end */ Date, Double],
    field: js.Function1[/* date */ Date, Double]
  ): CountableTimeInterval = js.native
}

