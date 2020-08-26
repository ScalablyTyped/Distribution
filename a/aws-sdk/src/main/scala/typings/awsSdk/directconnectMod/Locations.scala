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
  def apply(): Locations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locations]
  }
  @scala.inline
  implicit class LocationsOps[Self <: Locations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: LocationList): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
  }
  
}

