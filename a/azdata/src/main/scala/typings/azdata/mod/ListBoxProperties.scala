package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxProperties extends StObject {
  
  var selectedRow: js.UndefOr[Double] = js.undefined
  
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object ListBoxProperties {
  
  inline def apply(): ListBoxProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxProperties]
  }
  
  extension [Self <: ListBoxProperties](x: Self) {
    
    inline def setSelectedRow(value: Double): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
