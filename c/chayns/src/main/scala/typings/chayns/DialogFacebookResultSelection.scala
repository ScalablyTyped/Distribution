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
    val __obj = js.Dynamic.literal(first_name = first_name, gender = gender, id = id, last_name = last_name, name = name)
  
    __obj.asInstanceOf[DialogFacebookResultSelection]
  }
}

