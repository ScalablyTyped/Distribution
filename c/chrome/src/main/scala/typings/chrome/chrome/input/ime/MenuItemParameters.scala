package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemParameters extends js.Object {
  var engineId: String = js.native
  var items: js.Array[js.Object] = js.native
}

object MenuItemParameters {
  @scala.inline
  def apply(engineId: String, items: js.Array[js.Object]): MenuItemParameters = {
    val __obj = js.Dynamic.literal(engineId = engineId.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemParameters]
  }
  @scala.inline
  implicit class MenuItemParametersOps[Self <: MenuItemParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEngineId(value: String): Self = this.set("engineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: js.Object*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[js.Object]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

