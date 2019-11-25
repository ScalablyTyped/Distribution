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
trait JwtPaylod extends js.Object {
  var FacebookUserID: String
  var FirstName: String
  var LastName: String
  var LocationID: Double
  var LoginType: Double
  var PersonID: String
  var TobitUserID: Double
  var isAdmin: Boolean
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
}

