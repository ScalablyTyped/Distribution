package typings.regjsparser8A6ZFEHp.mod

import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.`null`
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.controlLetter
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.hexadecimalEscape
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.identifier
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.octal
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.singleEscape
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.symbol
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.unicodeCodePointEscape
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.unicodeEscape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regjsparser8A6ZFEHp.mod.CharacterClassEscape
  - typings.regjsparser8A6ZFEHp.mod.CharacterClassRange
  - typings.regjsparser8A6ZFEHp.mod.UnicodePropertyEscape
  - typings.regjsparser8A6ZFEHp.mod.Value
*/
trait CharacterClassBody extends StObject
object CharacterClassBody {
  
  inline def CharacterClassEscape(range: js.Tuple2[Double, Double], raw: String, value: String): typings.regjsparser8A6ZFEHp.mod.CharacterClassEscape = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClassEscape")
    __obj.asInstanceOf[typings.regjsparser8A6ZFEHp.mod.CharacterClassEscape]
  }
  
  inline def CharacterClassRange(max: Value, min: Value, range: js.Tuple2[Double, Double], raw: String): typings.regjsparser8A6ZFEHp.mod.CharacterClassRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClassRange")
    __obj.asInstanceOf[typings.regjsparser8A6ZFEHp.mod.CharacterClassRange]
  }
  
  inline def UnicodePropertyEscape(negative: Boolean, range: js.Tuple2[Double, Double], raw: String, value: String): typings.regjsparser8A6ZFEHp.mod.UnicodePropertyEscape = {
    val __obj = js.Dynamic.literal(negative = negative.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unicodePropertyEscape")
    __obj.asInstanceOf[typings.regjsparser8A6ZFEHp.mod.UnicodePropertyEscape]
  }
  
  inline def Value(
    codePoint: Double,
    kind: controlLetter | hexadecimalEscape | identifier | `null` | octal | singleEscape | symbol | unicodeCodePointEscape | unicodeEscape,
    range: js.Tuple2[Double, Double],
    raw: String
  ): typings.regjsparser8A6ZFEHp.mod.Value = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("value")
    __obj.asInstanceOf[typings.regjsparser8A6ZFEHp.mod.Value]
  }
}
