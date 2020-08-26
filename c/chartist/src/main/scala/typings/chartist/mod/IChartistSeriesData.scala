package typings.chartist.mod

import typings.chartist.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChartistSeriesData extends js.Object {
  var className: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Array[Double | X]] = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object IChartistSeriesData {
  @scala.inline
  def apply(): IChartistSeriesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistSeriesData]
  }
  @scala.inline
  implicit class IChartistSeriesDataOps[Self <: IChartistSeriesData] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDataVarargs(value: (Double | X)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Double | X]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

