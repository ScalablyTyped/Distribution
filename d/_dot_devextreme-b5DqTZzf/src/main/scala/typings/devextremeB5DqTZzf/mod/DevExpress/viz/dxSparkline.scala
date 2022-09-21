package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.ExportInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget.IncidentInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSparkline
  extends StObject
     with BaseSparkline[dxSparklineOptions] {
  
  def getDataSource(): DataSource[Any, Any] = js.native
}
object dxSparkline {
  
  type DisposingEvent = EventInfo[dxSparkline]
  
  type DrawnEvent = EventInfo[dxSparkline]
  
  type ExportedEvent = EventInfo[dxSparkline]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxSparkline]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxSparkline, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxSparkline]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxSparkline]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxSparkline, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxSparkline]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSparkline]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxSparkline, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSparklineOptions
  
  type TooltipHiddenEvent = EventInfo[dxSparkline]
  
  type TooltipShownEvent = EventInfo[dxSparkline]
}
