package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcesRequest extends StObject {
  
  /**
    * The Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The collection type.
    */
  var CollectionType: js.UndefOr[ResourceCollectionType] = js.undefined
  
  /**
    * The maximum number of resources to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  
  /**
    * The user ID for the resource collection. This is a required field for accessing the API operation using IAM credentials.
    */
  var UserId: js.UndefOr[IdType] = js.undefined
}
object GetResourcesRequest {
  
  @scala.inline
  def apply(): GetResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesRequest]
  }
  
  @scala.inline
  implicit class GetResourcesRequestMutableBuilder[Self <: GetResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setCollectionType(value: ResourceCollectionType): Self = StObject.set(x, "CollectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionTypeUndefined: Self = StObject.set(x, "CollectionType", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setUserId(value: IdType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
