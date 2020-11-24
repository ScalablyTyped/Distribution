package typings.chartist.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// data formats are not well documented on all the ways they can be passed to the constructors
// this definition gives some intellisense, but does not protect the user from misuse
// TODO: come in and tidy this up and make it fit better
@js.native
trait IChartistData extends js.Object {
  
  var labels: js.UndefOr[js.Array[Date | Double | String]] = js.native
  
  var series: js.Array[
    (js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData
  ] = js.native
}
object IChartistData {
  
  @scala.inline
  def apply(
    series: js.Array[
      (js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData
    ]
  ): IChartistData = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistData]
  }
  
  @scala.inline
  implicit class IChartistDataOps[Self <: IChartistData] (val x: Self) extends AnyVal {
    
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
    def setSeriesVarargs(value: ((js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData)*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(
      value: js.Array[
          (js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData
        ]
    ): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: (Date | Double | String)*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[Date | Double | String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
}
