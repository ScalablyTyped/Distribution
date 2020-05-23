package typings.c3.anon

import typings.c3.mod.DataSeries
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draggable extends js.Object {
  /**
    * Enable to select data points by dragging.
    * If this option set `true`, data points can be selected by dragging.
    *
    * **Note**: If this option set `true`, scrolling on the chart will be disabled because dragging event will handle the event.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable selecting data.
    * If this option is set `true`, we can select the data points and get/set its state of selection by API (e.g. `select`, `unselect`, `selected`).
    * Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Set grouped selection enabled.
    * If this option set `true`, multiple data points that have same x value will be selected by one selection.
    * Defaults to `false`.
    */
  var grouped: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent specific data from being selected. Only called if `selection.enabled` is `true`.
    * @param d The data series to decide for.
    * @returns `false` if selection should be disabled for this data.
    */
  var isselectable: js.UndefOr[js.ThisFunction1[/* this */ Record[String, _], /* d */ DataSeries, Boolean]] = js.undefined
  /**
    * Set multiple data points selection enabled.
    * If this option set `true`, multiple data points can have the selected
    * state at the same time. If `false` set, only one data point can have
    * the selected state and the others will be unselected when the new data point is selected.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
}

object Draggable {
  @scala.inline
  def apply(
    draggable: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    grouped: js.UndefOr[Boolean] = js.undefined,
    isselectable: js.ThisFunction1[/* this */ Record[String, _], /* d */ DataSeries, Boolean] = null,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): Draggable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped.get.asInstanceOf[js.Any])
    if (isselectable != null) __obj.updateDynamic("isselectable")(isselectable.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draggable]
  }
}

