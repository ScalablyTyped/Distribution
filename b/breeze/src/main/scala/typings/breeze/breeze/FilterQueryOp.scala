package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterQueryOp extends IEnum {
  
  var All: FilterQueryOpSymbol = js.native
  
  var Any: FilterQueryOpSymbol = js.native
  
  var Contains: FilterQueryOpSymbol = js.native
  
  var EndsWith: FilterQueryOpSymbol = js.native
  
  var Equals: FilterQueryOpSymbol = js.native
  
  var GreaterThan: FilterQueryOpSymbol = js.native
  
  var GreaterThanOrEqual: FilterQueryOpSymbol = js.native
  
  var IsTypeOf: FilterQueryOpSymbol = js.native
  
  var LessThan: FilterQueryOpSymbol = js.native
  
  var LessThanOrEqual: FilterQueryOpSymbol = js.native
  
  var NotEquals: FilterQueryOpSymbol = js.native
  
  var StartsWith: FilterQueryOpSymbol = js.native
}
object FilterQueryOp {
  
  @scala.inline
  def apply(
    All: FilterQueryOpSymbol,
    Any: FilterQueryOpSymbol,
    Contains: FilterQueryOpSymbol,
    EndsWith: FilterQueryOpSymbol,
    Equals: FilterQueryOpSymbol,
    GreaterThan: FilterQueryOpSymbol,
    GreaterThanOrEqual: FilterQueryOpSymbol,
    IsTypeOf: FilterQueryOpSymbol,
    LessThan: FilterQueryOpSymbol,
    LessThanOrEqual: FilterQueryOpSymbol,
    NotEquals: FilterQueryOpSymbol,
    StartsWith: FilterQueryOpSymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): FilterQueryOp = {
    val __obj = js.Dynamic.literal(All = All.asInstanceOf[js.Any], Any = Any.asInstanceOf[js.Any], Contains = Contains.asInstanceOf[js.Any], EndsWith = EndsWith.asInstanceOf[js.Any], Equals = Equals.asInstanceOf[js.Any], GreaterThan = GreaterThan.asInstanceOf[js.Any], GreaterThanOrEqual = GreaterThanOrEqual.asInstanceOf[js.Any], IsTypeOf = IsTypeOf.asInstanceOf[js.Any], LessThan = LessThan.asInstanceOf[js.Any], LessThanOrEqual = LessThanOrEqual.asInstanceOf[js.Any], NotEquals = NotEquals.asInstanceOf[js.Any], StartsWith = StartsWith.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[FilterQueryOp]
  }
  
  @scala.inline
  implicit class FilterQueryOpMutableBuilder[Self <: FilterQueryOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: FilterQueryOpSymbol): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAny(value: FilterQueryOpSymbol): Self = StObject.set(x, "Any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: FilterQueryOpSymbol): Self = StObject.set(x, "Contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndsWith(value: FilterQueryOpSymbol): Self = StObject.set(x, "EndsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: FilterQueryOpSymbol): Self = StObject.set(x, "Equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreaterThan(value: FilterQueryOpSymbol): Self = StObject.set(x, "GreaterThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreaterThanOrEqual(value: FilterQueryOpSymbol): Self = StObject.set(x, "GreaterThanOrEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTypeOf(value: FilterQueryOpSymbol): Self = StObject.set(x, "IsTypeOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLessThan(value: FilterQueryOpSymbol): Self = StObject.set(x, "LessThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLessThanOrEqual(value: FilterQueryOpSymbol): Self = StObject.set(x, "LessThanOrEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotEquals(value: FilterQueryOpSymbol): Self = StObject.set(x, "NotEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsWith(value: FilterQueryOpSymbol): Self = StObject.set(x, "StartsWith", value.asInstanceOf[js.Any])
  }
}
