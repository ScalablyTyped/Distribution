package typings.chartJs.mod

import typings.moment.mod.Moment
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartData extends StObject {
  
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
  implicit class ChartDataMutableBuilder[Self <: ChartData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasets(value: js.Array[ChartDataSets]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    @scala.inline
    def setDatasetsVarargs(value: ChartDataSets*): Self = StObject.set(x, "datasets", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[String | (js.Array[Date | Double | Moment | String]) | Double | Date | Moment]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: (String | (js.Array[Date | Double | Moment | String]) | Double | Date | Moment)*): Self = StObject.set(x, "labels", js.Array(value :_*))
  }
}
