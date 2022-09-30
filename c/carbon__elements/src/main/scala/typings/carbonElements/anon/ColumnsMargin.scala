package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`1rem`
import typings.carbonElements.carbonElementsStrings.`82rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnsMargin extends StObject {
  
  var columns: typings.carbonElements.carbonElementsInts.`16`
  
  var margin: `1rem`
  
  var width: `82rem`
}
object ColumnsMargin {
  
  inline def apply(): ColumnsMargin = {
    val __obj = js.Dynamic.literal(columns = 16, margin = "1rem", width = "82rem")
    __obj.asInstanceOf[ColumnsMargin]
  }
  
  extension [Self <: ColumnsMargin](x: Self) {
    
    inline def setColumns(value: typings.carbonElements.carbonElementsInts.`16`): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: `1rem`): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: `82rem`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
