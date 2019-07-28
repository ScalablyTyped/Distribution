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
    val __obj = js.Dynamic.literal(_chart = _chart, _datasetIndex = _datasetIndex, _index = _index, _model = _model, _view = _view, _xScale = _xScale, _yScale = _yScale)
    if (_start != null) __obj.updateDynamic("_start")(_start)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    __obj.asInstanceOf[MetaData]
  }
}

