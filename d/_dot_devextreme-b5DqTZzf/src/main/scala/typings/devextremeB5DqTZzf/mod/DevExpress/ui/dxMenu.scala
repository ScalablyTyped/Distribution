package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
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

object dxMenu {
  
  type ContentReadyEvent[TKey] = EventInfo[dxMenu[TKey]]
  
  type DisposingEvent[TKey] = EventInfo[dxMenu[TKey]]
  
  trait ExplicitTypes[TKey] extends StObject {
    
    var ContentReadyEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.ContentReadyEvent[TKey]
    
    var DisposingEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.DisposingEvent[TKey]
    
    var InitializedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.InitializedEvent[TKey]
    
    var ItemClickEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.ItemClickEvent[TKey]
    
    var ItemContextMenuEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.ItemContextMenuEvent[TKey]
    
    var ItemRenderedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.ItemRenderedEvent[TKey]
    
    var OptionChangedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.OptionChangedEvent[TKey]
    
    var Properties: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.Properties[TKey]
    
    var SelectionChangedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.SelectionChangedEvent[TKey]
    
    var SubmenuHiddenEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.SubmenuHiddenEvent[TKey]
    
    var SubmenuHidingEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.SubmenuHidingEvent[TKey]
    
    var SubmenuShowingEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.SubmenuShowingEvent[TKey]
    
    var SubmenuShownEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.SubmenuShownEvent[TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TKey](
      ContentReadyEvent: ContentReadyEvent[TKey],
      DisposingEvent: DisposingEvent[TKey],
      InitializedEvent: InitializedEvent[TKey],
      ItemClickEvent: ItemClickEvent[TKey],
      ItemContextMenuEvent: ItemContextMenuEvent[TKey],
      ItemRenderedEvent: ItemRenderedEvent[TKey],
      OptionChangedEvent: OptionChangedEvent[TKey],
      Properties: Properties[TKey],
      SelectionChangedEvent: SelectionChangedEvent[TKey],
      SubmenuHiddenEvent: SubmenuHiddenEvent[TKey],
      SubmenuHidingEvent: SubmenuHidingEvent[TKey],
      SubmenuShowingEvent: SubmenuShowingEvent[TKey],
      SubmenuShownEvent: SubmenuShownEvent[TKey]
    ): ExplicitTypes[TKey] = {
      val __obj = js.Dynamic.literal(ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], ItemContextMenuEvent = ItemContextMenuEvent.asInstanceOf[js.Any], ItemRenderedEvent = ItemRenderedEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any], SubmenuHiddenEvent = SubmenuHiddenEvent.asInstanceOf[js.Any], SubmenuHidingEvent = SubmenuHidingEvent.asInstanceOf[js.Any], SubmenuShowingEvent = SubmenuShowingEvent.asInstanceOf[js.Any], SubmenuShownEvent = SubmenuShownEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TKey]]
    }
    
    extension [Self <: ExplicitTypes[?], TKey](x: Self & ExplicitTypes[TKey]) {
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setItemContextMenuEvent(value: ItemContextMenuEvent[TKey]): Self = StObject.set(x, "ItemContextMenuEvent", value.asInstanceOf[js.Any])
      
      inline def setItemRenderedEvent(value: ItemRenderedEvent[TKey]): Self = StObject.set(x, "ItemRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
      
      inline def setSelectionChangedEvent(value: SelectionChangedEvent[TKey]): Self = StObject.set(x, "SelectionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setSubmenuHiddenEvent(value: SubmenuHiddenEvent[TKey]): Self = StObject.set(x, "SubmenuHiddenEvent", value.asInstanceOf[js.Any])
      
      inline def setSubmenuHidingEvent(value: SubmenuHidingEvent[TKey]): Self = StObject.set(x, "SubmenuHidingEvent", value.asInstanceOf[js.Any])
      
      inline def setSubmenuShowingEvent(value: SubmenuShowingEvent[TKey]): Self = StObject.set(x, "SubmenuShowingEvent", value.asInstanceOf[js.Any])
      
      inline def setSubmenuShownEvent(value: SubmenuShownEvent[TKey]): Self = StObject.set(x, "SubmenuShownEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent[TKey] = InitializedEventInfo[dxMenu[TKey]]
  
  type Item = dxMenuItem
  
  trait ItemClickEvent[TKey]
    extends StObject
       with NativeEventInfo[dxMenu[TKey], KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[Item]
  object ItemClickEvent {
    
    inline def apply[TKey](
      component: dxMenu[TKey],
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
       with NativeEventInfo[dxMenu[TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[Item]
  object ItemContextMenuEvent {
    
    inline def apply[TKey](
      component: dxMenu[TKey],
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
       with EventInfo[dxMenu[TKey]]
       with ItemInfo[Item]
  object ItemRenderedEvent {
    
    inline def apply[TKey](
      component: dxMenu[TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemRenderedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenderedEvent[TKey]]
    }
  }
  
  trait MenuBasePlainItem
    extends StObject
       with CollectionWidgetItem {
    
    /**
      * Specifies whether a group separator is displayed over the item.
      */
    var beginGroup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies if a menu is closed when a user clicks the item.
      */
    var closeMenuOnClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the menu item&apos;s icon.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies whether or not a user can select a menu item.
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether or not the item is selected.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object MenuBasePlainItem {
    
    inline def apply(): MenuBasePlainItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuBasePlainItem]
    }
    
    extension [Self <: MenuBasePlainItem](x: Self) {
      
      inline def setBeginGroup(value: Boolean): Self = StObject.set(x, "beginGroup", value.asInstanceOf[js.Any])
      
      inline def setBeginGroupUndefined: Self = StObject.set(x, "beginGroup", js.undefined)
      
      inline def setCloseMenuOnClick(value: Boolean): Self = StObject.set(x, "closeMenuOnClick", value.asInstanceOf[js.Any])
      
      inline def setCloseMenuOnClickUndefined: Self = StObject.set(x, "closeMenuOnClick", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait OptionChangedEvent[TKey]
    extends StObject
       with EventInfo[dxMenu[TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TKey](component: dxMenu[TKey], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TKey]]
    }
  }
  
  type Properties[TKey] = dxMenuOptions[TKey]
  
  trait SelectionChangedEvent[TKey]
    extends StObject
       with EventInfo[dxMenu[TKey]]
       with SelectionChangedInfo[Item]
  object SelectionChangedEvent {
    
    inline def apply[TKey](
      addedItems: js.Array[Item],
      component: dxMenu[TKey],
      element: DxElement_[HTMLElement],
      removedItems: js.Array[Item]
    ): SelectionChangedEvent[TKey] = {
      val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent[TKey]]
    }
  }
  
  trait SubmenuHiddenEvent[TKey]
    extends StObject
       with EventInfo[dxMenu[TKey]] {
    
    val rootItem: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object SubmenuHiddenEvent {
    
    inline def apply[TKey](component: dxMenu[TKey], element: DxElement_[HTMLElement]): SubmenuHiddenEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmenuHiddenEvent[TKey]]
    }
    
    extension [Self <: SubmenuHiddenEvent[?], TKey](x: Self & SubmenuHiddenEvent[TKey]) {
      
      inline def setRootItem(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rootItem", value.asInstanceOf[js.Any])
      
      inline def setRootItemUndefined: Self = StObject.set(x, "rootItem", js.undefined)
    }
  }
  
  trait SubmenuHidingEvent[TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxMenu[TKey]] {
    
    val rootItem: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object SubmenuHidingEvent {
    
    inline def apply[TKey](component: dxMenu[TKey], element: DxElement_[HTMLElement]): SubmenuHidingEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmenuHidingEvent[TKey]]
    }
    
    extension [Self <: SubmenuHidingEvent[?], TKey](x: Self & SubmenuHidingEvent[TKey]) {
      
      inline def setRootItem(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rootItem", value.asInstanceOf[js.Any])
      
      inline def setRootItemUndefined: Self = StObject.set(x, "rootItem", js.undefined)
    }
  }
  
  trait SubmenuShowingEvent[TKey]
    extends StObject
       with EventInfo[dxMenu[TKey]] {
    
    val rootItem: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object SubmenuShowingEvent {
    
    inline def apply[TKey](component: dxMenu[TKey], element: DxElement_[HTMLElement]): SubmenuShowingEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmenuShowingEvent[TKey]]
    }
    
    extension [Self <: SubmenuShowingEvent[?], TKey](x: Self & SubmenuShowingEvent[TKey]) {
      
      inline def setRootItem(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rootItem", value.asInstanceOf[js.Any])
      
      inline def setRootItemUndefined: Self = StObject.set(x, "rootItem", js.undefined)
    }
  }
  
  trait SubmenuShownEvent[TKey]
    extends StObject
       with EventInfo[dxMenu[TKey]] {
    
    val rootItem: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object SubmenuShownEvent {
    
    inline def apply[TKey](component: dxMenu[TKey], element: DxElement_[HTMLElement]): SubmenuShownEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmenuShownEvent[TKey]]
    }
    
    extension [Self <: SubmenuShownEvent[?], TKey](x: Self & SubmenuShownEvent[TKey]) {
      
      inline def setRootItem(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rootItem", value.asInstanceOf[js.Any])
      
      inline def setRootItemUndefined: Self = StObject.set(x, "rootItem", js.undefined)
    }
  }
}
