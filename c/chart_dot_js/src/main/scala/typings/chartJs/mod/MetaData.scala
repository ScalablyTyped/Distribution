package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaData extends StObject {
  
  var _chart: Chart
  
  var _datasetIndex: Double
  
  var _index: Double
  
  var _model: Model
  
  var _start: js.UndefOr[js.Any] = js.undefined
  
  var _view: Model
  
  var _xScale: ChartScales
  
  var _yScale: ChartScales
  
  var hidden: js.UndefOr[Boolean] = js.undefined
}
object MetaData {
  
  @scala.inline
  def apply(
    _chart: Chart,
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
    def set_chart(value: Chart): Self = StObject.set(x, "_chart", value.asInstanceOf[js.Any])
    
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
