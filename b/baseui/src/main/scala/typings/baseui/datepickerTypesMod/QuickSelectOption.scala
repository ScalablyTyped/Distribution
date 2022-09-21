package typings.baseui.datepickerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickSelectOption[T] extends StObject {
  
  var beginDate: T
  
  var endDate: js.UndefOr[T] = js.undefined
  
  var id: String
}
object QuickSelectOption {
  
  inline def apply[T](beginDate: T, id: String): QuickSelectOption[T] = {
    val __obj = js.Dynamic.literal(beginDate = beginDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickSelectOption[T]]
  }
  
  extension [Self <: QuickSelectOption[?], T](x: Self & QuickSelectOption[T]) {
    
    inline def setBeginDate(value: T): Self = StObject.set(x, "beginDate", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: T): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
