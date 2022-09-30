package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`1rem`
import typings.carbonElements.carbonElementsStrings.`66rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  var columns: typings.carbonElements.carbonElementsInts.`16`
  
  var margin: `1rem`
  
  var width: `66rem`
}
object Width {
  
  inline def apply(): Width = {
    val __obj = js.Dynamic.literal(columns = 16, margin = "1rem", width = "66rem")
    __obj.asInstanceOf[Width]
  }
  
  extension [Self <: Width](x: Self) {
    
    inline def setColumns(value: typings.carbonElements.carbonElementsInts.`16`): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: `1rem`): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: `66rem`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
