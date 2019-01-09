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

