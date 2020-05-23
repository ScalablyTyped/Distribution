package typings.bingmaps.global.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.getIsBirdseyeAvailable")
@js.native
object getIsBirdseyeAvailable extends js.Object {
  def apply(
    loc: typings.bingmaps.Microsoft.Maps.Location,
    heading: Double,
    callback: js.Function1[/* isAvailable */ Boolean, Unit]
  ): Unit = js.native
  def apply(
    loc: typings.bingmaps.Microsoft.Maps.Location,
    heading: typings.bingmaps.Microsoft.Maps.Heading,
    callback: js.Function1[/* isAvailable */ Boolean, Unit]
  ): Unit = js.native
}

