package typings.baseui.anon

import typings.baseui.tableSemanticTypesMod.Divider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  $isFocusVisible :boolean} & baseui.baseui/table-semantic/styled-components.StyledTableHeadCellProps */
trait isFocusVisiblebooleanStyl extends StObject {
  
  @JSName("$col")
  var $col: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$colIndex")
  var $colIndex: js.UndefOr[Double | Null] = js.undefined
  
  @JSName("$divider")
  var $divider: js.UndefOr[Divider] = js.undefined
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: Boolean
  
  @JSName("$isNumeric")
  var $isNumeric: js.UndefOr[Boolean | Null] = js.undefined
  
  @JSName("$size")
  var $size: js.UndefOr[typings.baseui.tableSemanticTypesMod.Size] = js.undefined
}
object isFocusVisiblebooleanStyl {
  
  inline def apply($isFocusVisible: Boolean): isFocusVisiblebooleanStyl = {
    val __obj = js.Dynamic.literal($isFocusVisible = $isFocusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[isFocusVisiblebooleanStyl]
  }
  
  extension [Self <: isFocusVisiblebooleanStyl](x: Self) {
    
    inline def set$col(value: js.Object): Self = StObject.set(x, "$col", value.asInstanceOf[js.Any])
    
    inline def set$colIndex(value: Double): Self = StObject.set(x, "$colIndex", value.asInstanceOf[js.Any])
    
    inline def set$colIndexNull: Self = StObject.set(x, "$colIndex", null)
    
    inline def set$colIndexUndefined: Self = StObject.set(x, "$colIndex", js.undefined)
    
    inline def set$colUndefined: Self = StObject.set(x, "$col", js.undefined)
    
    inline def set$divider(value: Divider): Self = StObject.set(x, "$divider", value.asInstanceOf[js.Any])
    
    inline def set$dividerUndefined: Self = StObject.set(x, "$divider", js.undefined)
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isNumeric(value: Boolean): Self = StObject.set(x, "$isNumeric", value.asInstanceOf[js.Any])
    
    inline def set$isNumericNull: Self = StObject.set(x, "$isNumeric", null)
    
    inline def set$isNumericUndefined: Self = StObject.set(x, "$isNumeric", js.undefined)
    
    inline def set$size(value: typings.baseui.tableSemanticTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
  }
}
