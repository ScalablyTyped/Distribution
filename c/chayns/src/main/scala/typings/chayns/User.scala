package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var FacebookID: String
  var FirstName: String
  var LastName: String
  var PersonID: String
  var UserFullName: String
  var UserID: Double
}

object User {
  @scala.inline
  def apply(
    FacebookID: String,
    FirstName: String,
    LastName: String,
    PersonID: String,
    UserFullName: String,
    UserID: Double
  ): User = {
    val __obj = js.Dynamic.literal(FacebookID = FacebookID.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], PersonID = PersonID.asInstanceOf[js.Any], UserFullName = UserFullName.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[User]
  }
}

