package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nested extends StObject {
  
  def contain(value: Any): Assertion
  def contain(value: Any, message: String): Assertion
  @JSName("contain")
  var contain_Original: Include
  
  def contains(value: Any): Assertion
  def contains(value: Any, message: String): Assertion
  @JSName("contains")
  var contains_Original: Include
  
  def include(value: Any): Assertion
  def include(value: Any, message: String): Assertion
  @JSName("include")
  var include_Original: Include
  
  def includes(value: Any): Assertion
  def includes(value: Any, message: String): Assertion
  @JSName("includes")
  var includes_Original: Include
  
  def members(set: js.Array[Any]): Assertion
  def members(set: js.Array[Any], message: String): Assertion
  @JSName("members")
  var members_Original: Members
  
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
object Nested {
  
  inline def apply(
    contain: Include,
    contains: Include,
    include: Include,
    includes: Include,
    members: (/* set */ js.Array[Any], /* message */ js.UndefOr[String]) => Assertion,
    property: Property
  ): Nested = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], members = js.Any.fromFunction2(members), property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nested]
  }
  
  extension [Self <: Nested](x: Self) {
    
    inline def setContain(value: Include): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setContains(value: Include): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setInclude(value: Include): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludes(value: Include): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: (/* set */ js.Array[Any], /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "members", js.Any.fromFunction2(value))
    
    inline def setProperty(value: Property): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
