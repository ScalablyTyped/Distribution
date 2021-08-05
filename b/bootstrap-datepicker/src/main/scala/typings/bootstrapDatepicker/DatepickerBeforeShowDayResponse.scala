package typings.bootstrapDatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatepickerBeforeShowDayResponse
  extends StObject
     with DatepickerBeforeShowResponse {
  
  var content: js.UndefOr[String] = js.undefined
}
object DatepickerBeforeShowDayResponse {
  
  inline def apply(): DatepickerBeforeShowDayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerBeforeShowDayResponse]
  }
  
  extension [Self <: DatepickerBeforeShowDayResponse](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
