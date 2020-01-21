package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locations extends js.Object {
  /**
    * The locations.
    */
  var locations: js.UndefOr[LocationList] = js.native
}

object Locations {
  @scala.inline
  def apply(locations: LocationList = null): Locations = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locations]
  }
}

