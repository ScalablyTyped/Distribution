package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`object`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.asc
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.boolean_
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.date
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.datetime
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.desc
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.number
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileManagerDetailsColumn extends StObject {
  
  /**
    * Specifies the column alignment.
    */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * Specifies the column caption.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a CSS class to be applied to the column.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which data field provides data for the column.
    */
  var dataField: js.UndefOr[String] = js.undefined
  
  /**
    * Casts column values to a specific data type.
    */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.undefined
  
  /**
    * Specifies the order in which columns are hidden when the UI component adapts to the screen or container size.
    */
  var hidingPriority: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the order in which the column is sorted.
    */
  var sortIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the sort order of column values.
    */
  var sortOrder: js.UndefOr[asc | desc] = js.undefined
  
  /**
    * Specifies the column visibility.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the position of the column in the resulting UI component.
    */
  var visibleIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the column width.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object dxFileManagerDetailsColumn {
  
  inline def apply(): dxFileManagerDetailsColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerDetailsColumn]
  }
  
  extension [Self <: dxFileManagerDetailsColumn](x: Self) {
    
    inline def setAlignment(value: center | left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setDataType(value: string_ | number | date | boolean_ | `object` | datetime): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setHidingPriority(value: Double): Self = StObject.set(x, "hidingPriority", value.asInstanceOf[js.Any])
    
    inline def setHidingPriorityUndefined: Self = StObject.set(x, "hidingPriority", js.undefined)
    
    inline def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
    
    inline def setSortIndexUndefined: Self = StObject.set(x, "sortIndex", js.undefined)
    
    inline def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndexUndefined: Self = StObject.set(x, "visibleIndex", js.undefined)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
