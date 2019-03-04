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
    allUsers: js.Function2[Query, CbCallback, scala.Unit],
    callTimeout: scala.Double,
    count: js.Function2[Query, CbCallback, scala.Unit],
    endpoint: java.lang.String,
    getUser: js.Function1[CbCallback, scala.Unit],
    setPassword: js.Function3[java.lang.String, java.lang.String, CbCallback, scala.Unit],
    setUser: js.Function2[js.Object, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI, allUsers = allUsers, callTimeout = callTimeout, count = count, endpoint = endpoint, getUser = getUser, setPassword = setPassword, setUser = setUser, systemKey = systemKey, systemSecret = systemSecret, user = user)
  
    __obj.asInstanceOf[AppUser]
  }
}

