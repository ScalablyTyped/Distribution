package typings.c3.anon

import typings.c3.mod.DataSeries
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draggable extends js.Object {
  /**
    * Enable to select data points by dragging.
    * If this option set `true`, data points can be selected by dragging.
    *
    * **Note**: If this option set `true`, scrolling on the chart will be disabled because dragging event will handle the event.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable selecting data.
    * If this option is set `true`, we can select the data points and get/set its state of selection by API (e.g. `select`, `unselect`, `selected`).
    * Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Set grouped selection enabled.
    * If this option set `true`, multiple data points that have same x value will be selected by one selection.
    * Defaults to `false`.
    */
  var grouped: js.UndefOr[Boolean] = js.native
  /**
    * Prevent specific data from being selected. Only called if `selection.enabled` is `true`.
    * @param d The data series to decide for.
    * @returns `false` if selection should be disabled for this data.
    */
  var isselectable: js.UndefOr[js.ThisFunction1[/* this */ Record[String, _], /* d */ DataSeries, Boolean]] = js.native
  /**
    * Set multiple data points selection enabled.
    * If this option set `true`, multiple data points can have the selected
    * state at the same time. If `false` set, only one data point can have
    * the selected state and the others will be unselected when the new data point is selected.
    */
  var multiple: js.UndefOr[Boolean] = js.native
}

object Draggable {
  @scala.inline
  def apply(): Draggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Draggable]
  }
  @scala.inline
  implicit class DraggableOps[Self <: Draggable] (val x: Self) extends AnyVal {
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
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setGrouped(value: Boolean): Self = this.set("grouped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouped: Self = this.set("grouped", js.undefined)
    @scala.inline
    def setIsselectable(value: js.ThisFunction1[/* this */ Record[String, _], /* d */ DataSeries, Boolean]): Self = this.set("isselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsselectable: Self = this.set("isselectable", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
  
}

