package typings
package chaynsLib

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
  var FacebookUserID: java.lang.String
  var FirstName: java.lang.String
  var LastName: java.lang.String
  var LocationID: scala.Double
  var LoginType: scala.Double
  var PersonID: java.lang.String
  var TobitUserID: scala.Double
  var isAdmin: scala.Boolean
}

object JwtPaylod {
  @scala.inline
  def apply(
    FacebookUserID: java.lang.String,
    FirstName: java.lang.String,
    LastName: java.lang.String,
    LocationID: scala.Double,
    LoginType: scala.Double,
    PersonID: java.lang.String,
    TobitUserID: scala.Double,
    isAdmin: scala.Boolean
  ): JwtPaylod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FacebookUserID")(FacebookUserID)
    __obj.updateDynamic("FirstName")(FirstName)
    __obj.updateDynamic("LastName")(LastName)
    __obj.updateDynamic("LocationID")(LocationID)
    __obj.updateDynamic("LoginType")(LoginType)
    __obj.updateDynamic("PersonID")(PersonID)
    __obj.updateDynamic("TobitUserID")(TobitUserID)
    __obj.updateDynamic("isAdmin")(isAdmin)
    __obj.asInstanceOf[JwtPaylod]
  }
}

