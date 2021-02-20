package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppUser extends StObject {
  
  var URI: String = js.native
  
  def allUsers(query: Query, callback: CbCallback): Unit = js.native
  
  var callTimeout: Double = js.native
  
  def count(query: Query, callback: CbCallback): Unit = js.native
  
  var endpoint: String = js.native
  
  def getUser(callback: CbCallback): Unit = js.native
  
  def setPassword(old_password: String, new_password: String, callback: CbCallback): Unit = js.native
  
  def setUser(data: js.Object, callback: CbCallback): Unit = js.native
  
  var systemKey: String = js.native
  
  var systemSecret: String = js.native
  
  var user: APIUser = js.native
}
object AppUser {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AppUserMutableBuilder[Self <: AppUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllUsers(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "allUsers", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "count", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUser(value: CbCallback => Unit): Self = StObject.set(x, "getUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPassword(value: (String, String, CbCallback) => Unit): Self = StObject.set(x, "setPassword", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetUser(value: (js.Object, CbCallback) => Unit): Self = StObject.set(x, "setUser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
