package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTablesOptions extends TimeoutIntervalOptions {
  var nextTableName: js.UndefOr[String] = js.native
}

object QueryTablesOptions {
  @scala.inline
  def apply(): QueryTablesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTablesOptions]
  }
  @scala.inline
  implicit class QueryTablesOptionsOps[Self <: QueryTablesOptions] (val x: Self) extends AnyVal {
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
    def setNextTableName(value: String): Self = this.set("nextTableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextTableName: Self = this.set("nextTableName", js.undefined)
  }
  
}

