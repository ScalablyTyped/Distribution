package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessPoliciesRequest extends StObject {
  
  /**
    * The ARN of the IAM user. For more information, see IAM ARNs in the IAM User Guide. This parameter is required if you specify IAM for identityType.
    */
  var iamArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The ID of the identity. This parameter is required if you specify USER or GROUP for identityType.
    */
  var identityId: js.UndefOr[IdentityId] = js.undefined
  
  /**
    * The type of identity (AWS SSO user, AWS SSO group, or IAM user). This parameter is required if you specify identityId.
    */
  var identityType: js.UndefOr[IdentityType] = js.undefined
  
  /**
    * The maximum number of results to be returned per paginated request. Default: 50
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ID of the resource. This parameter is required if you specify resourceType.
    */
  var resourceId: js.UndefOr[ID] = js.undefined
  
  /**
    * The type of resource (portal or project). This parameter is required if you specify resourceId.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object ListAccessPoliciesRequest {
  
  inline def apply(): ListAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessPoliciesRequest]
  }
  
  extension [Self <: ListAccessPoliciesRequest](x: Self) {
    
    inline def setIamArn(value: ARN): Self = StObject.set(x, "iamArn", value.asInstanceOf[js.Any])
    
    inline def setIamArnUndefined: Self = StObject.set(x, "iamArn", js.undefined)
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "identityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "identityId", js.undefined)
    
    inline def setIdentityType(value: IdentityType): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "identityType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceId(value: ID): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
