package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminServicesProvider extends DataProvider {
  def createDatabase(connectionUri: String, database: DatabaseInfo): Thenable[CreateDatabaseResponse]
  def createLogin(connectionUri: String, login: LoginInfo): Thenable[CreateLoginResponse]
  def getDatabaseInfo(connectionUri: String): Thenable[DatabaseInfo]
  def getDefaultDatabaseInfo(connectionUri: String): Thenable[DatabaseInfo]
}

object AdminServicesProvider {
  @scala.inline
  def apply(
    createDatabase: (String, DatabaseInfo) => Thenable[CreateDatabaseResponse],
    createLogin: (String, LoginInfo) => Thenable[CreateLoginResponse],
    getDatabaseInfo: String => Thenable[DatabaseInfo],
    getDefaultDatabaseInfo: String => Thenable[DatabaseInfo],
    providerId: String,
    handle: js.UndefOr[Double] = js.undefined
  ): AdminServicesProvider = {
    val __obj = js.Dynamic.literal(createDatabase = js.Any.fromFunction2(createDatabase), createLogin = js.Any.fromFunction2(createLogin), getDatabaseInfo = js.Any.fromFunction1(getDatabaseInfo), getDefaultDatabaseInfo = js.Any.fromFunction1(getDefaultDatabaseInfo), providerId = providerId.asInstanceOf[js.Any])
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminServicesProvider]
  }
}

