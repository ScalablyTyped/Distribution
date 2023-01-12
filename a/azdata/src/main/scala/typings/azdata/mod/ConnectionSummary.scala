package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionSummary extends StObject {
  
  /**
    * database name
    */
  var databaseName: js.UndefOr[String] = js.undefined
  
  /**
    * server name
    */
  var serverName: String
  
  /**
    * user name
    */
  var userName: String
}
object ConnectionSummary {
  
  inline def apply(serverName: String, userName: String): ConnectionSummary = {
    val __obj = js.Dynamic.literal(serverName = serverName.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionSummary] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
