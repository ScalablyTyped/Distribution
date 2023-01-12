package typings.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonMovementDeltaMod {
  
  trait IMovementDelta extends StObject {
    
    /** The number of columns by which to move. */
    var cols: Double
    
    /** The number of rows by which to move. */
    var rows: Double
  }
  object IMovementDelta {
    
    inline def apply(cols: Double, rows: Double): IMovementDelta = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMovementDelta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMovementDelta] (val x: Self) extends AnyVal {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
}
