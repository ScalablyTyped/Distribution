package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Database extends StObject {
  
  var database: String
  
  var password: String
  
  var server: String
  
  var user: String
}
object Database {
  
  inline def apply(database: String, password: String, server: String, user: String): Database = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Database]
  }
  
  extension [Self <: Database](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
