package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Own extends StObject {
  
  def contain(value: js.Any): Assertion
  def contain(value: js.Any, message: String): Assertion
  @JSName("contain")
  var contain_Original: Include
  
  def contains(value: js.Any): Assertion
  def contains(value: js.Any, message: String): Assertion
  @JSName("contains")
  var contains_Original: Include
  
  def include(value: js.Any): Assertion
  def include(value: js.Any, message: String): Assertion
  @JSName("include")
  var include_Original: Include
  
  def includes(value: js.Any): Assertion
  def includes(value: js.Any, message: String): Assertion
  @JSName("includes")
  var includes_Original: Include
  
  def property(name: String): Assertion
  def property(name: String, message: String): Assertion
  def property(name: String, value: js.Any): Assertion
  def property(name: String, value: js.Any, message: String): Assertion
  @JSName("property")
  var property_Original: Property
}
object Own {
  
  @scala.inline
  def apply(contain: Include, contains: Include, include: Include, includes: Include, property: Property): Own = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Own]
  }
  
  @scala.inline
  implicit class OwnMutableBuilder[Self <: Own] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContain(value: Include): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: Include): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: Include): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludes(value: Include): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Property): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
