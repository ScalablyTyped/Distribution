package typings.clearbladejsDashClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUser extends js.Object {
  var URI: String
  var callTimeout: Double
  var endpoint: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def allUsers(query: Query, callback: CbCallback): Unit
  def count(query: Query, callback: CbCallback): Unit
  def getUser(callback: CbCallback): Unit
  def setPassword(old_password: String, new_password: String, callback: CbCallback): Unit
  def setUser(data: js.Object, callback: CbCallback): Unit
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
    val __obj = js.Dynamic.literal(URI = URI, allUsers = js.Any.fromFunction2(allUsers), callTimeout = callTimeout, count = js.Any.fromFunction2(count), endpoint = endpoint, getUser = js.Any.fromFunction1(getUser), setPassword = js.Any.fromFunction3(setPassword), setUser = js.Any.fromFunction2(setUser), systemKey = systemKey, systemSecret = systemSecret, user = user)
  
    __obj.asInstanceOf[AppUser]
  }
}

