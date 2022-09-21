package typings.regjsparser8A6ZFEHp.mod

import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.Asterisk
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.Plussign
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.Questionmark
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.quantifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quantifier[F /* <: Features */]
  extends StObject
     with Base[quantifier]
     with _AstNode[F] {
  
  var body: js.Array[RootNode[F]]
  
  var greedy: Boolean
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: Double
  
  var symbol: js.UndefOr[Questionmark | Asterisk | Plussign] = js.undefined
}
object Quantifier {
  
  inline def apply[F /* <: Features */](
    body: js.Array[RootNode[F]],
    greedy: Boolean,
    min: Double,
    range: js.Tuple2[Double, Double],
    raw: String
  ): Quantifier[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("quantifier")
    __obj.asInstanceOf[Quantifier[F]]
  }
  
  extension [Self <: Quantifier[?], F /* <: Features */](x: Self & Quantifier[F]) {
    
    inline def setBody(value: js.Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: RootNode[F]*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Questionmark | Asterisk | Plussign): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
