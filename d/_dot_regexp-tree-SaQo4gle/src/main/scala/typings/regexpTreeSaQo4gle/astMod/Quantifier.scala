package typings.regexpTreeSaQo4gle.astMod

import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Asterisk
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Plussign
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Questionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTreeSaQo4gle.astMod.SimpleQuantifier
  - typings.regexpTreeSaQo4gle.astMod.RangeQuantifier
*/
trait Quantifier extends StObject
object Quantifier {
  
  inline def RangeQuantifier(from: Double, greedy: Boolean): typings.regexpTreeSaQo4gle.astMod.RangeQuantifier = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], kind = "Range")
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.RangeQuantifier]
  }
  
  inline def SimpleQuantifier(greedy: Boolean, kind: Plussign | Asterisk | Questionmark): typings.regexpTreeSaQo4gle.astMod.SimpleQuantifier = {
    val __obj = js.Dynamic.literal(greedy = greedy.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.SimpleQuantifier]
  }
}
