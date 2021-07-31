package typings.breeze.mod

import typings.breeze.breeze.IRecursiveArray
import typings.breeze.breeze.PredicateMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "Predicate")
@js.native
class Predicate ()
  extends StObject
     with typings.breeze.breeze.Predicate {
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
  
  /* CompleteClass */
  override def and(predicates: typings.breeze.breeze.Predicate*): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(predicates: js.Array[typings.breeze.breeze.Predicate]): typings.breeze.breeze.Predicate = js.native
  // for any/all clauses
  /* CompleteClass */
  override def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(
    property: String,
    filterop: typings.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(property: String, operator: String, value: js.Any): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(property: String, operator: typings.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(
    property: String,
    operator: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  @JSName("and")
  var and_Original: PredicateMethod = js.native
  
  /* CompleteClass */
  override def not(): typings.breeze.breeze.Predicate = js.native
  
  /* CompleteClass */
  override def or(predicates: typings.breeze.breeze.Predicate*): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(predicates: js.Array[typings.breeze.breeze.Predicate]): typings.breeze.breeze.Predicate = js.native
  // for any/all clauses
  /* CompleteClass */
  override def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(
    property: String,
    filterop: typings.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(property: String, operator: String, value: js.Any): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(property: String, operator: typings.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(
    property: String,
    operator: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  @JSName("or")
  var or_Original: PredicateMethod = js.native
  
  /* CompleteClass */
  override def toFunction(): js.Function = js.native
  
  /* CompleteClass */
  override def toJSON(): String = js.native
  
  /* CompleteClass */
  override def validate(entityType: typings.breeze.breeze.EntityType): Unit = js.native
}
/* static members */
object Predicate {
  
  @JSImport("breeze", "Predicate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and: PredicateMethod = js.native
  @scala.inline
  def and(predicates: typings.breeze.breeze.Predicate*): typings.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(predicates.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def and(predicates: js.Array[typings.breeze.breeze.Predicate]): typings.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(predicates.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Predicate]
  // for any/all clauses
  @scala.inline
  def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def and(
    property: String,
    filterop: typings.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def and(property: String, operator: String, value: js.Any): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def and(property: String, operator: typings.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def and(
    property: String,
    operator: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def and_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("and")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create: PredicateMethod = js.native
  @scala.inline
  def create(predicates: typings.breeze.breeze.Predicate*): typings.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(predicates.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def create(predicates: js.Array[typings.breeze.breeze.Predicate]): typings.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(predicates.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Predicate]
  // for any/all clauses
  @scala.inline
  def create(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def create(
    property: String,
    filterop: typings.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def create(property: String, operator: String, value: js.Any): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def create(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def create(property: String, operator: typings.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def create(
    property: String,
    operator: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def create_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def isPredicate(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPredicate")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def not(predicate: typings.breeze.breeze.Predicate): typings.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(predicate.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Predicate]
  
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or: PredicateMethod = js.native
  @scala.inline
  def or(predicates: typings.breeze.breeze.Predicate*): typings.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(predicates.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def or(predicates: js.Array[typings.breeze.breeze.Predicate]): typings.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(predicates.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Predicate]
  // for any/all clauses
  @scala.inline
  def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def or(
    property: String,
    filterop: typings.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def or(property: String, operator: String, value: js.Any): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def or(property: String, operator: typings.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def or(
    property: String,
    operator: typings.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typings.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Predicate]
  @scala.inline
  def or_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("or")(x.asInstanceOf[js.Any])
}
