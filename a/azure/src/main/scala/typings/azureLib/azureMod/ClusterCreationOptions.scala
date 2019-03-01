package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterCreationOptions extends js.Object {
  var additionalStorageAccounts: js.UndefOr[js.Array[azureLib.Anon_Key]] = js.undefined
  var defaultStorageAccountKey: java.lang.String
  var defaultStorageAccountName: java.lang.String
  var defaultStorageContainer: java.lang.String
  var hiveMetastore: js.UndefOr[azureLib.Anon_Database] = js.undefined
  var location: java.lang.String
  var name: java.lang.String
  var nodes: scala.Double
  var oozieMetastore: js.UndefOr[azureLib.Anon_Database] = js.undefined
  var password: java.lang.String
  var user: java.lang.String
}

object ClusterCreationOptions {
  @scala.inline
  def apply(
    defaultStorageAccountKey: java.lang.String,
    defaultStorageAccountName: java.lang.String,
    defaultStorageContainer: java.lang.String,
    location: java.lang.String,
    name: java.lang.String,
    nodes: scala.Double,
    password: java.lang.String,
    user: java.lang.String,
    additionalStorageAccounts: js.Array[azureLib.Anon_Key] = null,
    hiveMetastore: azureLib.Anon_Database = null,
    oozieMetastore: azureLib.Anon_Database = null
  ): ClusterCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultStorageAccountKey")(defaultStorageAccountKey)
    __obj.updateDynamic("defaultStorageAccountName")(defaultStorageAccountName)
    __obj.updateDynamic("defaultStorageContainer")(defaultStorageContainer)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("user")(user)
    if (additionalStorageAccounts != null) __obj.updateDynamic("additionalStorageAccounts")(additionalStorageAccounts)
    if (hiveMetastore != null) __obj.updateDynamic("hiveMetastore")(hiveMetastore)
    if (oozieMetastore != null) __obj.updateDynamic("oozieMetastore")(oozieMetastore)
    __obj.asInstanceOf[ClusterCreationOptions]
  }
}

