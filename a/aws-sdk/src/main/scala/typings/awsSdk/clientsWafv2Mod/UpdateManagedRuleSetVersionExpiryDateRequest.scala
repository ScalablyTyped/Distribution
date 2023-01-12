package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManagedRuleSetVersionExpiryDateRequest extends StObject {
  
  /**
    * The time that you want the version to expire. Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". 
    */
  var ExpiryTimestamp: js.Date
  
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
    * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or an Amazon Cognito user pool.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.clientsWafv2Mod.Scope
  
  /**
    * The version that you want to remove from your list of offerings for the named managed rule group. 
    */
  var VersionToExpire: VersionKeyString
}
object UpdateManagedRuleSetVersionExpiryDateRequest {
  
  inline def apply(
    ExpiryTimestamp: js.Date,
    Id: EntityId,
    LockToken: LockToken,
    Name: EntityName,
    Scope: Scope,
    VersionToExpire: VersionKeyString
  ): UpdateManagedRuleSetVersionExpiryDateRequest = {
    val __obj = js.Dynamic.literal(ExpiryTimestamp = ExpiryTimestamp.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], VersionToExpire = VersionToExpire.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateManagedRuleSetVersionExpiryDateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateManagedRuleSetVersionExpiryDateRequest] (val x: Self) extends AnyVal {
    
    inline def setExpiryTimestamp(value: js.Date): Self = StObject.set(x, "ExpiryTimestamp", value.asInstanceOf[js.Any])
    
    inline def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLockToken(value: LockToken): Self = StObject.set(x, "LockToken", value.asInstanceOf[js.Any])
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setVersionToExpire(value: VersionKeyString): Self = StObject.set(x, "VersionToExpire", value.asInstanceOf[js.Any])
  }
}
