package typings.chartmogulNode

import typings.chartmogulNode.mod.Customer.NewCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomArray extends js.Object {
  var custom: js.Array[NewCustomAttributes]
}

object AnonCustomArray {
  @scala.inline
  def apply(custom: js.Array[NewCustomAttributes]): AnonCustomArray = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomArray]
  }
}

