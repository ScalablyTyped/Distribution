package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcesRequest extends js.Object {
  
  /**
    * The Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The collection type.
    */
  var CollectionType: js.UndefOr[ResourceCollectionType] = js.native
  
  /**
    * The maximum number of resources to return.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  
  /**
    * The user ID for the resource collection. This is a required field for accessing the API operation using IAM credentials.
    */
  var UserId: js.UndefOr[IdType] = js.native
}
object GetResourcesRequest {
  
  @scala.inline
  def apply(): GetResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesRequest]
  }
  
  @scala.inline
  implicit class GetResourcesRequestOps[Self <: GetResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    
    @scala.inline
    def setCollectionType(value: ResourceCollectionType): Self = this.set("CollectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionType: Self = this.set("CollectionType", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitType): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setUserId(value: IdType): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
}
