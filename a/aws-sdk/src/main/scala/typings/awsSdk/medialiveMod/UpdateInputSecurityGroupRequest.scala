package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInputSecurityGroupRequest extends StObject {
  
  /**
    * The id of the Input Security Group to update.
    */
  var InputSecurityGroupId: string = js.native
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
  
  /**
    * List of IPv4 CIDR addresses to whitelist
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRuleCidr] = js.native
}
object UpdateInputSecurityGroupRequest {
  
  @scala.inline
  def apply(InputSecurityGroupId: string): UpdateInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputSecurityGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateInputSecurityGroupRequestMutableBuilder[Self <: UpdateInputSecurityGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputSecurityGroupId(value: string): Self = StObject.set(x, "InputSecurityGroupId", value.asInstanceOf[js.Any])
    
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
