package typings.regexpTreeSaQo4gle.astMod

import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.$
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.BackslashB
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Backslashb
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Lookahead
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Lookbehind
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.^
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.control
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.decimal
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.hex
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.meta
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.oct
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.unicode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTreeSaQo4gle.astMod.Char
  - typings.regexpTreeSaQo4gle.astMod.CharacterClass
  - typings.regexpTreeSaQo4gle.astMod.Alternative
  - typings.regexpTreeSaQo4gle.astMod.Disjunction
  - typings.regexpTreeSaQo4gle.astMod.Group
  - typings.regexpTreeSaQo4gle.astMod.Backreference
  - typings.regexpTreeSaQo4gle.astMod.Repetition
  - typings.regexpTreeSaQo4gle.astMod.Assertion
*/
trait Expression extends StObject
object Expression {
  
  inline def Alternative(expressions: js.Array[Expression]): typings.regexpTreeSaQo4gle.astMod.Alternative = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Alternative")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.Alternative]
  }
  
  inline def CapturingGroup(number: Double): typings.regexpTreeSaQo4gle.astMod.CapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = true, number = number.asInstanceOf[js.Any], expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.CapturingGroup]
  }
  
  inline def CharacterClass(expressions: js.Array[Char | ClassRange]): typings.regexpTreeSaQo4gle.astMod.CharacterClass = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterClass")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.CharacterClass]
  }
  
  inline def Disjunction(): typings.regexpTreeSaQo4gle.astMod.Disjunction = {
    val __obj = js.Dynamic.literal(left = null, right = null)
    __obj.updateDynamic("type")("Disjunction")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.Disjunction]
  }
  
  inline def LookaroundAssertion(kind: Lookahead | Lookbehind): typings.regexpTreeSaQo4gle.astMod.LookaroundAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], assertion = null)
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.LookaroundAssertion]
  }
  
  inline def NamedBackreference(number: Double, reference: String, referenceRaw: String): typings.regexpTreeSaQo4gle.astMod.NamedBackreference = {
    val __obj = js.Dynamic.literal(kind = "name", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], referenceRaw = referenceRaw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.NamedBackreference]
  }
  
  inline def NoncapturingGroup(): typings.regexpTreeSaQo4gle.astMod.NoncapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = false, expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.NoncapturingGroup]
  }
  
  inline def NumericBackreference(number: Double, reference: Double): typings.regexpTreeSaQo4gle.astMod.NumericBackreference = {
    val __obj = js.Dynamic.literal(kind = "number", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.NumericBackreference]
  }
  
  inline def Repetition(expression: Expression, quantifier: Quantifier): typings.regexpTreeSaQo4gle.astMod.Repetition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Repetition")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.Repetition]
  }
  
  inline def SimpleAssertion(kind: ^ | $ | Backslashb | BackslashB): typings.regexpTreeSaQo4gle.astMod.SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.SimpleAssertion]
  }
  
  inline def SimpleChar(codePoint: Double, value: String): typings.regexpTreeSaQo4gle.astMod.SimpleChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = "simple", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.SimpleChar]
  }
  
  inline def SpecialChar(codePoint: Double, kind: meta | control | hex | decimal | oct | unicode, value: String): typings.regexpTreeSaQo4gle.astMod.SpecialChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.SpecialChar]
  }
}
