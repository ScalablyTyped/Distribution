package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredicateMethod extends StObject {
  
  def apply(predicates: Predicate*): Predicate = js.native
  def apply(predicates: js.Array[Predicate]): Predicate = js.native
  // for any/all clauses
  def apply(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): Predicate = js.native
  def apply(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate = js.native
  def apply(property: String, operator: String, value: js.Any): Predicate = js.native
  def apply(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def apply(property: String, operator: FilterQueryOpSymbol, value: js.Any): Predicate = js.native
  def apply(property: String, operator: FilterQueryOpSymbol, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
}
