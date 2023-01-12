package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditCell
  extends StObject
     with DbCellValue {
  
  var isDirty: Boolean
}
object EditCell {
  
  inline def apply(displayValue: String, invariantCultureDisplayValue: String, isDirty: Boolean, isNull: Boolean): EditCell = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], invariantCultureDisplayValue = invariantCultureDisplayValue.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditCell] (val x: Self) extends AnyVal {
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
  }
}
