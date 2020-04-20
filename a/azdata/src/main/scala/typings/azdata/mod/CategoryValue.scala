package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryValue extends js.Object {
  var displayName: String
  var name: String
}

object CategoryValue {
  @scala.inline
  def apply(displayName: String, name: String): CategoryValue = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryValue]
  }
}

