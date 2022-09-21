package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallRuleGroupMetadata extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the rule group.
    */
  var Arn: js.UndefOr[typings.awsSdk.route53resolverMod.Arn] = js.undefined
  
  /**
    * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk of running the operation twice. This can be any unique string, for example, a timestamp. 
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.route53resolverMod.CreatorRequestId] = js.undefined
  
  /**
    * The ID of the rule group. 
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The name of the rule group.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.undefined
  
  /**
    * The Amazon Web Services account ID for the account that created the rule group. When a rule group is shared with your account, this is the account that has shared the rule group with you. 
    */
  var OwnerId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Whether the rule group is shared with other Amazon Web Services accounts, or was shared with the current account by another Amazon Web Services account. Sharing is configured through Resource Access Manager (RAM).
    */
  var ShareStatus: js.UndefOr[typings.awsSdk.route53resolverMod.ShareStatus] = js.undefined
}
object FirewallRuleGroupMetadata {
  
  inline def apply(): FirewallRuleGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallRuleGroupMetadata]
  }
  
  extension [Self <: FirewallRuleGroupMetadata](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerId(value: AccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setShareStatus(value: ShareStatus): Self = StObject.set(x, "ShareStatus", value.asInstanceOf[js.Any])
    
    inline def setShareStatusUndefined: Self = StObject.set(x, "ShareStatus", js.undefined)
  }
}
