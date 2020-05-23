package typings.chartmogulNode.anon

import typings.chartmogulNode.mod.Customer.NewCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Custom extends js.Object {
  var custom: js.Array[NewCustomAttributes]
  var email: String
}

object Custom {
  @scala.inline
  def apply(custom: js.Array[NewCustomAttributes], email: String): Custom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
}

