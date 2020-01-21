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
  def apply(Address: String = null, Latitude: String = null, Longitude: String = null): Location = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (Latitude != null) __obj.updateDynamic("Latitude")(Latitude.asInstanceOf[js.Any])
    if (Longitude != null) __obj.updateDynamic("Longitude")(Longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

