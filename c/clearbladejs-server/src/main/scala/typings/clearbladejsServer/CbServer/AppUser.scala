package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppUser extends js.Object {
  var URI: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def allUsers(query: QueryObj, callback: CbCallback): Unit = js.native
  def count(query: QueryObj, callback: CbCallback): Unit = js.native
  def getUser(callback: CbCallback): Unit = js.native
  def setUser(data: js.Object, callback: CbCallback): Unit = js.native
  def setUsers(query: QueryObj, data: js.Object, callback: CbCallback): Unit = js.native
}

object AppUser {
  @scala.inline
  def apply(
    URI: String,
    allUsers: (QueryObj, CbCallback) => Unit,
    count: (QueryObj, CbCallback) => Unit,
    getUser: CbCallback => Unit,
    setUser: (js.Object, CbCallback) => Unit,
    setUsers: (QueryObj, js.Object, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], allUsers = js.Any.fromFunction2(allUsers), count = js.Any.fromFunction2(count), getUser = js.Any.fromFunction1(getUser), setUser = js.Any.fromFunction2(setUser), setUsers = js.Any.fromFunction3(setUsers), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
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
    def setAllUsers(value: (QueryObj, CbCallback) => Unit): Self = this.set("allUsers", js.Any.fromFunction2(value))
    @scala.inline
    def setCount(value: (QueryObj, CbCallback) => Unit): Self = this.set("count", js.Any.fromFunction2(value))
    @scala.inline
    def setGetUser(value: CbCallback => Unit): Self = this.set("getUser", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUser(value: (js.Object, CbCallback) => Unit): Self = this.set("setUser", js.Any.fromFunction2(value))
    @scala.inline
    def setSetUsers(value: (QueryObj, js.Object, CbCallback) => Unit): Self = this.set("setUsers", js.Any.fromFunction3(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

