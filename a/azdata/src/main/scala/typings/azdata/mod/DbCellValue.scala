package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbCellValue extends StObject {
  
  var displayValue: String = js.native
  
  var invariantCultureDisplayValue: String = js.native
  
  var isNull: Boolean = js.native
}
object DbCellValue {
  
  @scala.inline
  def apply(displayValue: String, invariantCultureDisplayValue: String, isNull: Boolean): DbCellValue = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], invariantCultureDisplayValue = invariantCultureDisplayValue.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbCellValue]
  }
  
  @scala.inline
  implicit class DbCellValueMutableBuilder[Self <: DbCellValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvariantCultureDisplayValue(value: String): Self = StObject.set(x, "invariantCultureDisplayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNull(value: Boolean): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
  }
}
