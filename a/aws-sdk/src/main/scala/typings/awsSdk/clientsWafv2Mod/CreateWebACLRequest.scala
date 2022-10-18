package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWebACLRequest extends StObject {
  
  /**
    * Specifies how WAF should handle CAPTCHA evaluations for rules that don't have their own CaptchaConfig settings. If you don't specify this, WAF uses its default settings for CaptchaConfig. 
    */
  var CaptchaConfig: js.UndefOr[typings.awsSdk.clientsWafv2Mod.CaptchaConfig] = js.undefined
  
  /**
    * A map of custom response keys and content bodies. When you create a rule with a block action, you can send a custom response to the web request. You define these for the web ACL, and then use them in the rules and default actions that you define in the web ACL.  For information about customizing web requests and responses, see Customizing web requests and responses in WAF in the WAF Developer Guide.  For information about the limits on count and size for custom request and response settings, see WAF quotas in the WAF Developer Guide. 
    */
  var CustomResponseBodies: js.UndefOr[typings.awsSdk.clientsWafv2Mod.CustomResponseBodies] = js.undefined
  
  /**
    * The action to perform if none of the Rules contained in the WebACL match. 
    */
  var DefaultAction: typings.awsSdk.clientsWafv2Mod.DefaultAction
  
  /**
    * A description of the web ACL that helps with identification. 
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the web ACL. You cannot change the name of a web ACL after you create it.
    */
  var Name: EntityName
  
  /**
    * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that WAF uses to identify matching web requests, and parameters that govern how WAF handles them. 
    */
  var Rules: js.UndefOr[typings.awsSdk.clientsWafv2Mod.Rules] = js.undefined
  
  /**
    * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or an Amazon Cognito user pool.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.clientsWafv2Mod.Scope
  
  /**
    * An array of key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.clientsWafv2Mod.VisibilityConfig
}
object CreateWebACLRequest {
  
  inline def apply(DefaultAction: DefaultAction, Name: EntityName, Scope: Scope, VisibilityConfig: VisibilityConfig): CreateWebACLRequest = {
    val __obj = js.Dynamic.literal(DefaultAction = DefaultAction.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebACLRequest]
  }
  
  extension [Self <: CreateWebACLRequest](x: Self) {
    
    inline def setCaptchaConfig(value: CaptchaConfig): Self = StObject.set(x, "CaptchaConfig", value.asInstanceOf[js.Any])
    
    inline def setCaptchaConfigUndefined: Self = StObject.set(x, "CaptchaConfig", js.undefined)
    
    inline def setCustomResponseBodies(value: CustomResponseBodies): Self = StObject.set(x, "CustomResponseBodies", value.asInstanceOf[js.Any])
    
    inline def setCustomResponseBodiesUndefined: Self = StObject.set(x, "CustomResponseBodies", js.undefined)
    
    inline def setDefaultAction(value: DefaultAction): Self = StObject.set(x, "DefaultAction", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVisibilityConfig(value: VisibilityConfig): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
  }
}
