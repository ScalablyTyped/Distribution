package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  var FacebookID: String = js.native
  var FirstName: String = js.native
  var LastName: String = js.native
  var PersonID: String = js.native
  var UserFullName: String = js.native
  var UserID: Double = js.native
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
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFacebookID(value: String): Self = this.set("FacebookID", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstName(value: String): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastName(value: String): Self = this.set("LastName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonID(value: String): Self = this.set("PersonID", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserFullName(value: String): Self = this.set("UserFullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserID(value: Double): Self = this.set("UserID", value.asInstanceOf[js.Any])
  }
  
}

