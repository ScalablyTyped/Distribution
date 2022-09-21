package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    *  The optional contextRowId attribute can be used to specify the row id of the context row if the filter formula contains unqualified references to table columns and needs a context row to evaluate them successfully. 
    */
  var contextRowId: js.UndefOr[RowId] = js.undefined
  
  /**
    *  A formula representing a filter function that returns zero or more matching rows from a table. Valid formulas in this field return a list of rows from a table. The most common ways of writing a formula to return a list of rows are to use the FindRow() or Filter() functions. Any other formula that returns zero or more rows is also acceptable. For example, you can use a formula that points to a cell that contains a filter function. 
    */
  var formula: Formula
}
object Filter {
  
  inline def apply(formula: Formula): Filter = {
    val __obj = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setContextRowId(value: RowId): Self = StObject.set(x, "contextRowId", value.asInstanceOf[js.Any])
    
    inline def setContextRowIdUndefined: Self = StObject.set(x, "contextRowId", js.undefined)
    
    inline def setFormula(value: Formula): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
  }
}
