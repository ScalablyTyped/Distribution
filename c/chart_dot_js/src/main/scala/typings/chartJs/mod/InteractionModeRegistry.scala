package typings.chartJs.mod

import typings.chartJs.chartJsStrings.`x-axis`
import typings.chartJs.chartJsStrings.dataset
import typings.chartJs.chartJsStrings.index
import typings.chartJs.chartJsStrings.label
import typings.chartJs.chartJsStrings.nearest
import typings.chartJs.chartJsStrings.point
import typings.chartJs.chartJsStrings.single
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allow extending the IteractionMode type alias
// see https://github.com/microsoft/TypeScript/issues/28078#issuecomment-432339564
trait InteractionModeRegistry extends js.Object {
  var dataset: typings.chartJs.chartJsStrings.dataset
  var index: typings.chartJs.chartJsStrings.index
  var label: typings.chartJs.chartJsStrings.label
  var nearest: typings.chartJs.chartJsStrings.nearest
  var point: typings.chartJs.chartJsStrings.point
  var single: typings.chartJs.chartJsStrings.single
  var x: typings.chartJs.chartJsStrings.x
  var `x-axis`: typings.chartJs.chartJsStrings.`x-axis`
  var y: typings.chartJs.chartJsStrings.y
}

object InteractionModeRegistry {
  @scala.inline
  def apply(
    dataset: dataset,
    index: index,
    label: label,
    nearest: nearest,
    point: point,
    single: single,
    x: x,
    `x-axis`: `x-axis`,
    y: y
  ): InteractionModeRegistry = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("x-axis")(`x-axis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionModeRegistry]
  }
}

