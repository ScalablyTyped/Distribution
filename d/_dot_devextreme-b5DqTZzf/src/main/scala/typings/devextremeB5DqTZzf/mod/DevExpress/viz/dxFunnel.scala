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
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxFunnel.Item
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFunnel
  extends StObject
     with BaseWidget[dxFunnelOptions] {
  
  /**
    * Cancels the selection of all funnel items.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Provides access to all funnel items.
    */
  def getAllItems(): js.Array[Item] = js.native
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Hides all UI component tooltips.
    */
  def hideTooltip(): Unit = js.native
}
object dxFunnel {
  
  type DisposingEvent = EventInfo[dxFunnel]
  
  type DrawnEvent = EventInfo[dxFunnel]
  
  type ExportedEvent = EventInfo[dxFunnel]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxFunnel]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxFunnel]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  trait FunnelItemInfo extends StObject {
    
    val item: Item
  }
  object FunnelItemInfo {
    
    inline def apply(item: Item): FunnelItemInfo = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunnelItemInfo]
    }
    
    extension [Self <: FunnelItemInfo](x: Self) {
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait HoverChangedEvent
    extends StObject
       with EventInfo[dxFunnel]
       with FunnelItemInfo
  object HoverChangedEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], item: Item): HoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoverChangedEvent]
    }
  }
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxFunnel]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxFunnel]
  
  type Item = dxFunnelItem
  
  trait ItemClickEvent
    extends StObject
       with NativeEventInfo[dxFunnel, MouseEvent | PointerEvent]
       with FunnelItemInfo
  object ItemClickEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], item: Item): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
  }
  
  trait LegendClickEvent
    extends StObject
       with NativeEventInfo[dxFunnel, MouseEvent | PointerEvent]
       with FunnelItemInfo
  object LegendClickEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], item: Item): LegendClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendClickEvent]
    }
  }
  
  type LegendItem = FunnelLegendItem
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxFunnel]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxFunnelOptions
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxFunnel]
       with FunnelItemInfo
  object SelectionChangedEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], item: Item): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
  }
}
