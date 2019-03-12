package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUser extends js.Object {
  var URI: java.lang.String
  var callTimeout: scala.Double
  var endpoint: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def allUsers(query: Query, callback: CbCallback): scala.Unit
  def count(query: Query, callback: CbCallback): scala.Unit
  def getUser(callback: CbCallback): scala.Unit
  def setPassword(old_password: java.lang.String, new_password: java.lang.String, callback: CbCallback): scala.Unit
  def setUser(data: js.Object, callback: CbCallback): scala.Unit
}

object AppUser {
  @scala.inline
  def apply(
    URI: java.lang.String,
    allUsers: (Query, CbCallback) => scala.Unit,
    callTimeout: scala.Double,
    count: (Query, CbCallback) => scala.Unit,
    endpoint: java.lang.String,
    getUser: CbCallback => scala.Unit,
    setPassword: (java.lang.String, java.lang.String, CbCallback) => scala.Unit,
    setUser: (js.Object, CbCallback) => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI, allUsers = js.Any.fromFunction2(allUsers), callTimeout = callTimeout, count = js.Any.fromFunction2(count), endpoint = endpoint, getUser = js.Any.fromFunction1(getUser), setPassword = js.Any.fromFunction3(setPassword), setUser = js.Any.fromFunction2(setUser), systemKey = systemKey, systemSecret = systemSecret, user = user)
  
    __obj.asInstanceOf[AppUser]
  }
}

