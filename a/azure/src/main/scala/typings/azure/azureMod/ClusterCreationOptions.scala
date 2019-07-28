package typings.azure.azureMod

import typings.azure.Anon_Database
import typings.azure.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterCreationOptions extends js.Object {
  var additionalStorageAccounts: js.UndefOr[js.Array[Anon_Key]] = js.undefined
  var defaultStorageAccountKey: String
  var defaultStorageAccountName: String
  var defaultStorageContainer: String
  var hiveMetastore: js.UndefOr[Anon_Database] = js.undefined
  var location: String
  var name: String
  var nodes: Double
  var oozieMetastore: js.UndefOr[Anon_Database] = js.undefined
  var password: String
  var user: String
}

object ClusterCreationOptions {
  @scala.inline
  def apply(
    defaultStorageAccountKey: String,
    defaultStorageAccountName: String,
    defaultStorageContainer: String,
    location: String,
    name: String,
    nodes: Double,
    password: String,
    user: String,
    additionalStorageAccounts: js.Array[Anon_Key] = null,
    hiveMetastore: Anon_Database = null,
    oozieMetastore: Anon_Database = null
  ): ClusterCreationOptions = {
    val __obj = js.Dynamic.literal(defaultStorageAccountKey = defaultStorageAccountKey, defaultStorageAccountName = defaultStorageAccountName, defaultStorageContainer = defaultStorageContainer, location = location, name = name, nodes = nodes, password = password, user = user)
    if (additionalStorageAccounts != null) __obj.updateDynamic("additionalStorageAccounts")(additionalStorageAccounts)
    if (hiveMetastore != null) __obj.updateDynamic("hiveMetastore")(hiveMetastore)
    if (oozieMetastore != null) __obj.updateDynamic("oozieMetastore")(oozieMetastore)
    __obj.asInstanceOf[ClusterCreationOptions]
  }
}

