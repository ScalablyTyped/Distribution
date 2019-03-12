package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUser extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def allUsers(query: QueryObj, callback: CbCallback): scala.Unit
  def count(query: QueryObj, callback: CbCallback): scala.Unit
  def getUser(callback: CbCallback): scala.Unit
  def setUser(data: js.Object, callback: CbCallback): scala.Unit
  def setUsers(query: QueryObj, data: js.Object, callback: CbCallback): scala.Unit
}

object AppUser {
  @scala.inline
  def apply(
    URI: java.lang.String,
    allUsers: (QueryObj, CbCallback) => scala.Unit,
    count: (QueryObj, CbCallback) => scala.Unit,
    getUser: CbCallback => scala.Unit,
    setUser: (js.Object, CbCallback) => scala.Unit,
    setUsers: (QueryObj, js.Object, CbCallback) => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI, allUsers = js.Any.fromFunction2(allUsers), count = js.Any.fromFunction2(count), getUser = js.Any.fromFunction1(getUser), setUser = js.Any.fromFunction2(setUser), setUsers = js.Any.fromFunction3(setUsers), systemKey = systemKey, systemSecret = systemSecret, user = user)
  
    __obj.asInstanceOf[AppUser]
  }
}

