package typings.azure.mod

import typings.azure.AnonDatabase
import typings.azure.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterCreationOptions extends js.Object {
  var additionalStorageAccounts: js.UndefOr[js.Array[AnonKey]] = js.undefined
  var defaultStorageAccountKey: String
  var defaultStorageAccountName: String
  var defaultStorageContainer: String
  var hiveMetastore: js.UndefOr[AnonDatabase] = js.undefined
  var location: String
  var name: String
  var nodes: Double
  var oozieMetastore: js.UndefOr[AnonDatabase] = js.undefined
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
    additionalStorageAccounts: js.Array[AnonKey] = null,
    hiveMetastore: AnonDatabase = null,
    oozieMetastore: AnonDatabase = null
  ): ClusterCreationOptions = {
    val __obj = js.Dynamic.literal(defaultStorageAccountKey = defaultStorageAccountKey.asInstanceOf[js.Any], defaultStorageAccountName = defaultStorageAccountName.asInstanceOf[js.Any], defaultStorageContainer = defaultStorageContainer.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (additionalStorageAccounts != null) __obj.updateDynamic("additionalStorageAccounts")(additionalStorageAccounts.asInstanceOf[js.Any])
    if (hiveMetastore != null) __obj.updateDynamic("hiveMetastore")(hiveMetastore.asInstanceOf[js.Any])
    if (oozieMetastore != null) __obj.updateDynamic("oozieMetastore")(oozieMetastore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCreationOptions]
  }
}

