package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImeParameters extends js.Object {
  /** ID of the engine to use */
  var engineID: String = js.native
  /** MenuItems to use. */
  var items: js.Array[MenuItem] = js.native
}

object ImeParameters {
  @scala.inline
  def apply(engineID: String, items: js.Array[MenuItem]): ImeParameters = {
    val __obj = js.Dynamic.literal(engineID = engineID.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImeParameters]
  }
  @scala.inline
  implicit class ImeParametersOps[Self <: ImeParameters] (val x: Self) extends AnyVal {
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
    def setEngineID(value: String): Self = this.set("engineID", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: MenuItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[MenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

