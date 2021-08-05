package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInputSecurityGroupRequest extends StObject {
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.undefined
  
  /**
    * List of IPv4 CIDR addresses to whitelist
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRuleCidr] = js.undefined
}
object CreateInputSecurityGroupRequest {
  
  inline def apply(): CreateInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputSecurityGroupRequest]
  }
  
  extension [Self <: CreateInputSecurityGroupRequest](x: Self) {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setWhitelistRules(value: listOfInputWhitelistRuleCidr): Self = StObject.set(x, "WhitelistRules", value.asInstanceOf[js.Any])
    
    inline def setWhitelistRulesUndefined: Self = StObject.set(x, "WhitelistRules", js.undefined)
    
    inline def setWhitelistRulesVarargs(value: InputWhitelistRuleCidr*): Self = StObject.set(x, "WhitelistRules", js.Array(value :_*))
  }
}
