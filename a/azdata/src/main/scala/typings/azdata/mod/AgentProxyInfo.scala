package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentProxyInfo extends js.Object {
  
  var accountName: String = js.native
  
  var credentialId: Double = js.native
  
  var credentialIdentity: String = js.native
  
  var credentialName: String = js.native
  
  var description: String = js.native
  
  var id: Double = js.native
  
  var isEnabled: Boolean = js.native
}
object AgentProxyInfo {
  
  @scala.inline
  def apply(
    accountName: String,
    credentialId: Double,
    credentialIdentity: String,
    credentialName: String,
    description: String,
    id: Double,
    isEnabled: Boolean
  ): AgentProxyInfo = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], credentialId = credentialId.asInstanceOf[js.Any], credentialIdentity = credentialIdentity.asInstanceOf[js.Any], credentialName = credentialName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentProxyInfo]
  }
  
  @scala.inline
  implicit class AgentProxyInfoOps[Self <: AgentProxyInfo] (val x: Self) extends AnyVal {
    
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialId(value: Double): Self = this.set("credentialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialIdentity(value: String): Self = this.set("credentialIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialName(value: String): Self = this.set("credentialName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
  }
}
