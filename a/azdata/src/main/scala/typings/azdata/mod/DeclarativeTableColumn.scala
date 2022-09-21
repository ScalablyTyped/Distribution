package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarativeTableColumn extends StObject {
  
  /**
    * The optional accessibility label for the column. Default is the display name for the column.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The list of values when the valueType is category or editableCategory. Unused for other types. Default is an empty array.
    */
  var categoryValues: js.UndefOr[js.Array[CategoryValue]] = js.undefined
  
  /**
    * The name of the column displayed to the user
    */
  var displayName: String
  
  /**
    * The optional CSS style attributes to assign to the header elements
    */
  var headerCssStyles: js.UndefOr[CssStyles] = js.undefined
  
  /**
    * Whether this column is hidden. Default is false.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the column is read-only
    */
  var isReadOnly: Boolean
  
  /**
    * The optional CSS style attributes to assign to each row
    */
  var rowCssStyles: js.UndefOr[CssStyles] = js.undefined
  
  /**
    * Whether to display the "Check All" checkbox in the header row. Only used when the valueType is boolean.
    */
  var showCheckAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of column this is
    */
  var valueType: DeclarativeDataType
  
  /**
    * The width of the column, either as a number (in px) or a string
    */
  var width: Double | String
}
object DeclarativeTableColumn {
  
  inline def apply(displayName: String, isReadOnly: Boolean, valueType: DeclarativeDataType, width: Double | String): DeclarativeTableColumn = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableColumn]
  }
  
  extension [Self <: DeclarativeTableColumn](x: Self) {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setCategoryValues(value: js.Array[CategoryValue]): Self = StObject.set(x, "categoryValues", value.asInstanceOf[js.Any])
    
    inline def setCategoryValuesUndefined: Self = StObject.set(x, "categoryValues", js.undefined)
    
    inline def setCategoryValuesVarargs(value: CategoryValue*): Self = StObject.set(x, "categoryValues", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setHeaderCssStyles(value: CssStyles): Self = StObject.set(x, "headerCssStyles", value.asInstanceOf[js.Any])
    
    inline def setHeaderCssStylesUndefined: Self = StObject.set(x, "headerCssStyles", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setRowCssStyles(value: CssStyles): Self = StObject.set(x, "rowCssStyles", value.asInstanceOf[js.Any])
    
    inline def setRowCssStylesUndefined: Self = StObject.set(x, "rowCssStyles", js.undefined)
    
    inline def setShowCheckAll(value: Boolean): Self = StObject.set(x, "showCheckAll", value.asInstanceOf[js.Any])
    
    inline def setShowCheckAllUndefined: Self = StObject.set(x, "showCheckAll", js.undefined)
    
    inline def setValueType(value: DeclarativeDataType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
