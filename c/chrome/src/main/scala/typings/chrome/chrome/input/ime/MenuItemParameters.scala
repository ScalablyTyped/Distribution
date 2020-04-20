package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemParameters extends js.Object {
  var engineId: String
  var items: js.Array[js.Object]
}

object MenuItemParameters {
  @scala.inline
  def apply(engineId: String, items: js.Array[js.Object]): MenuItemParameters = {
    val __obj = js.Dynamic.literal(engineId = engineId.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemParameters]
  }
}

