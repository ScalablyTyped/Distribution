package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInputSecurityGroupRequest extends js.Object {
  
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
  implicit class UpdateInputSecurityGroupRequestOps[Self <: UpdateInputSecurityGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputSecurityGroupId(value: string): Self = this.set("InputSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setWhitelistRulesVarargs(value: InputWhitelistRuleCidr*): Self = this.set("WhitelistRules", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistRules(value: listOfInputWhitelistRuleCidr): Self = this.set("WhitelistRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelistRules: Self = this.set("WhitelistRules", js.undefined)
  }
}
