package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInputSecurityGroupRequest extends js.Object {
  
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
  implicit class CreateInputSecurityGroupRequestOps[Self <: CreateInputSecurityGroupRequest] (val x: Self) extends AnyVal {
    
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
