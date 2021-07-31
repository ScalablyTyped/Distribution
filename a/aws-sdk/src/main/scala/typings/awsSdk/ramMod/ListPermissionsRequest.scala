package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionsRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the resource type for which to list permissions. For example, to list only permissions that apply to EC2 subnets, specify ec2:Subnet.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object ListPermissionsRequest {
  
  @scala.inline
  def apply(): ListPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionsRequest]
  }
  
  @scala.inline
  implicit class ListPermissionsRequestMutableBuilder[Self <: ListPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
