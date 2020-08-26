package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSeries extends js.Object {
  var id: js.UndefOr[String] = js.native
  var id_org: js.UndefOr[String] = js.native
  var values: js.Array[DataPoint] = js.native
}

object DataSeries {
  @scala.inline
  def apply(values: js.Array[DataPoint]): DataSeries = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSeries]
  }
  @scala.inline
  implicit class DataSeriesOps[Self <: DataSeries] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: DataPoint*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[DataPoint]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setId_org(value: String): Self = this.set("id_org", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId_org: Self = this.set("id_org", js.undefined)
  }
  
}

