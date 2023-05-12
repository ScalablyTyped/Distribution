package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.mod.connection.AuthenticationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConnectionProfile
  extends StObject
     with ConnectionInfo {
  
  /**
    * The type of authentication to use when connecting
    */
  var authenticationType: String | AuthenticationType
  
  var azureTenantId: js.UndefOr[String] = js.undefined
  
  var connectionName: js.UndefOr[String] = js.undefined
  
  var databaseName: js.UndefOr[String] = js.undefined
  
  var groupFullName: js.UndefOr[String] = js.undefined
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var password: String
  
  var providerName: String
  
  var savePassword: Boolean
  
  var saveProfile: Boolean
  
  var serverName: String
  
  var userName: String
}
object IConnectionProfile {
  
  inline def apply(
    authenticationType: String | AuthenticationType,
    id: String,
    options: StringDictionary[Any],
    password: String,
    providerName: String,
    savePassword: Boolean,
    saveProfile: Boolean,
    serverName: String,
    userName: String
  ): IConnectionProfile = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], savePassword = savePassword.asInstanceOf[js.Any], saveProfile = saveProfile.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConnectionProfile] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationType(value: String | AuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setAzureTenantId(value: String): Self = StObject.set(x, "azureTenantId", value.asInstanceOf[js.Any])
    
    inline def setAzureTenantIdUndefined: Self = StObject.set(x, "azureTenantId", js.undefined)
    
    inline def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
    
    inline def setGroupFullName(value: String): Self = StObject.set(x, "groupFullName", value.asInstanceOf[js.Any])
    
    inline def setGroupFullNameUndefined: Self = StObject.set(x, "groupFullName", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    inline def setSavePassword(value: Boolean): Self = StObject.set(x, "savePassword", value.asInstanceOf[js.Any])
    
    inline def setSaveProfile(value: Boolean): Self = StObject.set(x, "saveProfile", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
