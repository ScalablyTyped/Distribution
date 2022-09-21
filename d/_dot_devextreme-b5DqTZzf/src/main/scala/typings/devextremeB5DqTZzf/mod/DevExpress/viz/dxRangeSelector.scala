package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.ExportInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.IncidentInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxRangeSelector
  extends StObject
     with BaseWidget[dxRangeSelectorOptions] {
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Gets the currently selected range.
    */
  def getValue(): js.Array[Double | String | js.Date] = js.native
  
  /**
    * Redraws the UI component.
    */
  def render(skipChartAnimation: Boolean): Unit = js.native
  
  /**
    * Sets the selected range.
    */
  def setValue(value: js.Array[Double | String | js.Date]): Unit = js.native
  def setValue(value: VizRange): Unit = js.native
}
object dxRangeSelector {
  
  type DisposingEvent = EventInfo[dxRangeSelector]
  
  type DrawnEvent = EventInfo[dxRangeSelector]
  
  type ExportedEvent = EventInfo[dxRangeSelector]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxRangeSelector]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxRangeSelector, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxRangeSelector]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxRangeSelector]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxRangeSelector, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxRangeSelector]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxRangeSelector]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxRangeSelector, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxRangeSelectorOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxRangeSelector, MouseEvent | TouchEvent] {
    
    val previousValue: js.Array[Double | String | js.Date]
    
    val value: js.Array[Double | String | js.Date]
  }
  object ValueChangedEvent {
    
    inline def apply(
      component: dxRangeSelector,
      element: DxElement_[HTMLElement],
      previousValue: js.Array[Double | String | js.Date],
      value: js.Array[Double | String | js.Date]
    ): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
    
    extension [Self <: ValueChangedEvent](x: Self) {
      
      inline def setPreviousValue(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "previousValue", js.Array(value*))
      
      inline def setValue(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
