package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionProfile extends ConnectionInfo {
  var authenticationType: String
  var azureTenantId: js.UndefOr[String] = js.undefined
  var connectionName: String
  var databaseName: String
  var groupFullName: js.UndefOr[String] = js.undefined
  var groupId: String
  var id: String
  var password: String
  var providerName: String
  var savePassword: Boolean
  var saveProfile: Boolean
  var serverName: String
  var userName: String
}

object IConnectionProfile {
  @scala.inline
  def apply(
    authenticationType: String,
    connectionName: String,
    databaseName: String,
    groupId: String,
    id: String,
    options: StringDictionary[js.Any],
    password: String,
    providerName: String,
    savePassword: Boolean,
    saveProfile: Boolean,
    serverName: String,
    userName: String,
    azureTenantId: String = null,
    groupFullName: String = null
  ): IConnectionProfile = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], savePassword = savePassword.asInstanceOf[js.Any], saveProfile = saveProfile.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    if (azureTenantId != null) __obj.updateDynamic("azureTenantId")(azureTenantId.asInstanceOf[js.Any])
    if (groupFullName != null) __obj.updateDynamic("groupFullName")(groupFullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionProfile]
  }
}

