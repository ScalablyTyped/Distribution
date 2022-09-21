package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.AlternateDataFields
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.data.PivotGridDataSource
import typings.devextremeB5DqTZzf.mod.DevExpress.data.PivotGridDataSource.Field
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPopup.Properties
import typings.std.Blob
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPivotGrid
  extends StObject
     with Widget[dxPivotGridOptions] {
  
  /**
    * Binds a Chart to the PivotGrid.
    */
  def bindChart(chart: String, integrationOptions: AlternateDataFields): js.Function & Null = js.native
  def bindChart(chart: Any, integrationOptions: AlternateDataFields): js.Function & Null = js.native
  def bindChart(chart: DxElement_[HTMLElement], integrationOptions: AlternateDataFields): js.Function & Null = js.native
  
  /**
    * Exports pivot grid data to the Excel file.
    * @deprecated Use exportPivotGrid instead.
    */
  def exportToExcel(): Unit = js.native
  
  /**
    * Gets the PivotGridDataSource instance.
    */
  def getDataSource(): PivotGridDataSource = js.native
  
  /**
    * Gets the Popup instance of the field chooser window.
    */
  def getFieldChooserPopup(): dxPopup[Properties] = js.native
  
  /**
    * Updates the UI component to the size of its content.
    */
  def updateDimensions(): Unit = js.native
}
object dxPivotGrid {
  
  type Cell = dxPivotGridPivotGridCell
  
  trait CellClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxPivotGrid, MouseEvent | PointerEvent] {
    
    val area: js.UndefOr[String] = js.undefined
    
    val cell: js.UndefOr[Cell] = js.undefined
    
    val cellElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val columnFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val columnIndex: js.UndefOr[Double] = js.undefined
    
    val dataFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val rowFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val rowIndex: js.UndefOr[Double] = js.undefined
  }
  object CellClickEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement]): CellClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellClickEvent]
    }
    
    extension [Self <: CellClickEvent](x: Self) {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setCell(value: Cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnFields(value: js.Array[Field]): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
      
      inline def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
      
      inline def setColumnFieldsVarargs(value: Field*): Self = StObject.set(x, "columnFields", js.Array(value*))
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setDataFields(value: js.Array[Field]): Self = StObject.set(x, "dataFields", value.asInstanceOf[js.Any])
      
      inline def setDataFieldsUndefined: Self = StObject.set(x, "dataFields", js.undefined)
      
      inline def setDataFieldsVarargs(value: Field*): Self = StObject.set(x, "dataFields", js.Array(value*))
      
      inline def setRowFields(value: js.Array[Field]): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
      
      inline def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
      
      inline def setRowFieldsVarargs(value: Field*): Self = StObject.set(x, "rowFields", js.Array(value*))
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  trait CellPreparedEvent
    extends StObject
       with EventInfo[dxPivotGrid] {
    
    val area: js.UndefOr[String] = js.undefined
    
    val cell: js.UndefOr[Cell] = js.undefined
    
    val cellElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val columnIndex: js.UndefOr[Double] = js.undefined
    
    val rowIndex: js.UndefOr[Double] = js.undefined
  }
  object CellPreparedEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement]): CellPreparedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellPreparedEvent]
    }
    
    extension [Self <: CellPreparedEvent](x: Self) {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setCell(value: Cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  type ContentReadyEvent = EventInfo[dxPivotGrid]
  
  trait ContextMenuPreparingEvent
    extends StObject
       with EventInfo[dxPivotGrid] {
    
    val area: js.UndefOr[String] = js.undefined
    
    val cell: js.UndefOr[Cell] = js.undefined
    
    val cellElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val columnFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val columnIndex: js.UndefOr[Double] = js.undefined
    
    val dataFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val field: js.UndefOr[Field] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    val rowFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val rowIndex: js.UndefOr[Double] = js.undefined
  }
  object ContextMenuPreparingEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement]): ContextMenuPreparingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuPreparingEvent]
    }
    
    extension [Self <: ContextMenuPreparingEvent](x: Self) {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setCell(value: Cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnFields(value: js.Array[Field]): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
      
      inline def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
      
      inline def setColumnFieldsVarargs(value: Field*): Self = StObject.set(x, "columnFields", js.Array(value*))
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setDataFields(value: js.Array[Field]): Self = StObject.set(x, "dataFields", value.asInstanceOf[js.Any])
      
      inline def setDataFieldsUndefined: Self = StObject.set(x, "dataFields", js.undefined)
      
      inline def setDataFieldsVarargs(value: Field*): Self = StObject.set(x, "dataFields", js.Array(value*))
      
      inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setRowFields(value: js.Array[Field]): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
      
      inline def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
      
      inline def setRowFieldsVarargs(value: Field*): Self = StObject.set(x, "rowFields", js.Array(value*))
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  type DisposingEvent = EventInfo[dxPivotGrid]
  
  type ExportedEvent = EventInfo[dxPivotGrid]
  
  trait ExportingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxPivotGrid] {
    
    var fileName: js.UndefOr[String] = js.undefined
  }
  object ExportingEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement]): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
    
    extension [Self <: ExportingEvent](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    }
  }
  
  trait FileSavingEvent
    extends StObject
       with Cancelable {
    
    val component: dxPivotGrid
    
    val data: js.UndefOr[Blob] = js.undefined
    
    val element: DxElement_[HTMLElement]
    
    var fileName: js.UndefOr[String] = js.undefined
    
    val format: js.UndefOr[String] = js.undefined
  }
  object FileSavingEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement]): FileSavingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSavingEvent]
    }
    
    extension [Self <: FileSavingEvent](x: Self) {
      
      inline def setComponent(value: dxPivotGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxPivotGrid]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxPivotGrid]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxPivotGridOptions
}
