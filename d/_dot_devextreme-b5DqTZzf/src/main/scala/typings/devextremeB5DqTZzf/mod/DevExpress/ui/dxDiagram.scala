package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.addShape
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.addShapeFromToolbox
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.changeConnection
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.changeConnectorPoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.checkUIElementAvailability
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.deleteConnector
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.deleteShape
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.jpg
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.modelModification
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.png_
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.svg_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDiagram.Item
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagram
  extends StObject
     with Widget[dxDiagramOptions] {
  
  /**
    * Exports the diagram data to a JSON object.
    */
  def `export`(): String = js.native
  
  /**
    * Exports the diagram to an image format.
    */
  def exportTo(format: svg_ | png_ | jpg, callback: js.Function): Unit = js.native
  
  /**
    * Fits the diagram content into the work area. The maximum scale is 100%.
    */
  def fitToContent(): Unit = js.native
  
  /**
    * Fits the diagram content&apos;s width into the work area width. The maximum scale is 100%.
    */
  def fitToWidth(): Unit = js.native
  
  /**
    * Returns the DataSource instance.
    */
  def getEdgeDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Returns a shape or connector object specified by its internal identifier.
    */
  def getItemById(id: String): Item = js.native
  
  /**
    * Returns a shape or connector object specified by its key.
    */
  def getItemByKey(key: js.Object): Item = js.native
  
  /**
    * Returns an array of diagram items.
    */
  def getItems(): js.Array[Item] = js.native
  
  /**
    * Gets the DataSource instance.
    */
  def getNodeDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Returns an array of selected diagram items.
    */
  def getSelectedItems(): js.Array[Item] = js.native
  
  /**
    * Imports the diagram data.
    */
  def `import`(data: String): Unit = js.native
  def `import`(data: String, updateExistingItemsOnly: Boolean): Unit = js.native
  
  /**
    * Scrolls the view area to the specified item.
    */
  def scrollToItem(item: Item): Unit = js.native
  
  /**
    * Selects the specified items.
    */
  def setSelectedItems(items: js.Array[Item]): Unit = js.native
  
  /**
    * Updates the diagram toolboxes.
    */
  def updateToolbox(): Unit = js.native
}
object dxDiagram {
  
  type ContentReadyEvent = EventInfo[dxDiagram]
  
  trait CustomCommandEvent extends StObject {
    
    val component: dxDiagram
    
    val element: DxElement_[HTMLElement]
    
    val name: String
  }
  object CustomCommandEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], name: String): CustomCommandEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomCommandEvent]
    }
    
    extension [Self <: CustomCommandEvent](x: Self) {
      
      inline def setComponent(value: dxDiagram): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomShapeTemplateData extends StObject {
    
    val item: dxDiagramShape
  }
  object CustomShapeTemplateData {
    
    inline def apply(item: dxDiagramShape): CustomShapeTemplateData = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomShapeTemplateData]
    }
    
    extension [Self <: CustomShapeTemplateData](x: Self) {
      
      inline def setItem(value: dxDiagramShape): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomShapeToolboxTemplateData extends StObject {
    
    val item: dxDiagramShape
  }
  object CustomShapeToolboxTemplateData {
    
    inline def apply(item: dxDiagramShape): CustomShapeToolboxTemplateData = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomShapeToolboxTemplateData]
    }
    
    extension [Self <: CustomShapeToolboxTemplateData](x: Self) {
      
      inline def setItem(value: dxDiagramShape): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxDiagram]
  
  type InitializedEvent = InitializedEventInfo[dxDiagram]
  
  type Item = dxDiagramItem
  
  trait ItemClickEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    val item: Item
  }
  object ItemClickEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], item: Item): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
    
    extension [Self <: ItemClickEvent](x: Self) {
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemDblClickEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    val item: Item
  }
  object ItemDblClickEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], item: Item): ItemDblClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDblClickEvent]
    }
    
    extension [Self <: ItemDblClickEvent](x: Self) {
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDiagram]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxDiagramOptions
  
  trait RequestEditOperationEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    var allowed: js.UndefOr[Boolean] = js.undefined
    
    val args: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
    
    val operation: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints
    
    val reason: checkUIElementAvailability | modelModification
  }
  object RequestEditOperationEvent {
    
    inline def apply(
      args: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs,
      component: dxDiagram,
      element: DxElement_[HTMLElement],
      operation: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints,
      reason: checkUIElementAvailability | modelModification
    ): RequestEditOperationEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestEditOperationEvent]
    }
    
    extension [Self <: RequestEditOperationEvent](x: Self) {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setArgs(
        value: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setOperation(
        value: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints
      ): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setReason(value: checkUIElementAvailability | modelModification): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestLayoutUpdateEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    var allowed: js.UndefOr[Boolean] = js.undefined
    
    val changes: js.Array[Any]
  }
  object RequestLayoutUpdateEvent {
    
    inline def apply(changes: js.Array[Any], component: dxDiagram, element: DxElement_[HTMLElement]): RequestLayoutUpdateEvent = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestLayoutUpdateEvent]
    }
    
    extension [Self <: RequestLayoutUpdateEvent](x: Self) {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setChanges(value: js.Array[Any]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: Any*): Self = StObject.set(x, "changes", js.Array(value*))
    }
  }
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    val items: js.Array[Item]
  }
  object SelectionChangedEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], items: js.Array[Item]): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    extension [Self <: SelectionChangedEvent](x: Self) {
      
      inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
