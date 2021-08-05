package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminServicesProvider
  extends StObject
     with DataProvider {
  
  def createDatabase(connectionUri: String, database: DatabaseInfo): Thenable[CreateDatabaseResponse]
  
  def createLogin(connectionUri: String, login: LoginInfo): Thenable[CreateLoginResponse]
  
  def getDatabaseInfo(connectionUri: String): Thenable[DatabaseInfo]
  
  def getDefaultDatabaseInfo(connectionUri: String): Thenable[DatabaseInfo]
}
object AdminServicesProvider {
  
  inline def apply(
    createDatabase: (String, DatabaseInfo) => Thenable[CreateDatabaseResponse],
    createLogin: (String, LoginInfo) => Thenable[CreateLoginResponse],
    getDatabaseInfo: String => Thenable[DatabaseInfo],
    getDefaultDatabaseInfo: String => Thenable[DatabaseInfo],
    providerId: String
  ): AdminServicesProvider = {
    val __obj = js.Dynamic.literal(createDatabase = js.Any.fromFunction2(createDatabase), createLogin = js.Any.fromFunction2(createLogin), getDatabaseInfo = js.Any.fromFunction1(getDatabaseInfo), getDefaultDatabaseInfo = js.Any.fromFunction1(getDefaultDatabaseInfo), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminServicesProvider]
  }
  
  extension [Self <: AdminServicesProvider](x: Self) {
    
    inline def setCreateDatabase(value: (String, DatabaseInfo) => Thenable[CreateDatabaseResponse]): Self = StObject.set(x, "createDatabase", js.Any.fromFunction2(value))
    
    inline def setCreateLogin(value: (String, LoginInfo) => Thenable[CreateLoginResponse]): Self = StObject.set(x, "createLogin", js.Any.fromFunction2(value))
    
    inline def setGetDatabaseInfo(value: String => Thenable[DatabaseInfo]): Self = StObject.set(x, "getDatabaseInfo", js.Any.fromFunction1(value))
    
    inline def setGetDefaultDatabaseInfo(value: String => Thenable[DatabaseInfo]): Self = StObject.set(x, "getDefaultDatabaseInfo", js.Any.fromFunction1(value))
  }
}
