package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ordered extends StObject {
  
  def members(set: js.Array[js.Any]): Assertion
  def members(set: js.Array[js.Any], message: String): Assertion
  @JSName("members")
  var members_Original: Members
}
object Ordered {
  
  inline def apply(members: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => Assertion): Ordered = {
    val __obj = js.Dynamic.literal(members = js.Any.fromFunction2(members))
    __obj.asInstanceOf[Ordered]
  }
  
  extension [Self <: Ordered](x: Self) {
    
    inline def setMembers(value: (/* set */ js.Array[js.Any], /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "members", js.Any.fromFunction2(value))
  }
}
