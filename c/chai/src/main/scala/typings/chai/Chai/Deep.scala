package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deep
  extends StObject
     with KeyFilter {
  
  def be(`type`: String): Assertion
  def be(`type`: String, message: String): Assertion
  @JSName("be")
  var be_Original: Assertion
  
  def contain(value: Any): Assertion
  def contain(value: Any, message: String): Assertion
  @JSName("contain")
  var contain_Original: Include
  
  def contains(value: Any): Assertion
  def contains(value: Any, message: String): Assertion
  @JSName("contains")
  var contains_Original: Include
  
  def eq(value: Any, message: String): Assertion
  @JSName("eq")
  var eq_Original: Equal
  
  def equal(value: Any): Assertion
  def equal(value: Any, message: String): Assertion
  @JSName("equal")
  var equal_Original: Equal
  
  def equals(value: Any, message: String): Assertion
  @JSName("equals")
  var equals_Original: Equal
  
  def include(value: Any): Assertion
  def include(value: Any, message: String): Assertion
  @JSName("include")
  var include_Original: Include
  
  def includes(value: Any): Assertion
  def includes(value: Any, message: String): Assertion
  @JSName("includes")
  var includes_Original: Include
  
  var nested: Nested
  
  def oneOf(list: js.Array[Any]): Assertion
  def oneOf(list: js.Array[Any], message: String): Assertion
  @JSName("oneOf")
  var oneOf_Original: OneOf
  
  var ordered: Ordered
  
  var own: Own
  
  def property(name: String): Assertion
  def property(name: String, message: String): Assertion
  def property(name: String, value: Any): Assertion
  def property(name: String, value: Any, message: String): Assertion
  def property(name: js.Symbol): Assertion
  def property(name: js.Symbol, message: String): Assertion
  def property(name: js.Symbol, value: Any): Assertion
  def property(name: js.Symbol, value: Any, message: String): Assertion
  @JSName("property")
  var property_Original: Property
}
object Deep {
  
  inline def apply(
    be: Assertion,
    contain: Include,
    contains: Include,
    eq_ : (/* value */ Any, /* message */ js.UndefOr[String]) => Assertion,
    equal: (/* value */ Any, /* message */ js.UndefOr[String]) => Assertion,
    equals_ : (/* value */ Any, /* message */ js.UndefOr[String]) => Assertion,
    include: Include,
    includes: Include,
    keys: Keys,
    members: (/* set */ js.Array[Any], /* message */ js.UndefOr[String]) => Assertion,
    nested: Nested,
    oneOf: (/* list */ js.Array[Any], /* message */ js.UndefOr[String]) => Assertion,
    ordered: Ordered,
    own: Own,
    property: Property
  ): Deep = {
    val __obj = js.Dynamic.literal(be = be.asInstanceOf[js.Any], contain = contain.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], equal = js.Any.fromFunction2(equal), include = include.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], members = js.Any.fromFunction2(members), nested = nested.asInstanceOf[js.Any], oneOf = js.Any.fromFunction2(oneOf), ordered = ordered.asInstanceOf[js.Any], own = own.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("eq")(js.Any.fromFunction2(eq_))
    __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
    __obj.asInstanceOf[Deep]
  }
  
  extension [Self <: Deep](x: Self) {
    
    inline def setBe(value: Assertion): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
    
    inline def setContain(value: Include): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setContains(value: Include): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setEq_(value: (/* value */ Any, /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "eq", js.Any.fromFunction2(value))
    
    inline def setEqual(value: (/* value */ Any, /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
    
    inline def setEquals_(value: (/* value */ Any, /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
    
    inline def setInclude(value: Include): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludes(value: Include): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setNested(value: Nested): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    inline def setOneOf(value: (/* list */ js.Array[Any], /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "oneOf", js.Any.fromFunction2(value))
    
    inline def setOrdered(value: Ordered): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOwn(value: Own): Self = StObject.set(x, "own", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Property): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
