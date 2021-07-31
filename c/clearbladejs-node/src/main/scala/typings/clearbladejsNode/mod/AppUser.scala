package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppUser extends StObject {
  
  var URI: String
  
  def allUsers(query: Query, callback: CbCallback): Unit
  
  def getUser(callback: CbCallback): Unit
  
  def setUser(data: js.Object, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  var user: APIUser
}
object AppUser {
  
  @scala.inline
  def apply(
    URI: String,
    allUsers: (Query, CbCallback) => Unit,
    getUser: CbCallback => Unit,
    setUser: (js.Object, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], allUsers = js.Any.fromFunction2(allUsers), getUser = js.Any.fromFunction1(getUser), setUser = js.Any.fromFunction2(setUser), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUser]
  }
  
  @scala.inline
  implicit class AppUserMutableBuilder[Self <: AppUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllUsers(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "allUsers", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUser(value: CbCallback => Unit): Self = StObject.set(x, "getUser", js.Any.fromFunction1(value))
    
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
