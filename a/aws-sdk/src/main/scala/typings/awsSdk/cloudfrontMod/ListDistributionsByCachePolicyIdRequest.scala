package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDistributionsByCachePolicyIdRequest extends js.Object {
  
  /**
    * The ID of the cache policy whose associated distribution IDs you want to list.
    */
  var CachePolicyId: String = js.native
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of distribution IDs. The response includes distribution IDs in the list that occur after the marker. To get the next page of the list, set this field’s value to the value of NextMarker from the current page’s response.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of distribution IDs that you want in the response.
    */
  var MaxItems: js.UndefOr[String] = js.native
}
object ListDistributionsByCachePolicyIdRequest {
  
  @scala.inline
  def apply(CachePolicyId: String): ListDistributionsByCachePolicyIdRequest = {
    val __obj = js.Dynamic.literal(CachePolicyId = CachePolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsByCachePolicyIdRequest]
  }
  
  @scala.inline
  implicit class ListDistributionsByCachePolicyIdRequestOps[Self <: ListDistributionsByCachePolicyIdRequest] (val x: Self) extends AnyVal {
    
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
    def setCachePolicyId(value: String): Self = this.set("CachePolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: String): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
  }
}
