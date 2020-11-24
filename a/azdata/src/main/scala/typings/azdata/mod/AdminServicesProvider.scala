package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminServicesProvider extends DataProvider {
  
  def createDatabase(connectionUri: String, database: DatabaseInfo): Thenable[CreateDatabaseResponse] = js.native
  
  def createLogin(connectionUri: String, login: LoginInfo): Thenable[CreateLoginResponse] = js.native
  
  def getDatabaseInfo(connectionUri: String): Thenable[DatabaseInfo] = js.native
  
  def getDefaultDatabaseInfo(connectionUri: String): Thenable[DatabaseInfo] = js.native
}
object AdminServicesProvider {
  
  @scala.inline
  def apply(
    createDatabase: (String, DatabaseInfo) => Thenable[CreateDatabaseResponse],
    createLogin: (String, LoginInfo) => Thenable[CreateLoginResponse],
    getDatabaseInfo: String => Thenable[DatabaseInfo],
    getDefaultDatabaseInfo: String => Thenable[DatabaseInfo],
    providerId: String
  ): AdminServicesProvider = {
    val __obj = js.Dynamic.literal(createDatabase = js.Any.fromFunction2(createDatabase), createLogin = js.Any.fromFunction2(createLogin), getDatabaseInfo = js.Any.fromFunction1(getDatabaseInfo), getDefaultDatabaseInfo = js.Any.fromFunction1(getDefaultDatabaseInfo), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminServicesProvider]
  }
  
  @scala.inline
  implicit class AdminServicesProviderOps[Self <: AdminServicesProvider] (val x: Self) extends AnyVal {
    
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
    def setCreateDatabase(value: (String, DatabaseInfo) => Thenable[CreateDatabaseResponse]): Self = this.set("createDatabase", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateLogin(value: (String, LoginInfo) => Thenable[CreateLoginResponse]): Self = this.set("createLogin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDatabaseInfo(value: String => Thenable[DatabaseInfo]): Self = this.set("getDatabaseInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultDatabaseInfo(value: String => Thenable[DatabaseInfo]): Self = this.set("getDefaultDatabaseInfo", js.Any.fromFunction1(value))
  }
}
