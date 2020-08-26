package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Utility Functions
  * Miscellaneous
  * chayns.utils
  * interfaces
  */
// chayns.utils.getJwtPayload()
@js.native
trait JwtPaylod extends js.Object {
  var FacebookUserID: String = js.native
  var FirstName: String = js.native
  var LastName: String = js.native
  var LocationID: Double = js.native
  var LoginType: Double = js.native
  var PersonID: String = js.native
  var TobitUserID: Double = js.native
  var isAdmin: Boolean = js.native
}

object JwtPaylod {
  @scala.inline
  def apply(
    FacebookUserID: String,
    FirstName: String,
    LastName: String,
    LocationID: Double,
    LoginType: Double,
    PersonID: String,
    TobitUserID: Double,
    isAdmin: Boolean
  ): JwtPaylod = {
    val __obj = js.Dynamic.literal(FacebookUserID = FacebookUserID.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], LocationID = LocationID.asInstanceOf[js.Any], LoginType = LoginType.asInstanceOf[js.Any], PersonID = PersonID.asInstanceOf[js.Any], TobitUserID = TobitUserID.asInstanceOf[js.Any], isAdmin = isAdmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtPaylod]
  }
  @scala.inline
  implicit class JwtPaylodOps[Self <: JwtPaylod] (val x: Self) extends AnyVal {
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
    def setFacebookUserID(value: String): Self = this.set("FacebookUserID", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstName(value: String): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastName(value: String): Self = this.set("LastName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationID(value: Double): Self = this.set("LocationID", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoginType(value: Double): Self = this.set("LoginType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonID(value: String): Self = this.set("PersonID", value.asInstanceOf[js.Any])
    @scala.inline
    def setTobitUserID(value: Double): Self = this.set("TobitUserID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAdmin(value: Boolean): Self = this.set("isAdmin", value.asInstanceOf[js.Any])
  }
  
}

