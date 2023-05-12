package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleGroupConfig extends StObject {
  
  /**
    * Additional configuration for using the account takeover prevention (ATP) managed rule group, AWSManagedRulesATPRuleSet. Use this to provide login request information to the rule group. For web ACLs that protect CloudFront distributions, use this to also provide the information about how your distribution responds to login requests.  This configuration replaces the individual configuration fields in ManagedRuleGroupConfig and provides additional feature configuration.  For information about using the ATP managed rule group, see WAF Fraud Control account takeover prevention (ATP) rule group and WAF Fraud Control account takeover prevention (ATP) in the WAF Developer Guide.
    */
  var AWSManagedRulesATPRuleSet: js.UndefOr[typings.awsSdk.clientsWafv2Mod.AWSManagedRulesATPRuleSet] = js.undefined
  
  /**
    * Additional configuration for using the Bot Control managed rule group. Use this to specify the inspection level that you want to use. For information about using the Bot Control managed rule group, see WAF Bot Control rule group and WAF Bot Control in the WAF Developer Guide.
    */
  var AWSManagedRulesBotControlRuleSet: js.UndefOr[typings.awsSdk.clientsWafv2Mod.AWSManagedRulesBotControlRuleSet] = js.undefined
  
  /**
    *  Instead of this setting, provide your configuration under AWSManagedRulesATPRuleSet.  
    */
  var LoginPath: js.UndefOr[LoginPathString] = js.undefined
  
  /**
    *  Instead of this setting, provide your configuration under AWSManagedRulesATPRuleSet RequestInspection.  
    */
  var PasswordField: js.UndefOr[typings.awsSdk.clientsWafv2Mod.PasswordField] = js.undefined
  
  /**
    *  Instead of this setting, provide your configuration under AWSManagedRulesATPRuleSet RequestInspection.  
    */
  var PayloadType: js.UndefOr[typings.awsSdk.clientsWafv2Mod.PayloadType] = js.undefined
  
  /**
    *  Instead of this setting, provide your configuration under AWSManagedRulesATPRuleSet RequestInspection.  
    */
  var UsernameField: js.UndefOr[typings.awsSdk.clientsWafv2Mod.UsernameField] = js.undefined
}
object ManagedRuleGroupConfig {
  
  inline def apply(): ManagedRuleGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedRuleGroupConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedRuleGroupConfig] (val x: Self) extends AnyVal {
    
    inline def setAWSManagedRulesATPRuleSet(value: AWSManagedRulesATPRuleSet): Self = StObject.set(x, "AWSManagedRulesATPRuleSet", value.asInstanceOf[js.Any])
    
    inline def setAWSManagedRulesATPRuleSetUndefined: Self = StObject.set(x, "AWSManagedRulesATPRuleSet", js.undefined)
    
    inline def setAWSManagedRulesBotControlRuleSet(value: AWSManagedRulesBotControlRuleSet): Self = StObject.set(x, "AWSManagedRulesBotControlRuleSet", value.asInstanceOf[js.Any])
    
    inline def setAWSManagedRulesBotControlRuleSetUndefined: Self = StObject.set(x, "AWSManagedRulesBotControlRuleSet", js.undefined)
    
    inline def setLoginPath(value: LoginPathString): Self = StObject.set(x, "LoginPath", value.asInstanceOf[js.Any])
    
    inline def setLoginPathUndefined: Self = StObject.set(x, "LoginPath", js.undefined)
    
    inline def setPasswordField(value: PasswordField): Self = StObject.set(x, "PasswordField", value.asInstanceOf[js.Any])
    
    inline def setPasswordFieldUndefined: Self = StObject.set(x, "PasswordField", js.undefined)
    
    inline def setPayloadType(value: PayloadType): Self = StObject.set(x, "PayloadType", value.asInstanceOf[js.Any])
    
    inline def setPayloadTypeUndefined: Self = StObject.set(x, "PayloadType", js.undefined)
    
    inline def setUsernameField(value: UsernameField): Self = StObject.set(x, "UsernameField", value.asInstanceOf[js.Any])
    
    inline def setUsernameFieldUndefined: Self = StObject.set(x, "UsernameField", js.undefined)
  }
}
