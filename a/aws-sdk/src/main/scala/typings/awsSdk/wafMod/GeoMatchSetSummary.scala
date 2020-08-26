package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchSetSummary extends js.Object {
  /**
    * The GeoMatchSetId for an GeoMatchSet. You can use GeoMatchSetId in a GetGeoMatchSet request to get detailed information about an GeoMatchSet.
    */
  var GeoMatchSetId: ResourceId = js.native
  /**
    * A friendly name or description of the GeoMatchSet. You can't change the name of an GeoMatchSet after you create it.
    */
  var Name: ResourceName = js.native
}

object GeoMatchSetSummary {
  @scala.inline
  def apply(GeoMatchSetId: ResourceId, Name: ResourceName): GeoMatchSetSummary = {
    val __obj = js.Dynamic.literal(GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetSummary]
  }
  @scala.inline
  implicit class GeoMatchSetSummaryOps[Self <: GeoMatchSetSummary] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

