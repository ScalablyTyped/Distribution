package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaData extends StObject {
  
  var _chart: typings.chartJs.mod.Chart = js.native
  
  var _datasetIndex: Double = js.native
  
  var _index: Double = js.native
  
  var _model: Model = js.native
  
  var _start: js.UndefOr[js.Any] = js.native
  
  var _view: Model = js.native
  
  var _xScale: ChartScales = js.native
  
  var _yScale: ChartScales = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
}
object MetaData {
  
  @scala.inline
  def apply(
    _chart: typings.chartJs.mod.Chart,
    _datasetIndex: Double,
    _index: Double,
    _model: Model,
    _view: Model,
    _xScale: ChartScales,
    _yScale: ChartScales
  ): MetaData = {
    val __obj = js.Dynamic.literal(_chart = _chart.asInstanceOf[js.Any], _datasetIndex = _datasetIndex.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _model = _model.asInstanceOf[js.Any], _view = _view.asInstanceOf[js.Any], _xScale = _xScale.asInstanceOf[js.Any], _yScale = _yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaData]
  }
  
  @scala.inline
  implicit class MetaDataMutableBuilder[Self <: MetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def set_chart(value: typings.chartJs.mod.Chart): Self = StObject.set(x, "_chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_datasetIndex(value: Double): Self = StObject.set(x, "_datasetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_index(value: Double): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_model(value: Model): Self = StObject.set(x, "_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_start(value: js.Any): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
    
    @scala.inline
    def set_view(value: Model): Self = StObject.set(x, "_view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_xScale(value: ChartScales): Self = StObject.set(x, "_xScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_yScale(value: ChartScales): Self = StObject.set(x, "_yScale", value.asInstanceOf[js.Any])
  }
}
