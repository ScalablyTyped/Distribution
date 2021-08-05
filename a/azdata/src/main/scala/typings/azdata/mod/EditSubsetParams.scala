package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditSubsetParams
  extends StObject
     with IEditSessionOperationParams {
  
  var rowCount: Double
  
  var rowStartIndex: Double
}
object EditSubsetParams {
  
  inline def apply(ownerUri: String, rowCount: Double, rowStartIndex: Double): EditSubsetParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSubsetParams]
  }
  
  extension [Self <: EditSubsetParams](x: Self) {
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowStartIndex(value: Double): Self = StObject.set(x, "rowStartIndex", value.asInstanceOf[js.Any])
  }
}
