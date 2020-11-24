package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGeoMatchSetsResponse extends js.Object {
  
  /**
    * An array of GeoMatchSetSummary objects.
    */
  var GeoMatchSets: js.UndefOr[GeoMatchSetSummaries] = js.native
  
  /**
    * If you have more GeoMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more GeoMatchSet objects, submit another ListGeoMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
}
object ListGeoMatchSetsResponse {
  
  @scala.inline
  def apply(): ListGeoMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGeoMatchSetsResponse]
  }
  
  @scala.inline
  implicit class ListGeoMatchSetsResponseOps[Self <: ListGeoMatchSetsResponse] (val x: Self) extends AnyVal {
    
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
    def setGeoMatchSetsVarargs(value: GeoMatchSetSummary*): Self = this.set("GeoMatchSets", js.Array(value :_*))
    
    @scala.inline
    def setGeoMatchSets(value: GeoMatchSetSummaries): Self = this.set("GeoMatchSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoMatchSets: Self = this.set("GeoMatchSets", js.undefined)
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
