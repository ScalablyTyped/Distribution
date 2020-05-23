package typings.chartmogulNode.anon

import typings.chartmogulNode.mod.Customer.NewCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomArray extends js.Object {
  var custom: js.Array[NewCustomAttributes]
}

object CustomArray {
  @scala.inline
  def apply(custom: js.Array[NewCustomAttributes]): CustomArray = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomArray]
  }
}

