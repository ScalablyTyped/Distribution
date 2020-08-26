package typings.datatablesNetFixedheader.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticFunctions extends js.Object {
  var FixedHeader: FixedHeaderStaticFunctions = js.native
}

object StaticFunctions {
  @scala.inline
  def apply(FixedHeader: FixedHeaderStaticFunctions): StaticFunctions = {
    val __obj = js.Dynamic.literal(FixedHeader = FixedHeader.asInstanceOf[js.Any])
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
    def setFixedHeader(value: FixedHeaderStaticFunctions): Self = this.set("FixedHeader", value.asInstanceOf[js.Any])
  }
  
}

