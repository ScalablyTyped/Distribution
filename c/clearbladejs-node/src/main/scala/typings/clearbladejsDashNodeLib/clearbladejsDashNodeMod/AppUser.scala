package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUser extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def allUsers(query: Query, callback: CbCallback): scala.Unit
  def getUser(callback: CbCallback): scala.Unit
  def setUser(data: js.Object, callback: CbCallback): scala.Unit
}

object AppUser {
  @scala.inline
  def apply(
    URI: java.lang.String,
    allUsers: js.Function2[Query, CbCallback, scala.Unit],
    getUser: js.Function1[CbCallback, scala.Unit],
    setUser: js.Function2[js.Object, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI, allUsers = allUsers, getUser = getUser, setUser = setUser, systemKey = systemKey, systemSecret = systemSecret, user = user)
  
    __obj.asInstanceOf[AppUser]
  }
}

