package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialRows extends StObject {
  
  var initialRows: Double
  
  var maxRows: Double
  
  var minRows: Double
}
object InitialRows {
  
  inline def apply(initialRows: Double, maxRows: Double, minRows: Double): InitialRows = {
    val __obj = js.Dynamic.literal(initialRows = initialRows.asInstanceOf[js.Any], maxRows = maxRows.asInstanceOf[js.Any], minRows = minRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialRows]
  }
  
  extension [Self <: InitialRows](x: Self) {
    
    inline def setInitialRows(value: Double): Self = StObject.set(x, "initialRows", value.asInstanceOf[js.Any])
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
  }
}
