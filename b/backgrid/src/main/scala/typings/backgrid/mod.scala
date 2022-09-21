package typings.backgrid

import typings.backbone.mod.Collection
import typings.backbone.mod.CombinedModelConstructorOptions
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.View
import typings.backbone.mod.ViewOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backgrid", "Body")
  @js.native
  open class Body () extends View[Model[Any, ModelSetOptions, Any], HTMLElement] {
    def this(options: ViewOptions[Model[Any, ModelSetOptions, Any], HTMLElement]) = this()
    
    def initialize(options: Any): Unit = js.native
    
    def insertRow(
      model: Model[Any, ModelSetOptions, Any],
      collection: Collection[Model[Any, ModelSetOptions, Any]],
      options: Any
    ): Any = js.native
    
    def moveToNextCell(model: Model[Any, ModelSetOptions, Any], cell: Column, command: Command): Any = js.native
    
    def refresh(): Body = js.native
    
    def removeRow(
      model: Model[Any, ModelSetOptions, Any],
      collection: Collection[Model[Any, ModelSetOptions, Any]],
      options: Any
    ): Any = js.native
  }
  
  @JSImport("backgrid", "Cell")
  @js.native
  open class Cell () extends View[Model[Any, ModelSetOptions, Any], HTMLElement] {
    def this(options: ViewOptions[Model[Any, ModelSetOptions, Any], HTMLElement]) = this()
    
    var editor: InputCellEditor = js.native
    
    def enterEditMode(): Any = js.native
    
    def exitEditMode(): Any = js.native
    
    var formatter: CellFormatter = js.native
    
    def renderError(): Any = js.native
  }
  
  @JSImport("backgrid", "CellEditor")
  @js.native
  open class CellEditor () extends View[Model[Any, ModelSetOptions, Any], HTMLElement] {
    def this(options: ViewOptions[Model[Any, ModelSetOptions, Any], HTMLElement]) = this()
    
    def initialize(options: Any): Unit = js.native
    
    def postRender(model: Model[Any, ModelSetOptions, Any], column: Model[Any, ModelSetOptions, Any]): Any = js.native
  }
  
  @JSImport("backgrid", "CellFormatter")
  @js.native
  open class CellFormatter () extends StObject {
    
    def fromRaw(rawData: Any, model: Model[Any, ModelSetOptions, Any]): Any = js.native
    
    def toRaw(formattedData: Any, model: Model[Any, ModelSetOptions, Any]): Any = js.native
  }
  
  @JSImport("backgrid", "Column")
  @js.native
  open class Column () extends Model[Any, ModelSetOptions, Any] {
    def this(attributes: Any) = this()
    def this(attributes: Any, options: CombinedModelConstructorOptions[Any, Model[Any, ModelSetOptions, Any]]) = this()
    def this(attributes: Unit, options: CombinedModelConstructorOptions[Any, Model[Any, ModelSetOptions, Any]]) = this()
  }
  
  @JSImport("backgrid", "Command")
  @js.native
  open class Command () extends StObject {
    
    def cancel(): Boolean = js.native
    
    def moveDown(): Boolean = js.native
    
    def moveLeft(): Boolean = js.native
    
    def moveRight(): Boolean = js.native
    
    def moveUp(): Boolean = js.native
    
    def passThru(): Boolean = js.native
    
    def save(): Boolean = js.native
  }
  
  @JSImport("backgrid", "DateTimeFormatter")
  @js.native
  open class DateTimeFormatter () extends CellFormatter
  
  @JSImport("backgrid", "EmailFormatter")
  @js.native
  open class EmailFormatter () extends CellFormatter
  
  @JSImport("backgrid", "Footer")
  @js.native
  open class Footer () extends View[Model[Any, ModelSetOptions, Any], HTMLElement] {
    def this(options: ViewOptions[Model[Any, ModelSetOptions, Any], HTMLElement]) = this()
  }
  
  @JSImport("backgrid", "Grid")
  @js.native
  open class Grid protected () extends View[Model[Any, ModelSetOptions, Any], HTMLElement] {
    def this(options: GridOptions) = this()
    
    var body: Body = js.native
    
    @JSName("className")
    var className_Grid: String = js.native
    
    var footer: Any = js.native
    
    def getSelectedModels(): js.Array[Model[Any, ModelSetOptions, Any]] = js.native
    
    var header: Any = js.native
    
    def initialize(options: Any): Unit = js.native
    
    def insertColumn(options: Any*): Grid = js.native
    
    def insertRow(
      model: Model[Any, ModelSetOptions, Any],
      collection: Collection[Model[Any, ModelSetOptions, Any]],
      options: Any
    ): Any = js.native
    
    def removeColumn(options: Any*): Grid = js.native
    
    def removeRow(
      model: Model[Any, ModelSetOptions, Any],
      collection: Collection[Model[Any, ModelSetOptions, Any]],
      options: Any
    ): Any = js.native
  }
  
  @JSImport("backgrid", "Header")
  @js.native
  open class Header () extends View[Model[Any, ModelSetOptions, Any], HTMLElement] {
    def this(options: ViewOptions[Model[Any, ModelSetOptions, Any], HTMLElement]) = this()
  }
  
  @JSImport("backgrid", "InputCellEditor")
  @js.native
  open class InputCellEditor () extends CellEditor {
    def this(options: ViewOptions[Model[Any, ModelSetOptions, Any], HTMLElement]) = this()
    
    def saveOrCancel(event: Any): Any = js.native
  }
  
  @JSImport("backgrid", "NumberFormatter")
  @js.native
  open class NumberFormatter () extends CellFormatter
  
  @JSImport("backgrid", "PercentFormatter")
  @js.native
  open class PercentFormatter () extends NumberFormatter
  
  @JSImport("backgrid", "Row")
  @js.native
  open class Row () extends View[Model[Any, ModelSetOptions, Any], HTMLElement] {
    def this(options: ViewOptions[Model[Any, ModelSetOptions, Any], HTMLElement]) = this()
  }
  
  @JSImport("backgrid", "SelectFormatter")
  @js.native
  open class SelectFormatter () extends CellFormatter
  
  @JSImport("backgrid", "StringCell")
  @js.native
  open class StringCell () extends Cell {
    def this(options: ViewOptions[Model[Any, ModelSetOptions, Any], HTMLElement]) = this()
  }
  
  @JSImport("backgrid", "StringFormatter")
  @js.native
  open class StringFormatter () extends CellFormatter
  
  trait ColumnAttr extends StObject {
    
    var cell: String
    
    var editable: Boolean
    
    var formater: String
    
    var headerCell: String
    
    var label: String
    
    var name: String
    
    var renderable: Boolean
    
    var sortable: Boolean
  }
  object ColumnAttr {
    
    inline def apply(
      cell: String,
      editable: Boolean,
      formater: String,
      headerCell: String,
      label: String,
      name: String,
      renderable: Boolean,
      sortable: Boolean
    ): ColumnAttr = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], formater = formater.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renderable = renderable.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnAttr]
    }
    
    extension [Self <: ColumnAttr](x: Self) {
      
      inline def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setFormater(value: String): Self = StObject.set(x, "formater", value.asInstanceOf[js.Any])
      
      inline def setHeaderCell(value: String): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRenderable(value: Boolean): Self = StObject.set(x, "renderable", value.asInstanceOf[js.Any])
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    }
  }
  
  trait GridOptions extends StObject {
    
    var body: js.UndefOr[Body] = js.undefined
    
    var collection: Collection[Model[Any, ModelSetOptions, Any]]
    
    var columns: js.Array[Column]
    
    var footer: js.UndefOr[Footer] = js.undefined
    
    var header: js.UndefOr[Header] = js.undefined
    
    var row: js.UndefOr[Row] = js.undefined
  }
  object GridOptions {
    
    inline def apply(collection: Collection[Model[Any, ModelSetOptions, Any]], columns: js.Array[Column]): GridOptions = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridOptions]
    }
    
    extension [Self <: GridOptions](x: Self) {
      
      inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCollection(value: Collection[Model[Any, ModelSetOptions, Any]]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setFooter(value: Footer): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setRow(value: Row): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
