package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticFunctions extends js.Object {
  var Buttons: ButtonStaticFunctions = js.native
}

object StaticFunctions {
  @scala.inline
  def apply(Buttons: ButtonStaticFunctions): StaticFunctions = {
    val __obj = js.Dynamic.literal(Buttons = Buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticFunctions]
  }
  @scala.inline
  implicit class StaticFunctionsOps[Self <: StaticFunctions] (val x: Self) extends AnyVal {
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
    def setButtons(value: ButtonStaticFunctions): Self = this.set("Buttons", value.asInstanceOf[js.Any])
  }
  
}

