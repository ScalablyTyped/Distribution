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
    val __obj = js.Dynamic.literal(FacebookID = FacebookID, FirstName = FirstName, LastName = LastName, PersonID = PersonID, UserFullName = UserFullName, UserID = UserID)
  
    __obj.asInstanceOf[User]
  }
}

