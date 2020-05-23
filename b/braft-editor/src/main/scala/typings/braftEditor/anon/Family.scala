package typings.braftEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Family extends js.Object {
  var family: String
  var name: String
}

object Family {
  @scala.inline
  def apply(family: String, name: String): Family = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Family]
  }
}

