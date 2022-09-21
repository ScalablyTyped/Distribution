package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.Bottom
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxResizable {
  
  type DisposingEvent = EventInfo[dxResizable]
  
  type InitializedEvent = InitializedEventInfo[dxResizable]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxResizable]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxResizable, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxResizableOptions
  
  trait ResizeEndEvent
    extends StObject
       with NativeEventInfo[dxResizable, MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeEndEvent {
    
    inline def apply(
      component: dxResizable,
      element: DxElement_[HTMLElement],
      handles: Bottom,
      height: Double,
      width: Double
    ): ResizeEndEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handles = handles.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeEndEvent]
    }
  }
  
  trait ResizeEvent
    extends StObject
       with NativeEventInfo[dxResizable, MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeEvent {
    
    inline def apply(
      component: dxResizable,
      element: DxElement_[HTMLElement],
      handles: Bottom,
      height: Double,
      width: Double
    ): ResizeEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handles = handles.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeEvent]
    }
  }
  
  trait ResizeInfo extends StObject {
    
    var handles: Bottom
    
    val height: Double
    
    val width: Double
  }
  object ResizeInfo {
    
    inline def apply(handles: Bottom, height: Double, width: Double): ResizeInfo = {
      val __obj = js.Dynamic.literal(handles = handles.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeInfo]
    }
    
    extension [Self <: ResizeInfo](x: Self) {
      
      inline def setHandles(value: Bottom): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeStartEvent
    extends StObject
       with NativeEventInfo[dxResizable, MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeStartEvent {
    
    inline def apply(
      component: dxResizable,
      element: DxElement_[HTMLElement],
      handles: Bottom,
      height: Double,
      width: Double
    ): ResizeStartEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handles = handles.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeStartEvent]
    }
  }
}
