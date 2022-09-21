package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateColumnsOperation extends StObject {
  
  /**
    * Calculated columns to create.
    */
  var Columns: CalculatedColumnList
}
object CreateColumnsOperation {
  
  inline def apply(Columns: CalculatedColumnList): CreateColumnsOperation = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateColumnsOperation]
  }
  
  extension [Self <: CreateColumnsOperation](x: Self) {
    
    inline def setColumns(value: CalculatedColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: CalculatedColumn*): Self = StObject.set(x, "Columns", js.Array(value*))
  }
}
