package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnectionProfile extends ConnectionInfo {
  
  var authenticationType: String = js.native
  
  var azureTenantId: js.UndefOr[String] = js.native
  
  var connectionName: String = js.native
  
  var databaseName: String = js.native
  
  var groupFullName: js.UndefOr[String] = js.native
  
  var groupId: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var password: String = js.native
  
  var providerName: String = js.native
  
  var savePassword: Boolean = js.native
  
  var saveProfile: Boolean = js.native
  
  var serverName: String = js.native
  
  var userName: String = js.native
}
object IConnectionProfile {
  
  @scala.inline
  def apply(
    authenticationType: String,
    connectionName: String,
    databaseName: String,
    id: String,
    options: StringDictionary[js.Any],
    password: String,
    providerName: String,
    savePassword: Boolean,
    saveProfile: Boolean,
    serverName: String,
    userName: String
  ): IConnectionProfile = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], savePassword = savePassword.asInstanceOf[js.Any], saveProfile = saveProfile.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionProfile]
  }
  
  @scala.inline
  implicit class IConnectionProfileOps[Self <: IConnectionProfile] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationType(value: String): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionName(value: String): Self = this.set("connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: String): Self = this.set("providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavePassword(value: Boolean): Self = this.set("savePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveProfile(value: Boolean): Self = this.set("saveProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: String): Self = this.set("serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureTenantId(value: String): Self = this.set("azureTenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzureTenantId: Self = this.set("azureTenantId", js.undefined)
    
    @scala.inline
    def setGroupFullName(value: String): Self = this.set("groupFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupFullName: Self = this.set("groupFullName", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
  }
}
