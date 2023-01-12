package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutManagedRuleSetVersionsRequest extends StObject {
  
  /**
    * A unique identifier for the managed rule set. The ID is returned in the responses to commands like list. You provide it to operations like get and update.
    */
  var Id: EntityId
  
  /**
    * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: typings.awsSdk.clientsWafv2Mod.LockToken
  
  /**
    * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set. This name is assigned to the corresponding managed rule group, which your customers can access and use. 
    */
  var Name: EntityName
  
  /**
    * The version of the named managed rule group that you'd like your customers to choose, from among your version offerings. 
    */
  var RecommendedVersion: js.UndefOr[VersionKeyString] = js.undefined
  
  /**
    * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or an Amazon Cognito user pool.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.clientsWafv2Mod.Scope
  
  /**
    * The versions of the named managed rule group that you want to offer to your customers. 
    */
  var VersionsToPublish: js.UndefOr[typings.awsSdk.clientsWafv2Mod.VersionsToPublish] = js.undefined
}
object PutManagedRuleSetVersionsRequest {
  
  inline def apply(Id: EntityId, LockToken: LockToken, Name: EntityName, Scope: Scope): PutManagedRuleSetVersionsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutManagedRuleSetVersionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutManagedRuleSetVersionsRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLockToken(value: LockToken): Self = StObject.set(x, "LockToken", value.asInstanceOf[js.Any])
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecommendedVersion(value: VersionKeyString): Self = StObject.set(x, "RecommendedVersion", value.asInstanceOf[js.Any])
    
    inline def setRecommendedVersionUndefined: Self = StObject.set(x, "RecommendedVersion", js.undefined)
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setVersionsToPublish(value: VersionsToPublish): Self = StObject.set(x, "VersionsToPublish", value.asInstanceOf[js.Any])
    
    inline def setVersionsToPublishUndefined: Self = StObject.set(x, "VersionsToPublish", js.undefined)
  }
}
