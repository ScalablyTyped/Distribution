package typings.backlogDashJs.backlogDashJsMod.Option.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostUserParams extends js.Object {
  var mailAddress: String
  var name: String
  var password: String
  var roleType: RoleType
  var userId: String
}

object PostUserParams {
  @scala.inline
  def apply(mailAddress: String, name: String, password: String, roleType: RoleType, userId: String): PostUserParams = {
    val __obj = js.Dynamic.literal(mailAddress = mailAddress, name = name, password = password, roleType = roleType, userId = userId)
  
    __obj.asInstanceOf[PostUserParams]
  }
}

