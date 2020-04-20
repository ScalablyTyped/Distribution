package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginInfo extends js.Object {
  var name: String
}

object LoginInfo {
  @scala.inline
  def apply(name: String): LoginInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginInfo]
  }
}

