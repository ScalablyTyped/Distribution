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
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with Base[value]
     with CharacterClassBody
     with _AstNode[Any] {
  
  var codePoint: Double
  
  var kind: controlLetter | hexadecimalEscape | identifier | `null` | octal | singleEscape | symbol | unicodeCodePointEscape | unicodeEscape
}
object Value {
  
  inline def apply(
    codePoint: Double,
    kind: controlLetter | hexadecimalEscape | identifier | `null` | octal | singleEscape | symbol | unicodeCodePointEscape | unicodeEscape,
    range: js.Tuple2[Double, Double],
    raw: String
  ): Value = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("value")
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setCodePoint(value: Double): Self = StObject.set(x, "codePoint", value.asInstanceOf[js.Any])
    
    inline def setKind(
      value: controlLetter | hexadecimalEscape | identifier | `null` | octal | singleEscape | symbol | unicodeCodePointEscape | unicodeEscape
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
