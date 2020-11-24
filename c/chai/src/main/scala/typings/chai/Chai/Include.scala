package typings.chai.Chai

import typings.chai.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Include extends js.Object {
  
  def apply(value: js.Any): Assertion = js.native
  def apply(value: js.Any, message: String): Assertion = js.native
  
  var all: KeyFilter = js.native
  
  var any: KeyFilter = js.native
  
  var deep: Deep = js.native
  
  def keys(keys: String*): Assertion = js.native
  def keys(keys: js.Array[_]): Assertion = js.native
  def keys(keys: Object): Assertion = js.native
  @JSName("keys")
  var keys_Original: Keys = js.native
  
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: String): Assertion = js.native
  @JSName("members")
  var members_Original: Members = js.native
  
  var ordered: Ordered = js.native
}
