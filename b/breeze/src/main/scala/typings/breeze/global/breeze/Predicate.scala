package typings.breeze.global.breeze

import typings.breeze.breeze.IRecursiveArray
import typings.breeze.breeze.PredicateMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.Predicate")
@js.native
class Predicate ()
  extends typings.breeze.breeze.Predicate {
  def this(anArray: IRecursiveArray[
        String | Double | typings.breeze.breeze.FilterQueryOpSymbol | typings.breeze.breeze.Predicate
      ]) = this()
  // for any/all clauses
  def this(passthru: String) = this()
  def this(predicate: typings.breeze.breeze.Predicate) = this()
  def this(property: String, operator: String, value: js.Any) = this()
  def this(property: String, operator: String, value: typings.breeze.anon.DataType) = this()
  def this(property: String, operator: typings.breeze.breeze.FilterQueryOpSymbol, value: js.Any) = this()
  def this(
    property: String,
    operator: typings.breeze.breeze.FilterQueryOpSymbol,
    value: typings.breeze.anon.DataType
  ) = this()
  // for any/all clauses
  def this(property: String, filterop: String, property2: String, filterop2: String, value: js.Any) = this()
  def this(
    property: String,
    filterop: typings.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ) = this()
}
/* static members */
object Predicate {
  
  @JSGlobal("breeze.Predicate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("breeze.Predicate.and")
  @js.native
  def and: PredicateMethod = js.native
  @JSGlobal("breeze.Predicate.and")
  @js.native
  def and(predicates: typings.breeze.breeze.Predicate*): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.and")
  @js.native
  def and(predicates: js.Array[typings.breeze.breeze.Predicate]): typings.breeze.breeze.Predicate = js.native
  // for any/all clauses
  @JSGlobal("breeze.Predicate.and")
  @js.native
  def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.and")
  @js.native
  def and(
    property: String,
    filterop: typings.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.and")
  @js.native
  def and(property: String, operator: String, value: js.Any): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.and")
  @js.native
  def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.and")
  @js.native
  def and(property: String, operator: typings.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.and")
  @js.native
  def and(
    property: String,
    operator: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breeze.Predicate = js.native
  @scala.inline
  def and_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("and")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.Predicate.create")
  @js.native
  def create: PredicateMethod = js.native
  @JSGlobal("breeze.Predicate.create")
  @js.native
  def create(predicates: typings.breeze.breeze.Predicate*): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.create")
  @js.native
  def create(predicates: js.Array[typings.breeze.breeze.Predicate]): typings.breeze.breeze.Predicate = js.native
  // for any/all clauses
  @JSGlobal("breeze.Predicate.create")
  @js.native
  def create(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.create")
  @js.native
  def create(
    property: String,
    filterop: typings.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.create")
  @js.native
  def create(property: String, operator: String, value: js.Any): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.create")
  @js.native
  def create(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.create")
  @js.native
  def create(property: String, operator: typings.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.create")
  @js.native
  def create(
    property: String,
    operator: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breeze.Predicate = js.native
  @scala.inline
  def create_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.Predicate.isPredicate")
  @js.native
  def isPredicate(o: js.Any): Boolean = js.native
  
  @JSGlobal("breeze.Predicate.not")
  @js.native
  def not(predicate: typings.breeze.breeze.Predicate): typings.breeze.breeze.Predicate = js.native
  
  @JSGlobal("breeze.Predicate.or")
  @js.native
  def or: PredicateMethod = js.native
  @JSGlobal("breeze.Predicate.or")
  @js.native
  def or(predicates: typings.breeze.breeze.Predicate*): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.or")
  @js.native
  def or(predicates: js.Array[typings.breeze.breeze.Predicate]): typings.breeze.breeze.Predicate = js.native
  // for any/all clauses
  @JSGlobal("breeze.Predicate.or")
  @js.native
  def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.or")
  @js.native
  def or(
    property: String,
    filterop: typings.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.or")
  @js.native
  def or(property: String, operator: String, value: js.Any): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.or")
  @js.native
  def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.or")
  @js.native
  def or(property: String, operator: typings.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typings.breeze.breeze.Predicate = js.native
  @JSGlobal("breeze.Predicate.or")
  @js.native
  def or(
    property: String,
    operator: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breeze.Predicate = js.native
  @scala.inline
  def or_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("or")(x.asInstanceOf[js.Any])
}
