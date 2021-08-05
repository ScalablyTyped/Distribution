package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deep
  extends StObject
     with KeyFilter {
  
  def contain(value: js.Any): Assertion
  def contain(value: js.Any, message: String): Assertion
  @JSName("contain")
  var contain_Original: Include
  
  def contains(value: js.Any): Assertion
  def contains(value: js.Any, message: String): Assertion
  @JSName("contains")
  var contains_Original: Include
  
  def eq(value: js.Any): Assertion
  def eq(value: js.Any, message: String): Assertion
  @JSName("eq")
  var eq_Original: Equal
  
  def equal(value: js.Any): Assertion
  def equal(value: js.Any, message: String): Assertion
  @JSName("equal")
  var equal_Original: Equal
  
  def equals(value: js.Any): Assertion
  def equals(value: js.Any, message: String): Assertion
  @JSName("equals")
  var equals_Original: Equal
  
  def include(value: js.Any): Assertion
  def include(value: js.Any, message: String): Assertion
  @JSName("include")
  var include_Original: Include
  
  def includes(value: js.Any): Assertion
  def includes(value: js.Any, message: String): Assertion
  @JSName("includes")
  var includes_Original: Include
  
  var nested: Nested
  
  var ordered: Ordered
  
  var own: Own
  
  def property(name: String): Assertion
  def property(name: String, message: String): Assertion
  def property(name: String, value: js.Any): Assertion
  def property(name: String, value: js.Any, message: String): Assertion
  @JSName("property")
  var property_Original: Property
}
object Deep {
  
  inline def apply(
    contain: Include,
    contains: Include,
    eq_ : (/* value */ js.Any, /* message */ js.UndefOr[String]) => Assertion,
    equal: (/* value */ js.Any, /* message */ js.UndefOr[String]) => Assertion,
    equals_ : (/* value */ js.Any, /* message */ js.UndefOr[String]) => Assertion,
    include: Include,
    includes: Include,
    keys: Keys,
    members: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => Assertion,
    nested: Nested,
    ordered: Ordered,
    own: Own,
    property: Property
  ): Deep = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], equal = js.Any.fromFunction2(equal), include = include.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], members = js.Any.fromFunction2(members), nested = nested.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], own = own.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("eq")(js.Any.fromFunction2(eq_))
    __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
    __obj.asInstanceOf[Deep]
  }
  
  extension [Self <: Deep](x: Self) {
    
    inline def setContain(value: Include): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setContains(value: Include): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setEq_(value: (/* value */ js.Any, /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "eq", js.Any.fromFunction2(value))
    
    inline def setEqual(value: (/* value */ js.Any, /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
    
    inline def setEquals_(value: (/* value */ js.Any, /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
    
    inline def setInclude(value: Include): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludes(value: Include): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setNested(value: Nested): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    inline def setOrdered(value: Ordered): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOwn(value: Own): Self = StObject.set(x, "own", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Property): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
