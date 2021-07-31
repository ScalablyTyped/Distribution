package typings.datatablesNet.DataTables

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "ajax-settings"
//#region "colunm-settings"
trait ColumnSettings extends StObject {
  
  /**
    * Cell type to be created for a column. th/td Since: 1.10
    */
  var cellType: js.UndefOr[String] = js.undefined
  
  /**
    * Class to assign to each cell in the column. Since: 1.10
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Add padding to the text content used when calculating the optimal with for a table. Since: 1.10
    */
  var contentPadding: js.UndefOr[String] = js.undefined
  
  /**
    * Cell created callback to allow DOM manipulation. Since: 1.10
    */
  var createdCell: js.UndefOr[FunctionColumnCreatedCell] = js.undefined
  
  /**
    * Class to assign to each cell in the column. Since: 1.10
    */
  var data: js.UndefOr[Double | String | ObjectColumnData | FunctionColumnData | Null] = js.undefined
  
  /**
    * Set default, static, content for a column. Since: 1.10
    */
  var defaultContent: js.UndefOr[String] = js.undefined
  
  /**
    * Set a descriptive name for a column. Since: 1.10
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Define multiple column ordering as the default order for a column. Since: 1.10
    */
  var orderData: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * Live DOM sorting type assignment. Since: 1.10
    */
  var orderDataType: js.UndefOr[String] = js.undefined
  
  /**
    * Ordering to always be applied to the table. Since 1.10
    *
    * Array type is prefix ordering only and is a two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var orderFixed: js.UndefOr[js.Array[js.Any] | ObjectOrderFixed] = js.undefined
  
  /**
    * Order direction application sequence. Since: 1.10
    */
  var orderSequence: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Enable or disable ordering on this column. Since: 1.10
    */
  var orderable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Render (process) the data for use in the table. Since: 1.10
    */
  var render: js.UndefOr[Double | String | ObjectColumnData | FunctionColumnRender | ObjectColumnRender] = js.undefined
  
  /**
    * Enable or disable filtering on the data in this column. Since: 1.10
    */
  var searchable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the column title. Since: 1.10
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Set the column type - used for filtering and sorting string processing. Since: 1.10
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Enable or disable the display of this column. Since: 1.10
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Column width assignment. Since: 1.10
    */
  var width: js.UndefOr[String] = js.undefined
}
object ColumnSettings {
  
  @scala.inline
  def apply(): ColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSettings]
  }
  
  @scala.inline
  implicit class ColumnSettingsMutableBuilder[Self <: ColumnSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellType(value: String): Self = StObject.set(x, "cellType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellTypeUndefined: Self = StObject.set(x, "cellType", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContentPadding(value: String): Self = StObject.set(x, "contentPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentPaddingUndefined: Self = StObject.set(x, "contentPadding", js.undefined)
    
    @scala.inline
    def setCreatedCell(
      value: (/* cell */ Node, /* cellData */ js.Any, /* rowData */ js.Any, /* row */ Double, /* col */ Double) => Unit
    ): Self = StObject.set(x, "createdCell", js.Any.fromFunction5(value))
    
    @scala.inline
    def setCreatedCellUndefined: Self = StObject.set(x, "createdCell", js.undefined)
    
    @scala.inline
    def setData(value: Double | String | ObjectColumnData | FunctionColumnData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDefaultContent(value: String): Self = StObject.set(x, "defaultContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultContentUndefined: Self = StObject.set(x, "defaultContent", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrderData(value: Double | js.Array[Double]): Self = StObject.set(x, "orderData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderDataType(value: String): Self = StObject.set(x, "orderDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderDataTypeUndefined: Self = StObject.set(x, "orderDataType", js.undefined)
    
    @scala.inline
    def setOrderDataUndefined: Self = StObject.set(x, "orderData", js.undefined)
    
    @scala.inline
    def setOrderDataVarargs(value: Double*): Self = StObject.set(x, "orderData", js.Array(value :_*))
    
    @scala.inline
    def setOrderFixed(value: js.Array[js.Any] | ObjectOrderFixed): Self = StObject.set(x, "orderFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderFixedUndefined: Self = StObject.set(x, "orderFixed", js.undefined)
    
    @scala.inline
    def setOrderFixedVarargs(value: js.Any*): Self = StObject.set(x, "orderFixed", js.Array(value :_*))
    
    @scala.inline
    def setOrderSequence(value: js.Array[String]): Self = StObject.set(x, "orderSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderSequenceUndefined: Self = StObject.set(x, "orderSequence", js.undefined)
    
    @scala.inline
    def setOrderSequenceVarargs(value: String*): Self = StObject.set(x, "orderSequence", js.Array(value :_*))
    
    @scala.inline
    def setOrderable(value: Boolean): Self = StObject.set(x, "orderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderableUndefined: Self = StObject.set(x, "orderable", js.undefined)
    
    @scala.inline
    def setRender(value: Double | String | ObjectColumnData | FunctionColumnRender | ObjectColumnRender): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = StObject.set(x, "render", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
