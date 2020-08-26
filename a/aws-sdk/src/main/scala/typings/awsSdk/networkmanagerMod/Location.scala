package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * The physical address.
    */
  var Address: js.UndefOr[String] = js.native
  /**
    * The latitude.
    */
  var Latitude: js.UndefOr[String] = js.native
  /**
    * The longitude.
    */
  var Longitude: js.UndefOr[String] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    @scala.inline
    def setLatitude(value: String): Self = this.set("Latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("Latitude", js.undefined)
    @scala.inline
    def setLongitude(value: String): Self = this.set("Longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("Longitude", js.undefined)
  }
  
}

