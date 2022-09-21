package typings.regjsparser8A6ZFEHp.mod

import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.`not-boundary`
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.`null`
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.boundary
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.controlLetter
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.end
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.hexadecimalEscape
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.identifier
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.intersection
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.octal
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.singleEscape
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.start
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.subtraction
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.symbol
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.unicodeCodePointEscape
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.unicodeEscape
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AstNode[F /* <: Features */] extends StObject
object _AstNode {
  
  inline def Alternative[F /* <: Features */](body: js.Array[RootNode[F]], range: js.Tuple2[Double, Double], raw: String): typings.regjsparser8A6ZFEHp.mod.Alternative[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("alternative")
    __obj.asInstanceOf[typings.regjsparser8A6ZFEHp.mod.Alternative[F]]
  }
  
  inline def Anchor(kind: boundary | end | `not-boundary` | start, range: js.Tuple2[Double, Double], raw: String): typings.regjsparser8A6ZFEHp.mod.Anchor = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("anchor")
    __obj.asInstanceOf[typings.regjsparser8A6ZFEHp.mod.Anchor]
  }
  
  inline def CharacterClass[F /* <: Features */](
    body: js.Array[CharacterClassBody],
    kind: union | (If[
      /* import warning: importer.ImportType#apply Failed type conversion: F['unicodeSet'] */ js.Any, 
      intersection | subtraction, 
      scala.Nothing
    ]),
    negative: Boolean,
    range: js.Tuple2[Double, Double],
    raw: String
  ): typings.regjsparser8A6ZFEHp.mod.CharacterClass[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClass")
    __obj.asInstanceOf[typings.regjsparser8A6ZFEHp.mod.CharacterClass[F]]
  }
  
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
  
  inline def Disjunction[F /* <: Features */](body: Array[RootNode[F]], range: js.Tuple2[Double, Double], raw: String): typings.regjsparser8A6ZFEHp.mod.Disjunction[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("disjunction")
    __obj.asInstanceOf[typings.regjsparser8A6ZFEHp.mod.Disjunction[F]]
  }
  
  inline def Quantifier[F /* <: Features */](
    body: js.Array[RootNode[F]],
    greedy: Boolean,
    min: Double,
    range: js.Tuple2[Double, Double],
    raw: String
  ): typings.regjsparser8A6ZFEHp.mod.Quantifier[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("quantifier")
    __obj.asInstanceOf[typings.regjsparser8A6ZFEHp.mod.Quantifier[F]]
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
