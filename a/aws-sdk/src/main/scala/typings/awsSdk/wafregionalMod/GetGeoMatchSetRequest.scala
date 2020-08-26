package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGeoMatchSetRequest extends js.Object {
  /**
    * The GeoMatchSetId of the GeoMatchSet that you want to get. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId = js.native
}

object GetGeoMatchSetRequest {
  @scala.inline
  def apply(GeoMatchSetId: ResourceId): GetGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeoMatchSetRequest]
  }
  @scala.inline
  implicit class GetGeoMatchSetRequestOps[Self <: GetGeoMatchSetRequest] (val x: Self) extends AnyVal {
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
    def setGeoMatchSetId(value: ResourceId): Self = this.set("GeoMatchSetId", value.asInstanceOf[js.Any])
  }
  
}

