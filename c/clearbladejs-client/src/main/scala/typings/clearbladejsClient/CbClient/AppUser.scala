package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppUser extends StObject {
  
  var URI: String
  
  def allUsers(query: Query, callback: CbCallback): Unit
  
  var callTimeout: Double
  
  def count(query: Query, callback: CbCallback): Unit
  
  var endpoint: String
  
  def getUser(callback: CbCallback): Unit
  
  def setPassword(old_password: String, new_password: String, callback: CbCallback): Unit
  
  def setUser(data: js.Object, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  var user: APIUser
}
object AppUser {
  
  inline def apply(
    URI: String,
    allUsers: (Query, CbCallback) => Unit,
    callTimeout: Double,
    count: (Query, CbCallback) => Unit,
    endpoint: String,
    getUser: CbCallback => Unit,
    setPassword: (String, String, CbCallback) => Unit,
    setUser: (js.Object, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], allUsers = js.Any.fromFunction2(allUsers), callTimeout = callTimeout.asInstanceOf[js.Any], count = js.Any.fromFunction2(count), endpoint = endpoint.asInstanceOf[js.Any], getUser = js.Any.fromFunction1(getUser), setPassword = js.Any.fromFunction3(setPassword), setUser = js.Any.fromFunction2(setUser), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUser]
  }
  
  extension [Self <: AppUser](x: Self) {
    
    inline def setAllUsers(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "allUsers", js.Any.fromFunction2(value))
    
    inline def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
    
    inline def setCount(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "count", js.Any.fromFunction2(value))
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setGetUser(value: CbCallback => Unit): Self = StObject.set(x, "getUser", js.Any.fromFunction1(value))
    
    inline def setSetPassword(value: (String, String, CbCallback) => Unit): Self = StObject.set(x, "setPassword", js.Any.fromFunction3(value))
    
    inline def setSetUser(value: (js.Object, CbCallback) => Unit): Self = StObject.set(x, "setUser", js.Any.fromFunction2(value))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
