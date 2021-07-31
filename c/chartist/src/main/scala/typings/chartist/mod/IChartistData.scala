package typings.chartist.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// data formats are not well documented on all the ways they can be passed to the constructors
// this definition gives some intellisense, but does not protect the user from misuse
// TODO: come in and tidy this up and make it fit better
trait IChartistData extends StObject {
  
  var labels: js.UndefOr[js.Array[Date | Double | String]] = js.undefined
  
  var series: js.Array[
    (js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData
  ]
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
  implicit class IChartistDataMutableBuilder[Self <: IChartistData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: js.Array[Date | Double | String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: (Date | Double | String)*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setSeries(
      value: js.Array[
          (js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData
        ]
    ): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesVarargs(value: ((js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData)*): Self = StObject.set(x, "series", js.Array(value :_*))
  }
}
