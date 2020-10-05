package typings.chartJs.mod

import typings.moment.mod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartData extends js.Object {
  var datasets: js.UndefOr[js.Array[ChartDataSets]] = js.native
  var labels: js.UndefOr[
    js.Array[String | (js.Array[Date | Double | Moment | String]) | Double | Date | Moment]
  ] = js.native
}

object ChartData {
  @scala.inline
  def apply(): ChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartData]
  }
  @scala.inline
  implicit class ChartDataOps[Self <: ChartData] (val x: Self) extends AnyVal {
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
    def setDatasetsVarargs(value: ChartDataSets*): Self = this.set("datasets", js.Array(value :_*))
    @scala.inline
    def setDatasets(value: js.Array[ChartDataSets]): Self = this.set("datasets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasets: Self = this.set("datasets", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: (String | (js.Array[Date | Double | Moment | String]) | Double | Date | Moment)*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[String | (js.Array[Date | Double | Moment | String]) | Double | Date | Moment]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
  
}

