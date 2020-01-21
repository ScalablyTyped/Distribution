package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUser extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def allUsers(query: QueryObj, callback: CbCallback): Unit
  def count(query: QueryObj, callback: CbCallback): Unit
  def getUser(callback: CbCallback): Unit
  def setUser(data: js.Object, callback: CbCallback): Unit
  def setUsers(query: QueryObj, data: js.Object, callback: CbCallback): Unit
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
}

