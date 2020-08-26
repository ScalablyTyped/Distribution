package typings.azure.mod

import typings.azure.anon.Database
import typings.azure.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCreationOptions extends js.Object {
  var additionalStorageAccounts: js.UndefOr[js.Array[Key]] = js.native
  var defaultStorageAccountKey: String = js.native
  var defaultStorageAccountName: String = js.native
  var defaultStorageContainer: String = js.native
  var hiveMetastore: js.UndefOr[Database] = js.native
  var location: String = js.native
  var name: String = js.native
  var nodes: Double = js.native
  var oozieMetastore: js.UndefOr[Database] = js.native
  var password: String = js.native
  var user: String = js.native
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
    user: String
  ): ClusterCreationOptions = {
    val __obj = js.Dynamic.literal(defaultStorageAccountKey = defaultStorageAccountKey.asInstanceOf[js.Any], defaultStorageAccountName = defaultStorageAccountName.asInstanceOf[js.Any], defaultStorageContainer = defaultStorageContainer.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCreationOptions]
  }
  @scala.inline
  implicit class ClusterCreationOptionsOps[Self <: ClusterCreationOptions] (val x: Self) extends AnyVal {
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
    def setDefaultStorageAccountKey(value: String): Self = this.set("defaultStorageAccountKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultStorageAccountName(value: String): Self = this.set("defaultStorageAccountName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultStorageContainer(value: String): Self = this.set("defaultStorageContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodes(value: Double): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalStorageAccountsVarargs(value: Key*): Self = this.set("additionalStorageAccounts", js.Array(value :_*))
    @scala.inline
    def setAdditionalStorageAccounts(value: js.Array[Key]): Self = this.set("additionalStorageAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalStorageAccounts: Self = this.set("additionalStorageAccounts", js.undefined)
    @scala.inline
    def setHiveMetastore(value: Database): Self = this.set("hiveMetastore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiveMetastore: Self = this.set("hiveMetastore", js.undefined)
    @scala.inline
    def setOozieMetastore(value: Database): Self = this.set("oozieMetastore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOozieMetastore: Self = this.set("oozieMetastore", js.undefined)
  }
  
}

