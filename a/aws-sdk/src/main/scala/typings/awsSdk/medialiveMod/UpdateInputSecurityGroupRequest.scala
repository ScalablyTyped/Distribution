package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInputSecurityGroupRequest extends StObject {
  
  /**
    * The id of the Input Security Group to update.
    */
  var InputSecurityGroupId: string
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.undefined
  
  /**
    * List of IPv4 CIDR addresses to whitelist
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRuleCidr] = js.undefined
}
object UpdateInputSecurityGroupRequest {
  
  inline def apply(InputSecurityGroupId: string): UpdateInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputSecurityGroupRequest]
  }
  
  extension [Self <: UpdateInputSecurityGroupRequest](x: Self) {
    
    inline def setInputSecurityGroupId(value: string): Self = StObject.set(x, "InputSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setWhitelistRules(value: listOfInputWhitelistRuleCidr): Self = StObject.set(x, "WhitelistRules", value.asInstanceOf[js.Any])
    
    inline def setWhitelistRulesUndefined: Self = StObject.set(x, "WhitelistRules", js.undefined)
    
    inline def setWhitelistRulesVarargs(value: InputWhitelistRuleCidr*): Self = StObject.set(x, "WhitelistRules", js.Array(value*))
  }
}
