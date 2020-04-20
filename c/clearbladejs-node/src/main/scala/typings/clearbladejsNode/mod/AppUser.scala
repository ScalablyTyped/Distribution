package typings.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUser extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def allUsers(query: Query, callback: CbCallback): Unit
  def getUser(callback: CbCallback): Unit
  def setUser(data: js.Object, callback: CbCallback): Unit
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
}

