package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueOne extends StObject {
  
  var name: Name
  
  var tokens: js.Array[CSSToken]
  
  var `type`: NodeType
  
  var valueOne: Value
  
  var valueTwo: Value
}
object ValueOne {
  
  inline def apply(name: Name, tokens: js.Array[CSSToken], `type`: NodeType, valueOne: Value, valueTwo: Value): ValueOne = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], valueOne = valueOne.asInstanceOf[js.Any], valueTwo = valueTwo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueOne]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueOne] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[CSSToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: CSSToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueOne(value: Value): Self = StObject.set(x, "valueOne", value.asInstanceOf[js.Any])
    
    inline def setValueTwo(value: Value): Self = StObject.set(x, "valueTwo", value.asInstanceOf[js.Any])
  }
}
