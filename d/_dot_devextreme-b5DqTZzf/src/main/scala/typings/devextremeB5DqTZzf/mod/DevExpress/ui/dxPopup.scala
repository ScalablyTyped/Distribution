package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.Bottom
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxResizable.ResizeInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxPopup {
  
  type ContentReadyEvent = EventInfo[dxPopup[Properties]]
  
  type DisposingEvent = EventInfo[dxPopup[Properties]]
  
  type HiddenEvent = EventInfo[dxPopup[Properties]]
  
  trait HidingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxPopup[Properties]]
  object HidingEvent {
    
    inline def apply(component: dxPopup[Properties], element: DxElement_[HTMLElement]): HidingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[HidingEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxPopup[Properties]]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxPopup[Properties]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxPopup[Properties], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  type PopupInstance = dxPopup[Properties]
  
  trait Properties
    extends StObject
       with dxPopupOptions[PopupInstance]
  object Properties {
    
    inline def apply(): Properties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Properties]
    }
  }
  
  trait ResizeEndEvent
    extends StObject
       with NativeEventInfo[dxPopup[Properties], MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeEndEvent {
    
    inline def apply(
      component: dxPopup[Properties],
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
       with NativeEventInfo[dxPopup[Properties], MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeEvent {
    
    inline def apply(
      component: dxPopup[Properties],
      element: DxElement_[HTMLElement],
      handles: Bottom,
      height: Double,
      width: Double
    ): ResizeEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handles = handles.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeEvent]
    }
  }
  
  trait ResizeStartEvent
    extends StObject
       with NativeEventInfo[dxPopup[Properties], MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeStartEvent {
    
    inline def apply(
      component: dxPopup[Properties],
      element: DxElement_[HTMLElement],
      handles: Bottom,
      height: Double,
      width: Double
    ): ResizeStartEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handles = handles.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeStartEvent]
    }
  }
  
  trait ShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxPopup[Properties]]
  object ShowingEvent {
    
    inline def apply(component: dxPopup[Properties], element: DxElement_[HTMLElement]): ShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowingEvent]
    }
  }
  
  trait ShownEvent
    extends StObject
       with EventInfo[dxPopup[Properties]]
  object ShownEvent {
    
    inline def apply(component: dxPopup[Properties], element: DxElement_[HTMLElement]): ShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShownEvent]
    }
  }
  
  trait TitleRenderedEvent
    extends StObject
       with EventInfo[dxPopup[Properties]]
       with TitleRenderedInfo
  object TitleRenderedEvent {
    
    inline def apply(
      component: dxPopup[Properties],
      element: DxElement_[HTMLElement],
      titleElement: DxElement_[HTMLElement]
    ): TitleRenderedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], titleElement = titleElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleRenderedEvent]
    }
  }
  
  trait TitleRenderedInfo extends StObject {
    
    val titleElement: DxElement_[HTMLElement]
  }
  object TitleRenderedInfo {
    
    inline def apply(titleElement: DxElement_[HTMLElement]): TitleRenderedInfo = {
      val __obj = js.Dynamic.literal(titleElement = titleElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleRenderedInfo]
    }
    
    extension [Self <: TitleRenderedInfo](x: Self) {
      
      inline def setTitleElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "titleElement", value.asInstanceOf[js.Any])
    }
  }
  
  type ToolbarItem = dxPopupToolbarItem
}
