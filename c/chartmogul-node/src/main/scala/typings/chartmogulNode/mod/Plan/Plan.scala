package typings.chartmogulNode.mod.Plan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plan extends js.Object {
  var data_source_uuid: js.UndefOr[String] = js.native
  var external_id: js.UndefOr[String] = js.native
  var interval_count: js.UndefOr[Double] = js.native
  var interval_unit: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var uuid: js.UndefOr[String] = js.native
}

object Plan {
  @scala.inline
  def apply(): Plan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plan]
  }
  @scala.inline
  implicit class PlanOps[Self <: typings.chartmogulNode.mod.Plan.Plan] (val x: Self) extends AnyVal {
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
    def setData_source_uuid(value: String): Self = this.set("data_source_uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData_source_uuid: Self = this.set("data_source_uuid", js.undefined)
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    @scala.inline
    def setInterval_count(value: Double): Self = this.set("interval_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval_count: Self = this.set("interval_count", js.undefined)
    @scala.inline
    def setInterval_unit(value: String): Self = this.set("interval_unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval_unit: Self = this.set("interval_unit", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
  
}

