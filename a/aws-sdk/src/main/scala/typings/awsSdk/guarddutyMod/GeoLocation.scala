package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocation extends js.Object {
  /**
    * The latitude information of the remote IP address.
    */
  var Lat: js.UndefOr[Double] = js.native
  /**
    * The longitude information of the remote IP address.
    */
  var Lon: js.UndefOr[Double] = js.native
}

object GeoLocation {
  @scala.inline
  def apply(Lat: js.UndefOr[Double] = js.undefined, Lon: js.UndefOr[Double] = js.undefined): GeoLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Lat)) __obj.updateDynamic("Lat")(Lat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Lon)) __obj.updateDynamic("Lon")(Lon.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoLocation]
  }
}

