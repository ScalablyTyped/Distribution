package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccessPoliciesRequest extends StObject {
  
  /**
    * The ARN of the IAM user. For more information, see IAM ARNs in the IAM User Guide. This parameter is required if you specify IAM for identityType.
    */
  var iamArn: js.UndefOr[ARN] = js.native
  
  /**
    * The ID of the identity. This parameter is required if you specify USER or GROUP for identityType.
    */
  var identityId: js.UndefOr[IdentityId] = js.native
  
  /**
    * The type of identity (AWS SSO user, AWS SSO group, or IAM user). This parameter is required if you specify identityId.
    */
  var identityType: js.UndefOr[IdentityType] = js.native
  
  /**
    * The maximum number of results to be returned per paginated request. Default: 50
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The ID of the resource. This parameter is required if you specify resourceType.
    */
  var resourceId: js.UndefOr[ID] = js.native
  
  /**
    * The type of resource (portal or project). This parameter is required if you specify resourceId.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}
object ListAccessPoliciesRequest {
  
  @scala.inline
  def apply(): ListAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessPoliciesRequest]
  }
  
  @scala.inline
  implicit class ListAccessPoliciesRequestMutableBuilder[Self <: ListAccessPoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamArn(value: ARN): Self = StObject.set(x, "iamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamArnUndefined: Self = StObject.set(x, "iamArn", js.undefined)
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "identityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "identityId", js.undefined)
    
    @scala.inline
    def setIdentityType(value: IdentityType): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityTypeUndefined: Self = StObject.set(x, "identityType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceId(value: ID): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
