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
  
  @scala.inline
  def apply(database: String, password: String, server: String, user: String): Database = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit class DatabaseMutableBuilder[Self <: Database] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
