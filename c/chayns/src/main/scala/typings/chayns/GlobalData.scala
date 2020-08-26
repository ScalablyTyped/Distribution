package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalData extends js.Object {
  var _result: js.Any = js.native
}

object GlobalData {
  @scala.inline
  def apply(_result: js.Any): GlobalData = {
    val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalData]
  }
  @scala.inline
  implicit class GlobalDataOps[Self <: GlobalData] (val x: Self) extends AnyVal {
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
    def set_result(value: js.Any): Self = this.set("_result", value.asInstanceOf[js.Any])
  }
  
}

