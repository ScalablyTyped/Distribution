package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaData extends js.Object {
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
    _yScale: ChartScales,
    _start: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined
  ): MetaData = {
    val __obj = js.Dynamic.literal(_chart = _chart.asInstanceOf[js.Any], _datasetIndex = _datasetIndex.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _model = _model.asInstanceOf[js.Any], _view = _view.asInstanceOf[js.Any], _xScale = _xScale.asInstanceOf[js.Any], _yScale = _yScale.asInstanceOf[js.Any])
    if (_start != null) __obj.updateDynamic("_start")(_start.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaData]
  }
}

