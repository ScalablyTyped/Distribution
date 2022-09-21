package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditSubsetResult extends StObject {
  
  var rowCount: Double
  
  var subset: js.Array[EditRow]
}
object EditSubsetResult {
  
  inline def apply(rowCount: Double, subset: js.Array[EditRow]): EditSubsetResult = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], subset = subset.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSubsetResult]
  }
  
  extension [Self <: EditSubsetResult](x: Self) {
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setSubset(value: js.Array[EditRow]): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
    
    inline def setSubsetVarargs(value: EditRow*): Self = StObject.set(x, "subset", js.Array(value*))
  }
}
