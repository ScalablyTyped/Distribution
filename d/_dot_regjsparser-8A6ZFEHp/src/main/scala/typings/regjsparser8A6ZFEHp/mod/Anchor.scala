package typings.regjsparser8A6ZFEHp.mod

import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.`not-boundary`
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.anchor
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.boundary
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.end
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anchor
  extends StObject
     with Base[anchor]
     with _AstNode[Any] {
  
  var kind: boundary | end | `not-boundary` | start
}
object Anchor {
  
  inline def apply(kind: boundary | end | `not-boundary` | start, range: js.Tuple2[Double, Double], raw: String): Anchor = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("anchor")
    __obj.asInstanceOf[Anchor]
  }
  
  extension [Self <: Anchor](x: Self) {
    
    inline def setKind(value: boundary | end | `not-boundary` | start): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
