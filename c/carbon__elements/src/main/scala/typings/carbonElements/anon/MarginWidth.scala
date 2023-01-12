package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`1Dot5rem`
import typings.carbonElements.carbonElementsStrings.`99rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginWidth extends StObject {
  
  var columns: typings.carbonElements.carbonElementsInts.`16`
  
  var margin: `1Dot5rem`
  
  var width: `99rem`
}
object MarginWidth {
  
  inline def apply(): MarginWidth = {
    val __obj = js.Dynamic.literal(columns = 16, margin = "1.5rem", width = "99rem")
    __obj.asInstanceOf[MarginWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarginWidth] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: typings.carbonElements.carbonElementsInts.`16`): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: `1Dot5rem`): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: `99rem`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
