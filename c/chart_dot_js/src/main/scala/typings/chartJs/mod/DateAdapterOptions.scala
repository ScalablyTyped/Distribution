package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateAdapterOptions extends StObject {
  
  var date: js.UndefOr[js.Object] = js.undefined
}
object DateAdapterOptions {
  
  inline def apply(): DateAdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateAdapterOptions]
  }
  
  extension [Self <: DateAdapterOptions](x: Self) {
    
    inline def setDate(value: js.Object): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
  }
}
