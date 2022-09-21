package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.PositionConfig
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
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
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxContextMenu[TKey]
  extends StObject
     with dxMenuBase[dxContextMenuOptions[TKey], dxContextMenuItem, TKey] {
  
  /**
    * Hides the UI component.
    */
  def hide(): DxPromise[Unit] = js.native
  
  /**
    * Shows the UI component.
    */
  def show(): DxPromise[Unit] = js.native
  
  /**
    * Shows or hides the UI component depending on the argument.
    */
  def toggle(showing: Boolean): DxPromise[Unit] = js.native
}
object dxContextMenu {
  
  type ContentReadyEvent[TKey] = EventInfo[dxContextMenu[TKey]]
  
  type DisposingEvent[TKey] = EventInfo[dxContextMenu[TKey]]
  
  trait ExplicitTypes[TKey] extends StObject {
    
    var ContentReadyEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.ContentReadyEvent[TKey]
    
    var DisposingEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.DisposingEvent[TKey]
    
    var HiddenEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.HiddenEvent[TKey]
    
    var HidingEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.HidingEvent[TKey]
    
    var InitializedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.InitializedEvent[TKey]
    
    var ItemClickEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.ItemClickEvent[TKey]
    
    var ItemContextMenuEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.ItemContextMenuEvent[TKey]
    
    var ItemRenderedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.ItemRenderedEvent[TKey]
    
    var OptionChangedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.OptionChangedEvent[TKey]
    
    var PositioningEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.PositioningEvent[TKey]
    
    var Properties: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.Properties[TKey]
    
    var SelectionChangedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.SelectionChangedEvent[TKey]
    
    var ShowingEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.ShowingEvent[TKey]
    
    var ShownEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.ShownEvent[TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TKey](
      ContentReadyEvent: ContentReadyEvent[TKey],
      DisposingEvent: DisposingEvent[TKey],
      HiddenEvent: HiddenEvent[TKey],
      HidingEvent: HidingEvent[TKey],
      InitializedEvent: InitializedEvent[TKey],
      ItemClickEvent: ItemClickEvent[TKey],
      ItemContextMenuEvent: ItemContextMenuEvent[TKey],
      ItemRenderedEvent: ItemRenderedEvent[TKey],
      OptionChangedEvent: OptionChangedEvent[TKey],
      PositioningEvent: PositioningEvent[TKey],
      Properties: Properties[TKey],
      SelectionChangedEvent: SelectionChangedEvent[TKey],
      ShowingEvent: ShowingEvent[TKey],
      ShownEvent: ShownEvent[TKey]
    ): ExplicitTypes[TKey] = {
      val __obj = js.Dynamic.literal(ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], HiddenEvent = HiddenEvent.asInstanceOf[js.Any], HidingEvent = HidingEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], ItemContextMenuEvent = ItemContextMenuEvent.asInstanceOf[js.Any], ItemRenderedEvent = ItemRenderedEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], PositioningEvent = PositioningEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any], ShowingEvent = ShowingEvent.asInstanceOf[js.Any], ShownEvent = ShownEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TKey]]
    }
    
    extension [Self <: ExplicitTypes[?], TKey](x: Self & ExplicitTypes[TKey]) {
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setHiddenEvent(value: HiddenEvent[TKey]): Self = StObject.set(x, "HiddenEvent", value.asInstanceOf[js.Any])
      
      inline def setHidingEvent(value: HidingEvent[TKey]): Self = StObject.set(x, "HidingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setItemContextMenuEvent(value: ItemContextMenuEvent[TKey]): Self = StObject.set(x, "ItemContextMenuEvent", value.asInstanceOf[js.Any])
      
      inline def setItemRenderedEvent(value: ItemRenderedEvent[TKey]): Self = StObject.set(x, "ItemRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setPositioningEvent(value: PositioningEvent[TKey]): Self = StObject.set(x, "PositioningEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
      
      inline def setSelectionChangedEvent(value: SelectionChangedEvent[TKey]): Self = StObject.set(x, "SelectionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setShowingEvent(value: ShowingEvent[TKey]): Self = StObject.set(x, "ShowingEvent", value.asInstanceOf[js.Any])
      
      inline def setShownEvent(value: ShownEvent[TKey]): Self = StObject.set(x, "ShownEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type HiddenEvent[TKey] = EventInfo[dxContextMenu[TKey]]
  
  trait HidingEvent[TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxContextMenu[TKey]]
  object HidingEvent {
    
    inline def apply[TKey](component: dxContextMenu[TKey], element: DxElement_[HTMLElement]): HidingEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[HidingEvent[TKey]]
    }
  }
  
  type InitializedEvent[TKey] = InitializedEventInfo[dxContextMenu[TKey]]
  
  type Item = dxContextMenuItem
  
  trait ItemClickEvent[TKey]
    extends StObject
       with NativeEventInfo[dxContextMenu[TKey], KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[Item]
  object ItemClickEvent {
    
    inline def apply[TKey](
      component: dxContextMenu[TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent[TKey]]
    }
  }
  
  trait ItemContextMenuEvent[TKey]
    extends StObject
       with NativeEventInfo[dxContextMenu[TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[Item]
  object ItemContextMenuEvent {
    
    inline def apply[TKey](
      component: dxContextMenu[TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemContextMenuEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContextMenuEvent[TKey]]
    }
  }
  
  trait ItemRenderedEvent[TKey]
    extends StObject
       with EventInfo[dxContextMenu[TKey]]
       with ItemInfo[Item]
  object ItemRenderedEvent {
    
    inline def apply[TKey](
      component: dxContextMenu[TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemRenderedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenderedEvent[TKey]]
    }
  }
  
  trait OptionChangedEvent[TKey]
    extends StObject
       with EventInfo[dxContextMenu[TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TKey](component: dxContextMenu[TKey], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TKey]]
    }
  }
  
  trait PositioningEvent[TKey]
    extends StObject
       with NativeEventInfo[dxContextMenu[TKey], MouseEvent | PointerEvent | TouchEvent] {
    
    val position: PositionConfig
  }
  object PositioningEvent {
    
    inline def apply[TKey](component: dxContextMenu[TKey], element: DxElement_[HTMLElement], position: PositionConfig): PositioningEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositioningEvent[TKey]]
    }
    
    extension [Self <: PositioningEvent[?], TKey](x: Self & PositioningEvent[TKey]) {
      
      inline def setPosition(value: PositionConfig): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  type Properties[TKey] = dxContextMenuOptions[TKey]
  
  trait SelectionChangedEvent[TKey]
    extends StObject
       with EventInfo[dxContextMenu[TKey]]
       with SelectionChangedInfo[Item]
  object SelectionChangedEvent {
    
    inline def apply[TKey](
      addedItems: js.Array[Item],
      component: dxContextMenu[TKey],
      element: DxElement_[HTMLElement],
      removedItems: js.Array[Item]
    ): SelectionChangedEvent[TKey] = {
      val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent[TKey]]
    }
  }
  
  trait ShowingEvent[TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxContextMenu[TKey]]
  object ShowingEvent {
    
    inline def apply[TKey](component: dxContextMenu[TKey], element: DxElement_[HTMLElement]): ShowingEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowingEvent[TKey]]
    }
  }
  
  type ShownEvent[TKey] = EventInfo[dxContextMenu[TKey]]
}
