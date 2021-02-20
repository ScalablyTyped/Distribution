package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionSummary extends StObject {
  
  /**
    * database name
    */
  var databaseName: String = js.native
  
  /**
    * server name
    */
  var serverName: String = js.native
  
  /**
    * user name
    */
  var userName: String = js.native
}
object ConnectionSummary {
  
  @scala.inline
  def apply(databaseName: String, serverName: String, userName: String): ConnectionSummary = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionSummary]
  }
  
  @scala.inline
  implicit class ConnectionSummaryMutableBuilder[Self <: ConnectionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
