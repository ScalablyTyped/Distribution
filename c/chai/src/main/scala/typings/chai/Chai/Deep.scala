package typings.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deep extends KeyFilter {
  
  def contain(value: js.Any): Assertion = js.native
  def contain(value: js.Any, message: String): Assertion = js.native
  @JSName("contain")
  var contain_Original: Include = js.native
  
  def contains(value: js.Any): Assertion = js.native
  def contains(value: js.Any, message: String): Assertion = js.native
  @JSName("contains")
  var contains_Original: Include = js.native
  
  def eq(value: js.Any): Assertion = js.native
  def eq(value: js.Any, message: String): Assertion = js.native
  @JSName("eq")
  var eq_Original: Equal = js.native
  
  def equal(value: js.Any): Assertion = js.native
  def equal(value: js.Any, message: String): Assertion = js.native
  @JSName("equal")
  var equal_Original: Equal = js.native
  
  def equals(value: js.Any): Assertion = js.native
  def equals(value: js.Any, message: String): Assertion = js.native
  @JSName("equals")
  var equals_Original: Equal = js.native
  
  def include(value: js.Any): Assertion = js.native
  def include(value: js.Any, message: String): Assertion = js.native
  @JSName("include")
  var include_Original: Include = js.native
  
  def includes(value: js.Any): Assertion = js.native
  def includes(value: js.Any, message: String): Assertion = js.native
  @JSName("includes")
  var includes_Original: Include = js.native
  
  var nested: Nested = js.native
  
  var ordered: Ordered = js.native
  
  var own: Own = js.native
  
  def property(name: String): Assertion = js.native
  def property(name: String, message: String): Assertion = js.native
  def property(name: String, value: js.Any): Assertion = js.native
  def property(name: String, value: js.Any, message: String): Assertion = js.native
  @JSName("property")
  var property_Original: Property = js.native
}
