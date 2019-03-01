package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogFacebookResultSelection extends js.Object {
  var first_name: java.lang.String
  var gender: java.lang.String
  var id: java.lang.String
  var last_name: java.lang.String
  var name: java.lang.String
}

object DialogFacebookResultSelection {
  @scala.inline
  def apply(
    first_name: java.lang.String,
    gender: java.lang.String,
    id: java.lang.String,
    last_name: java.lang.String,
    name: java.lang.String
  ): DialogFacebookResultSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("first_name")(first_name)
    __obj.updateDynamic("gender")(gender)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("last_name")(last_name)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DialogFacebookResultSelection]
  }
}

