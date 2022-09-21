package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupRuleUpdate extends StObject {
  
  /**
    * Information about the security group rule.
    */
  var SecurityGroupRule: js.UndefOr[SecurityGroupRuleRequest] = js.undefined
  
  /**
    * The ID of the security group rule.
    */
  var SecurityGroupRuleId: js.UndefOr[typings.awsSdk.ec2Mod.SecurityGroupRuleId] = js.undefined
}
object SecurityGroupRuleUpdate {
  
  inline def apply(): SecurityGroupRuleUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupRuleUpdate]
  }
  
  extension [Self <: SecurityGroupRuleUpdate](x: Self) {
    
    inline def setSecurityGroupRule(value: SecurityGroupRuleRequest): Self = StObject.set(x, "SecurityGroupRule", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleId(value: SecurityGroupRuleId): Self = StObject.set(x, "SecurityGroupRuleId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleIdUndefined: Self = StObject.set(x, "SecurityGroupRuleId", js.undefined)
    
    inline def setSecurityGroupRuleUndefined: Self = StObject.set(x, "SecurityGroupRule", js.undefined)
  }
}
