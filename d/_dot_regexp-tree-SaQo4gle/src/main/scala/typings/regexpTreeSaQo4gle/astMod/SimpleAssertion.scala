package typings.regexpTreeSaQo4gle.astMod

import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.$
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.BackslashB
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Backslashb
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleAssertion
  extends StObject
     with Base[typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Assertion]
     with Assertion {
  
  var kind: ^ | $ | Backslashb | BackslashB
}
object SimpleAssertion {
  
  inline def apply(kind: ^ | $ | Backslashb | BackslashB): SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[SimpleAssertion]
  }
  
  extension [Self <: SimpleAssertion](x: Self) {
    
    inline def setKind(value: ^ | $ | Backslashb | BackslashB): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
