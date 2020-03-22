package typings.azdata.mod.connection

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "connection.ConnectionProfile")
@js.native
class ConnectionProfile () extends js.Object {
  var authenticationType: String = js.native
  var azureTenantId: js.UndefOr[String] = js.native
  var connectionId: String = js.native
  var connectionName: String = js.native
  var databaseName: String = js.native
  var groupFullName: String = js.native
  var groupId: String = js.native
  var options: StringDictionary[js.Any] = js.native
  var password: String = js.native
  var providerId: String = js.native
  var savePassword: Boolean = js.native
  var saveProfile: Boolean = js.native
  var serverName: String = js.native
  var userName: String = js.native
}

/* static members */
@JSImport("azdata", "connection.ConnectionProfile")
@js.native
object ConnectionProfile extends js.Object {
  def createFrom(options: StringDictionary[js.Any]): ConnectionProfile = js.native
}

