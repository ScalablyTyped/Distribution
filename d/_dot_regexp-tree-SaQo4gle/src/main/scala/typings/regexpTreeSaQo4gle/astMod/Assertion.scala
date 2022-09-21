package typings.regexpTreeSaQo4gle.astMod

import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.$
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.BackslashB
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Backslashb
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Lookahead
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Lookbehind
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTreeSaQo4gle.astMod.SimpleAssertion
  - typings.regexpTreeSaQo4gle.astMod.LookaroundAssertion
*/
trait Assertion
  extends StObject
     with Expression
object Assertion {
  
  inline def LookaroundAssertion(kind: Lookahead | Lookbehind): typings.regexpTreeSaQo4gle.astMod.LookaroundAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], assertion = null)
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.LookaroundAssertion]
  }
  
  inline def SimpleAssertion(kind: ^ | $ | Backslashb | BackslashB): typings.regexpTreeSaQo4gle.astMod.SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.SimpleAssertion]
  }
}
