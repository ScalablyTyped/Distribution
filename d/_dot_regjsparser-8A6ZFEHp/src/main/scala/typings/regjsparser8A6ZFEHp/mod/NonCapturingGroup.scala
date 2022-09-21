package typings.regjsparser8A6ZFEHp.mod

import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.group
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.ignore
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.lookahead
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.lookbehind
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.negativeLookahead
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.negativeLookbehind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonCapturingGroup[F /* <: Features */]
  extends StObject
     with Base[group] {
  
  var behavior: ignore | lookahead | lookbehind | negativeLookahead | negativeLookbehind
  
  var body: js.Array[RootNode[F]]
}
object NonCapturingGroup {
  
  inline def apply[F /* <: Features */](
    behavior: ignore | lookahead | lookbehind | negativeLookahead | negativeLookbehind,
    body: js.Array[RootNode[F]],
    range: js.Tuple2[Double, Double],
    raw: String
  ): NonCapturingGroup[F] = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[NonCapturingGroup[F]]
  }
  
  extension [Self <: NonCapturingGroup[?], F /* <: Features */](x: Self & NonCapturingGroup[F]) {
    
    inline def setBehavior(value: ignore | lookahead | lookbehind | negativeLookahead | negativeLookbehind): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBody(value: js.Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: RootNode[F]*): Self = StObject.set(x, "body", js.Array(value*))
  }
}
