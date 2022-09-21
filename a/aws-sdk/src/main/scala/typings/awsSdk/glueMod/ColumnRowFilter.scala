package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnRowFilter extends StObject {
  
  var ColumnName: js.UndefOr[NameString] = js.undefined
  
  var RowFilterExpression: js.UndefOr[PredicateString] = js.undefined
}
object ColumnRowFilter {
  
  inline def apply(): ColumnRowFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnRowFilter]
  }
  
  extension [Self <: ColumnRowFilter](x: Self) {
    
    inline def setColumnName(value: NameString): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setColumnNameUndefined: Self = StObject.set(x, "ColumnName", js.undefined)
    
    inline def setRowFilterExpression(value: PredicateString): Self = StObject.set(x, "RowFilterExpression", value.asInstanceOf[js.Any])
    
    inline def setRowFilterExpressionUndefined: Self = StObject.set(x, "RowFilterExpression", js.undefined)
  }
}
