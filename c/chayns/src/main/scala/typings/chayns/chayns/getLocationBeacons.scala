package typings.chayns.chayns

import typings.chayns.LocationBeacon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns.getLocationBeacons")
@js.native
object getLocationBeacons extends js.Object {
  def apply(forceReload: Boolean): js.Promise[js.Array[LocationBeacon]] = js.native
}

