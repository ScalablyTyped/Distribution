package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var FacebookID: java.lang.String
  var FirstName: java.lang.String
  var LastName: java.lang.String
  var PersonID: java.lang.String
  var UserFullName: java.lang.String
  var UserID: scala.Double
}

object User {
  @scala.inline
  def apply(
    FacebookID: java.lang.String,
    FirstName: java.lang.String,
    LastName: java.lang.String,
    PersonID: java.lang.String,
    UserFullName: java.lang.String,
    UserID: scala.Double
  ): User = {
    val __obj = js.Dynamic.literal(FacebookID = FacebookID, FirstName = FirstName, LastName = LastName, PersonID = PersonID, UserFullName = UserFullName, UserID = UserID)
  
    __obj.asInstanceOf[User]
  }
}

