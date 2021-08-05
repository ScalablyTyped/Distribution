package typings.bootstrapDatepicker

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatepickerCustomFormatOptions extends StObject {
  
  var toDisplay: js.UndefOr[
    js.Function3[/* date */ String, /* format */ js.Any, /* language */ js.Any, String]
  ] = js.undefined
  
  var toValue: js.UndefOr[
    js.Function3[/* date */ String, /* format */ js.Any, /* language */ js.Any, Date]
  ] = js.undefined
}
object DatepickerCustomFormatOptions {
  
  inline def apply(): DatepickerCustomFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerCustomFormatOptions]
  }
  
  extension [Self <: DatepickerCustomFormatOptions](x: Self) {
    
    inline def setToDisplay(value: (/* date */ String, /* format */ js.Any, /* language */ js.Any) => String): Self = StObject.set(x, "toDisplay", js.Any.fromFunction3(value))
    
    inline def setToDisplayUndefined: Self = StObject.set(x, "toDisplay", js.undefined)
    
    inline def setToValue(value: (/* date */ String, /* format */ js.Any, /* language */ js.Any) => Date): Self = StObject.set(x, "toValue", js.Any.fromFunction3(value))
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
  }
}
