package typings.chai.Chai

import typings.chai.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyFilter extends StObject {
  
  def keys(keys: String*): Assertion
  def keys(keys: js.Array[js.Any]): Assertion
  def keys(keys: Object): Assertion
  @JSName("keys")
  var keys_Original: Keys
  
  def members(set: js.Array[js.Any]): Assertion
  def members(set: js.Array[js.Any], message: String): Assertion
  @JSName("members")
  var members_Original: Members
}
object KeyFilter {
  
  inline def apply(keys: Keys, members: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => Assertion): KeyFilter = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], members = js.Any.fromFunction2(members))
    __obj.asInstanceOf[KeyFilter]
  }
  
  extension [Self <: KeyFilter](x: Self) {
    
    inline def setKeys(value: Keys): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "members", js.Any.fromFunction2(value))
  }
}
