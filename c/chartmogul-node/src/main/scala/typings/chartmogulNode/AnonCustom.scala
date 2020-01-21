package typings.chartmogulNode

import typings.chartmogulNode.mod.Customer.NewCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustom extends js.Object {
  var custom: js.Array[NewCustomAttributes]
  var email: String
}

object AnonCustom {
  @scala.inline
  def apply(custom: js.Array[NewCustomAttributes], email: String): AnonCustom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCustom]
  }
}

