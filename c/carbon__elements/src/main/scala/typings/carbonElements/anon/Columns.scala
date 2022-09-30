package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`20rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: typings.carbonElements.carbonElementsInts.`4`
  
  var margin: typings.carbonElements.carbonElementsStrings.`0`
  
  var width: `20rem`
}
object Columns {
  
  inline def apply(): Columns = {
    val __obj = js.Dynamic.literal(columns = 4, margin = "0", width = "20rem")
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: typings.carbonElements.carbonElementsInts.`4`): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: typings.carbonElements.carbonElementsStrings.`0`): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: `20rem`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
