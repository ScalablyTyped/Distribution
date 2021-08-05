package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Predicate extends StObject {
  
  def and(predicates: Predicate*): Predicate
  def and(predicates: js.Array[Predicate]): Predicate
  // for any/all clauses
  def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): Predicate
  def and(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate
  def and(property: String, operator: String, value: js.Any): Predicate
  def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): Predicate
  def and(property: String, operator: FilterQueryOpSymbol, value: js.Any): Predicate
  def and(property: String, operator: FilterQueryOpSymbol, value: js.Any, valueIsLiteral: Boolean): Predicate
  @JSName("and")
  var and_Original: PredicateMethod
  
  def not(): Predicate
  
  def or(predicates: Predicate*): Predicate
  def or(predicates: js.Array[Predicate]): Predicate
  // for any/all clauses
  def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): Predicate
  def or(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate
  def or(property: String, operator: String, value: js.Any): Predicate
  def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): Predicate
  def or(property: String, operator: FilterQueryOpSymbol, value: js.Any): Predicate
  def or(property: String, operator: FilterQueryOpSymbol, value: js.Any, valueIsLiteral: Boolean): Predicate
  @JSName("or")
  var or_Original: PredicateMethod
  
  def toFunction(): js.Function
  
  def toJSON(): String
  
  def validate(entityType: EntityType): Unit
}
object Predicate {
  
  inline def apply(
    and: PredicateMethod,
    not: () => Predicate,
    or: PredicateMethod,
    toFunction: () => js.Function,
    toJSON: () => String,
    validate: EntityType => Unit
  ): Predicate = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], not = js.Any.fromFunction0(not), or = or.asInstanceOf[js.Any], toFunction = js.Any.fromFunction0(toFunction), toJSON = js.Any.fromFunction0(toJSON), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Predicate]
  }
  
  extension [Self <: Predicate](x: Self) {
    
    inline def setAnd(value: PredicateMethod): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setNot(value: () => Predicate): Self = StObject.set(x, "not", js.Any.fromFunction0(value))
    
    inline def setOr(value: PredicateMethod): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setToFunction(value: () => js.Function): Self = StObject.set(x, "toFunction", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setValidate(value: EntityType => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
