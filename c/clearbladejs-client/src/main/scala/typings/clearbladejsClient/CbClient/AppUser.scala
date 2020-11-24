package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppUser extends js.Object {
  
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
  implicit class AppUserOps[Self <: AppUser] (val x: Self) extends AnyVal {
    
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
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUsers(value: (Query, CbCallback) => Unit): Self = this.set("allUsers", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallTimeout(value: Double): Self = this.set("callTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: (Query, CbCallback) => Unit): Self = this.set("count", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUser(value: CbCallback => Unit): Self = this.set("getUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPassword(value: (String, String, CbCallback) => Unit): Self = this.set("setPassword", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetUser(value: (js.Object, CbCallback) => Unit): Self = this.set("setUser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
