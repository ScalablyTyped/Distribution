package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ItemInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.CollectionWidget.SelectionChangedInfo
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxButtonGroup {
  
  type ContentReadyEvent = EventInfo[dxButtonGroup]
  
  type DisposingEvent = EventInfo[dxButtonGroup]
  
  type InitializedEvent = InitializedEventInfo[dxButtonGroup]
  
  type Item = dxButtonGroupItem
  
  trait ItemClickEvent
    extends StObject
       with NativeEventInfo[dxButtonGroup, KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[Any]
  object ItemClickEvent {
    
    inline def apply(
      component: dxButtonGroup,
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxButtonGroup]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxButtonGroup, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxButtonGroupOptions
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxButtonGroup]
       with SelectionChangedInfo[Any]
  object SelectionChangedEvent {
    
    inline def apply(
      addedItems: js.Array[Any],
      component: dxButtonGroup,
      element: DxElement_[HTMLElement],
      removedItems: js.Array[Any]
    ): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
  }
}
