package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaData extends js.Object {
  var _chart: Chart
  var _datasetIndex: scala.Double
  var _index: scala.Double
  var _model: Model
  var _start: js.UndefOr[js.Any] = js.undefined
  var _view: Model
  var _xScale: chartDotJsLib.chartDotJsMod.ChartNs.ChartScales
  var _yScale: chartDotJsLib.chartDotJsMod.ChartNs.ChartScales
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
}

object MetaData {
  @scala.inline
  def apply(
    _chart: Chart,
    _datasetIndex: scala.Double,
    _index: scala.Double,
    _model: Model,
    _view: Model,
    _xScale: chartDotJsLib.chartDotJsMod.ChartNs.ChartScales,
    _yScale: chartDotJsLib.chartDotJsMod.ChartNs.ChartScales,
    _start: js.Any = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined
  ): MetaData = {
    val __obj = js.Dynamic.literal(_chart = _chart, _datasetIndex = _datasetIndex, _index = _index, _model = _model, _view = _view, _xScale = _xScale, _yScale = _yScale)
    if (_start != null) __obj.updateDynamic("_start")(_start)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    __obj.asInstanceOf[MetaData]
  }
}

