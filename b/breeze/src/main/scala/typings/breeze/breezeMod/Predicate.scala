package typings.breeze.breezeMod

import typings.breeze.Anon_DataType
import typings.breeze.breezeNs.IRecursiveArray
import typings.breeze.breezeNs.PredicateMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "Predicate")
@js.native
class Predicate ()
  extends typings.breeze.breezeNs.Predicate {
  def this(anArray: IRecursiveArray[
        String | Double | typings.breeze.breezeNs.FilterQueryOpSymbol | typings.breeze.breezeNs.Predicate
      ]) = this()
    // for any/all clauses
  def this(passthru: String) = this()
  def this(predicate: typings.breeze.breezeNs.Predicate) = this()
  def this(property: String, operator: String, value: js.Any) = this()
  def this(property: String, operator: String, value: Anon_DataType) = this()
  def this(property: String, operator: typings.breeze.breezeNs.FilterQueryOpSymbol, value: js.Any) = this()
  def this(property: String, operator: typings.breeze.breezeNs.FilterQueryOpSymbol, value: Anon_DataType) = this()
    // for any/all clauses
  def this(property: String, filterop: String, property2: String, filterop2: String, value: js.Any) = this()
  def this(
    property: String,
    filterop: typings.breeze.breezeNs.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breezeNs.FilterQueryOpSymbol,
    value: js.Any
  ) = this()
}

/* static members */
@JSImport("breeze", "Predicate")
@js.native
object Predicate extends js.Object {
  @JSName("and")
  var and_Original: PredicateMethod = js.native
  @JSName("create")
  var create_Original: PredicateMethod = js.native
  @JSName("or")
  var or_Original: PredicateMethod = js.native
  def and(predicates: typings.breeze.breezeNs.Predicate*): typings.breeze.breezeNs.Predicate = js.native
  def and(predicates: js.Array[typings.breeze.breezeNs.Predicate]): typings.breeze.breezeNs.Predicate = js.native
    // for any/all clauses
  def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breezeNs.Predicate = js.native
  def and(
    property: String,
    filterop: typings.breeze.breezeNs.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breezeNs.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breezeNs.Predicate = js.native
  def and(property: String, operator: String, value: js.Any): typings.breeze.breezeNs.Predicate = js.native
  def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breezeNs.Predicate = js.native
  def and(property: String, operator: typings.breeze.breezeNs.FilterQueryOpSymbol, value: js.Any): typings.breeze.breezeNs.Predicate = js.native
  def and(
    property: String,
    operator: typings.breeze.breezeNs.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breezeNs.Predicate = js.native
  def create(predicates: typings.breeze.breezeNs.Predicate*): typings.breeze.breezeNs.Predicate = js.native
  def create(predicates: js.Array[typings.breeze.breezeNs.Predicate]): typings.breeze.breezeNs.Predicate = js.native
    // for any/all clauses
  def create(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breezeNs.Predicate = js.native
  def create(
    property: String,
    filterop: typings.breeze.breezeNs.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breezeNs.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breezeNs.Predicate = js.native
  def create(property: String, operator: String, value: js.Any): typings.breeze.breezeNs.Predicate = js.native
  def create(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breezeNs.Predicate = js.native
  def create(property: String, operator: typings.breeze.breezeNs.FilterQueryOpSymbol, value: js.Any): typings.breeze.breezeNs.Predicate = js.native
  def create(
    property: String,
    operator: typings.breeze.breezeNs.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breezeNs.Predicate = js.native
  def isPredicate(o: js.Any): Boolean = js.native
  def not(predicate: typings.breeze.breezeNs.Predicate): typings.breeze.breezeNs.Predicate = js.native
  def or(predicates: typings.breeze.breezeNs.Predicate*): typings.breeze.breezeNs.Predicate = js.native
  def or(predicates: js.Array[typings.breeze.breezeNs.Predicate]): typings.breeze.breezeNs.Predicate = js.native
    // for any/all clauses
  def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breezeNs.Predicate = js.native
  def or(
    property: String,
    filterop: typings.breeze.breezeNs.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breezeNs.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breezeNs.Predicate = js.native
  def or(property: String, operator: String, value: js.Any): typings.breeze.breezeNs.Predicate = js.native
  def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breezeNs.Predicate = js.native
  def or(property: String, operator: typings.breeze.breezeNs.FilterQueryOpSymbol, value: js.Any): typings.breeze.breezeNs.Predicate = js.native
  def or(
    property: String,
    operator: typings.breeze.breezeNs.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breezeNs.Predicate = js.native
}

