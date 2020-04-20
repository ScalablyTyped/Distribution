package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogFacebookResultSelection extends js.Object {
  var first_name: String
  var gender: String
  var id: String
  var last_name: String
  var name: String
}

object DialogFacebookResultSelection {
  @scala.inline
  def apply(first_name: String, gender: String, id: String, last_name: String, name: String): DialogFacebookResultSelection = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFacebookResultSelection]
  }
}

