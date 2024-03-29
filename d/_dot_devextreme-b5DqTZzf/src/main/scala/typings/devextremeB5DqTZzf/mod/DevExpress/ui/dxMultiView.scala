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
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxMultiView {
  
  type ContentReadyEvent[TItem /* <: ItemLike */, TKey] = EventInfo[MultiViewInstance[TItem, TKey]]
  
  type DisposingEvent[TItem /* <: ItemLike */, TKey] = EventInfo[MultiViewInstance[TItem, TKey]]
  
  trait ExplicitTypes[TItem /* <: ItemLike */, TKey] extends StObject {
    
    var ContentReadyEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.ContentReadyEvent[TItem, TKey]
    
    var DisposingEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.DisposingEvent[TItem, TKey]
    
    var InitializedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.InitializedEvent[TItem, TKey]
    
    var ItemClickEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.ItemClickEvent[TItem, TKey]
    
    var ItemContextMenuEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.ItemContextMenuEvent[TItem, TKey]
    
    var ItemHoldEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.ItemHoldEvent[TItem, TKey]
    
    var ItemRenderedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.ItemRenderedEvent[TItem, TKey]
    
    var OptionChangedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.OptionChangedEvent[TItem, TKey]
    
    var Properties: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.Properties[TItem, TKey]
    
    var SelectionChangedEvent: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.SelectionChangedEvent[TItem, TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      ContentReadyEvent: ContentReadyEvent[TItem, TKey],
      DisposingEvent: DisposingEvent[TItem, TKey],
      InitializedEvent: InitializedEvent[TItem, TKey],
      ItemClickEvent: ItemClickEvent[TItem, TKey],
      ItemContextMenuEvent: ItemContextMenuEvent[TItem, TKey],
      ItemHoldEvent: ItemHoldEvent[TItem, TKey],
      ItemRenderedEvent: ItemRenderedEvent[TItem, TKey],
      OptionChangedEvent: OptionChangedEvent[TItem, TKey],
      Properties: Properties[TItem, TKey],
      SelectionChangedEvent: SelectionChangedEvent[TItem, TKey]
    ): ExplicitTypes[TItem, TKey] = {
      val __obj = js.Dynamic.literal(ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], ItemContextMenuEvent = ItemContextMenuEvent.asInstanceOf[js.Any], ItemHoldEvent = ItemHoldEvent.asInstanceOf[js.Any], ItemRenderedEvent = ItemRenderedEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TItem, TKey]]
    }
    
    extension [Self <: ExplicitTypes[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (ExplicitTypes[TItem, TKey])) {
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TItem, TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TItem, TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TItem, TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TItem, TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setItemContextMenuEvent(value: ItemContextMenuEvent[TItem, TKey]): Self = StObject.set(x, "ItemContextMenuEvent", value.asInstanceOf[js.Any])
      
      inline def setItemHoldEvent(value: ItemHoldEvent[TItem, TKey]): Self = StObject.set(x, "ItemHoldEvent", value.asInstanceOf[js.Any])
      
      inline def setItemRenderedEvent(value: ItemRenderedEvent[TItem, TKey]): Self = StObject.set(x, "ItemRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TItem, TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TItem, TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
      
      inline def setSelectionChangedEvent(value: SelectionChangedEvent[TItem, TKey]): Self = StObject.set(x, "SelectionChangedEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent[TItem /* <: ItemLike */, TKey] = InitializedEventInfo[MultiViewInstance[TItem, TKey]]
  
  type Item = dxMultiViewItem
  
  trait ItemClickEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[MultiViewInstance[TItem, TKey], KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[TItem]
  object ItemClickEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: MultiViewInstance[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent[TItem, TKey]]
    }
  }
  
  trait ItemContextMenuEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[MultiViewInstance[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TItem]
  object ItemContextMenuEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: MultiViewInstance[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemContextMenuEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContextMenuEvent[TItem, TKey]]
    }
  }
  
  trait ItemHoldEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[MultiViewInstance[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TItem]
  object ItemHoldEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: MultiViewInstance[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemHoldEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemHoldEvent[TItem, TKey]]
    }
  }
  
  type ItemLike = String | Item | Any
  
  trait ItemRenderedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[MultiViewInstance[TItem, TKey]]
       with ItemInfo[TItem]
  object ItemRenderedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: MultiViewInstance[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemRenderedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenderedEvent[TItem, TKey]]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  type MultiViewInstance[TItem, TKey] = dxMultiView[Properties[TItem, TKey], TItem, TKey]
  
  trait OptionChangedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[MultiViewInstance[TItem, TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: MultiViewInstance[TItem, TKey],
      element: DxElement_[HTMLElement],
      fullName: String,
      name: String
    ): OptionChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TItem, TKey]]
    }
  }
  
  trait Properties[TItem /* <: ItemLike */, TKey]
    extends StObject
       with dxMultiViewBaseOptions[MultiViewInstance[TItem, TKey], TItem, TKey]
  object Properties {
    
    inline def apply[TItem /* <: ItemLike */, TKey](): Properties[TItem, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Properties[TItem, TKey]]
    }
  }
  
  trait SelectionChangedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[MultiViewInstance[TItem, TKey]]
       with SelectionChangedInfo[TItem]
  object SelectionChangedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      addedItems: js.Array[TItem],
      component: MultiViewInstance[TItem, TKey],
      element: DxElement_[HTMLElement],
      removedItems: js.Array[TItem]
    ): SelectionChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent[TItem, TKey]]
    }
  }
}
