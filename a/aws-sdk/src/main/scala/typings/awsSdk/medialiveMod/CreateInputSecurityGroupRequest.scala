package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInputSecurityGroupRequest extends StObject {
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
  
  /**
    * List of IPv4 CIDR addresses to whitelist
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRuleCidr] = js.native
}
object CreateInputSecurityGroupRequest {
  
  @scala.inline
  def apply(): CreateInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputSecurityGroupRequest]
  }
  
  @scala.inline
  implicit class CreateInputSecurityGroupRequestMutableBuilder[Self <: CreateInputSecurityGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setWhitelistRules(value: listOfInputWhitelistRuleCidr): Self = StObject.set(x, "WhitelistRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistRulesUndefined: Self = StObject.set(x, "WhitelistRules", js.undefined)
    
    @scala.inline
    def setWhitelistRulesVarargs(value: InputWhitelistRuleCidr*): Self = StObject.set(x, "WhitelistRules", js.Array(value :_*))
  }
}
