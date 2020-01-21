package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGeoMatchSetResponse extends js.Object {
  /**
    * Information about the GeoMatchSet that you specified in the GetGeoMatchSet request. This includes the Type, which for a GeoMatchContraint is always Country, as well as the Value, which is the identifier for a specific country.
    */
  var GeoMatchSet: js.UndefOr[typings.awsSdk.wafregionalMod.GeoMatchSet] = js.native
}

object GetGeoMatchSetResponse {
  @scala.inline
  def apply(GeoMatchSet: GeoMatchSet = null): GetGeoMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (GeoMatchSet != null) __obj.updateDynamic("GeoMatchSet")(GeoMatchSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeoMatchSetResponse]
  }
}

