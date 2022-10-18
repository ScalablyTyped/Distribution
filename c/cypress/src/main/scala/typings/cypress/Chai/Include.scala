package typings.cypress.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Include extends StObject {
  
  def apply(value: Any): Assertion = js.native
  def apply(value: Any, message: String): Assertion = js.native
  
  var all: KeyFilter = js.native
  
  var any: KeyFilter = js.native
  
  var deep: Deep = js.native
  
  def html(html: String): Assertion = js.native
  
  def keys(keys: String*): Assertion = js.native
  def keys(keys: js.Array[Any]): Assertion = js.native
  def keys(keys: js.Object): Assertion = js.native
  @JSName("keys")
  var keys_Original: Keys = js.native
  
  def members(set: js.Array[Any]): Assertion = js.native
  def members(set: js.Array[Any], message: String): Assertion = js.native
  @JSName("members")
  var members_Original: Members = js.native
  
  var ordered: Ordered = js.native
  
  def text(text: String): Assertion = js.native
  
  def value(text: String): Assertion = js.native
}
