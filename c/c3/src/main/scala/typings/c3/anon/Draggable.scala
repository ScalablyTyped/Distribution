package typings.c3.anon

import typings.c3.mod.DataSeries
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Draggable extends StObject {
  
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
  var isselectable: js.UndefOr[js.ThisFunction1[/* this */ Record[String, Any], /* d */ DataSeries, Boolean]] = js.undefined
  
  /**
    * Set multiple data points selection enabled.
    * If this option set `true`, multiple data points can have the selected
    * state at the same time. If `false` set, only one data point can have
    * the selected state and the others will be unselected when the new data point is selected.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
}
object Draggable {
  
  inline def apply(): Draggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Draggable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Draggable] (val x: Self) extends AnyVal {
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    
    inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    
    inline def setIsselectable(value: js.ThisFunction1[/* this */ Record[String, Any], /* d */ DataSeries, Boolean]): Self = StObject.set(x, "isselectable", value.asInstanceOf[js.Any])
    
    inline def setIsselectableUndefined: Self = StObject.set(x, "isselectable", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
