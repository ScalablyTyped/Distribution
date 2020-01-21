package typings.braftEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFamily extends js.Object {
  var family: String
  var name: String
}

object AnonFamily {
  @scala.inline
  def apply(family: String, name: String): AnonFamily = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFamily]
  }
}

