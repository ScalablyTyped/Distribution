package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpGeoLocation extends js.Object {
  /**
    * Reserved for future use.
    */
  var lat: js.UndefOr[double] = js.native
  /**
    * Reserved for future use.
    */
  var lon: js.UndefOr[double] = js.native
}

object IpGeoLocation {
  @scala.inline
  def apply(lat: js.UndefOr[double] = js.undefined, lon: js.UndefOr[double] = js.undefined): IpGeoLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lat)) __obj.updateDynamic("lat")(lat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lon)) __obj.updateDynamic("lon")(lon.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpGeoLocation]
  }
}

